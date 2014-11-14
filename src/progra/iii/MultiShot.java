/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Diego
 */
public class MultiShot extends Arma{
    
    public MultiShot(Jugador pJugador){
        super(1,1,4000,pJugador);
    }

    @Override
    public boolean disparar(int posXDestino, int posYDestino, int jugadorADisparar){
        if (jugadorADisparar != jugadorAsociado.getNumero() && jugadorADisparar>0 && jugadorADisparar<=super.jugadorAsociado.getNumeroJugadores()){
            if (posXDestino>=0 && posXDestino<15 && posYDestino>=0 && posYDestino<15){
                jugadorAsociado.dispararMisil(jugadorADisparar,posXDestino,posYDestino);
                jugadorAsociado.quitarArma(this);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MultiShot.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(jugadorAsociado.getACiertoComponente()){
                    jugadorAsociado.getVentanaPlataforma().mostrar("Servidor: El multishot ha sido existoso!Se dispararan 4 misiles mas");
                    for (int i = 0;i<4;i++){
                        jugadorAsociado.getArmas().add(new Misil(jugadorAsociado));
                        Random randomNumero = new Random();
                        int randX = randomNumero.nextInt(15);
                        int randY = randomNumero.nextInt(15);
                        jugadorAsociado.disparar(0, randX, randY, jugadorADisparar);
                    }
                
                }
                else{
                    jugadorAsociado.getVentanaPlataforma().mostrar("Servidor: El multishot no logro ser acertado");
                
                }
            return true;
        }
    }
        return false;
        
    }
    
    
}
