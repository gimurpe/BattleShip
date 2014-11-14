/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

/**
 *
 * @author Luis Diego
 */
public abstract class Arma {
    protected int alcanceX;
    protected int alcanceY;
    protected int costo;
    protected Jugador jugadorAsociado;
    
    public Arma(int pAlcanceX, int pAlcanceY,int pCosto,Jugador pJugador){
        setAlcanceX(pAlcanceX);
        setAlcanceY(pAlcanceY);
        setCosto(pCosto);
        jugadorAsociado = pJugador;
    }
    public void setJugador(Jugador pJugador){
        jugadorAsociado = pJugador;
    }
    public Jugador getJugdor(){
        return jugadorAsociado;
    }
    public void setAlcanceX(int pAlcanceX){
        alcanceX = pAlcanceX;
    }
    public void setAlcanceY(int pAlcanceY){
        alcanceY = pAlcanceY;
    }
    public void setCosto(int pCosto){
        costo = pCosto;
    }
    public int getAlcanceX(){
        return alcanceX;
    }
    public int getAlcanceY(){
        return alcanceY;
    }
    public int getCosto(){
        return costo;
    }
    public abstract boolean disparar(int posXDestino, int posYDestino, int jugadorADisparar);   
}
