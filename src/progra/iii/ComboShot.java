/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

/**
 *
 * @author Luis Diego
 */
public class ComboShot extends Arma {
    
    public ComboShot(Jugador pJugador){
        super(1,1,5000,pJugador);
    }

    @Override
    public boolean disparar(int posXDestino, int posYDestino, int jugadorADisparar) {
        if (jugadorADisparar != jugadorAsociado.getNumero() && jugadorADisparar>0 && jugadorADisparar<=super.jugadorAsociado.getNumeroJugadores()){
            if (posXDestino>=0 && posXDestino<15 && posYDestino>=0 && posYDestino<15)
                jugadorAsociado.dispararMisil(jugadorADisparar,posXDestino,posYDestino);
                return true;
        }
        return false;
    }  
}
