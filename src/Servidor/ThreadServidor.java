package Servidor;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Diego
 */
public class ThreadServidor extends Thread
{
     private Socket cliente = null;//referencia a socket de comunicacion de cliente
     private DataInputStream entrada=null;//Para leer comunicacion
     private DataOutputStream salida=null;//Para enviar comunicacion	
     private String nameUser; //Para el nombre del usuario de esta conexion
     private Servidor servidor;// referencia al servidor
     private boolean resultadoIntercambio;

     // para envio de mensajes al enemigo
     ArrayList<ThreadServidor> enemigos;
     // identificar el numero de jugador
     private int numeroDeJugador;
     private boolean disparoMundo;
     private boolean aciertoComponente;
     private String mensajeNave;
     private String matrizJugador;
     public boolean cambio = false;
     
     public ThreadServidor(Socket pCliente,Servidor pServidor, int pNumero)
     {
        setResultadoIntercambio(false);
        matrizJugador = "";
        this.cliente = pCliente;
        this.servidor = pServidor;
        enemigos = new ArrayList();
        this.numeroDeJugador = pNumero;
        nameUser="";// inicialmente se desconoce, hasta el primer read del hilo
        mensajeNave = "";
     }

    public boolean getResultadoIntercambio() {
        return resultadoIntercambio;
    }

    public void setResultadoIntercambio(boolean resultadoIntercambio) {
        this.resultadoIntercambio = resultadoIntercambio;
    }
     
     public void setMatrizJugador(String matriz){
         matrizJugador = matriz;
     }
     public String getMatriz(){
         return matrizJugador;
     }
     public DataOutputStream getSalida(){
         return salida;
         
     }
     public DataInputStream getEntrada(){
         return entrada;
         
     }
     public boolean getAciertoMundo(){
         return disparoMundo;
     }
     public boolean getAciertoComponente(){
         return aciertoComponente;
     }
     public String getMensajeNave(){
         return mensajeNave;
     }
     
     //Getter an Setter...
     public String getNameUser()
     {
       return nameUser;
     }
     public void setNameUser(String name)
     {
       nameUser=name;
     }
     public void setEnemigos(ArrayList<ThreadServidor> pEnemigos){
         enemigos = pEnemigos;
     }
     
     public void run()
     {
    	try
    	{
            // inicializa para lectura y escritura con stream de cliente
          entrada=new DataInputStream(cliente.getInputStream());//comunic
          salida=new DataOutputStream(cliente.getOutputStream());//comunic
          // Es el primer read que hace, para el nombre del user
    	}
    	catch (IOException e) {  e.printStackTrace();     }
    	//VARIABLES
        int opcion=0;
        int numUsers=enemigos.size();
        String amigo="";
        String mencli="";
                
    	while(true)
    	{
          try
          {
              
              
              //Siempre espera leer un int que será la instruccion por hacer
             opcion=entrada.readInt();
             switch(opcion)
             {
                case 1: // El jugador con el 1 envia disparos
                    int jugadorRecibeDisparo = entrada.readInt();
                    int casillaX = entrada.readInt();
                    int casillaY = entrada.readInt();
                    jugadorRecibeDisparo -= 1;
                    ThreadServidor jugadorADisparar = servidor.hilosServer.get(jugadorRecibeDisparo);
                    try {
                        enviarDisparo(jugadorADisparar,casillaX,casillaY);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   break;
                case 2://resultado del disparo
                    disparoMundo = entrada.readBoolean();
                    System.out.println("Resultado del disparo a un mundo: "+disparoMundo);
                    aciertoComponente = entrada.readBoolean();
                    System.out.println("Resultado del disparo: "+aciertoComponente); 
                   break;
                case 3: //para enviar una nave amigo
                    int jugadorRecibeNave = entrada.readInt();
                    jugadorRecibeNave-=1;
                    enviarNave(servidor.hilosServer.get(jugadorRecibeNave));
                   break;
                 case 4:
                     // lee el mensaje enviado desde el jframe
                     String mensaje = entrada.readUTF();
                     // envia un 4 al thradCliente enemigo
                     for (int i = 0; i<enemigos.size();i++){
                         enemigos.get(i).getSalida().writeInt(4);
                         enemigos.get(i).getSalida().writeUTF(mensaje);
                     }
                     System.out.println("Op4: envia 4 y mensaje: "+ mensaje);
                 break;
                 case 5:
                     mensajeNave = entrada.readUTF();
                    break;
                 case 6:
                     int jugadorVerMatriz = entrada.readInt();
                     jugadorVerMatriz -=1;
                     ThreadServidor jugadorMatriz = servidor.hilosServer.get(jugadorVerMatriz);
                     verMatriz(jugadorMatriz);
                     break;
                 case 7:
                     matrizJugador = entrada.readUTF();
                     break;
                 case 8:
                    int montoAcordado = entrada.readInt();
                    int componente = entrada.readInt();
                    int jugadorAIntercambiar = entrada.readInt();
                    jugadorAIntercambiar-=1;
                    ThreadServidor jugadorIntercambio = servidor.hilosServer.get(jugadorAIntercambiar);
                    enviarIntercambio(jugadorIntercambio, montoAcordado, componente);
                    break;
                 case 9:
                     setResultadoIntercambio(entrada.readBoolean());
                     cambio = true;
                     break;
                 case 10:
                    int siguienteJugadorTurno = this.numeroDeJugador;
                    if (siguienteJugadorTurno==servidor.hilosServer.size()){
                        siguienteJugadorTurno = 0;
                    }
                    servidor.hilosServer.get(siguienteJugadorTurno).getSalida().writeInt(9);
                    for (int i = 0; i<servidor.hilosServer.size();i++){
                         servidor.hilosServer.get(i).getSalida().writeInt(4);
                         servidor.hilosServer.get(i).getSalida().writeUTF("Servidor: es el turno de jugador: "+(siguienteJugadorTurno+1));
                     }
                    break;
             }
          }
          catch (IOException e) {
              System.out.println("El cliente termino la conexion");break;}
    	}
    	servidor.ventana.mostrar("Se removio un usuario");
    	
    	try
    	{
          servidor.ventana.mostrar("Se desconecto un usuario: "+nameUser);
          cliente.close();
    	}	
        catch(Exception e)
        {servidor.ventana.mostrar("no se puede cerrar el socket");}   
     }
     public void enviarNave(ThreadServidor jugadorAEspiar){
         try {
             jugadorAEspiar.getSalida().writeInt(3);
             try {
                 Thread.sleep(1000);
                 salida.writeInt(4);
                 salida.writeUTF(jugadorAEspiar.getMensajeNave());
             } catch (InterruptedException ex) {
                 Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (IOException ex) {
             Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
     public void enviarDisparo(ThreadServidor jugadorADisparar,int casillaX, int casillaY) throws InterruptedException{
         try {
             DataInputStream enemigo = jugadorADisparar.getEntrada();
             jugadorADisparar.getSalida().writeInt(1);
             jugadorADisparar.getSalida().writeInt(casillaX);
             jugadorADisparar.getSalida().writeInt(casillaY);
             jugadorADisparar.getSalida().writeInt(numeroDeJugador);
             Thread.sleep(1000);
             salida.writeInt(2);
             salida.writeBoolean(jugadorADisparar.getAciertoMundo());
             salida.writeBoolean(jugadorADisparar.getAciertoComponente());
            
         } catch (IOException ex) {
             Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
         }
        
     }

    private void verMatriz(ThreadServidor jugadorMatriz) {
         try {
             jugadorMatriz.getSalida().writeInt(5);
             jugadorMatriz.getSalida().writeInt(numeroDeJugador);
             try {
                 Thread.sleep(200);
                 salida.writeInt(6);
                 System.out.println(jugadorMatriz.getMatriz());
                 salida.writeUTF(jugadorMatriz.getMatriz());
             } catch (InterruptedException ex) {
                 Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (IOException ex) {
             Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
         }
        

    }
    
    public void enviarIntercambio(ThreadServidor jugadorAIntercambiar, int montoAcordado, int componente)
    {
        System.out.println("realizandoIntercambio");
         try {
             jugadorAIntercambiar.getSalida().writeInt(7);
             jugadorAIntercambiar.getSalida().writeInt(montoAcordado);
             jugadorAIntercambiar.getSalida().writeInt(componente);
             jugadorAIntercambiar.getSalida().writeInt(this.numeroDeJugador);
             try {
                 while(jugadorAIntercambiar.cambio == false){
                     Thread.sleep(200);
                 }
                 jugadorAIntercambiar.cambio = false;
                 salida.writeInt(8);
                 salida.writeBoolean(jugadorAIntercambiar.getResultadoIntercambio());
                 salida.writeInt(montoAcordado);
                 salida.writeInt(componente);
             } catch (InterruptedException ex) {
                 Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (IOException ex) {
             Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
   


}

