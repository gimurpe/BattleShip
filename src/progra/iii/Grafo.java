/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;
import java.util.*;
/**
 *
 * @author Calo
 */
public class Grafo {
    ArrayList <Componente> componentes;
    private boolean disconexo;
    
    public Grafo(){
        componentes = new ArrayList<Componente>();
        disconexo = false;
    }

    // agrega a la lista
    public void agregarComponente(Componente pComponente)
    {
        componentes.add(pComponente);
    }

    // agrega las aristas con peso
    public void agregarArista(Componente origen, Componente destino, int peso)
    {
        if (origen != null && destino != null)
            origen.agregarArista(destino, peso);
    }

    // busca un vertice en la lista
    public Componente buscarComponente (int id){

        for (int i = 0; i < componentes.size(); i++) {
            if (componentes.get(i).getId() == id)
                return componentes.get(i);
        }
        return null;
    }

    // imprime la lista con sus listas de adyacencia
    public void imprimir ()
    {
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < componentes.size(); i++)
        {
            System.out.print("Componente "+ componentes.get(i).getPrecio() + ":  ");
            for (int j = 0; j < componentes.get(i).aristas.size(); j++) {
                System.out.print(componentes.get(i).aristas.get(j).getComponente().getPrecio() + "  ");
            }
            System.out.println("");
        }
        System.out.println("----------------------------------------------------------");

    }

    // elimina un vertice, de la lista y de las listas de adyacencia
    // imprime la lista con sus listas de adyacencia
    public void eliminar (Componente c)
    {
        for (int i = 0; i < componentes.size(); i++)
        {
            for (int j = 0; j < componentes.get(i).aristas.size(); j++) {
                if (componentes.get(i).aristas.get(j).getComponente() == c)
                    componentes.get(i).aristas.remove(j);
            }
        }
        componentes.remove(c);
    }   

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }
    
    // Recorrido PROFUNDIDAD
    public void profundidad(Componente componente){
        for (int i = 0; i < componente.getAristas().size(); i++){   // Recorre todos los componentes de las aristas
            if(componente.getAristas().get(i).getComponente().isVisitado() == false){
                visitarAdyacentes(componente.getAristas().get(i).getComponente());
            }
        }
        limpiarVisitados();// quita todos los nodos visitados
    }
    // Visita los nodos en la lista de adyacencia
    public void visitarAdyacentes(Componente nodo){
        visitarVertice(nodo);
        if (nodo instanceof Mundo)
            this.setDisconexo(true);
        //System.out.print(nodo.getId() + "  ");
        // para cada arista
        for (int i = 0; i < nodo.aristas.size(); i++){
            // marca cada uno de los adyacentes
            if (visitadoVertice(nodo.aristas.get(i).getComponente()) == false){
                visitarAdyacentes(nodo.aristas.get(i).getComponente());
            }
        }
    }

    public void visitarVertice(Componente nodo){
        nodo.setVisitado(true);
    }

    public boolean visitadoVertice(Componente nodo){
        return nodo.isVisitado();    
    }

    public void limpiarVisitados(){
        for (int i = 0; i < componentes.size(); i++) {
            Componente componente = componentes.get(i);
            componente.setVisitado(false);
        }
    }

    public boolean isDisconexo() {
        return disconexo;
    }

    public void setDisconexo(boolean disconexo) {
        this.disconexo = disconexo;
    }
    
    
}