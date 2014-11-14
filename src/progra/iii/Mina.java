
package progra.iii;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mina extends Componente implements Runnable{
    private Thread threadMina;
    private boolean posicion;
    
    public Mina(Jugador pJugador){
        super(1000,pJugador);
        threadMina = new Thread(this, "Thread" + this.getId());
        threadMina.start();
    }
    
    @Override
    public void run() {
        while (super.getCasillasAsociadas() != null){
            try {
                Thread.sleep(60000);
                jugador.setKgAcero(jugador.getKgAcero()+50);            
            } catch (InterruptedException ex) {
                Logger.getLogger(Mina.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println("Thread Mina: " + getId() + " corriendo");

        }
    }
    
    public void setPosicion(boolean pPosicion){
        posicion = pPosicion;
    }
    
    public boolean getPosicion(){
        return posicion;
    }
}
