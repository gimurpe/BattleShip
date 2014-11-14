/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Diego
 */
public class Templo extends Componente implements Runnable {
    private Thread threadTemplo;
    private boolean posicion;


    public Templo(Jugador pJugador){
        super(2500,pJugador);
        threadTemplo = new Thread(this, "Thread" + this.getId());
        threadTemplo.start();
    }

    @Override
    public void run() {
        while (super.getCasillasAsociadas()!=null){
            try {
                if (this.jugador.getComodin() || this.jugador.getCantEscudos() > 0){
                    Thread.sleep(500);
                }
                else{
                    Thread.sleep(300000);
                    this.jugador.setComodin(true);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Templo.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println("Thread Templo: " + getId() + " corriendo");   
        }
    }
    
    public void setPosicion(boolean pPosicion){
        posicion = pPosicion;
    }
    
    public boolean getPosicion(){
        return posicion;
    }
}
