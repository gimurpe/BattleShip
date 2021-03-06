/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import progra.iii.*;
/**
 *
 * @author Luis Diego
 */
public class InicioJuego extends javax.swing.JFrame {
    private Jugador jugador;
 
    

    /**
     * Creates new form InicioJuego
     */
    public InicioJuego() {
        initComponents();
        String nombreJugador = JOptionPane.showInputDialog("Introducir Nick :");
        jugador = new Jugador (nombreJugador,this);
        this.setTitle(nombreJugador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCrearPartida = new javax.swing.JButton();
        botonUnirsePartida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCrearPartida.setText("Crear Partida");
        botonCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 110, -1));

        botonUnirsePartida.setText("Unirse a Partida");
        botonUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnirsePartidaActionPerformed(evt);
            }
        });
        getContentPane().add(botonUnirsePartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgVentana Inicio.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPartidaActionPerformed
        int cantidadJugadores = getCantidadJugadores();
        try {
            jugador.crearPartida(cantidadJugadores);
            Plataforma plataforma = new Plataforma();
            plataforma.setJugador(this.jugador);
            plataforma.setVisible(true);
            ThreadJugador threadJugador = new ThreadJugador(jugador.getEntrada(),jugador.getVentanaPlataforma(),this.jugador);
            threadJugador.start();
        } catch (IOException ex) {
            Logger.getLogger(InicioJuego.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_botonCrearPartidaActionPerformed

    private void botonUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnirsePartidaActionPerformed
        jugador.unirseAPartida();
        Plataforma plataforma = new Plataforma();
        plataforma.setJugador(this.jugador);
        plataforma.setVisible(true);
        ThreadJugador threadJugador = null;
        try {
            threadJugador = new ThreadJugador(jugador.getEntrada(),jugador.getVentanaPlataforma(),this.jugador);
            threadJugador.start();
        } catch (IOException ex) {
            Logger.getLogger(InicioJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        
    }//GEN-LAST:event_botonUnirsePartidaActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioJuego().setVisible(true);
            }
        });
        
    }
    
    public int getCantidadJugadores(){
        this.setVisible(false);
        String cantidadJugadores = JOptionPane.showInputDialog("Introducir cantidad Jugadores: ");
        if (validarCantidadJugadores(cantidadJugadores)){
            return Integer.parseInt(cantidadJugadores);
        }
        else{
            return getCantidadJugadores();
        }   
    }
    
    public boolean validarCantidadJugadores(String pCantidadJugadores){
        if (pCantidadJugadores.equals("2")|| pCantidadJugadores.equals("3") || pCantidadJugadores.equals("4") ){
            return true;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearPartida;
    private javax.swing.JButton botonUnirsePartida;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
