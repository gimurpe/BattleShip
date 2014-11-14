/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

/**
 *
 * @author Calo
 */
public class Armeria  extends Componente{
    private int tipo;
    private boolean posicion;
    
    public Armeria(Jugador pJugador, int pTipo){
        super(1000,pJugador);
        tipo = pTipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setPosicion(boolean posicion) {
        this.posicion = posicion;
    }

    public boolean isPosicion() {
        return posicion;
    }
    
    
    
}
