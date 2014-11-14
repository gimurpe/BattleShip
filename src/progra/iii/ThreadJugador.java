package progra.iii;

import interfaz.Plataforma;
import interfaz.prueba;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadJugador extends Thread{
   //solo de lectura
    Jugador jugador;
    private DataInputStream entrada;
    private Plataforma vcli; //referencia acliente
    public ThreadJugador(DataInputStream entrada,Plataforma vcli,Jugador pJugador) throws IOException
    {
        this.entrada=entrada;
        this.vcli=vcli;
        jugador = pJugador;
    }
    @Override
    public void run()
    {
       //VARIABLES
        String menser;
        int opcion=0;
      
      // solamente lee lo que el servidor threadServidor le envia
        while(true)
        {         
            try{
                
             // esta leyendo siempre la instruccion, un int
                opcion=entrada.readInt();
            
                switch(opcion)
                {
                case 1://recibe un disparo
                    int casillaX = entrada.readInt();
                    int casillaY = entrada.readInt();
                    int jugadorQueDisparo = entrada.readInt();
                    jugador.verSiDisparoMundo(casillaX, casillaY);
                    jugador.recibirDisparo(casillaX,casillaY,jugadorQueDisparo);
                    break;
                case 2://resultado de disparo que se envio
                    if(entrada.readBoolean()){
                        jugador.aciertoAMundo();
                        vcli.mostrar("Servidor:Has ganado un bono de 10000 por acertar el mundo enemigo");
                    }
                    boolean aciertoComponente = entrada.readBoolean();
                    jugador.setAciertoComponente(aciertoComponente);
                    if(aciertoComponente){
                        vcli.mostrar("Servidor: Has acertado un componente del enemigo");
                    }
                    else{
                        vcli.mostrar("Servidor: No se logro concretar el disparo");
                        
                    }
                    break;
                case 3://para enviar informacion de las casillas
                    jugador.enviarInformacionNave();
                    break;
                case 4:
                    // lee el mensaje
                    menser = entrada.readUTF();
                    // muestra el mensjae en pantalla.
                    System.out.println("OP4, lee mensaje "+menser);
                    vcli.mostrar(menser);
                    break;
                
                case 5:
                    int jugadorQuiereVerMatriz = entrada.readInt();
                    jugador.enviarStringMatriz(jugadorQuiereVerMatriz);
                    break;
                case 6:
                    String matriz = entrada.readUTF();
                    System.out.println(matriz);
                    jugador.traducirMatriz(matriz);
                    break;
                case 7:
                    int montoAcordado = entrada.readInt();
                    int componente = entrada.readInt();
                    int jugadorQuiereIntercambiar = entrada.readInt();
                    jugador.recibirIntercambio(montoAcordado,componente,jugadorQuiereIntercambiar);
                    break;
                case 8:
                    boolean resultadoIntercambio = entrada.readBoolean();
                    int montoARestar = entrada.readInt();
                    int componenteAQuitar = entrada.readInt();
                    if(resultadoIntercambio)
                    {
                        jugador.intercambioExitoso(componenteAQuitar,montoARestar);
                    }
                    else
                        jugador.getVentanaPlataforma().mostrar("Servidor: se ha rechazado el intercambio");
                    break;
                case 9:
                    jugador.setTurno(true);
                    break;
                default:
                    break;
                    
                }
            }
            catch (IOException e){
                System.out.println("Error en la comunicaci�n "+"Informaci�n para el usuario");
                break;
          
            } 
        }
        System.out.println("se desconecto el servidor");
    }

   
}
