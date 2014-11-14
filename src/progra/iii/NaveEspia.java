/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Diego
 */
public class NaveEspia extends Arma {
    
    public NaveEspia(Jugador jugadorAsociado){
        super(0,0,2500,jugadorAsociado);
    }

    @Override
    public boolean disparar(int posXDestino, int posYDestino, int jugadorADisparar) {
        try {
            jugadorAsociado.getSalida().writeInt(3);
            jugadorAsociado.getSalida().writeInt(jugadorADisparar);
            jugadorAsociado.quitarArma(this);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(NaveEspia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
        
    }
    
}
