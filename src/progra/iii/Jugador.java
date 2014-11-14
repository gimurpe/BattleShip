/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

import interfaz.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Jugador {
    private int numeroJugadores = 1;
    private int numero;
    private String nombre;
    private int dinero;
    private int kgAcero;
    private Grafo grafo;
    public static String IP_SERVER = "localhost"; //IP del Servidor "192.168.0.101"
    private DataInputStream entrada = null;//leer comunicacion
    private DataOutputStream salida = null;//escribir comunicacion
    private Socket cliente = null;//para la comunicacion
    private ArrayList <ArrayList<Casilla>> matriz;
    private ArrayList <Arma> armas;
    private ArrayList <Componente> componentesDisponibles;
    private InicioJuego ventanaInicio;
    private Plataforma plataforma = null;
    private boolean comodin;
    private boolean aciertoAComponente;
    private boolean turno;
    private int cantEscudos;
    
    public Jugador(String pNombre,InicioJuego pVentanaInicio){
        turno = false;
        cantEscudos = 0;
        aciertoAComponente = false;
        setNombre(pNombre);
        setDinero(400000);
        setKgAcero(100000);
        setComodin(false);
        Mundo mundoInicial = new Mundo(this);        
        componentesDisponibles = new ArrayList();
        componentesDisponibles.add(mundoInicial);   // Cada jugador comienza con un mundo
        grafo = new Grafo();
        ventanaInicio = pVentanaInicio;
        Casilla casilla;
        ArrayList <Casilla> fila;
        matriz = new ArrayList();
        armas = new ArrayList();
        for (int i = 0; i<15 ; i++){
            fila = new ArrayList();
            for (int j = 0; j<15; j++){
                casilla = new Casilla(i,j);
                fila.add(casilla);
            }
            matriz.add(fila);   
        }
    }
    
    public void conexion() throws IOException {
       try {
           // se conecta con dos sockets al server, uno comunicacion otro msjes
          cliente = new Socket(Jugador.IP_SERVER, 8081);
          // inicializa las entradas-lectura y salidas-escritura
          entrada = new DataInputStream(cliente.getInputStream());
          salida = new DataOutputStream(cliente.getOutputStream());
          // solicita el nombre del user
          nombre = JOptionPane.showInputDialog("Introducir Nick :");
          salida.writeUTF(nombre);
          System.out.println("1. Envia el nombre del cliente: "+nombre);
          turno = true;
       } catch (IOException e) {
          System.out.println("\tEl servidor no esta levantado");
          System.out.println("\t=============================");
       }
       //new threadCliente(entrada, ventanaCliente).start();
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setKgAcero(int kgAcero) {
        this.kgAcero = kgAcero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public int getKgAcero() {
        return kgAcero;
    }

    public Grafo getGrafo() {
        return grafo;
    }
    
    public Casilla getCasillaMatriz(int fila, int columna){
        Casilla casilla = matriz.get(fila).get(columna);
        return casilla;
    }

    public ArrayList<ArrayList<Casilla>> getMatriz() {
        return matriz;
    }
   
    public void unirseAPartida(){
        try{
         cliente = new Socket(Jugador.IP_SERVER, 8081);
         // inicializa las entradas-lectura y salidas-escritura
         entrada = new DataInputStream(cliente.getInputStream());
         salida = new DataOutputStream(cliente.getOutputStream());
         salida.writeUTF(this.nombre);
         setNumero(entrada.readInt());
         numeroJugadores = entrada.readInt();
         System.out.println(this.numeroJugadores);
        System.out.println("1. Envia el nombre del cliente: ");
      } catch (IOException e) {
         System.out.println("\tEl servidor no esta levantado");
         System.out.println("\t=============================");
      }
    }
    
    public void crearPartida(int numeroJugadores) throws IOException 
   {
      try {
          // se conecta con dos sockets al server, uno comunicacion otro msjes
         cliente = new Socket(Jugador.IP_SERVER, 8081);
         // inicializa las entradas-lectura y salidas-escritura
         entrada = new DataInputStream(cliente.getInputStream());
         salida = new DataOutputStream(cliente.getOutputStream());
         // es lo primero que envia al server
         // el thread servidor esta pendiente de leer el nombre antes de entrar
         // al while para leer opciones
         salida.writeInt(numeroJugadores);
         salida.writeUTF(this.nombre);
         setNumero(entrada.readInt());
         this.numeroJugadores = entrada.readInt();
         System.out.println(this.numeroJugadores);
         System.out.println("1. Envia el nombre del cliente: ");
         turno = true;
      } catch (IOException e) {
         System.out.println("\tEl servidor no esta levantado");
         System.out.println("\t=============================");
      }
      // solo se le pasa entrada pues es solo para leer mensajes
      // el hiloCliente lee lo que el servidor le envia, opciones y como tiene referencia
      // a la ventana gato puede colocar en la pantalla cualquier cosa, como las
      //imagenes de X o O, llamar a metodo marcar, colocar el nombre de enemigo
      // o el suyo propio
      
   }
    
    public void dispararMultiShot(int pJugadorADisparar,int pCasillaX, int pCasillaY){
        try {
            salida.writeInt(1);
            salida.writeInt(pJugadorADisparar);
            salida.writeInt(pCasillaX);
            salida.writeInt(pCasillaY);
            if (entrada.readBoolean()){
                for (int i = 0;i<4;i++){
                    salida.writeInt(1);
                    int casillaX = (int)(Math.random()*(15)+0);
                    int casillaY = (int)(Math.random()*(15)+0);
                    dispararMisil(pJugadorADisparar,casillaX,casillaY);
                    
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void quitarArma(Arma pArma){
        armas.remove(pArma);
    }

    public DataOutputStream getSalida() {
        return salida;
    }
    public DataInputStream getEntrada(){
        return entrada;
    }
    public Socket getCliente(){
        return cliente;
    }
    public Plataforma getVentanaPlataforma(){
        return plataforma;
    }
    public void setVentanaPlataforma (Plataforma pPlataforma){
        plataforma = pPlataforma;
    }
    
    public boolean agregarMercado(int fila, int columna, boolean posicion, Conector conector){
        Mercado mercadoNuevo;
        Casilla casilla;
        Casilla casilla2;
         if (posicion){
            if (fila < 14){
                casilla = getCasillaMatriz(fila,columna);
                casilla2 = getCasillaMatriz(fila+1,columna);
                 if ((casilla.getComponente() == null )&& (casilla2.getComponente() == null)){
                    mercadoNuevo = new Mercado(this);
                    mercadoNuevo.setPosicion(posicion);
                    grafo.agregarComponente(mercadoNuevo);
                    colocarComponente(casilla,casilla2, mercadoNuevo,conector);
                    return true;
                }
            }
        }
        else{
            if (columna < 14){
                casilla = getCasillaMatriz(fila,columna);
                casilla2 = getCasillaMatriz(fila,columna+1);
                 if ((casilla.getComponente() == null )&& (casilla2.getComponente() == null)){
                    mercadoNuevo = new Mercado(this);
                    mercadoNuevo.setPosicion(posicion);
                    grafo.agregarComponente(mercadoNuevo);
                    colocarComponente(casilla,casilla2, mercadoNuevo,conector);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean agregarMina(int fila, int columna, boolean posicion, Conector conector){
        Mina minaNueva;
        Casilla casilla;
        Casilla casilla2;
         if (posicion){
            if (fila < 14){
                casilla = getCasillaMatriz(fila,columna);
                casilla2 = getCasillaMatriz(fila+1,columna);
                 if ((casilla.getComponente() == null )&& (casilla2.getComponente() == null)){
                    minaNueva = new Mina(this);
                    minaNueva.setPosicion(posicion);
                    grafo.agregarComponente(minaNueva);
                    colocarComponente(casilla,casilla2, minaNueva,conector);
                    return true;
                }
            }
        }
        else{
            if (columna < 14){
                casilla = getCasillaMatriz(fila,columna);
                casilla2 = getCasillaMatriz(fila,columna+1);
                 if ((casilla.getComponente() == null )&& (casilla2.getComponente() == null)){
                    minaNueva = new Mina(this);
                    minaNueva.setPosicion(posicion);
                    grafo.agregarComponente(minaNueva);
                    colocarComponente(casilla,casilla2, minaNueva,conector);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean agregarTemplo(int fila, int columna, boolean posicion, Conector conector){
        Templo temploNuevo;
        Casilla casilla;
        Casilla casilla2;
         if (posicion){
            if (fila < 14){
                casilla = getCasillaMatriz(fila,columna);
                casilla2 = getCasillaMatriz(fila+1,columna);
                 if ((casilla.getComponente() == null )&& (casilla2.getComponente() == null)){
                    temploNuevo = new Templo(this);
                    temploNuevo.setPosicion(posicion);
                    grafo.agregarComponente(temploNuevo);
                    colocarComponente(casilla,casilla2, temploNuevo,conector);
                    return true;
                }
            }
        }
        else{
            if (columna < 14){
                casilla = getCasillaMatriz(fila,columna);
                casilla2 = getCasillaMatriz(fila,columna+1);
                 if ((casilla.getComponente() == null )&& (casilla2.getComponente() == null)){
                    temploNuevo = new Templo(this);
                    temploNuevo.setPosicion(posicion);
                    grafo.agregarComponente(temploNuevo);
                    colocarComponente(casilla,casilla2, temploNuevo,conector);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean agregarArmeria(int fila, int columna, boolean posicion, Conector conector, int tipo){
        Armeria armeriaNueva;
        Casilla casilla;
        Casilla casilla2;
         if (posicion){
            if (fila < 14){
                casilla = getCasillaMatriz(fila,columna);
                casilla2 = getCasillaMatriz(fila+1,columna);
                 if ((casilla.getComponente() == null )&& (casilla2.getComponente() == null)){
                    armeriaNueva = new Armeria(this,tipo);
                    armeriaNueva.setPosicion(posicion);
                    grafo.agregarComponente(armeriaNueva);
                    colocarComponente(casilla,casilla2, armeriaNueva,conector);
                    return true;
                }
            }
        }
        else{
            if (columna < 14){
                casilla = getCasillaMatriz(fila,columna);
                casilla2 = getCasillaMatriz(fila,columna+1);
                 if ((casilla.getComponente() == null )&& (casilla2.getComponente() == null)){
                    armeriaNueva = new Armeria(this,tipo);
                    armeriaNueva.setPosicion(posicion);
                    grafo.agregarComponente(armeriaNueva);
                    colocarComponente(casilla,casilla2, armeriaNueva,conector);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean agregarMundo(int fila, int columna){
        Mundo mundo;
        if(fila < 14 && columna < 14){
            Casilla casilla1 = getCasillaMatriz (fila,columna);
            Casilla casilla2 = getCasillaMatriz (fila+1,columna);
            Casilla casilla3 = getCasillaMatriz (fila,columna+1);
            Casilla casilla4 = getCasillaMatriz (fila+1,columna+1);
            if ((casilla1.getComponente() == null)&&(casilla2.getComponente() == null)&&(casilla3.getComponente() == null)&&(casilla4.getComponente() == null)){
                mundo = new Mundo(this);
                grafo.agregarComponente(mundo);
                colocarMundo(casilla1,casilla2,casilla3,casilla4,mundo);
                return true;
            }
        }
        
        return false;
    }
    
    public void colocarMundo(Casilla casilla1, Casilla casilla2, Casilla casilla3, Casilla casilla4, Componente mundo){
        ArrayList <Casilla> arreglo = new ArrayList();
        casilla1.setComponente(mundo);
        casilla2.setComponente(mundo);
        casilla3.setComponente(mundo);
        casilla4.setComponente(mundo);
        arreglo.add(casilla1);
        arreglo.add(casilla2);
        arreglo.add(casilla3);
        arreglo.add(casilla4);
        mundo.setCasillasAsociadas(arreglo);        
    }
    
    public void colocarComponente(Casilla casilla, Casilla casilla2,Componente componente, Componente conector){
        ArrayList <Casilla> arreglo = new ArrayList();
        casilla.setComponente(componente);
        casilla2.setComponente(componente);
        arreglo.add(casilla);
        arreglo.add(casilla2);
        componente.setCasillasAsociadas(arreglo);
        int peso = this.calcularPeso(componente, conector);
        conector.agregarArista(componente,peso);
        componente.agregarArista(conector, peso);
    }
    
    public int calcularPeso(Componente componente, Componente conector){
        int peso = 0;
        int filaComponente = componente.getCasillasAsociadas().get(0).getFila();
        int columnaComponente = componente.getCasillasAsociadas().get(0).getColumna();
        int filaConector = conector.getCasillasAsociadas().get(0).getFila();
        int columnaConector = conector.getCasillasAsociadas().get(0).getColumna();
        
        if (filaComponente < filaConector){
            for (int i = filaComponente; i < filaConector; i++){ // For para calcular la distancia en filas
                peso += 1000;
            }
            if (columnaComponente < columnaConector){
                for (int i = columnaComponente; i < columnaConector ; i++){ // For para calcular la distancia en columnas
                    peso += 1000;
                }
            }
            else{
                for (int i = columnaConector; i < columnaComponente ; i++){ // For para calcular la distancia en columnas
                    peso += 1000;
                }
            }
        }
        else{
            if (filaConector != filaComponente){
                for (int i = filaConector; i < filaComponente; i++){ // For para calcular la distancia en filas
                    peso += 1000;
                }
            }
            if (columnaComponente < columnaConector){
                for (int i = columnaComponente; i < columnaConector ; i++){ // For para calcular la distancia en columnas
                    peso += 1000;
                }
            }
            else{
                for (int i = columnaConector; i < columnaComponente ; i++){ // For para calcular la distancia en columnas
                    peso += 1000;
                }
            }
        }
        return peso;
    }
    
    
    
   
    
    public void buscarDisconexos(int jugadorDisparo){
        ArrayList <Componente> disconexos = new ArrayList();
        for (int i = 0; i< grafo.getComponentes().size();i++){
            if (!(grafo.getComponentes().get(i) instanceof Conector) && !(grafo.getComponentes().get(i) instanceof Mundo)){
                if(verSiDisconexo(grafo.getComponentes().get(i))){
                    disconexos.add(grafo.getComponentes().get(i));
                }
            }
        }
        for (int i = 0; i< disconexos.size() ; i++){
            disconexos.get(i).getVisibilidadJugadores().add(jugadorDisparo);
        }
    }
    
    public boolean verSiDisconexo(Componente componente){ // Verifico si un componente dado no tiene ningun conector
        for (int i = 0; i<componente.getAristas().size(); i++){
            if (componente.getAristas().get(i).getComponente() instanceof Conector)
                return false;
        }
        return true;
    }
    
    
    public void quitarMina_Templo_Armeria(int fila, int columna){
        // Obtengo la mina de la casilla
        Componente componente = this.getCasillaMatriz(fila, columna).getComponente();
        componente.getCasillasAsociadas().get(0).setComponente(null);
        componente.getCasillasAsociadas().get(1).setComponente(null);
        componente.getCasillasAsociadas().removeAll(componente.getCasillasAsociadas());
        this.grafo.eliminar(componente);
    }
    
    public void quitarMundo(int fila, int columna){
        Mundo mundo = (Mundo)this.getCasillaMatriz(fila, columna).getComponente();
        mundo.getCasillasAsociadas().get(0).setComponente(null);
        mundo.getCasillasAsociadas().get(1).setComponente(null);
        mundo.getCasillasAsociadas().get(2).setComponente(null);
        mundo.getCasillasAsociadas().get(3).setComponente(null);
        mundo.getCasillasAsociadas().removeAll(mundo.getCasillasAsociadas());
        this.grafo.eliminar(mundo);
    }
    
    public boolean agregarConector(int fila, int columna, Componente componente){
        Conector conector;
        ArrayList <Casilla> arreglo;
        Casilla casilla = getCasillaMatriz(fila,columna);
        if (casilla.getComponente() == null){
            conector = new Conector(this);
            arreglo = new ArrayList();
            casilla.setComponente(conector);
            arreglo.add(casilla);
            conector.setCasillasAsociadas(arreglo);
            this.grafo.agregarComponente(conector);
            int peso = calcularPeso(conector,componente);
            conector.agregarArista(componente, peso);
            componente.agregarArista(conector, peso);
            return true;
        }
        return false;
    }
    
    public void quitarConector(Conector conector, int jugadorDisparo){
        Casilla casilla = conector.getCasillasAsociadas().get(0);
        casilla.setComponente(null);    // Desligo el conector de la casilla
        conector.getCasillasAsociadas().removeAll(conector.getCasillasAsociadas());     // Elimino las casiilas asociadas 
        conector.getAristas().removeAll(conector.getAristas()); // Elimino las aristas del conector
        this.grafo.eliminar(conector); // Elimino el conector y las aristas que lo contienen
        this.buscarDisconexos(jugadorDisparo);
    }

    public boolean getComodin() {
        return comodin;
    }

    public void setComodin(boolean comodin) {
        this.comodin = comodin;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public ArrayList<Componente> getComponentesDisponibles() {
        return componentesDisponibles;
    }

    public boolean isComodin() {
        return comodin;
    }
    
     public void dispararMisil(int pJugadorADisparar,int pCasillaX, int pCasillaY){
        try {
            salida.writeInt(1);
            salida.writeInt(pJugadorADisparar);
            salida.writeInt(pCasillaX);
            salida.writeInt(pCasillaY);
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void aciertoAMundo(){
        dinero += 10000;
    }
    public void verSiDisparoMundo(int pCasillaX, int pCasillaY){
        Casilla casillaDisparo = getCasillaMatriz(pCasillaX,pCasillaY);
        
        try {
            salida.writeInt(2);
            if (casillaDisparo.getComponente()!=null)
                salida.writeBoolean(casillaDisparo.getComponente() instanceof Mundo);
            else{
                salida.writeBoolean(false);
            }
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void recibirDisparo(int pCasillaX, int pCasillaY,int pJugadorQueDisparo){
        
        try{
            if (this.getCantEscudos() == 0){
                salida.flush();
                Casilla casillaDisparo = getCasillaMatriz(pCasillaX, pCasillaY);
                salida.writeBoolean(casillaDisparo.getComponente()!=null);
                if(casillaDisparo.getComponente()!=null){
                    if(casillaDisparo.getComponente() instanceof HoyoNegro){
                        HoyoNegro hoyoNegro = (HoyoNegro) casillaDisparo.getComponente();
                        hoyoNegro.devolverDisparo(pJugadorQueDisparo);
                        salida.writeInt(4);
                        salida.writeUTF("Servidor: El jugador "+pJugadorQueDisparo+" acerto en un Hoyo Negro del jugador "+ numero+"\n");
                    }
                    else{
                        quitarComponente(casillaDisparo.getComponente(),pJugadorQueDisparo);        
                    }

                }
            }
            else{
                cantEscudos--;
            }
                
        }
        catch (Exception e){
            
        }
    }
    
    public void traducirMatriz(ArrayList<ArrayList<Casilla>> matriz){
        for(int i=0; i<matriz.size();i++){
            for(int j=0; j<matriz.size();j++){
                if (matriz.get(i).get(j).getComponente()!= null){
                    if (matriz.get(i).get(j).getComponente().getVisibilidadJugadores().contains(this.getNumero())){
                        Componente componente = matriz.get(i).get(j).getComponente();
                        int fila = componente.getCasillasAsociadas().get(0).getFila();
                        int columna = componente.getCasillasAsociadas().get(0).getColumna();
                        int indice = fila * 15 + columna;
                        JButton bComponente = this.getVentanaPlataforma().getListaBotones().get(indice);
                        traducirMatriz(bComponente,componente);
                    }
                }
            }
        }
    }
    
    public void traducirMatriz(JButton bComponente, Componente componente){
        if (componente instanceof Mina){
            Mina mina = (Mina)componente;
            if (mina.getPosicion())
                this.getVentanaPlataforma().ponerMina1x2(bComponente);
            else
                this.getVentanaPlataforma().ponerMina2x1(bComponente);               
        }
        else if (componente instanceof Templo){
            Templo templo = (Templo)componente;
            if (templo.getPosicion())
                this.getVentanaPlataforma().ponerTemplo1x2(bComponente);
            else
                this.getVentanaPlataforma().ponerTemplo2x1(bComponente);  
        }
        else if (componente instanceof Mundo)
            this.getVentanaPlataforma().ponerPlaneta(bComponente);
        else if (componente instanceof Conector)
            this.getVentanaPlataforma().ponerConector(bComponente);
        
    }
    
    public boolean hayArmeria(){
        for (int i=0;i<grafo.getComponentes().size();i++){
            if (grafo.getComponentes().get(i) instanceof Armeria){
                return true;
            }
        }
        return false;
    }
    
    public boolean hayMercado(){
        for (int i=0;i<grafo.getComponentes().size();i++){
            if (grafo.getComponentes().get(i) instanceof Mercado){
                return true;
            }
        }
        return false;
    }
    
    public boolean disparar (int tipoArma, int pCasillaX, int pCasillaY, int pJugadorADisparar){
         if (tipoArma == 0){
             if(getHayMisil()){
                 Misil misilADisparar = getMisil();
                 return misilADisparar.disparar(pCasillaX, pCasillaY, pJugadorADisparar);
             }  
         }
         else if (tipoArma == 1){
            if (getHayBomba()){
                Bomba bomba = getBomba();
                return bomba.disparar(pCasillaX,pCasillaY,pJugadorADisparar);
            }
         }
         else if(tipoArma == 2){
             if (getHayComboShot()){
                 ComboShot comboShot = getComboShot();
                 return comboShot.disparar(pCasillaX, pCasillaY, pJugadorADisparar);
             }
         }
         else if(tipoArma == 3){
             if (getHayMultiShot()){
                 MultiShot multiShot = getMultiShot();
                 return multiShot.disparar(pCasillaX,pCasillaY,pJugadorADisparar);
             }
         }
         else if(tipoArma ==4){
             if (getHayNave()){
                 NaveEspia naveEspia = getNaveEspia();
                 return naveEspia.disparar(pCasillaX,pCasillaY,pJugadorADisparar);
             }
             
         }
        return false;
     }
    
    public boolean getHayBomba(){
        for (int i = 0; i<armas.size();i++){
            if(armas.get(i) instanceof Bomba){
                return true;
            } 
        }
        return false;
    }
    public Bomba getBomba(){
        for (int i = 0;i<armas.size();i++){
            if (armas.get(i) instanceof Bomba){
                return (Bomba)armas.get(i);
            }
        }
        return null;
    }
    
    public Misil getMisil(){
         for (int i = 0;i<armas.size();i++){
             if (armas.get(i) instanceof Misil){
                 return (Misil) armas.get(i);
             }
         }
         return null;
     }
    
    public boolean getHayMisil(){
        boolean resultado = false;
        for(int i = 0;i<armas.size();i++){
            if (armas.get(i) instanceof Misil){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public  int getNumeroJugadores() {
        return numeroJugadores;
    }
     public void finalizarTurno(){
        try {
            turno = false;
            salida.writeInt(10);
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void quitarComponenteGrafico(Componente componente)
    {
        for(int i=0;i<componente.getCasillasAsociadas().size();i++)
        {
            int fila = componente.getCasillasAsociadas().get(i).getFila();
            int columna = componente.getCasillasAsociadas().get(i).getColumna();
            int indice = fila * 15 + columna;
            JButton bComponente = this.getVentanaPlataforma().getListaBotones().get(indice);
            this.getVentanaPlataforma().borrarComponente(bComponente);
        }
    }
    
    public int getCantMundos(){
        int cantMundos = 0;
        for (int i=0;i<grafo.getComponentes().size();i++){
            if (grafo.getComponentes().get(i) instanceof Mundo)
                cantMundos++;
        }
        return cantMundos;
    }
    
    public void ponerDisconexos(int jugadorDisparo){
        for (int i = 0; i<grafo.getComponentes().size();i++){
            if (grafo.getComponentes().get(i).getVisibilidadJugadores().contains(jugadorDisparo) == false)    
                grafo.getComponentes().get(i).getVisibilidadJugadores().add(jugadorDisparo);
        }
    }
    
    public ComboShot getComboShot() {
       for (int i = 0 ;i<armas.size();i++){
           if (armas.get(i) instanceof ComboShot){
               return (ComboShot)armas.get(i);
           }
       }
       return null;    
    }
    public boolean getHayComboShot(){
       for (int i = 0 ;i<armas.size();i++){
           if (armas.get(i) instanceof ComboShot){
               return true;
           }
       }
       return false;    
    }
    
    public void setAciertoComponente(boolean pAcierto){
        aciertoAComponente = pAcierto;
        
    }
    public boolean getACiertoComponente(){
        return aciertoAComponente;
    }
    
     public boolean getHayMultiShot(){
        for (int i = 0 ;i<armas.size();i++){
           if (armas.get(i) instanceof MultiShot){
               return true;
           }
       }
       return false;    
    }
    public MultiShot getMultiShot() {
       for (int i = 0 ;i<armas.size();i++){
           if (armas.get(i) instanceof MultiShot){
               return (MultiShot)armas.get(i);
           }
       }
       return null;    
    }
    public void agregarNaveEspia()
    {
        
        if(this.kgAcero >= 2500){
            this.kgAcero-=2500;
            NaveEspia naveEspacial = new NaveEspia(this);
            this.armas.add(naveEspacial);
        }
    }
    
    public void enviarInformacionNave() throws IOException {
        String informacionNave = "La nave Espia ha vuelto con: \n";
        salida.writeInt(5);
        int cantidadComponentes = ((grafo.getComponentes().size()*25)/100);
        for (int i=0;i<cantidadComponentes;i++){
            System.out.println("Recolectando informacion");
            informacionNave += ("El grafo del enemigo tiene un: "+grafo.getComponentes().get(i).getCasillasAsociadas().get(0).toString()+"\n");
        
        }
        salida.writeUTF(informacionNave);
    }
    
    public boolean getHayNave(){
        for (int i = 0 ;i<armas.size();i++){
           if (armas.get(i) instanceof NaveEspia){
               return true;
           }
       }
       return false;    
    }
    public NaveEspia getNaveEspia(){
        for (int i = 0 ;i<armas.size();i++){
           if (armas.get(i) instanceof NaveEspia){
               return (NaveEspia) armas.get(i);
           }
       }
       return null;        
    }
    
    
    public boolean getHayMina(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Mina){
               return true;
           }
       }
       return false;    
    }
    public Mina getMina(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Mina){
               return (Mina) componentesDisponibles.get(i);
           }
       }
       return null;        
    }
    
    public boolean getHayTemplo(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Templo){
               return true;
           }
       }
       return false;    
    }
    public Templo getTemplo(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Templo){
               return (Templo) componentesDisponibles.get(i);
           }
       }
       return null;        
    }
    
    public boolean getHayMercado(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Mercado){
               return true;
           }
       }
       return false;    
    }
    public Mercado getMercado(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Mercado){
               return (Mercado) componentesDisponibles.get(i);
           }
       }
       return null;        
    }
    
    public boolean getHayMundo(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Mundo){
               return true;
           }
       }
       return false;    
    }
    public Mundo getMundo(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Mundo){
               return (Mundo) componentesDisponibles.get(i);
           }
       }
       return null;        
    }
    
    
    public boolean getHayConector(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Conector){
               return true;
           }
       }
       return false;    
    }
    public Conector getConector(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Conector){
               return (Conector) componentesDisponibles.get(i);
           }
       }
       return null;        
    }
    
    public boolean getHayArmeriaMisil(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Armeria){
               Armeria armeria = (Armeria) componentesDisponibles.get(i);
               if (armeria.getTipo() == 0){
                   return true;
               }
           }
       }
       return false;    
    }
    public Armeria getArmeriaMisil(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Armeria){
               Armeria armeria = (Armeria) componentesDisponibles.get(i);
               if (armeria.getTipo() == 0){
                   return armeria;
               }
           }
       }
       return null;        
    }
    
    public boolean getHayArmeriaBomba(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Armeria){
               Armeria armeria = (Armeria) componentesDisponibles.get(i);
               if (armeria.getTipo() == 1){
                   return true;
               }
           }
       }
       return false;    
    }
    public Armeria getArmeriaBomba(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Armeria){
               Armeria armeria = (Armeria) componentesDisponibles.get(i);
               if (armeria.getTipo() == 1){
                   return armeria;
               }
           }
       }
       return null;        
    }
    
    public boolean getHayArmeriaMultiShot(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Armeria){
               Armeria armeria = (Armeria) componentesDisponibles.get(i);
               if (armeria.getTipo() == 2){
                   return true;
               }
           }
       }
       return false;    
    }
    public Armeria getArmeriaMultiShot(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Armeria){
               Armeria armeria = (Armeria) componentesDisponibles.get(i);
               if (armeria.getTipo() == 2){
                   return armeria;
               }
           }
       }
       return null;        
    }
    
    public boolean getHayArmeriaComboShot(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Armeria){
               Armeria armeria = (Armeria) componentesDisponibles.get(i);
               if (armeria.getTipo() == 3){
                   return true;
               }
           }
       }
       return false;    
    }
    public Armeria getArmeriaComboShot(){
        for (int i = 0 ;i<componentesDisponibles.size();i++){
           if (componentesDisponibles.get(i) instanceof Armeria){
               Armeria armeria = (Armeria) componentesDisponibles.get(i);
               if (armeria.getTipo() == 3){
                   return armeria;
               }
           }
       }
       return null;        
    }

    public void enviarStringMatriz(int jugadorQuePideVerCasillas){
        String casilla = "";
        for(int i = 0;i<15;i++){
            for (int j=0;j<15;j++){
                casilla+=(matriz.get(i).get(j).codificarCasilla(jugadorQuePideVerCasillas));
            }
        }
        try {
            System.out.println(casilla);
            salida.writeInt(7);
            salida.writeUTF(casilla);
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String enviarStringMatriz(){
        String casilla = "";
        for(int i = 0;i<15;i++){
            for (int j=0;j<15;j++){
                casilla+=(matriz.get(i).get(j).codificarCasilla(this.getNumero()));
            }
        }
        return casilla;
        
    }
    public void traducirMatriz(String numeros){
        for(int i=0;i<numeros.length();i++)
        {
         
         if(numeros.charAt(i) == '0')
         {
           this.getVentanaPlataforma().getListaBotones().get(i).setIcon(null);
         }
         
         if(numeros.charAt(i) == '1')
         {
           this.getVentanaPlataforma().getListaBotones().get(i).setIcon(this.getVentanaPlataforma().getMina());
         }
         
         if(numeros.charAt(i) == '2')
         {
           this.getVentanaPlataforma().getListaBotones().get(i).setIcon(this.getVentanaPlataforma().getTemplo());
         }
         
         if(numeros.charAt(i) == '3')
         {
           this.getVentanaPlataforma().getListaBotones().get(i).setIcon(this.getVentanaPlataforma().getConector());
         }
         
         if(numeros.charAt(i) == '4')
         {
           this.getVentanaPlataforma().getListaBotones().get(i).setIcon(this.getVentanaPlataforma().getPlaneta());
         }
        
        if(numeros.charAt(i) == '5')
         {
           this.getVentanaPlataforma().getListaBotones().get(i).setIcon(this.getVentanaPlataforma().getArmeria());
         }
        if(numeros.charAt(i) == '6')
         {
           this.getVentanaPlataforma().getListaBotones().get(i).setIcon(this.getVentanaPlataforma().getHoyoNegro());
         }
        }
        
    }
    
    public void intercambar(int montoAcuerdo, int componente, int jugadorIntercambiar) {
        try {
            salida.writeInt(8);
            salida.writeInt(montoAcuerdo);
            salida.writeInt(componente);
            salida.writeInt(jugadorIntercambiar);
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }

   public void recibirIntercambio(int montoAcordado, int componente, int jugadorQuiereIntercambiar) {
       System.out.println("Intercambio");
       
        try {
            salida.writeInt(9);
            int respuesta = JOptionPane.showConfirmDialog(this.getVentanaPlataforma(),"El Jugador "+
                        String.valueOf(jugadorQuiereIntercambiar)+" quiere intercambiar : "+
                        decodificarComponente(componente)+" por "+String.valueOf(montoAcordado)+
                        " de dinero","Oferta de Intercambio",JOptionPane.YES_NO_OPTION);
             if(respuesta == JOptionPane.YES_OPTION)
            {
                if(validarRetiroDinero(montoAcordado))
                {
                    this.dinero-=montoAcordado;
                    this.agregarComponenteIntercambio(componente);
                    salida.writeBoolean(true);
                    return;
                }
            }
            salida.writeBoolean(false);
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean validarRetiroDinero(int monto)
    {
        boolean dineroSuficiente= false;
        if(this.dinero>=monto)
        {
           dineroSuficiente= true;
        }
        return dineroSuficiente;
    }
    
    public String decodificarComponente(int componente){
     if (componente==0){
         return "Misil";
     }
     else if (componente ==1){
         return "Bomba";
     }
     else if (componente == 2){
         return "Multi Shot";
     }
     else if (componente == 3){
         return "Combo Shot";
     }
     else if (componente ==4){
         return "Nave Espia";
     }
     else if (componente ==5){
         return "Mina";
     }
     else if (componente ==6){
         return "Templo";
     }
     else if (componente ==7){
         return "Mercado";
     }
     else if (componente == 8){
         return "Planeta";
     }
     else if (componente == 9){
         return "Conector";
     }
     else if (componente == 10){
         return "Armeria Misil";
     }
     else if (componente ==11){
         return "Armeria Bomba";
     }
     else if (componente == 12){
         return "Armeria MultiShot";
     }
     else if (componente == 13){
         return "Combo Shot";
     }
    return null;
        
    }
    public void agregarComponenteIntercambio(int componente){
     if (componente==0){
         armas.add(new Misil(this));
     }
     else if (componente ==1){
         armas.add(new Bomba(this));
     }
     else if (componente == 2){
         armas.add(new MultiShot(this));
     }
     else if (componente == 3){
         armas.add(new ComboShot(this));
     }
     else if (componente ==4){
         armas.add(new NaveEspia(this));
     }
     else if (componente ==5){
         componentesDisponibles.add(new Mina(this));
     }
     else if (componente ==6){
         componentesDisponibles.add(new Templo(this));
     }
     else if (componente ==7){
         componentesDisponibles.add(new Mercado(this));
     }
     else if (componente == 8){
         componentesDisponibles.add(new Mundo(this));
     }
     else if (componente == 9){
         componentesDisponibles.add(new Conector(this));
     }
     else if (componente == 10){
         componentesDisponibles.add(new Armeria(this,0));
     }
     else if (componente ==11){
         componentesDisponibles.add(new Armeria(this,1));
     }
     else if (componente == 12){
         componentesDisponibles.add(new Armeria(this,2));
     }
     else if (componente == 13){
         componentesDisponibles.add(new Armeria(this,3));
     }
    return;
        
    }

    public void intercambioExitoso(int componenteAQuitar, int montoARestar) {
        this.getVentanaPlataforma().mostrar("Servidor : El intercambio fue exitoso");
        quitarComponenteIntercambio(componenteAQuitar);
        dinero+=montoARestar;
    }
    public void quitarComponenteIntercambio(int componente)
    {
    if (componente==0){
         armas.remove(getMisil());
     }
     else if (componente ==1){
         armas.remove(getBomba());
     }
     else if (componente == 2){
         armas.remove(getMultiShot());
     }
     else if (componente == 3){
         armas.remove(getComboShot());
     }
     else if (componente ==4){
         armas.remove(getNaveEspia());
     }
     else if (componente ==5){
         componentesDisponibles.remove(getMina());
     }
     else if (componente ==6){
         componentesDisponibles.remove(getTemplo());
     }
     else if (componente ==7){
         componentesDisponibles.remove(getMercado());
     }
     else if (componente == 8){
         componentesDisponibles.remove(getMundo());
     }
     else if (componente == 9){
         componentesDisponibles.remove(getConector());
     }
     else if (componente == 10){
         componentesDisponibles.remove(this.getArmeriaMisil());
     }
     else if (componente ==11){
         componentesDisponibles.remove(getArmeriaBomba());
     }
     else if (componente == 12){
         componentesDisponibles.remove(getMultiShot());
     }
     else if (componente == 13){
         componentesDisponibles.remove(getComboShot());
     }
        
    }
    public void quitarComponente(Componente componente, int jugadorDisparo){
        quitarComponenteGrafico(componente);
        if (componente instanceof Conector){
            Conector conector = (Conector) componente;
            this.quitarConector(conector, jugadorDisparo);
        }
        else if (componente instanceof Mundo){
            quitarMundo(componente.getCasillasAsociadas().get(0).getFila(),(componente.getCasillasAsociadas().get(0).getColumna()) );
            if (getCantMundos() == 0){ // Si solo hay un mundo
                ponerDisconexos(jugadorDisparo);
            }
        }
        else if (componente instanceof Templo || componente instanceof Mina || componente instanceof Armeria || componente instanceof Mercado){
            quitarMina_Templo_Armeria(componente.getCasillasAsociadas().get(0).getFila(),(componente.getCasillasAsociadas().get(0).getColumna()) );      
        }
        buscarDisconexos(jugadorDisparo);
    }

    public void setTurno(boolean readBoolean) {
        turno = readBoolean;
    }
    public boolean getTurno(){
        return turno;
    }
    
    
    public int getCantEscudos() {
        return cantEscudos;
    }

    public void setCantEscudos(int cantEscudos) {
        this.cantEscudos = cantEscudos;
    }

    public void avisarEscudo(int escudos) throws IOException {
        salida.writeInt(4);
        salida.writeUTF("El Jugador: " + this.getNumero() + " ha usado comodin con:  " + escudos + " escudos");   
    }
    
}
