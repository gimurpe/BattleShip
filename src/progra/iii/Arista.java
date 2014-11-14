/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

/**
 *
 * @author Calo
 */
public class Arista {
    
    private Componente componente;
    private int peso;
    
    Arista(Componente pComponente, int pPeso){
        setComponente(pComponente);
        setPeso(pPeso);
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Componente getComponente() {
        return componente;
    }

    public int getPeso() {
        return peso;
    }
}
