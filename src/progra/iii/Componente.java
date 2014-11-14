
package progra.iii;

import java.util.*;


public abstract class Componente {
   protected ArrayList<Casilla> casillasAsociadas;
   protected ArrayList <Integer> visibilidadJugadores;
   protected ArrayList <Arista> aristas;    // Arreglo de aristas donde se conecta
   protected Jugador jugador;
   protected boolean visitado;
   protected int precio;
   protected int id;
   protected static int idGeneral = 1;

   Componente(int pPrecio,Jugador pJugador){
       casillasAsociadas = new ArrayList();
       visibilidadJugadores = new ArrayList();
       aristas = new ArrayList();
       setPrecio(pPrecio);
       setVisitado(false);
       setJugador(pJugador);
       setId(idGeneral);
       visibilidadJugadores.add(jugador.getNumero());
       idGeneral++;
   }
   
   public void agregarArista (Componente componente, int pesoArista){
        // si no está la arista para no repetir
        if (buscarArista(componente) == false)
            aristas.add(new Arista(componente, pesoArista));
   }
   
   public boolean buscarArista(Componente componente){
        for (int i = 0; i<aristas.size();i++){
            if(aristas.get(i).getComponente() == componente ){
                return true;
            }
        }       
       return false;
   }

   public ArrayList <Integer> getVisibilidadJugadores() {
        return visibilidadJugadores;
   }

   public ArrayList <Arista> getAristas() {
        return aristas;
    }

   public int getPrecio() {
        return precio;
    }

   public boolean isVisitado() {
        return visitado;
    }

   public void setVisibilidadJugadores(ArrayList <Integer> visibilidadJugadores) {
        this.visibilidadJugadores = visibilidadJugadores;
    }

   public void setAristas(ArrayList <Arista> aristas) {
        this.aristas = aristas;
    }

   public void setPrecio(int precio) {
        this.precio = precio;
    }

   public void setVisitado(boolean visitado) {
        this.visitado = visitado;
   }
   
   public void setCasillasAsociadas(ArrayList<Casilla> pCasillas){
       for (int i = 0;i<pCasillas.size();i++){
           pCasillas.get(i).setComponente(this);
       }
       casillasAsociadas = pCasillas;
   }
   public ArrayList<Casilla> getCasillasAsociadas(){
       return casillasAsociadas;
   }

    public int getId() {
        return id;
    }

    public static int getIdGeneral() {
        return idGeneral;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

}
