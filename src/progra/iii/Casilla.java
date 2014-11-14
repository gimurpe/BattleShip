/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

/**
 *
 * @author Luis Diego
 */
public final class Casilla {
    private Componente componenteAsociado;
    private int fila;
    private int columna;
    
    public Casilla(int pFila, int pColumna){
        componenteAsociado = null;
        fila = pFila;
        columna = pColumna;
    }
    
    public void setComponente(Componente pComponente){
        componenteAsociado = pComponente;
    }
    
    public Componente getComponente(){
        return componenteAsociado;
    }
    
    public String toString(){
        String mensaje = "La casilla: "+fila+"x"+columna+" tiene: ";
        if (componenteAsociado instanceof Mina)
            return (mensaje.concat("Mina"));
        else if (componenteAsociado instanceof Templo)
            return (mensaje.concat("Templo"));
        else if (componenteAsociado instanceof Conector)
            return (mensaje.concat("Conector"));
        else if(componenteAsociado instanceof Mundo)
            return (mensaje.concat("Mundo"));
        else if(componenteAsociado instanceof HoyoNegro)
            return (mensaje.concat("Hoyo Negro"));
        else if (componenteAsociado instanceof Armeria)
            return (mensaje.concat("Armeria"));
        return (mensaje.concat("No tiene nada"));
    }
    public String codificarCasilla(int jugadorQuePideVerCasillas){
        String mensaje = "";
        if (componenteAsociado!=null && componenteAsociado.getVisibilidadJugadores().contains(jugadorQuePideVerCasillas)){
            if (componenteAsociado instanceof Mina)
                return (mensaje.concat("1"));
            else if (componenteAsociado instanceof Templo)
                return (mensaje.concat("2"));
            else if (componenteAsociado instanceof Conector)
                return (mensaje.concat("3"));
            else if(componenteAsociado instanceof Mundo)
                return (mensaje.concat("4"));
            else if (componenteAsociado instanceof Armeria)
                return (mensaje.concat("5"));
            else if (componenteAsociado instanceof HoyoNegro)
                return(mensaje.concat("6"));
        }
        return (mensaje.concat("0"));
      
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    
    
}
