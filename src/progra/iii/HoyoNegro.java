/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.iii;

import java.util.Random;

/**
 *
 * @author Luis Diego
 */
public class HoyoNegro extends Componente{
    
    public HoyoNegro(Jugador jugadorAsociado){
        super(0,jugadorAsociado);
    }
    public void devolverDisparo(int jugadorQueDisparo){
        for (int i=0;i<3;i++){
            jugador.getArmas().add(new Misil(jugador));
            Random randomNumero = new Random();
            int randX = randomNumero.nextInt(15);
            int randY = randomNumero.nextInt(15);
            jugador.disparar(0, randX, randY, jugadorQueDisparo);
        }
    }
    
}
