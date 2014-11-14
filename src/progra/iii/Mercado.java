/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

/**
 *
 * @author Calo
 */
public class Mercado  extends Componente{
    
    private boolean posicion;
    
    public Mercado(Jugador pJugador){
        super(2000,pJugador);
    }
    
    public boolean intercambiar(int jugadorAIntercambiar) {
        if (jugadorAIntercambiar != jugador.getNumero() && jugadorAIntercambiar > 0 && jugadorAIntercambiar <= super.jugador.getNumeroJugadores()){
                // Logica del intercambio
                
                
                
                return true;
        }
        return false;
    }
    

    public void setPosicion(boolean posicion) {
        this.posicion = posicion;
    }

    public boolean isPosicion() {
        return posicion;
    }
    
}
