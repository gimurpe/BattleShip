/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author Luis Diego
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import progra.iii.*;

/**
 *
 * @author Diego
 */
public class Servidor {
    
    JFrameServidor ventana;
    ArrayList <Socket> jugadores;
    public ArrayList<ThreadServidor> hilosServer;
    
    public Servidor(JFrameServidor padre)
    {
        // asigna la ventana
        this.ventana = padre;
        jugadores = new ArrayList();
        hilosServer = new ArrayList();
        
    }
    
    public void runServer()
    {
        try {
            //crea el socket servidor para aceptar dos conexiones
            ServerSocket serv = new ServerSocket(8081);
            ventana.mostrar(".::Servidor Activo");
            ventana.mostrar(".::Esperando jugadores");   
            // espera primer cliente
            Socket cliente1 = serv.accept();
            jugadores.add(cliente1);
            ventana.mostrar(".::Primer Cliente Aceptado");
            DataInputStream entrada;
            DataOutputStream salida;//Para enviar comunicacion
            entrada = new DataInputStream(cliente1.getInputStream());
            salida  = new DataOutputStream(cliente1.getOutputStream());//comunic
            int cantidadJugadores = entrada.readInt();
            String nombreJugador = entrada.readUTF();
            ThreadServidor hilo = new ThreadServidor(cliente1,this,1);
            hilo.setNameUser(nombreJugador);
            hilosServer.add(hilo);
            ventana.mostrar(".::Jugador "+ nombreJugador +" Aceptado");
            ventana.mostrar(".::Se van a conectar: "+ cantidadJugadores+" Jugadores");
            int cantidadJugadoresConectados = 1;
            while(cantidadJugadoresConectados<cantidadJugadores){
                Socket cliente = serv.accept();
                entrada = new DataInputStream(cliente.getInputStream());
                String nombre = entrada.readUTF();
                jugadores.add(cliente);
                cantidadJugadoresConectados++;
                hilo = new ThreadServidor(cliente,this,cantidadJugadoresConectados);
                hilo.setNameUser(nombre);
                hilosServer.add(hilo);
                ventana.mostrar(".::Jugador "+ nombre +" Aceptado");
            }
            ventana.mostrar(".::Todos los jugadores estan conectados");
            for (int i = 0 ; i<jugadores.size();i++){
                salida = new DataOutputStream(jugadores.get(i).getOutputStream());
                salida.writeInt(i+1);
                salida.writeInt(hilosServer.size());
                
            }
            for (int i = 0;i<hilosServer.size();i++){
                configurarEnemigos(i);
                hilosServer.get(i).start();
            }
            
            while (true)
            {
            
            }
            
        } catch (IOException ex) {
            ventana.mostrar("ERROR ... en el servidor");
        }
    }
    
    public void configurarEnemigos(int pNumeroJugador){
        ThreadServidor jugador = hilosServer.get(pNumeroJugador);
        ArrayList <ThreadServidor> enemigos = new ArrayList();
        for (int i = 0;i<hilosServer.size();i++){
            if (i!=pNumeroJugador){
                enemigos.add(hilosServer.get(i));
            }
        }
        jugador.setEnemigos(enemigos);
    }

}

