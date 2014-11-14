/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import progra.iii.*;



/**
 *
 * @author familia
 */
public class Plataforma extends javax.swing.JFrame implements Runnable {
    
    Jugador jugadorAsociado;
    
    ImageIcon partePlaneta1 = new ImageIcon(getClass().getResource("/Imagenes/planera1.png"));
    ImageIcon partePlaneta2 = new ImageIcon(getClass().getResource("/Imagenes/planeta2.png"));
    ImageIcon partePlaneta3 = new ImageIcon(getClass().getResource("/Imagenes/planeta3.png"));
    ImageIcon partePlaneta4 = new ImageIcon(getClass().getResource("/Imagenes/planeta4.png"));
    ImageIcon conector = new ImageIcon(getClass().getResource("/Imagenes/conector.jpg"));
    ImageIcon mina = new ImageIcon(getClass().getResource("/Imagenes/mina.jpg"));
    ImageIcon templo1=new ImageIcon(getClass().getResource("/Imagenes/templo1.png"));
    ImageIcon templo2=new ImageIcon(getClass().getResource("/Imagenes/templo2.png"));
    ImageIcon templo1volt=new ImageIcon(getClass().getResource("/Imagenes/templo1volt.png"));
    ImageIcon templo2volt=new ImageIcon(getClass().getResource("/Imagenes/templo2volt.png"));
    ImageIcon armeria = new ImageIcon(getClass().getResource("/Imagenes/armeria.png"));
    ImageIcon mercado = new ImageIcon(getClass().getResource("/Imagenes/mercadoJugador.png"));
    ImageIcon templo = new ImageIcon(getClass().getResource("/Imagenes/templo.jpg"));
    ImageIcon planeta = new ImageIcon(getClass().getResource("/Imagenes/planeta.png"));
    
    
    ImageIcon minaMostar = new ImageIcon(getClass().getResource("/Imagenes/minaMostrar.png"));
    ImageIcon temploMostar = new ImageIcon(getClass().getResource("/Imagenes/temploMostrar.jpg"));
    ImageIcon planetaMostar = new ImageIcon(getClass().getResource("/Imagenes/planetaMostar.png"));
    ImageIcon conectorMostar = new ImageIcon(getClass().getResource("/Imagenes/conectorMostrar.png"));
    ImageIcon armeriaMostrar =new ImageIcon(getClass().getResource("/Imagenes/armeriaMostrar.png"));
    ImageIcon mercadoMostrar = new ImageIcon(getClass().getResource("/Imagenes/mercado.png"));
    ImageIcon hoyoNegro = new ImageIcon(getClass().getResource("/Imagenes/hoyoNegro.png"));
    
    
    private ArrayList<JButton> listaBotones=new ArrayList<JButton>();
    private Componente componenteAsociar;
    Thread threadVentana;
    
    public Plataforma(){
        jugadorAsociado = null;
        componenteAsociar = null;
        threadVentana = new Thread(this,"Thread Ventana");
        initComponents();
        listaBotones.add(casilla1_1);
        listaBotones.add(casilla2_1);
        listaBotones.add(casilla3_1);
        listaBotones.add(casilla4_1);
        listaBotones.add(casilla5_1);
        listaBotones.add(casilla6_1);
        listaBotones.add(casilla7_1);
        listaBotones.add(casilla8_1);
        listaBotones.add(casilla9_1);
        listaBotones.add(casilla10_1);
        listaBotones.add(casilla11_1);
        listaBotones.add(casilla12_1);
        listaBotones.add(casilla13_1);
        listaBotones.add(casilla14_1);
        listaBotones.add(casilla15_1);
        listaBotones.add(casilla1_2);
        listaBotones.add(casilla2_2);
        listaBotones.add(casilla3_2);
        listaBotones.add(casilla4_2);
        listaBotones.add(casilla5_2);
        listaBotones.add(casilla6_2);
        listaBotones.add(casilla7_2);
        listaBotones.add(casilla8_2);
        listaBotones.add(casilla9_2);
        listaBotones.add(casilla10_2);
        listaBotones.add(casilla11_2);
        listaBotones.add(casilla12_2);
        listaBotones.add(casilla13_2);
        listaBotones.add(casilla14_2);
        listaBotones.add(casilla15_2);
        listaBotones.add(casilla1_3);
        listaBotones.add(casilla2_3);
        listaBotones.add(casilla3_3);
        listaBotones.add(casilla4_3);
        listaBotones.add(casilla5_3);
        listaBotones.add(casilla6_3);
        listaBotones.add(casilla7_3);
        listaBotones.add(casilla8_3);
        listaBotones.add(casilla9_3);
        listaBotones.add(casilla10_3);
        listaBotones.add(casilla11_3);
        listaBotones.add(casilla12_3);
        listaBotones.add(casilla13_3);
        listaBotones.add(casilla14_3);
        listaBotones.add(casilla15_3);
        listaBotones.add(casilla1_4);
        listaBotones.add(casilla2_4);
        listaBotones.add(casilla3_4);
        listaBotones.add(casilla4_4);
        listaBotones.add(casilla5_4);
        listaBotones.add(casilla6_4);
        listaBotones.add(casilla7_4);
        listaBotones.add(casilla8_4);
        listaBotones.add(casilla9_4);
        listaBotones.add(casilla10_4);
        listaBotones.add(casilla11_4);
        listaBotones.add(casilla12_4);
        listaBotones.add(casilla13_4);
        listaBotones.add(casilla14_4);
        listaBotones.add(casilla15_4);
        listaBotones.add(casilla1_5);
        listaBotones.add(casilla2_5);
        listaBotones.add(casilla3_5);
        listaBotones.add(casilla4_5);
        listaBotones.add(casilla5_5);
        listaBotones.add(casilla6_5);
        listaBotones.add(casilla7_5);
        listaBotones.add(casilla8_5);
        listaBotones.add(casilla9_5);
        listaBotones.add(casilla10_5);
        listaBotones.add(casilla11_5);
        listaBotones.add(casilla12_5);
        listaBotones.add(casilla13_5);
        listaBotones.add(casilla14_5);
        listaBotones.add(casilla15_5);
        listaBotones.add(casilla1_6);
        listaBotones.add(casilla2_6);
        listaBotones.add(casilla3_6);
        listaBotones.add(casilla4_6);
        listaBotones.add(casilla5_6);
        listaBotones.add(casilla6_6);
        listaBotones.add(casilla7_6);
        listaBotones.add(casilla8_6);
        listaBotones.add(casilla9_6);
        listaBotones.add(casilla10_6);
        listaBotones.add(casilla11_6);
        listaBotones.add(casilla12_6);
        listaBotones.add(casilla13_6);
        listaBotones.add(casilla14_6);
        listaBotones.add(casilla15_6);
        listaBotones.add(casilla1_7);
        listaBotones.add(casilla2_7);
        listaBotones.add(casilla3_7);
        listaBotones.add(casilla4_7);
        listaBotones.add(casilla5_7);
        listaBotones.add(casilla6_7);
        listaBotones.add(casilla7_7);
        listaBotones.add(casilla8_7);
        listaBotones.add(casilla9_7);
        listaBotones.add(casilla10_7);
        listaBotones.add(casilla11_7);
        listaBotones.add(casilla12_7);
        listaBotones.add(casilla13_7);
        listaBotones.add(casilla14_7);
        listaBotones.add(casilla15_7);
        listaBotones.add(casilla1_8);
        listaBotones.add(casilla2_8);
        listaBotones.add(casilla3_8);
        listaBotones.add(casilla4_8);
        listaBotones.add(casilla5_8);
        listaBotones.add(casilla6_8);
        listaBotones.add(casilla7_8);
        listaBotones.add(casilla8_8);
        listaBotones.add(casilla9_8);
        listaBotones.add(casilla10_8);
        listaBotones.add(casilla11_8);
        listaBotones.add(casilla12_8);
        listaBotones.add(casilla13_8);
        listaBotones.add(casilla14_8);
        listaBotones.add(casilla15_8);
        listaBotones.add(casilla1_9);
        listaBotones.add(casilla2_9);
        listaBotones.add(casilla3_9);
        listaBotones.add(casilla4_9);
        listaBotones.add(casilla5_9);
        listaBotones.add(casilla6_9);
        listaBotones.add(casilla7_9);
        listaBotones.add(casilla8_9);
        listaBotones.add(casilla9_9);
        listaBotones.add(casilla10_9);
        listaBotones.add(casilla11_9);
        listaBotones.add(casilla12_9);
        listaBotones.add(casilla13_9);
        listaBotones.add(casilla14_9);
        listaBotones.add(casilla15_9);
        listaBotones.add(casilla1_10);
        listaBotones.add(casilla2_10);
        listaBotones.add(casilla3_10);
        listaBotones.add(casilla4_10);
        listaBotones.add(casilla5_10);
        listaBotones.add(casilla6_10);
        listaBotones.add(casilla7_10);
        listaBotones.add(casilla8_10);
        listaBotones.add(casilla9_10);
        listaBotones.add(casilla10_10);
        listaBotones.add(casilla11_10);
        listaBotones.add(casilla12_10);
        listaBotones.add(casilla13_10);
        listaBotones.add(casilla14_10);
        listaBotones.add(casilla15_10);
        listaBotones.add(casilla1_11);
        listaBotones.add(casilla2_11);
        listaBotones.add(casilla3_11);
        listaBotones.add(casilla4_11);
        listaBotones.add(casilla5_11);
        listaBotones.add(casilla6_11);
        listaBotones.add(casilla7_11);
        listaBotones.add(casilla8_11);
        listaBotones.add(casilla9_11);
        listaBotones.add(casilla10_11);
        listaBotones.add(casilla11_11);
        listaBotones.add(casilla12_11);
        listaBotones.add(casilla13_11);
        listaBotones.add(casilla14_11);
        listaBotones.add(casilla15_11);
        listaBotones.add(casilla1_12);
        listaBotones.add(casilla2_12);
        listaBotones.add(casilla3_12);
        listaBotones.add(casilla4_12);
        listaBotones.add(casilla5_12);
        listaBotones.add(casilla6_12);
        listaBotones.add(casilla7_12);
        listaBotones.add(casilla8_12);
        listaBotones.add(casilla9_12);
        listaBotones.add(casilla10_12);
        listaBotones.add(casilla11_12);
        listaBotones.add(casilla12_12);
        listaBotones.add(casilla13_12);
        listaBotones.add(casilla14_12);
        listaBotones.add(casilla15_12);
        listaBotones.add(casilla1_13);
        listaBotones.add(casilla2_13);
        listaBotones.add(casilla3_13);
        listaBotones.add(casilla4_13);
        listaBotones.add(casilla5_13);
        listaBotones.add(casilla6_13);
        listaBotones.add(casilla7_13);
        listaBotones.add(casilla8_13);
        listaBotones.add(casilla9_13);
        listaBotones.add(casilla10_13);
        listaBotones.add(casilla11_13);
        listaBotones.add(casilla12_13);
        listaBotones.add(casilla13_13);
        listaBotones.add(casilla14_13);
        listaBotones.add(casilla15_13);
        listaBotones.add(casilla1_14);
        listaBotones.add(casilla2_14);
        listaBotones.add(casilla3_14);
        listaBotones.add(casilla4_14);
        listaBotones.add(casilla5_14);
        listaBotones.add(casilla6_14);
        listaBotones.add(casilla7_14);
        listaBotones.add(casilla8_14);
        listaBotones.add(casilla9_14);
        listaBotones.add(casilla10_14);
        listaBotones.add(casilla11_14);
        listaBotones.add(casilla12_14);
        listaBotones.add(casilla13_14);
        listaBotones.add(casilla14_14);
        listaBotones.add(casilla15_14);
        listaBotones.add(casilla1_15);
        listaBotones.add(casilla2_15);
        listaBotones.add(casilla3_15);
        listaBotones.add(casilla4_15);
        listaBotones.add(casilla5_15);
        listaBotones.add(casilla6_15);
        listaBotones.add(casilla7_15);
        listaBotones.add(casilla8_15);
        listaBotones.add(casilla9_15);
        listaBotones.add(casilla10_15);
        listaBotones.add(casilla11_15);
        listaBotones.add(casilla12_15);
        listaBotones.add(casilla13_15);
        listaBotones.add(casilla14_15);
        listaBotones.add(casilla15_15);
        threadVentana.start();

        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casilla12_1 = new javax.swing.JButton();
        casilla5_1 = new javax.swing.JButton();
        casilla4_1 = new javax.swing.JButton();
        casilla3_1 = new javax.swing.JButton();
        casilla2_1 = new javax.swing.JButton();
        casilla13_1 = new javax.swing.JButton();
        casilla15_2 = new javax.swing.JButton();
        casilla6_1 = new javax.swing.JButton();
        casilla1_15 = new javax.swing.JButton();
        casilla8_4 = new javax.swing.JButton();
        casilla9_1 = new javax.swing.JButton();
        casilla10_1 = new javax.swing.JButton();
        casilla11_1 = new javax.swing.JButton();
        casilla9_15 = new javax.swing.JButton();
        casilla14_1 = new javax.swing.JButton();
        casilla15_3 = new javax.swing.JButton();
        casilla15_4 = new javax.swing.JButton();
        casilla15_5 = new javax.swing.JButton();
        casilla15_6 = new javax.swing.JButton();
        casilla15_7 = new javax.swing.JButton();
        casilla14_15 = new javax.swing.JButton();
        casilla15_9 = new javax.swing.JButton();
        casilla15_10 = new javax.swing.JButton();
        casilla15_11 = new javax.swing.JButton();
        casilla15_12 = new javax.swing.JButton();
        casilla15_13 = new javax.swing.JButton();
        casilla15_14 = new javax.swing.JButton();
        casilla15_1 = new javax.swing.JButton();
        casilla15_15 = new javax.swing.JButton();
        casilla14_14 = new javax.swing.JButton();
        casilla14_13 = new javax.swing.JButton();
        casilla14_12 = new javax.swing.JButton();
        casilla14_11 = new javax.swing.JButton();
        casilla14_10 = new javax.swing.JButton();
        casilla14_9 = new javax.swing.JButton();
        casilla14_8 = new javax.swing.JButton();
        casilla14_7 = new javax.swing.JButton();
        casilla14_6 = new javax.swing.JButton();
        casilla14_5 = new javax.swing.JButton();
        casilla14_4 = new javax.swing.JButton();
        casilla14_3 = new javax.swing.JButton();
        casilla14_2 = new javax.swing.JButton();
        casilla15_8 = new javax.swing.JButton();
        casilla1_1 = new javax.swing.JButton();
        casilla13_2 = new javax.swing.JButton();
        casilla13_3 = new javax.swing.JButton();
        casilla13_4 = new javax.swing.JButton();
        casilla13_5 = new javax.swing.JButton();
        casilla13_6 = new javax.swing.JButton();
        casilla13_7 = new javax.swing.JButton();
        casilla13_8 = new javax.swing.JButton();
        casilla13_9 = new javax.swing.JButton();
        casilla13_10 = new javax.swing.JButton();
        casilla13_11 = new javax.swing.JButton();
        casilla13_12 = new javax.swing.JButton();
        casilla13_13 = new javax.swing.JButton();
        casilla13_14 = new javax.swing.JButton();
        casilla13_15 = new javax.swing.JButton();
        casilla12_15 = new javax.swing.JButton();
        casilla12_14 = new javax.swing.JButton();
        casilla12_13 = new javax.swing.JButton();
        casilla12_12 = new javax.swing.JButton();
        casilla12_11 = new javax.swing.JButton();
        casilla12_10 = new javax.swing.JButton();
        casilla12_9 = new javax.swing.JButton();
        casilla12_8 = new javax.swing.JButton();
        casilla12_7 = new javax.swing.JButton();
        casilla12_6 = new javax.swing.JButton();
        casilla12_5 = new javax.swing.JButton();
        casilla12_4 = new javax.swing.JButton();
        casilla12_3 = new javax.swing.JButton();
        casilla12_2 = new javax.swing.JButton();
        casilla11_2 = new javax.swing.JButton();
        casilla11_3 = new javax.swing.JButton();
        casilla11_4 = new javax.swing.JButton();
        casilla11_5 = new javax.swing.JButton();
        casilla11_6 = new javax.swing.JButton();
        casilla11_7 = new javax.swing.JButton();
        casilla11_8 = new javax.swing.JButton();
        casilla11_9 = new javax.swing.JButton();
        casilla11_10 = new javax.swing.JButton();
        casilla11_11 = new javax.swing.JButton();
        casilla11_12 = new javax.swing.JButton();
        casilla11_13 = new javax.swing.JButton();
        casilla11_14 = new javax.swing.JButton();
        casilla11_15 = new javax.swing.JButton();
        casilla10_2 = new javax.swing.JButton();
        casilla10_3 = new javax.swing.JButton();
        casilla10_4 = new javax.swing.JButton();
        casilla10_5 = new javax.swing.JButton();
        casilla10_6 = new javax.swing.JButton();
        casilla10_7 = new javax.swing.JButton();
        casilla10_8 = new javax.swing.JButton();
        casilla10_9 = new javax.swing.JButton();
        casilla10_10 = new javax.swing.JButton();
        casilla10_11 = new javax.swing.JButton();
        casilla10_12 = new javax.swing.JButton();
        casilla10_13 = new javax.swing.JButton();
        casilla10_14 = new javax.swing.JButton();
        casilla10_15 = new javax.swing.JButton();
        casilla9_2 = new javax.swing.JButton();
        casilla9_3 = new javax.swing.JButton();
        casilla9_4 = new javax.swing.JButton();
        casilla9_5 = new javax.swing.JButton();
        casilla9_6 = new javax.swing.JButton();
        casilla9_7 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        casilla9_8 = new javax.swing.JButton();
        casilla9_9 = new javax.swing.JButton();
        casilla9_10 = new javax.swing.JButton();
        casilla9_11 = new javax.swing.JButton();
        casilla9_12 = new javax.swing.JButton();
        casilla9_13 = new javax.swing.JButton();
        casilla9_14 = new javax.swing.JButton();
        casilla8_1 = new javax.swing.JButton();
        casilla8_2 = new javax.swing.JButton();
        casilla8_3 = new javax.swing.JButton();
        casilla8_15 = new javax.swing.JButton();
        casilla8_5 = new javax.swing.JButton();
        casilla8_6 = new javax.swing.JButton();
        casilla8_7 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        casilla8_8 = new javax.swing.JButton();
        casilla8_9 = new javax.swing.JButton();
        casilla8_10 = new javax.swing.JButton();
        casilla8_11 = new javax.swing.JButton();
        casilla8_12 = new javax.swing.JButton();
        casilla8_13 = new javax.swing.JButton();
        casilla8_14 = new javax.swing.JButton();
        casilla7_1 = new javax.swing.JButton();
        casilla7_2 = new javax.swing.JButton();
        casilla7_3 = new javax.swing.JButton();
        casilla7_4 = new javax.swing.JButton();
        casilla7_5 = new javax.swing.JButton();
        casilla7_6 = new javax.swing.JButton();
        casilla7_7 = new javax.swing.JButton();
        casilla7_8 = new javax.swing.JButton();
        casilla7_9 = new javax.swing.JButton();
        casilla7_10 = new javax.swing.JButton();
        casilla7_11 = new javax.swing.JButton();
        casilla7_12 = new javax.swing.JButton();
        casilla7_13 = new javax.swing.JButton();
        casilla7_14 = new javax.swing.JButton();
        casilla7_15 = new javax.swing.JButton();
        casilla6_15 = new javax.swing.JButton();
        casilla6_14 = new javax.swing.JButton();
        casilla6_13 = new javax.swing.JButton();
        casilla6_12 = new javax.swing.JButton();
        casilla6_11 = new javax.swing.JButton();
        casilla6_10 = new javax.swing.JButton();
        casilla6_9 = new javax.swing.JButton();
        casilla6_8 = new javax.swing.JButton();
        casilla6_7 = new javax.swing.JButton();
        casilla6_6 = new javax.swing.JButton();
        casilla6_5 = new javax.swing.JButton();
        casilla6_4 = new javax.swing.JButton();
        casilla6_3 = new javax.swing.JButton();
        casilla6_2 = new javax.swing.JButton();
        casilla5_2 = new javax.swing.JButton();
        casilla5_3 = new javax.swing.JButton();
        casilla5_4 = new javax.swing.JButton();
        casilla5_5 = new javax.swing.JButton();
        casilla5_6 = new javax.swing.JButton();
        casilla5_7 = new javax.swing.JButton();
        casilla5_8 = new javax.swing.JButton();
        casilla5_9 = new javax.swing.JButton();
        casilla5_10 = new javax.swing.JButton();
        casilla5_11 = new javax.swing.JButton();
        casilla5_12 = new javax.swing.JButton();
        casilla5_13 = new javax.swing.JButton();
        casilla5_14 = new javax.swing.JButton();
        casilla5_15 = new javax.swing.JButton();
        casilla4_15 = new javax.swing.JButton();
        casilla4_14 = new javax.swing.JButton();
        casilla4_13 = new javax.swing.JButton();
        casilla4_12 = new javax.swing.JButton();
        casilla4_11 = new javax.swing.JButton();
        casilla4_10 = new javax.swing.JButton();
        casilla4_9 = new javax.swing.JButton();
        casilla4_8 = new javax.swing.JButton();
        casilla4_7 = new javax.swing.JButton();
        casilla4_6 = new javax.swing.JButton();
        casilla4_5 = new javax.swing.JButton();
        casilla4_4 = new javax.swing.JButton();
        casilla4_3 = new javax.swing.JButton();
        casilla4_2 = new javax.swing.JButton();
        casilla3_2 = new javax.swing.JButton();
        jButton188 = new javax.swing.JButton();
        casilla3_3 = new javax.swing.JButton();
        casilla3_4 = new javax.swing.JButton();
        casilla3_5 = new javax.swing.JButton();
        casilla3_6 = new javax.swing.JButton();
        casilla3_7 = new javax.swing.JButton();
        casilla3_8 = new javax.swing.JButton();
        casilla3_9 = new javax.swing.JButton();
        casilla3_10 = new javax.swing.JButton();
        casilla3_11 = new javax.swing.JButton();
        casilla3_12 = new javax.swing.JButton();
        jButton199 = new javax.swing.JButton();
        casilla3_13 = new javax.swing.JButton();
        casilla3_14 = new javax.swing.JButton();
        casilla3_15 = new javax.swing.JButton();
        casilla2_15 = new javax.swing.JButton();
        casilla2_14 = new javax.swing.JButton();
        casilla2_13 = new javax.swing.JButton();
        casilla2_12 = new javax.swing.JButton();
        casilla2_11 = new javax.swing.JButton();
        jButton208 = new javax.swing.JButton();
        casilla2_10 = new javax.swing.JButton();
        casilla2_9 = new javax.swing.JButton();
        casilla2_8 = new javax.swing.JButton();
        casilla2_7 = new javax.swing.JButton();
        casilla2_6 = new javax.swing.JButton();
        casilla2_5 = new javax.swing.JButton();
        casilla2_4 = new javax.swing.JButton();
        casilla2_3 = new javax.swing.JButton();
        casilla2_2 = new javax.swing.JButton();
        casilla1_2 = new javax.swing.JButton();
        jButton219 = new javax.swing.JButton();
        casilla1_3 = new javax.swing.JButton();
        casilla1_4 = new javax.swing.JButton();
        casilla1_5 = new javax.swing.JButton();
        jButton223 = new javax.swing.JButton();
        casilla1_6 = new javax.swing.JButton();
        casilla1_7 = new javax.swing.JButton();
        casilla1_8 = new javax.swing.JButton();
        casilla1_9 = new javax.swing.JButton();
        casilla1_10 = new javax.swing.JButton();
        casilla1_11 = new javax.swing.JButton();
        casilla1_12 = new javax.swing.JButton();
        casilla1_13 = new javax.swing.JButton();
        casilla1_14 = new javax.swing.JButton();
        jButton233 = new javax.swing.JButton();
        txfMensaje = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnPlayer2 = new javax.swing.JRadioButton();
        btnPlayer3 = new javax.swing.JRadioButton();
        btnPlayer4 = new javax.swing.JRadioButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txfMensajes = new javax.swing.JTextArea();
        textFila = new javax.swing.JTextField();
        textColumna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelKgAcero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnComponenteAsociar = new javax.swing.JButton();
        btnColocarMundo = new javax.swing.JButton();
        btnColocarConector = new javax.swing.JButton();
        btnColocarMina1x2 = new javax.swing.JButton();
        boton2x1 = new javax.swing.JRadioButton();
        btnColocarTemplo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnComodin = new javax.swing.JButton();
        labelComponente = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cantTemplos = new javax.swing.JLabel();
        cantMinas = new javax.swing.JLabel();
        cantConectores = new javax.swing.JLabel();
        cantMundos = new javax.swing.JLabel();
        btnMercadoComponentes = new javax.swing.JButton();
        labelDinero = new javax.swing.JLabel();
        btnComprarArmas = new javax.swing.JButton();
        ArmeriaMisiles = new javax.swing.JButton();
        btnArmasDisp = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        textJugadorADisparar = new javax.swing.JTextField();
        botonDipararMisil = new javax.swing.JButton();
        botonDispararBomba = new javax.swing.JButton();
        botonDispararComboShot = new javax.swing.JButton();
        labelEscudos = new javax.swing.JLabel();
        cantArmeriaMisiles = new javax.swing.JLabel();
        cantArmeriaComboShot = new javax.swing.JLabel();
        cantArmeriaMultiShot = new javax.swing.JLabel();
        cantArmeriaBombas = new javax.swing.JLabel();
        ArmeriaBombas = new javax.swing.JButton();
        ArmeriaMultiShot = new javax.swing.JButton();
        ArmeriaComboShot = new javax.swing.JButton();
        botonDispararMultiShot = new javax.swing.JButton();
        botonEnviarNaveEspia = new javax.swing.JButton();
        bntMercado = new javax.swing.JButton();
        cantMercados = new javax.swing.JLabel();
        btnAbrirMercado = new javax.swing.JButton();
        btnPlayer1 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 910, 615));
        setMinimumSize(new java.awt.Dimension(910, 615));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla12_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        casilla5_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        casilla4_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        casilla3_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        casilla2_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        casilla13_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        casilla15_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        casilla6_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        casilla1_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        casilla8_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        casilla9_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        casilla10_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        casilla11_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        casilla9_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        casilla14_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        casilla15_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        casilla15_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        casilla15_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        casilla15_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        casilla15_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        casilla14_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        casilla15_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        casilla15_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        casilla15_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        casilla15_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        casilla15_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        casilla15_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        casilla15_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        casilla15_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        casilla14_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        casilla14_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        casilla14_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        casilla14_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        casilla14_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        casilla14_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        casilla14_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        casilla14_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        casilla14_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        casilla14_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        casilla14_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        casilla14_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        casilla14_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla14_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla14_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla14_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla14_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla14_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        casilla15_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla15_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla15_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla15_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla15_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla15_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        casilla1_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        casilla13_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        casilla13_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        casilla13_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        casilla13_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        casilla13_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        casilla13_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        casilla13_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        casilla13_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        casilla13_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        casilla13_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        casilla13_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        casilla13_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        casilla13_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        casilla13_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla13_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla13_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla13_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla13_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla13_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        casilla12_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        casilla12_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        casilla12_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        casilla12_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        casilla12_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        casilla12_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        casilla12_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        casilla12_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        casilla12_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        casilla12_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        casilla12_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        casilla12_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        casilla12_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        casilla12_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla12_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla12_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla12_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla12_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla12_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        casilla11_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        casilla11_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        casilla11_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        casilla11_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        casilla11_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        casilla11_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        casilla11_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        casilla11_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        casilla11_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        casilla11_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        casilla11_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        casilla11_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        casilla11_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        casilla11_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla11_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla11_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla11_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla11_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla11_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        casilla10_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        casilla10_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        casilla10_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        casilla10_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        casilla10_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        casilla10_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        casilla10_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        casilla10_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        casilla10_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        casilla10_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        casilla10_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        casilla10_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        casilla10_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        casilla10_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla10_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla10_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla10_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla10_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla10_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        casilla9_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        casilla9_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        casilla9_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        casilla9_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        casilla9_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        casilla9_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jButton107.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton107.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton107.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        casilla9_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        casilla9_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        casilla9_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        casilla9_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        casilla9_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        casilla9_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        casilla9_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla9_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla9_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla9_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        casilla8_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        casilla8_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        casilla8_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        casilla8_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        casilla8_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        casilla8_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        casilla8_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jButton122.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton122.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton122.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton122ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton122, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        casilla8_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        casilla8_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        casilla8_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        casilla8_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        casilla8_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        casilla8_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        casilla8_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla8_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla8_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla8_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        casilla7_1.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_1.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_1.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        casilla7_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        casilla7_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        casilla7_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        casilla7_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        casilla7_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        casilla7_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        casilla7_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        casilla7_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        casilla7_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        casilla7_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        casilla7_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        casilla7_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        casilla7_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        casilla7_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla7_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla7_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla7_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        casilla6_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, -1));

        casilla6_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        casilla6_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        casilla6_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        casilla6_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        casilla6_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        casilla6_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        casilla6_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        casilla6_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        casilla6_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        casilla6_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        casilla6_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        casilla6_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        casilla6_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla6_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla6_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        casilla5_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        casilla5_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        casilla5_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        casilla5_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        casilla5_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        casilla5_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        casilla5_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        casilla5_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        casilla5_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        casilla5_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        casilla5_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        casilla5_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        casilla5_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        casilla5_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla5_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla5_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla5_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        casilla4_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        casilla4_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        casilla4_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        casilla4_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        casilla4_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        casilla4_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        casilla4_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        casilla4_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        casilla4_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        casilla4_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        casilla4_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        casilla4_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        casilla4_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        casilla4_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla4_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla4_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        casilla3_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jButton188.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton188.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton188.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton188ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton188, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        casilla3_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        casilla3_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        casilla3_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        casilla3_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        casilla3_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        casilla3_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        casilla3_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        casilla3_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        casilla3_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        casilla3_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jButton199.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton199.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton199.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton199ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton199, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        casilla3_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        casilla3_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        casilla3_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla3_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla3_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla3_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        casilla2_15.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_15.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_15.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_15ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        casilla2_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        casilla2_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        casilla2_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        casilla2_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jButton208.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton208.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton208.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton208ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton208, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        casilla2_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        casilla2_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        casilla2_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        casilla2_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        casilla2_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        casilla2_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        casilla2_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        casilla2_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        casilla2_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla2_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla2_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        casilla1_2.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_2.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_2.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton219.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton219.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton219.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton219ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton219, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        casilla1_3.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_3.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_3.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        casilla1_4.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_4.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_4.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        casilla1_5.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_5.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_5.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton223.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton223.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton223.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton223ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton223, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        casilla1_6.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_6.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_6.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        casilla1_7.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_7.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_7.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        casilla1_8.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_8.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_8.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        casilla1_9.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_9.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_9.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        casilla1_10.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_10.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_10.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_10ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        casilla1_11.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_11.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_11.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_11ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        casilla1_12.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_12.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_12.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_12ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        casilla1_13.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_13.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_13.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_13ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        casilla1_14.setMaximumSize(new java.awt.Dimension(30, 30));
        casilla1_14.setMinimumSize(new java.awt.Dimension(30, 30));
        casilla1_14.setPreferredSize(new java.awt.Dimension(30, 30));
        casilla1_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1_14ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jButton233.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton233.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton233.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton233.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton233ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton233, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));
        getContentPane().add(txfMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 310, 30));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, 70, 30));

        btnPlayer2.setText("Player 2");
        btnPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 80, -1));

        btnPlayer3.setText("Player 3");
        btnPlayer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 80, -1));

        btnPlayer4.setText("Player 4");
        btnPlayer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 80, -1));

        btnLogout.setText("Logout");
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 70, -1));

        txfMensajes.setColumns(20);
        txfMensajes.setRows(5);
        jScrollPane2.setViewportView(txfMensajes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 380, -1));

        textFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFilaActionPerformed(evt);
            }
        });
        getContentPane().add(textFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 30, 30));

        textColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColumnaActionPerformed(evt);
            }
        });
        getContentPane().add(textColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 30, 30));

        jLabel2.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 20));

        labelKgAcero.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        labelKgAcero.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelKgAcero, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 150, 20));

        jLabel4.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fila");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 60, -1));

        jLabel5.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 450, -1));

        jLabel6.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("1");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 20, 20));

        jLabel7.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("3");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 20, 20));

        jLabel8.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("4");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 20, 20));

        jLabel9.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("5");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 20, 20));

        jLabel10.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("0");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 20));

        jLabel11.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("6");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 20, 20));

        jLabel12.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("7");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 20, 20));

        jLabel13.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("8");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 20, 20));

        jLabel14.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("9");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 20, 20));

        jLabel15.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("10");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 20));

        jLabel16.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("11");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        jLabel17.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("12");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        jLabel19.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("14");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 20));

        jLabel20.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("13");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 20));

        btnComponenteAsociar.setText("Componente Asociar");
        btnComponenteAsociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComponenteAsociarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComponenteAsociar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 160, -1));

        btnColocarMundo.setText("Mundo");
        btnColocarMundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColocarMundoActionPerformed(evt);
            }
        });
        getContentPane().add(btnColocarMundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 160, -1));

        btnColocarConector.setText("Conector");
        btnColocarConector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColocarConectorActionPerformed(evt);
            }
        });
        getContentPane().add(btnColocarConector, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 160, -1));

        btnColocarMina1x2.setText("Mina");
        btnColocarMina1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColocarMina1x2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColocarMina1x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 160, -1));

        boton2x1.setText("2x1");
        boton2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2x1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 50, -1));

        btnColocarTemplo.setText("Templo");
        btnColocarTemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColocarTemploActionPerformed(evt);
            }
        });
        getContentPane().add(btnColocarTemplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 160, -1));

        jLabel18.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Columna");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 80, -1));

        btnComodin.setText("Usar Comodin");
        btnComodin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComodinActionPerformed(evt);
            }
        });
        getContentPane().add(btnComodin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 130, -1));

        labelComponente.setMaximumSize(new java.awt.Dimension(90, 90));
        getContentPane().add(labelComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 80, 80));

        jLabel21.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Jugador Objetivo");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 180, -1));

        cantTemplos.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantTemplos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantTemplos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 40, 20));

        cantMinas.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantMinas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantMinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 40, 20));

        cantConectores.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantConectores.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantConectores, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 40, 20));

        cantMundos.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantMundos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantMundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 40, 20));

        btnMercadoComponentes.setText("Mercado Componentes");
        btnMercadoComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMercadoComponentesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMercadoComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 150, -1));

        labelDinero.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        labelDinero.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(labelDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 34, 150, 20));

        btnComprarArmas.setText("Comprar Armas");
        btnComprarArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarArmasActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 150, -1));

        ArmeriaMisiles.setText("Armeria Misiles");
        ArmeriaMisiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmeriaMisilesActionPerformed(evt);
            }
        });
        getContentPane().add(ArmeriaMisiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 160, -1));

        btnArmasDisp.setText("Armas Disponibles");
        btnArmasDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmasDispActionPerformed(evt);
            }
        });
        getContentPane().add(btnArmasDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 160, -1));

        jLabel22.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Colocar");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 100, -1));

        textJugadorADisparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textJugadorADispararActionPerformed(evt);
            }
        });
        getContentPane().add(textJugadorADisparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 30, 30));

        botonDipararMisil.setText("Disparar Misil");
        botonDipararMisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDipararMisilActionPerformed(evt);
            }
        });
        getContentPane().add(botonDipararMisil, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 160, -1));

        botonDispararBomba.setText("Disparar Bomba");
        botonDispararBomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDispararBombaActionPerformed(evt);
            }
        });
        getContentPane().add(botonDispararBomba, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 160, -1));

        botonDispararComboShot.setText("Disparar ComboShot");
        botonDispararComboShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDispararComboShotActionPerformed(evt);
            }
        });
        getContentPane().add(botonDispararComboShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 160, -1));

        labelEscudos.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        labelEscudos.setForeground(new java.awt.Color(255, 255, 255));
        labelEscudos.setText("Escudos: ");
        getContentPane().add(labelEscudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 140, -1));

        cantArmeriaMisiles.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantArmeriaMisiles.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantArmeriaMisiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 40, 20));

        cantArmeriaComboShot.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantArmeriaComboShot.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantArmeriaComboShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 40, 20));

        cantArmeriaMultiShot.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantArmeriaMultiShot.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantArmeriaMultiShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 40, 20));

        cantArmeriaBombas.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantArmeriaBombas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantArmeriaBombas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 40, 20));

        ArmeriaBombas.setText("Armeria Bombas");
        ArmeriaBombas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmeriaBombasActionPerformed(evt);
            }
        });
        getContentPane().add(ArmeriaBombas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 160, -1));

        ArmeriaMultiShot.setText("Armeria MultiShot");
        ArmeriaMultiShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmeriaMultiShotActionPerformed(evt);
            }
        });
        getContentPane().add(ArmeriaMultiShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 160, -1));

        ArmeriaComboShot.setText("Armeria ComboShot");
        ArmeriaComboShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmeriaComboShotActionPerformed(evt);
            }
        });
        getContentPane().add(ArmeriaComboShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 160, -1));

        botonDispararMultiShot.setText("Disparar MultiShot");
        botonDispararMultiShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDispararMultiShotActionPerformed(evt);
            }
        });
        getContentPane().add(botonDispararMultiShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 160, -1));

        botonEnviarNaveEspia.setText("Enviar Nave Espia");
        botonEnviarNaveEspia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarNaveEspiaActionPerformed(evt);
            }
        });
        getContentPane().add(botonEnviarNaveEspia, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 160, -1));

        bntMercado.setText("Mercado");
        bntMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMercadoActionPerformed(evt);
            }
        });
        getContentPane().add(bntMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 160, -1));

        cantMercados.setFont(new java.awt.Font("OCR A Std", 0, 11)); // NOI18N
        cantMercados.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantMercados, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 40, 20));

        btnAbrirMercado.setText("Abrir Mercado");
        btnAbrirMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirMercadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbrirMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 130, -1));

        btnPlayer1.setText("Player 1");
        btnPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 80, -1));

        jLabel24.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cant");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 40, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espacio3.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 1000));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, 1170, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    


    private void casilla12_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_1ActionPerformed
        
    }//GEN-LAST:event_casilla12_1ActionPerformed

    private void casilla5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_1ActionPerformed

    private void casilla4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_1ActionPerformed

    private void casilla3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_1ActionPerformed
        ponerPlaneta(casilla3_1);
    }//GEN-LAST:event_casilla3_1ActionPerformed

    private void casilla2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_1ActionPerformed

    private void casilla13_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_1ActionPerformed

    private void casilla15_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_2ActionPerformed

    private void casilla6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_1ActionPerformed

    private void casilla1_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_15ActionPerformed

    private void casilla8_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_4ActionPerformed

    private void casilla9_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_1ActionPerformed

    private void casilla10_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_1ActionPerformed

    private void casilla11_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_1ActionPerformed

    private void casilla9_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_15ActionPerformed

    private void casilla14_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_1ActionPerformed

    private void casilla15_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_3ActionPerformed

    private void casilla15_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_4ActionPerformed

    private void casilla15_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_5ActionPerformed

    private void casilla15_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_6ActionPerformed

    private void casilla15_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_7ActionPerformed

    private void casilla14_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_15ActionPerformed

    private void casilla15_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_9ActionPerformed

    private void casilla15_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_10ActionPerformed

    private void casilla15_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_11ActionPerformed

    private void casilla15_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_12ActionPerformed

    private void casilla15_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_13ActionPerformed

    private void casilla15_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_14ActionPerformed

    private void casilla15_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_1ActionPerformed

    private void casilla15_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_15ActionPerformed

    private void casilla14_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_14ActionPerformed

    private void casilla14_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_13ActionPerformed

    private void casilla14_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_12ActionPerformed

    private void casilla14_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_11ActionPerformed

    private void casilla14_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_10ActionPerformed

    private void casilla14_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_9ActionPerformed

    private void casilla14_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_8ActionPerformed

    private void casilla14_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_7ActionPerformed

    private void casilla14_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_6ActionPerformed

    private void casilla14_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_5ActionPerformed

    private void casilla14_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_4ActionPerformed

    private void casilla14_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_3ActionPerformed

    private void casilla14_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla14_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla14_2ActionPerformed

    private void casilla15_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla15_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla15_8ActionPerformed

    private void casilla1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_1ActionPerformed
    }//GEN-LAST:event_casilla1_1ActionPerformed

    private void casilla13_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_2ActionPerformed

    private void casilla13_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_3ActionPerformed

    private void casilla13_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_4ActionPerformed

    private void casilla13_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_5ActionPerformed

    private void casilla13_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_6ActionPerformed

    private void casilla13_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_7ActionPerformed

    private void casilla13_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_8ActionPerformed

    private void casilla13_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_9ActionPerformed

    private void casilla13_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_10ActionPerformed

    private void casilla13_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_11ActionPerformed

    private void casilla13_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_12ActionPerformed

    private void casilla13_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_13ActionPerformed

    private void casilla13_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_14ActionPerformed

    private void casilla13_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla13_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla13_15ActionPerformed

    private void casilla12_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_15ActionPerformed

    private void casilla12_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_14ActionPerformed

    private void casilla12_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_13ActionPerformed

    private void casilla12_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_12ActionPerformed

    private void casilla12_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_11ActionPerformed

    private void casilla12_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_10ActionPerformed

    private void casilla12_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_9ActionPerformed

    private void casilla12_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_8ActionPerformed

    private void casilla12_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_7ActionPerformed

    private void casilla12_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_6ActionPerformed

    private void casilla12_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_5ActionPerformed

    private void casilla12_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_4ActionPerformed

    private void casilla12_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_3ActionPerformed

    private void casilla12_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla12_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla12_2ActionPerformed

    private void casilla11_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_2ActionPerformed

    private void casilla11_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_3ActionPerformed

    private void casilla11_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_4ActionPerformed

    private void casilla11_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_5ActionPerformed

    private void casilla11_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_6ActionPerformed

    private void casilla11_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_7ActionPerformed

    private void casilla11_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_8ActionPerformed

    private void casilla11_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_9ActionPerformed

    private void casilla11_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_10ActionPerformed

    private void casilla11_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_11ActionPerformed

    private void casilla11_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_12ActionPerformed

    private void casilla11_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_13ActionPerformed

    private void casilla11_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_14ActionPerformed

    private void casilla11_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla11_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla11_15ActionPerformed

    private void casilla10_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_2ActionPerformed

    private void casilla10_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_3ActionPerformed

    private void casilla10_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_4ActionPerformed

    private void casilla10_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_5ActionPerformed

    private void casilla10_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_6ActionPerformed

    private void casilla10_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_7ActionPerformed

    private void casilla10_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_8ActionPerformed

    private void casilla10_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_9ActionPerformed

    private void casilla10_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_10ActionPerformed

    private void casilla10_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_11ActionPerformed

    private void casilla10_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_12ActionPerformed

    private void casilla10_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_13ActionPerformed

    private void casilla10_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_14ActionPerformed

    private void casilla10_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla10_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla10_15ActionPerformed

    private void casilla9_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_2ActionPerformed

    private void casilla9_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_3ActionPerformed

    private void casilla9_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_4ActionPerformed

    private void casilla9_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_5ActionPerformed

    private void casilla9_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_6ActionPerformed

    private void casilla9_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_7ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton107ActionPerformed

    private void casilla9_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_8ActionPerformed

    private void casilla9_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_9ActionPerformed

    private void casilla9_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_10ActionPerformed

    private void casilla9_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_11ActionPerformed

    private void casilla9_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_12ActionPerformed

    private void casilla9_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_13ActionPerformed

    private void casilla9_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla9_14ActionPerformed

    private void casilla8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_1ActionPerformed

    private void casilla8_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_2ActionPerformed

    private void casilla8_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_3ActionPerformed

    private void casilla8_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_15ActionPerformed

    private void casilla8_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_5ActionPerformed

    private void casilla8_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_6ActionPerformed

    private void casilla8_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_7ActionPerformed

    private void jButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton122ActionPerformed

    private void casilla8_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_8ActionPerformed

    private void casilla8_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_9ActionPerformed

    private void casilla8_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_10ActionPerformed

    private void casilla8_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_11ActionPerformed

    private void casilla8_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_12ActionPerformed

    private void casilla8_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_13ActionPerformed

    private void casilla8_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla8_14ActionPerformed

    private void casilla7_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_1ActionPerformed

    private void casilla7_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_2ActionPerformed

    private void casilla7_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_3ActionPerformed

    private void casilla7_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_4ActionPerformed

    private void casilla7_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_5ActionPerformed

    private void casilla7_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_6ActionPerformed

    private void casilla7_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_7ActionPerformed

    private void casilla7_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_8ActionPerformed

    private void casilla7_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_9ActionPerformed

    private void casilla7_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_10ActionPerformed

    private void casilla7_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_11ActionPerformed

    private void casilla7_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_12ActionPerformed

    private void casilla7_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_13ActionPerformed

    private void casilla7_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_14ActionPerformed

    private void casilla7_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla7_15ActionPerformed

    private void casilla6_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_15ActionPerformed

    private void casilla6_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_14ActionPerformed

    private void casilla6_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_13ActionPerformed

    private void casilla6_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_12ActionPerformed

    private void casilla6_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_11ActionPerformed

    private void casilla6_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_10ActionPerformed

    private void casilla6_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_9ActionPerformed

    private void casilla6_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_8ActionPerformed

    private void casilla6_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_7ActionPerformed

    private void casilla6_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_6ActionPerformed

    private void casilla6_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_5ActionPerformed

    private void casilla6_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_4ActionPerformed

    private void casilla6_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_3ActionPerformed

    private void casilla6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla6_2ActionPerformed

    private void casilla5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_2ActionPerformed

    private void casilla5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_3ActionPerformed

    private void casilla5_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_4ActionPerformed

    private void casilla5_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_5ActionPerformed

    private void casilla5_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_6ActionPerformed

    private void casilla5_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_7ActionPerformed

    private void casilla5_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_8ActionPerformed

    private void casilla5_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_9ActionPerformed

    private void casilla5_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_10ActionPerformed

    private void casilla5_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_11ActionPerformed

    private void casilla5_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_12ActionPerformed

    private void casilla5_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_13ActionPerformed

    private void casilla5_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_14ActionPerformed

    private void casilla5_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla5_15ActionPerformed

    private void casilla4_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_15ActionPerformed

    private void casilla4_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_14ActionPerformed

    private void casilla4_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_13ActionPerformed

    private void casilla4_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_12ActionPerformed

    private void casilla4_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_11ActionPerformed

    private void casilla4_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_10ActionPerformed

    private void casilla4_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_9ActionPerformed

    private void casilla4_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_8ActionPerformed

    private void casilla4_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_7ActionPerformed

    private void casilla4_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_6ActionPerformed

    private void casilla4_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_5ActionPerformed

    private void casilla4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_4ActionPerformed

    private void casilla4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_3ActionPerformed

    private void casilla4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla4_2ActionPerformed

    private void casilla3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_2ActionPerformed

    private void jButton188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton188ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton188ActionPerformed

    private void casilla3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_3ActionPerformed

    private void casilla3_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_4ActionPerformed

    private void casilla3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_5ActionPerformed

    private void casilla3_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_6ActionPerformed

    private void casilla3_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_7ActionPerformed

    private void casilla3_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_8ActionPerformed

    private void casilla3_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_9ActionPerformed

    private void casilla3_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_10ActionPerformed

    private void casilla3_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_11ActionPerformed

    private void casilla3_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_12ActionPerformed

    private void jButton199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton199ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton199ActionPerformed

    private void casilla3_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_13ActionPerformed

    private void casilla3_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_14ActionPerformed

    private void casilla3_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla3_15ActionPerformed

    private void casilla2_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_15ActionPerformed

    private void casilla2_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_14ActionPerformed

    private void casilla2_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_13ActionPerformed

    private void casilla2_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_12ActionPerformed

    private void casilla2_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_11ActionPerformed

    private void jButton208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton208ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton208ActionPerformed

    private void casilla2_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_10ActionPerformed

    private void casilla2_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_9ActionPerformed

    private void casilla2_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_8ActionPerformed

    private void casilla2_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_7ActionPerformed

    private void casilla2_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_6ActionPerformed

    private void casilla2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_5ActionPerformed

    private void casilla2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_4ActionPerformed

    private void casilla2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_3ActionPerformed

    private void casilla2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2_2ActionPerformed

    private void casilla1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_2ActionPerformed

    private void jButton219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton219ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton219ActionPerformed

    private void casilla1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_3ActionPerformed

    private void casilla1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_4ActionPerformed

    private void casilla1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_5ActionPerformed

    private void jButton223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton223ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton223ActionPerformed

    private void casilla1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_6ActionPerformed

    private void casilla1_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_7ActionPerformed

    private void casilla1_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_8ActionPerformed

    private void casilla1_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_9ActionPerformed

    private void casilla1_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_10ActionPerformed

    private void casilla1_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_11ActionPerformed

    private void casilla1_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_12ActionPerformed

    private void casilla1_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_13ActionPerformed

    private void casilla1_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1_14ActionPerformed

    private void jButton233ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton233ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton233ActionPerformed

    private void btnPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2ActionPerformed

        btnPlayer1.setSelected(false);
        btnPlayer3.setSelected(false);
        btnPlayer4.setSelected(false);
         try {
            if(jugadorAsociado.getNumero()==2){
                jugadorAsociado.traducirMatriz(jugadorAsociado.enviarStringMatriz());
            }
            else if (jugadorAsociado.getNumeroJugadores()>=2){
                jugadorAsociado.getSalida().writeInt(6);
                jugadorAsociado.getSalida().writeInt(2);
        }
        } catch (IOException ex) {
            Logger.getLogger(Plataforma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPlayer2ActionPerformed

    private void btnPlayer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer3ActionPerformed
        btnPlayer1.setSelected(false);
        btnPlayer2.setSelected(false);
        btnPlayer4.setSelected(false);
        try {
            if(jugadorAsociado.getNumero()==3){
                jugadorAsociado.traducirMatriz(jugadorAsociado.enviarStringMatriz());
            }
            else if (jugadorAsociado.getNumeroJugadores()>=3){
                jugadorAsociado.getSalida().writeInt(6);
                jugadorAsociado.getSalida().writeInt(3);
        }
        } catch (IOException ex) {
            Logger.getLogger(Plataforma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPlayer3ActionPerformed

    private void btnPlayer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer4ActionPerformed
        btnPlayer2.setSelected(false);
        btnPlayer3.setSelected(false);
        btnPlayer1.setSelected(false);
        try {
            if(jugadorAsociado.getNumero()==4){
                jugadorAsociado.traducirMatriz(jugadorAsociado.enviarStringMatriz());
            }
            else if (jugadorAsociado.getNumeroJugadores()>=4){
                jugadorAsociado.getSalida().writeInt(6);
                jugadorAsociado.getSalida().writeInt(4);
        }
        } catch (IOException ex) {
            Logger.getLogger(Plataforma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPlayer4ActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
    try {
            // se toma lo escrito
            String mensaje = txfMensaje.getText();
            // se muestra en el text area
            txfMensajes.append(jugadorAsociado.getNombre()+"> "+ mensaje + "\n");
            // se limpia el textfield
            txfMensaje.setText("");

            // envia al server la opcion 4 para que le pase al enemigo
            // lo escrito
            jugadorAsociado.getSalida().writeInt(4);
            // le envia el mensaje
            jugadorAsociado.getSalida().writeUTF(jugadorAsociado.getNombre()+"> "+mensaje);
            
        } catch (IOException ex) {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void textFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFilaActionPerformed

    private void textColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textColumnaActionPerformed

    private void btnComponenteAsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComponenteAsociarActionPerformed
        // Tomar componente Asociar
        if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
            int fila = Integer.parseInt(textFila.getText());    
            int columna = Integer.parseInt(textColumna.getText());
            if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                if (jugadorAsociado.getCasillaMatriz(fila, columna).getComponente() != null)
                    componenteAsociar = jugadorAsociado.getCasillaMatriz(fila, columna).getComponente();
            }
        }
    }//GEN-LAST:event_btnComponenteAsociarActionPerformed

    private void btnColocarMundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColocarMundoActionPerformed
        // Colocar Mundo
        int indiceMundo = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene mundos
            if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Mundo){
                indiceMundo = i;
                break;
            } 
        }
        if (indiceMundo != -1){
            if ((textFila.getText() != "") &&(textColumna.getText() != "")){  // Tomo la fila y columna del mundo a colocar
                int fila = Integer.parseInt(textFila.getText());    
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if (jugadorAsociado.agregarMundo(fila, columna)){
                        int indiceBoton = fila*15+columna;
                        JButton boton = listaBotones.get(indiceBoton);
                        ponerPlaneta(boton);
                        jugadorAsociado.getComponentesDisponibles().remove(indiceMundo);
                    }
                }   
            }
        }
    }//GEN-LAST:event_btnColocarMundoActionPerformed

    private void btnColocarConectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColocarConectorActionPerformed
        // Colocar conector
        int indiceConector = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene mundos
            if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Conector){
                indiceConector = i;
                break;
            } 
        }
        if (indiceConector != -1){
            if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
                int fila = Integer.parseInt(textFila.getText());    
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if (componenteAsociar != null){
                        if (jugadorAsociado.agregarConector(fila, columna, componenteAsociar) == true){
                            int indiceBoton = fila*15+columna;
                            JButton boton = listaBotones.get(indiceBoton); 
                            ponerConector(boton);
                            jugadorAsociado.getComponentesDisponibles().remove(indiceConector);
                            componenteAsociar = null;
                        }
                    }
                }
            }    
        } 
    }//GEN-LAST:event_btnColocarConectorActionPerformed

    private void btnColocarMina1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColocarMina1x2ActionPerformed
        // Colocar  Mina 1x2
        int indiceMina = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene minas
            if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Mina){
                indiceMina = i;
                break;
            }
        }
        if (indiceMina != -1){
            if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
                int fila = Integer.parseInt(textFila.getText());
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if ((componenteAsociar != null) && (componenteAsociar instanceof Conector)){
                        if (boton2x1.isSelected() == false){
                            if (jugadorAsociado.agregarMina(fila, columna,true, (Conector)componenteAsociar) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerMina1x2(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMina);
                                componenteAsociar = null;
                            }
                        }
                        else{
                            if (jugadorAsociado.agregarMina(fila, columna,false, (Conector)componenteAsociar) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton);
                                ponerMina2x1(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMina);
                                componenteAsociar = null;
                            }
                        }
                    }
                }
            }
        }
      }//GEN-LAST:event_btnColocarMina1x2ActionPerformed

    private void boton2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton2x1ActionPerformed

    private void btnColocarTemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColocarTemploActionPerformed
        // Colocar  Templo
        int indiceTemplo = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene mundos
            if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Templo){
                indiceTemplo = i;
                break;
            } 
        }
        if (indiceTemplo != -1){
            if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
                int fila = Integer.parseInt(textFila.getText());    
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if ((componenteAsociar != null) && (componenteAsociar instanceof Conector)){
                        if (boton2x1.isSelected() == false){
                            if (jugadorAsociado.agregarTemplo(fila, columna,true, (Conector)componenteAsociar) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerTemplo1x2(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceTemplo);
                                componenteAsociar = null;
                            }
                        }
                        else{
                            if (jugadorAsociado.agregarTemplo(fila, columna,false, (Conector)componenteAsociar) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerTemplo2x1(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceTemplo);
                                componenteAsociar = null;
                            } 
                        }         
                    }
                }
            }
        }
    }//GEN-LAST:event_btnColocarTemploActionPerformed

    private void btnComodinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComodinActionPerformed
 
        try {
            int escudos = (int )(Math.random() * 6 + 6);
            this.jugadorAsociado.setCantEscudos(escudos);
            this.jugadorAsociado.avisarEscudo(escudos);
        } catch (IOException ex) {
            Logger.getLogger(Plataforma.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jugadorAsociado.setComodin(false);        
        
    }//GEN-LAST:event_btnComodinActionPerformed

    private void btnMercadoComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMercadoComponentesActionPerformed
        MercadoComponentes mercadoComponentes = new MercadoComponentes (this.getJugador());
        mercadoComponentes.setVisible(true);
        
    }//GEN-LAST:event_btnMercadoComponentesActionPerformed

    private void btnComprarArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarArmasActionPerformed
        vArmeria varmeria = new vArmeria(this.jugadorAsociado);
        varmeria.getBtnComprarMisil().setEnabled(false);
        varmeria.getBtnComprarBomba().setEnabled(false);
        varmeria.getBtnComprarMultiShot().setEnabled(false);
        varmeria.getBtnComprarComboShot().setEnabled(false);
        
        for(int i = 0; i<jugadorAsociado.getGrafo().getComponentes().size(); i++){
            if(jugadorAsociado.getGrafo().getComponentes().get(i) instanceof Armeria)
            {
                Armeria armeria = (Armeria)jugadorAsociado.getGrafo().getComponentes().get(i);
                int tipoArmeria = armeria.getTipo();                
                
                if (tipoArmeria == 0)
                    varmeria.getBtnComprarMisil().setEnabled(true);
                else if (tipoArmeria == 1)
                    varmeria.getBtnComprarBomba().setEnabled(true);
                else if (tipoArmeria == 2)
                    varmeria.getBtnComprarMultiShot().setEnabled(true);
                else if (tipoArmeria == 3)
                    varmeria.getBtnComprarComboShot().setEnabled(true);
            }
        }
        varmeria.setVisible(true);
        
    }//GEN-LAST:event_btnComprarArmasActionPerformed

    private void ArmeriaMisilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmeriaMisilesActionPerformed
        // Colocar  Armeria
        int indiceMisil = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene mundos
            if ((jugadorAsociado.getComponentesDisponibles().get(i) instanceof Armeria)){
                Armeria armeria = (Armeria)jugadorAsociado.getComponentesDisponibles().get(i);
                if (armeria.getTipo() == 0){
                    indiceMisil = i;
                    break;
                }
            } 
        }
        if (indiceMisil != -1){
            if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
                int fila = Integer.parseInt(textFila.getText());    
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if ((componenteAsociar != null) && (componenteAsociar instanceof Conector)){
                        if (boton2x1.isSelected() == false){
                            if (jugadorAsociado.agregarArmeria(fila, columna,true, (Conector)componenteAsociar,0) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerArmeria1x2(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMisil);
                                componenteAsociar = null;
                            }
                        }
                        else{
                            if (jugadorAsociado.agregarArmeria(fila, columna,false, (Conector)componenteAsociar,0) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerArmeria2x1(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMisil);
                                componenteAsociar = null;
                            } 
                        }         
                    }
                }
            }
        }
    }//GEN-LAST:event_ArmeriaMisilesActionPerformed

    private void btnArmasDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmasDispActionPerformed
        int misiles = 0;
        int comboShot = 0;
        int multiShot = 0;
        int bombas = 0;
        int navesEspia = 0;
        for (int i=0 ;i<this.jugadorAsociado.getArmas().size(); i++){
            if (this.jugadorAsociado.getArmas().get(i) instanceof Misil)
                misiles++;
            else if (this.jugadorAsociado.getArmas().get(i) instanceof ComboShot)
                comboShot++;
            else if (this.jugadorAsociado.getArmas().get(i) instanceof MultiShot)
                multiShot++;
            else if (this.jugadorAsociado.getArmas().get(i) instanceof Bomba)
                bombas++;
            else if (this.jugadorAsociado.getArmas().get(i) instanceof NaveEspia)
                navesEspia++;
        }
                
        VArmasDisp armasDisp = new VArmasDisp(this.jugadorAsociado);
        armasDisp.getLabelMisil().setText("Misiles: " + String.valueOf(misiles));
        armasDisp.getLabelComboShot().setText("ComboShot: " + String.valueOf(comboShot));
        armasDisp.getLabelMultiShot().setText("MultiShot: " + String.valueOf(multiShot));
        armasDisp.getLabelBomba().setText("Bombas: " + String.valueOf(bombas));
        armasDisp.getLabelNaveEspia().setText("Naves Espia: " + String.valueOf(navesEspia));
        armasDisp.setVisible(true);
        
    }//GEN-LAST:event_btnArmasDispActionPerformed

    private void textJugadorADispararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textJugadorADispararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textJugadorADispararActionPerformed

    private void botonDipararMisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDipararMisilActionPerformed
        String casillaX = textFila.getText();
        String casillaY = textColumna.getText();
        String jugadorADisparar = textJugadorADisparar.getText();
        try{
            int posX = Integer.parseInt(casillaX);
            int posY = Integer.parseInt(casillaY);
            int jugadorRecibeDisparo = Integer.parseInt(jugadorADisparar);
            if (jugadorAsociado.disparar(0, posX, posY, jugadorRecibeDisparo)){
                mostrar("Servidor: Datos Correctos");
                jugadorAsociado.finalizarTurno();

            }
            else{
                mostrar("Servidor: Datos Incorrectos");
                
            }
           
        }catch(Exception e){
            mostrar("Servidor: Datos Incorrectos");
            
        }
        
    }//GEN-LAST:event_botonDipararMisilActionPerformed

    private void botonDispararBombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDispararBombaActionPerformed

        String casillasADisparar1 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar2 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar3 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String jugadorADisparar = textJugadorADisparar.getText();
        if ((validarStringCasillas(casillasADisparar1))&&(validarStringCasillas(casillasADisparar2)) && (validarStringCasillas(casillasADisparar3))){
            System.out.println("Las casillas fueron ingresadas correctamente");
            int cantidadDisparos = 0;
            ArrayList <String> casillasADisparar = new ArrayList();
            casillasADisparar.add(casillasADisparar1);
            casillasADisparar.add(casillasADisparar2);
            casillasADisparar.add(casillasADisparar3);
            try{
                while (cantidadDisparos<3){
                    int casillaX = (Integer)obtenerCasillas(casillasADisparar.get(cantidadDisparos)).get(0);
                    int casillaY = (Integer)obtenerCasillas(casillasADisparar.get(cantidadDisparos)).get(1);
                    System.out.println("CasillaX: " + casillaX);
                    System.out.println("CasillaY: " + casillaY);
                    int jugadorRecibeDisparo = Integer.parseInt(jugadorADisparar);
                    Random tipoDeDisparo = new Random();
                    System.out.println("Hice la conversion");
                    boolean disparo1x2 = tipoDeDisparo.nextBoolean();
                    dispararBomba(casillaX,casillaY,jugadorRecibeDisparo,disparo1x2);
                    cantidadDisparos++;
                    Thread.sleep(2000);
                }
                jugadorAsociado.quitarArma(jugadorAsociado.getBomba());
                jugadorAsociado.finalizarTurno();
            }catch(Exception e){
                mostrar("Servidor: Datos Incorrectos"); 
            }
        }
        else
            mostrar("Servidor: Datos Incorretos");
            
        
        
    }//GEN-LAST:event_botonDispararBombaActionPerformed

    private void botonDispararComboShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDispararComboShotActionPerformed

        String casillasADisparar1 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar2 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar3 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar4 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar5 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar6 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar7 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar8 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar9 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String casillasADisparar10 = JOptionPane.showInputDialog("Escriba la casilla de esta forma: 3x3");
        String jugadorADisparar = textJugadorADisparar.getText();
        if ((validarStringCasillas(casillasADisparar1))&&(validarStringCasillas(casillasADisparar2)) && 
            (validarStringCasillas(casillasADisparar3))&&(validarStringCasillas(casillasADisparar4)) &&
            (validarStringCasillas(casillasADisparar5))&&(validarStringCasillas(casillasADisparar6)) &&
            (validarStringCasillas(casillasADisparar7)&&(validarStringCasillas(casillasADisparar8))) &&
            (validarStringCasillas(casillasADisparar9))&&(validarStringCasillas(casillasADisparar10))){
            ArrayList <String> casillasADisparar = new ArrayList();
            casillasADisparar.add(casillasADisparar1);
            casillasADisparar.add(casillasADisparar2);
            casillasADisparar.add(casillasADisparar3);
            casillasADisparar.add(casillasADisparar4);
            casillasADisparar.add(casillasADisparar5);
            casillasADisparar.add(casillasADisparar6);
            casillasADisparar.add(casillasADisparar7);
            casillasADisparar.add(casillasADisparar8);
            casillasADisparar.add(casillasADisparar9);
            casillasADisparar.add(casillasADisparar10);
            try{
                for (int i = 0;i<10;i++){
                    int casillaX = (Integer)obtenerCasillas(casillasADisparar.get(i)).get(0);
                    int casillaY = (Integer)obtenerCasillas(casillasADisparar.get(i)).get(1);
                    int jugadorRecibeDisparo = Integer.parseInt(jugadorADisparar);
                    if(jugadorAsociado.disparar(2, casillaX, casillaY, jugadorRecibeDisparo)){
                        mostrar("Servidor: Datos Correctos");
                        
                    }
                    else{
                        mostrar("Servidor: Datos Correctos");
                        
                    }
                    Thread.sleep(2000);
                }
                jugadorAsociado.quitarArma(jugadorAsociado.getComboShot());
                jugadorAsociado.finalizarTurno();
            }catch (Exception e){
                mostrar("Servidor: Datos Correctos");
                
            }   
        }
    }//GEN-LAST:event_botonDispararComboShotActionPerformed

    private void ArmeriaBombasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmeriaBombasActionPerformed

        // Colocar  Armeria
        int indiceMisil = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene mundos
            if ((jugadorAsociado.getComponentesDisponibles().get(i) instanceof Armeria)){
                Armeria armeria = (Armeria)jugadorAsociado.getComponentesDisponibles().get(i);
                if (armeria.getTipo() == 1){
                    indiceMisil = i;
                    break;
                }
            } 
        }
        if (indiceMisil != -1){
            if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
                int fila = Integer.parseInt(textFila.getText());    
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if ((componenteAsociar != null) && (componenteAsociar instanceof Conector)){
                        if (boton2x1.isSelected() == false){
                            if (jugadorAsociado.agregarArmeria(fila, columna,true, (Conector)componenteAsociar,1) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerArmeria1x2(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMisil);
                                componenteAsociar = null;
                            }
                        }
                        else{
                            if (jugadorAsociado.agregarArmeria(fila, columna,false, (Conector)componenteAsociar,1) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerArmeria2x1(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMisil);
                                componenteAsociar = null;
                            } 
                        }         
                    }
                }
            }
        }
    }//GEN-LAST:event_ArmeriaBombasActionPerformed

    private void ArmeriaMultiShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmeriaMultiShotActionPerformed

        // Colocar  Armeria
        int indiceMisil = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene mundos
            if ((jugadorAsociado.getComponentesDisponibles().get(i) instanceof Armeria)){
                Armeria armeria = (Armeria)jugadorAsociado.getComponentesDisponibles().get(i);
                if (armeria.getTipo() == 2){
                    indiceMisil = i;
                    break;
                }
            } 
        }
        if (indiceMisil != -1){
            if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
                int fila = Integer.parseInt(textFila.getText());    
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if ((componenteAsociar != null) && (componenteAsociar instanceof Conector)){
                        if (boton2x1.isSelected() == false){
                            if (jugadorAsociado.agregarArmeria(fila, columna,true, (Conector)componenteAsociar,2) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerArmeria1x2(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMisil);
                                componenteAsociar = null;
                            }
                        }
                        else{
                            if (jugadorAsociado.agregarArmeria(fila, columna,false, (Conector)componenteAsociar,2) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerArmeria2x1(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMisil);
                                componenteAsociar = null;
                            } 
                        }         
                    }
                }
            }
        }        
    }//GEN-LAST:event_ArmeriaMultiShotActionPerformed

    private void ArmeriaComboShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmeriaComboShotActionPerformed

        // Colocar  Armeria
        int indiceMisil = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene mundos
            if ((jugadorAsociado.getComponentesDisponibles().get(i) instanceof Armeria)){
                Armeria armeria = (Armeria)jugadorAsociado.getComponentesDisponibles().get(i);
                if (armeria.getTipo() == 3){
                    indiceMisil = i;
                    break;
                }
            } 
        }
        if (indiceMisil != -1){
            if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
                int fila = Integer.parseInt(textFila.getText());    
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if ((componenteAsociar != null) && (componenteAsociar instanceof Conector)){
                        if (boton2x1.isSelected() == false){
                            if (jugadorAsociado.agregarArmeria(fila, columna,true, (Conector)componenteAsociar,3) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerArmeria1x2(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMisil);
                                componenteAsociar = null;
                            }
                        }
                        else{
                            if (jugadorAsociado.agregarArmeria(fila, columna,false, (Conector)componenteAsociar,3) == true){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerArmeria2x1(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMisil);
                                componenteAsociar = null;
                            } 
                        }         
                    }
                }
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ArmeriaComboShotActionPerformed

    private void botonDispararMultiShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDispararMultiShotActionPerformed
        String casillaX = textFila.getText();
        String casillaY = textColumna.getText();
        String jugadorADisparar = textJugadorADisparar.getText();
        try{
            int posX = Integer.parseInt(casillaX);
            int posY = Integer.parseInt(casillaY);
            int jugadorRecibeDisparo = Integer.parseInt(jugadorADisparar);
            if (jugadorAsociado.disparar(3, posX, posY, jugadorRecibeDisparo)){
                mostrar("Servidor: Datos Correctos");
            }
            else{
                mostrar("Servidor: Datos Incorrectos");
                
            }
            jugadorAsociado.finalizarTurno();
           
        }catch(Exception e){
            mostrar("Servidor: Datos Incorrectos");
            
        }
          }//GEN-LAST:event_botonDispararMultiShotActionPerformed

    private void botonEnviarNaveEspiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarNaveEspiaActionPerformed
        String jugadorADisparar = textJugadorADisparar.getText();
        try{
            int jugadorRecibeNave = Integer.parseInt(jugadorADisparar);
            if ((jugadorAsociado.getNumero() != jugadorRecibeNave)&&(jugadorRecibeNave <= jugadorAsociado.getNumeroJugadores())){
                jugadorAsociado.disparar(4, 0, 0, jugadorRecibeNave);
            }
            else
                mostrar("Servidor: Datos Incorrectos");
            jugadorAsociado.finalizarTurno();
        }catch(Exception e){
            mostrar("Servidor: Datos Incorrectos");
        }
    }//GEN-LAST:event_botonEnviarNaveEspiaActionPerformed

    private void bntMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMercadoActionPerformed
        // Colocar Mercado
        int indiceMercado = -1;
        for (int i =0;i<jugadorAsociado.getComponentesDisponibles().size(); i++ ){ // Verifico si tiene mundos
            if ((jugadorAsociado.getComponentesDisponibles().get(i) instanceof Mercado)){
                indiceMercado = i;
            }
        }
        if (indiceMercado != -1){
            if ((textFila.getText() != "") && (textColumna.getText() != "")){  // Tomo la fila y columna
                int fila = Integer.parseInt(textFila.getText());    
                int columna = Integer.parseInt(textColumna.getText());
                if ((fila < 15) && (fila >= 0) && (columna < 15) && (columna >= 0)){ // Fila y columna en rango
                    if ((componenteAsociar != null) && (componenteAsociar instanceof Conector)){
                        if (boton2x1.isSelected() == false){
                            if (jugadorAsociado.agregarMercado(fila, columna,true, (Conector)componenteAsociar)){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerMercado1x2(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMercado);
                                componenteAsociar = null;
                            }
                        }
                        else{
                            if (jugadorAsociado.agregarMercado(fila, columna,false, (Conector)componenteAsociar)){
                                int indiceBoton = fila*15+columna;
                                JButton boton = listaBotones.get(indiceBoton); 
                                ponerMercado2x1(boton);
                                jugadorAsociado.getComponentesDisponibles().remove(indiceMercado);
                                componenteAsociar = null;
                            } 
                        }         
                    }
                }
            }
        }
    }//GEN-LAST:event_bntMercadoActionPerformed

    private void btnAbrirMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirMercadoActionPerformed
        // Abrir Mercado
        vMercado mercado = new vMercado(this.jugadorAsociado);
        mercado.setVisible(true);
        
    }//GEN-LAST:event_btnAbrirMercadoActionPerformed

    private void btnPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1ActionPerformed
        btnPlayer2.setSelected(false);
        btnPlayer3.setSelected(false);
        btnPlayer4.setSelected(false);
        try {
            if(jugadorAsociado.getNumero()==1){
                jugadorAsociado.traducirMatriz(jugadorAsociado.enviarStringMatriz());
            }
            else {
                jugadorAsociado.getSalida().writeInt(6);
                jugadorAsociado.getSalida().writeInt(1);
        }
        } catch (IOException ex) {
            Logger.getLogger(Plataforma.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnPlayer1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void ponerPlaneta(JButton boton)
    {
        boton.setIcon(partePlaneta1);
        for (int i = 0;i<listaBotones.size();i++)
        {
           JButton botonAdyacente= listaBotones.get(i);
           
           if (botonAdyacente.getX()== boton.getX()+30 & botonAdyacente.getY()== boton.getY())
           {
              botonAdyacente.setIcon(partePlaneta2);
           }
           
           if (botonAdyacente.getX()== boton.getX()+30 & botonAdyacente.getY()== boton.getY()+30)
           {
              botonAdyacente.setIcon(partePlaneta3);
           }
           
           if (botonAdyacente.getX()== boton.getX() & botonAdyacente.getY()== boton.getY()+30)
           {
              botonAdyacente.setIcon(partePlaneta4);
           }
        }
    }
    
    public void ponerConector(JButton boton)
    {
        boton.setIcon(conector);
    }
    
    public void ponerMina2x1(JButton boton)
    {
        boton.setIcon(mina);
        for(int i=0;i<listaBotones.size();i++)
        {
            if (listaBotones.get(i).getX() == boton.getX()+30 & listaBotones.get(i).getY() == boton.getY())
            {
                listaBotones.get(i).setIcon(mina);
            }
        }
    }
    public void ponerMina1x2(JButton boton)
    {
        boton.setIcon(mina);
        for(int i=0;i<listaBotones.size();i++)
        {
            if (listaBotones.get(i).getY() == boton.getY()+30 & listaBotones.get(i).getX() == boton.getX())
            {
                listaBotones.get(i).setIcon(mina);
            }
        }
    }
    
    public void ponerTemplo1x2(JButton boton)
    {
        boton.setIcon(templo1);
        for(int i=0;i<listaBotones.size();i++)
        {
            if (listaBotones.get(i).getY() == boton.getY()+30 & listaBotones.get(i).getX() == boton.getX())
            {
                listaBotones.get(i).setIcon(templo2);
            }
        }
    }
     public void ponerTemplo2x1(JButton boton)
    {
        boton.setIcon(templo2volt);
        for(int i=0;i<listaBotones.size();i++)
        {
            if (listaBotones.get(i).getX() == boton.getX()+30 & listaBotones.get(i).getY() == boton.getY())
            {
                listaBotones.get(i).setIcon(templo1volt);
            }
        }
    }
    
    public void ponerArmeria1x2(JButton boton)
    {
        boton.setIcon(armeria);
        for(int i=0;i<listaBotones.size();i++)
        {
            if (listaBotones.get(i).getY() == boton.getY()+30 & listaBotones.get(i).getX() == boton.getX())
            {
                listaBotones.get(i).setIcon(armeria);
            }
        }
    }
     public void ponerArmeria2x1(JButton boton)
    {
        boton.setIcon(armeria);
        for(int i=0;i<listaBotones.size();i++)
        {
            if (listaBotones.get(i).getX() == boton.getX()+30 & listaBotones.get(i).getY() == boton.getY())
            {
                listaBotones.get(i).setIcon(armeria);
            }
        }
    } 
     
    public void ponerHoyoNegro(JButton boton)
    {
        boton.setIcon(hoyoNegro);
    } 

    public void ponerMercado1x2(JButton boton)
    {
        boton.setIcon(mercado);
        for(int i=0;i<listaBotones.size();i++)
        {
            if (listaBotones.get(i).getY() == boton.getY()+30 & listaBotones.get(i).getX() == boton.getX())
            {
                listaBotones.get(i).setIcon(mercado);
            }
        }
    }
     public void ponerMercado2x1(JButton boton)
    {
        boton.setIcon(mercado);
        for(int i=0;i<listaBotones.size();i++)
        {
            if (listaBotones.get(i).getX() == boton.getX()+30 & listaBotones.get(i).getY() == boton.getY())
            {
                listaBotones.get(i).setIcon(mercado);
            }
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Plataforma().setVisible(true);
            }
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArmeriaBombas;
    private javax.swing.JButton ArmeriaComboShot;
    private javax.swing.JButton ArmeriaMisiles;
    private javax.swing.JButton ArmeriaMultiShot;
    private javax.swing.JButton bntMercado;
    private javax.swing.JRadioButton boton2x1;
    private javax.swing.JButton botonDipararMisil;
    private javax.swing.JButton botonDispararBomba;
    private javax.swing.JButton botonDispararComboShot;
    private javax.swing.JButton botonDispararMultiShot;
    private javax.swing.JButton botonEnviarNaveEspia;
    private javax.swing.JButton btnAbrirMercado;
    private javax.swing.JButton btnArmasDisp;
    private javax.swing.JButton btnColocarConector;
    private javax.swing.JButton btnColocarMina1x2;
    private javax.swing.JButton btnColocarMundo;
    private javax.swing.JButton btnColocarTemplo;
    private javax.swing.JButton btnComodin;
    private javax.swing.JButton btnComponenteAsociar;
    private javax.swing.JButton btnComprarArmas;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMercadoComponentes;
    private javax.swing.JRadioButton btnPlayer1;
    private javax.swing.JRadioButton btnPlayer2;
    private javax.swing.JRadioButton btnPlayer3;
    private javax.swing.JRadioButton btnPlayer4;
    private javax.swing.JLabel cantArmeriaBombas;
    private javax.swing.JLabel cantArmeriaComboShot;
    private javax.swing.JLabel cantArmeriaMisiles;
    private javax.swing.JLabel cantArmeriaMultiShot;
    private javax.swing.JLabel cantConectores;
    private javax.swing.JLabel cantMercados;
    private javax.swing.JLabel cantMinas;
    private javax.swing.JLabel cantMundos;
    private javax.swing.JLabel cantTemplos;
    private javax.swing.JButton casilla10_1;
    private javax.swing.JButton casilla10_10;
    private javax.swing.JButton casilla10_11;
    private javax.swing.JButton casilla10_12;
    private javax.swing.JButton casilla10_13;
    private javax.swing.JButton casilla10_14;
    private javax.swing.JButton casilla10_15;
    private javax.swing.JButton casilla10_2;
    private javax.swing.JButton casilla10_3;
    private javax.swing.JButton casilla10_4;
    private javax.swing.JButton casilla10_5;
    private javax.swing.JButton casilla10_6;
    private javax.swing.JButton casilla10_7;
    private javax.swing.JButton casilla10_8;
    private javax.swing.JButton casilla10_9;
    private javax.swing.JButton casilla11_1;
    private javax.swing.JButton casilla11_10;
    private javax.swing.JButton casilla11_11;
    private javax.swing.JButton casilla11_12;
    private javax.swing.JButton casilla11_13;
    private javax.swing.JButton casilla11_14;
    private javax.swing.JButton casilla11_15;
    private javax.swing.JButton casilla11_2;
    private javax.swing.JButton casilla11_3;
    private javax.swing.JButton casilla11_4;
    private javax.swing.JButton casilla11_5;
    private javax.swing.JButton casilla11_6;
    private javax.swing.JButton casilla11_7;
    private javax.swing.JButton casilla11_8;
    private javax.swing.JButton casilla11_9;
    private javax.swing.JButton casilla12_1;
    private javax.swing.JButton casilla12_10;
    private javax.swing.JButton casilla12_11;
    private javax.swing.JButton casilla12_12;
    private javax.swing.JButton casilla12_13;
    private javax.swing.JButton casilla12_14;
    private javax.swing.JButton casilla12_15;
    private javax.swing.JButton casilla12_2;
    private javax.swing.JButton casilla12_3;
    private javax.swing.JButton casilla12_4;
    private javax.swing.JButton casilla12_5;
    private javax.swing.JButton casilla12_6;
    private javax.swing.JButton casilla12_7;
    private javax.swing.JButton casilla12_8;
    private javax.swing.JButton casilla12_9;
    private javax.swing.JButton casilla13_1;
    private javax.swing.JButton casilla13_10;
    private javax.swing.JButton casilla13_11;
    private javax.swing.JButton casilla13_12;
    private javax.swing.JButton casilla13_13;
    private javax.swing.JButton casilla13_14;
    private javax.swing.JButton casilla13_15;
    private javax.swing.JButton casilla13_2;
    private javax.swing.JButton casilla13_3;
    private javax.swing.JButton casilla13_4;
    private javax.swing.JButton casilla13_5;
    private javax.swing.JButton casilla13_6;
    private javax.swing.JButton casilla13_7;
    private javax.swing.JButton casilla13_8;
    private javax.swing.JButton casilla13_9;
    private javax.swing.JButton casilla14_1;
    private javax.swing.JButton casilla14_10;
    private javax.swing.JButton casilla14_11;
    private javax.swing.JButton casilla14_12;
    private javax.swing.JButton casilla14_13;
    private javax.swing.JButton casilla14_14;
    private javax.swing.JButton casilla14_15;
    private javax.swing.JButton casilla14_2;
    private javax.swing.JButton casilla14_3;
    private javax.swing.JButton casilla14_4;
    private javax.swing.JButton casilla14_5;
    private javax.swing.JButton casilla14_6;
    private javax.swing.JButton casilla14_7;
    private javax.swing.JButton casilla14_8;
    private javax.swing.JButton casilla14_9;
    private javax.swing.JButton casilla15_1;
    private javax.swing.JButton casilla15_10;
    private javax.swing.JButton casilla15_11;
    private javax.swing.JButton casilla15_12;
    private javax.swing.JButton casilla15_13;
    private javax.swing.JButton casilla15_14;
    private javax.swing.JButton casilla15_15;
    private javax.swing.JButton casilla15_2;
    private javax.swing.JButton casilla15_3;
    private javax.swing.JButton casilla15_4;
    private javax.swing.JButton casilla15_5;
    private javax.swing.JButton casilla15_6;
    private javax.swing.JButton casilla15_7;
    private javax.swing.JButton casilla15_8;
    private javax.swing.JButton casilla15_9;
    private javax.swing.JButton casilla1_1;
    private javax.swing.JButton casilla1_10;
    private javax.swing.JButton casilla1_11;
    private javax.swing.JButton casilla1_12;
    private javax.swing.JButton casilla1_13;
    private javax.swing.JButton casilla1_14;
    private javax.swing.JButton casilla1_15;
    private javax.swing.JButton casilla1_2;
    private javax.swing.JButton casilla1_3;
    private javax.swing.JButton casilla1_4;
    private javax.swing.JButton casilla1_5;
    private javax.swing.JButton casilla1_6;
    private javax.swing.JButton casilla1_7;
    private javax.swing.JButton casilla1_8;
    private javax.swing.JButton casilla1_9;
    private javax.swing.JButton casilla2_1;
    private javax.swing.JButton casilla2_10;
    private javax.swing.JButton casilla2_11;
    private javax.swing.JButton casilla2_12;
    private javax.swing.JButton casilla2_13;
    private javax.swing.JButton casilla2_14;
    private javax.swing.JButton casilla2_15;
    private javax.swing.JButton casilla2_2;
    private javax.swing.JButton casilla2_3;
    private javax.swing.JButton casilla2_4;
    private javax.swing.JButton casilla2_5;
    private javax.swing.JButton casilla2_6;
    private javax.swing.JButton casilla2_7;
    private javax.swing.JButton casilla2_8;
    private javax.swing.JButton casilla2_9;
    private javax.swing.JButton casilla3_1;
    private javax.swing.JButton casilla3_10;
    private javax.swing.JButton casilla3_11;
    private javax.swing.JButton casilla3_12;
    private javax.swing.JButton casilla3_13;
    private javax.swing.JButton casilla3_14;
    private javax.swing.JButton casilla3_15;
    private javax.swing.JButton casilla3_2;
    private javax.swing.JButton casilla3_3;
    private javax.swing.JButton casilla3_4;
    private javax.swing.JButton casilla3_5;
    private javax.swing.JButton casilla3_6;
    private javax.swing.JButton casilla3_7;
    private javax.swing.JButton casilla3_8;
    private javax.swing.JButton casilla3_9;
    private javax.swing.JButton casilla4_1;
    private javax.swing.JButton casilla4_10;
    private javax.swing.JButton casilla4_11;
    private javax.swing.JButton casilla4_12;
    private javax.swing.JButton casilla4_13;
    private javax.swing.JButton casilla4_14;
    private javax.swing.JButton casilla4_15;
    private javax.swing.JButton casilla4_2;
    private javax.swing.JButton casilla4_3;
    private javax.swing.JButton casilla4_4;
    private javax.swing.JButton casilla4_5;
    private javax.swing.JButton casilla4_6;
    private javax.swing.JButton casilla4_7;
    private javax.swing.JButton casilla4_8;
    private javax.swing.JButton casilla4_9;
    private javax.swing.JButton casilla5_1;
    private javax.swing.JButton casilla5_10;
    private javax.swing.JButton casilla5_11;
    private javax.swing.JButton casilla5_12;
    private javax.swing.JButton casilla5_13;
    private javax.swing.JButton casilla5_14;
    private javax.swing.JButton casilla5_15;
    private javax.swing.JButton casilla5_2;
    private javax.swing.JButton casilla5_3;
    private javax.swing.JButton casilla5_4;
    private javax.swing.JButton casilla5_5;
    private javax.swing.JButton casilla5_6;
    private javax.swing.JButton casilla5_7;
    private javax.swing.JButton casilla5_8;
    private javax.swing.JButton casilla5_9;
    private javax.swing.JButton casilla6_1;
    private javax.swing.JButton casilla6_10;
    private javax.swing.JButton casilla6_11;
    private javax.swing.JButton casilla6_12;
    private javax.swing.JButton casilla6_13;
    private javax.swing.JButton casilla6_14;
    private javax.swing.JButton casilla6_15;
    private javax.swing.JButton casilla6_2;
    private javax.swing.JButton casilla6_3;
    private javax.swing.JButton casilla6_4;
    private javax.swing.JButton casilla6_5;
    private javax.swing.JButton casilla6_6;
    private javax.swing.JButton casilla6_7;
    private javax.swing.JButton casilla6_8;
    private javax.swing.JButton casilla6_9;
    private javax.swing.JButton casilla7_1;
    private javax.swing.JButton casilla7_10;
    private javax.swing.JButton casilla7_11;
    private javax.swing.JButton casilla7_12;
    private javax.swing.JButton casilla7_13;
    private javax.swing.JButton casilla7_14;
    private javax.swing.JButton casilla7_15;
    private javax.swing.JButton casilla7_2;
    private javax.swing.JButton casilla7_3;
    private javax.swing.JButton casilla7_4;
    private javax.swing.JButton casilla7_5;
    private javax.swing.JButton casilla7_6;
    private javax.swing.JButton casilla7_7;
    private javax.swing.JButton casilla7_8;
    private javax.swing.JButton casilla7_9;
    private javax.swing.JButton casilla8_1;
    private javax.swing.JButton casilla8_10;
    private javax.swing.JButton casilla8_11;
    private javax.swing.JButton casilla8_12;
    private javax.swing.JButton casilla8_13;
    private javax.swing.JButton casilla8_14;
    private javax.swing.JButton casilla8_15;
    private javax.swing.JButton casilla8_2;
    private javax.swing.JButton casilla8_3;
    private javax.swing.JButton casilla8_4;
    private javax.swing.JButton casilla8_5;
    private javax.swing.JButton casilla8_6;
    private javax.swing.JButton casilla8_7;
    private javax.swing.JButton casilla8_8;
    private javax.swing.JButton casilla8_9;
    private javax.swing.JButton casilla9_1;
    private javax.swing.JButton casilla9_10;
    private javax.swing.JButton casilla9_11;
    private javax.swing.JButton casilla9_12;
    private javax.swing.JButton casilla9_13;
    private javax.swing.JButton casilla9_14;
    private javax.swing.JButton casilla9_15;
    private javax.swing.JButton casilla9_2;
    private javax.swing.JButton casilla9_3;
    private javax.swing.JButton casilla9_4;
    private javax.swing.JButton casilla9_5;
    private javax.swing.JButton casilla9_6;
    private javax.swing.JButton casilla9_7;
    private javax.swing.JButton casilla9_8;
    private javax.swing.JButton casilla9_9;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton188;
    private javax.swing.JButton jButton199;
    private javax.swing.JButton jButton208;
    private javax.swing.JButton jButton219;
    private javax.swing.JButton jButton223;
    private javax.swing.JButton jButton233;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelComponente;
    private javax.swing.JLabel labelDinero;
    private javax.swing.JLabel labelEscudos;
    private javax.swing.JLabel labelKgAcero;
    private javax.swing.JTextField textColumna;
    private javax.swing.JTextField textFila;
    private javax.swing.JTextField textJugadorADisparar;
    private javax.swing.JTextField txfMensaje;
    private javax.swing.JTextArea txfMensajes;
    // End of variables declaration//GEN-END:variables

    public void mostrar(String menser) {
        txfMensajes.append(menser+"\n");
    }
    public Jugador getJugador(){
        return jugadorAsociado;
    }
    public void setJugador(Jugador pJugador){
        jugadorAsociado = pJugador;
        jugadorAsociado.setVentanaPlataforma(this);
        this.setTitle(jugadorAsociado.getNombre()+" Jugador: "+jugadorAsociado.getNumero());
        ponerHoyoNegro();
    }
    
    public void actualizarCantidades(){
        int minas = 0;
        int templos = 0;
        int mundos = 0;
        int conectores = 0;
        int armeriasMisiles = 0;
        int armeriasBombas = 0;
        int armeriasComboShot = 0;
        int armeriasMultiShot = 0;
        int mercados = 0;
        Armeria armeria = null;
        for (int i=0;i<jugadorAsociado.getComponentesDisponibles().size();i++){
            if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Mina)
                minas++;
            else if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Templo)
                templos++;
            else if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Mundo)
                mundos++;
            else if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Conector)
                conectores++;
            else if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Mercado)
                mercados++;
            else if (jugadorAsociado.getComponentesDisponibles().get(i) instanceof Armeria){
                armeria = (Armeria) jugadorAsociado.getComponentesDisponibles().get(i);
                if (armeria.getTipo() == 0) // Si es de misiles
                    armeriasMisiles++;
                else if (armeria.getTipo() == 1) // Si es de Bombas
                    armeriasBombas++;
                else if (armeria.getTipo() == 2) // Si es de MultShot
                    armeriasMultiShot++;
                else if (armeria.getTipo() == 3) // SI es de ComboShot
                    armeriasComboShot++;
            }
        }
        this.cantMinas.setText(String.valueOf(minas));
        this.cantTemplos.setText(String.valueOf(templos));
        this.cantMundos.setText(String.valueOf(mundos));
        this.cantConectores.setText(String.valueOf(conectores));
        this.cantArmeriaMisiles.setText(String.valueOf(armeriasMisiles));
        this.cantArmeriaBombas.setText(String.valueOf(armeriasBombas));
        this.cantArmeriaComboShot.setText(String.valueOf(armeriasComboShot));
        this.cantArmeriaMultiShot.setText(String.valueOf(armeriasMultiShot));
        this.cantMercados.setText((String.valueOf(mercados)));
    }
    
    @Override
    public void run() {
        while (true){            
            try {
                actualizarCantidades();
                labelKgAcero.setText(String.valueOf(jugadorAsociado.getKgAcero()) + "Kg Acero");
                if (jugadorAsociado.getTurno()){
                    btnComodin.setEnabled(jugadorAsociado.getComodin());
                    btnComprarArmas.setEnabled(jugadorAsociado.hayArmeria());
                    btnAbrirMercado.setEnabled(jugadorAsociado.hayMercado());
                }
                labelEscudos.setText("Escudos: " + String.valueOf(jugadorAsociado.getCantEscudos()));
                labelDinero.setText("Dinero: $" + String.valueOf(jugadorAsociado.getDinero()));
                if (componenteAsociar  != null){
                    if (componenteAsociar instanceof Mina)
                        labelComponente.setIcon(minaMostar);
                    else if (componenteAsociar instanceof Templo)
                        labelComponente.setIcon(temploMostar);
                    else if (componenteAsociar instanceof Mundo)
                        labelComponente.setIcon(planetaMostar);
                    else if (componenteAsociar instanceof Conector)
                        labelComponente.setIcon(conectorMostar);
                    else if (componenteAsociar instanceof Armeria)
                        labelComponente.setIcon(armeriaMostrar);
                    else if (componenteAsociar instanceof Mercado)
                        labelComponente.setIcon(mercadoMostrar);
                }
                else{
                    labelComponente.setIcon(null);
                }
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Plataforma.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (jugadorAsociado.getTurno()==false){
                btnColocarMundo.setEnabled(false);
                btnColocarConector.setEnabled(false);
                btnColocarMina1x2.setEnabled(false);
                btnColocarTemplo.setEnabled(false);
                ArmeriaMisiles.setEnabled(false);
                ArmeriaBombas.setEnabled(false);
                ArmeriaMultiShot.setEnabled(false);
                ArmeriaComboShot.setEnabled(false);
                bntMercado.setEnabled(false);
                botonDipararMisil.setEnabled(false);
                botonDispararBomba.setEnabled(false);
                botonDispararComboShot.setEnabled(false);
                botonDispararMultiShot.setEnabled(false);
                botonEnviarNaveEspia.setEnabled(false);
                btnArmasDisp.setEnabled(false);
                btnMercadoComponentes.setEnabled(false);
                btnComponenteAsociar.setEnabled(false);
                btnComprarArmas.setEnabled(false);
                btnComodin.setEnabled(false);
                btnAbrirMercado.setEnabled(false);
            }
            else{
                btnColocarMundo.setEnabled(true);
                btnColocarConector.setEnabled(true);
                btnColocarMina1x2.setEnabled(true);
                btnColocarTemplo.setEnabled(true);
                ArmeriaMisiles.setEnabled(true);
                ArmeriaBombas.setEnabled(true);
                ArmeriaMultiShot.setEnabled(true);
                ArmeriaComboShot.setEnabled(true);
                bntMercado.setEnabled(true);
                botonDipararMisil.setEnabled(true);
                botonDispararBomba.setEnabled(true);
                botonDispararComboShot.setEnabled(true);
                botonDispararMultiShot.setEnabled(true);
                botonEnviarNaveEspia.setEnabled(true);
                btnArmasDisp.setEnabled(true);
                btnMercadoComponentes.setEnabled(true);
                btnComponenteAsociar.setEnabled(true);
                btnComprarArmas.setEnabled(true);
                btnComodin.setEnabled(true);
                btnAbrirMercado.setEnabled(true);
                
            }
            
        }

    }

    public ArrayList<JButton> getListaBotones() {
        return listaBotones;
    }
    
    public ArrayList<Integer> obtenerCasillas(String casillas){
            int posicionLimite = casillas.indexOf("x");
            String posX = casillas.substring(0,posicionLimite);
            String posY = casillas.substring(posicionLimite+1);
            int posicionX = Integer.parseInt(posX);
            int posicionY = Integer.parseInt(posY);
            ArrayList <Integer> casillasArray = new ArrayList();
            casillasArray.add(posicionX);
            casillasArray.add(posicionY);
            return casillasArray; 
    }
    public boolean validarStringCasillas(String casillas){
        if (casillas.contains("x")){
            String casillasX = casillas.substring(0,casillas.indexOf("x"));
            boolean casillasXCorrectas = false;
                if(("0".equals(casillasX))||("1".equals(casillasX))||("2".equals(casillasX))||("3".equals(casillasX))||("4".equals(casillasX))||
                    ("5".equals(casillasX))||("6".equals(casillasX))||("7".equals(casillasX))||("8".equals(casillasX))||("9".equals(casillasX))||
                    ("10".equals(casillasX))||("11".equals(casillasX))||("12".equals(casillasX))||("13".equals(casillasX))||("14".equals(casillasX))){
                    casillasXCorrectas = true;
                }
            String casillasY = casillas.substring(casillas.indexOf("x")+1);
            boolean casillasYCorrectas = false;
            if (("0".equals(casillasY))||("1".equals(casillasY))||("2".equals(casillasY))||("3".equals(casillasY))||("4".equals(casillasY))||
                ("5".equals(casillasY))||("6".equals(casillasY))||("7".equals(casillasY))||("8".equals(casillasY))||("9".equals(casillasY))||
                ("10".equals(casillasY))||("11".equals(casillasY))||("12".equals(casillasY))||("13".equals(casillasY))||("14".equals(casillasY))){
                casillasYCorrectas = true;
            }             
            return (casillasXCorrectas && casillasYCorrectas);
        }
        return false;
    }
    
     public void dispararBomba(int casillaX, int casillaY,int jugadorADisparar, boolean disparo1x2){
        int cantidadDisparos = 0;
        while(cantidadDisparos<2){
            System.out.print("dispararBomba");
            jugadorAsociado.disparar(1, casillaX, casillaY,jugadorADisparar);
            System.out.println("Disparo realizado");
            if (disparo1x2){
                if (casillaY<14){
                    casillaY+=1;
                }
                else{
                    casillaY-=1;
                }
            }
            else{
                if (casillaX<14){
                    casillaX+=1;
                }
                else{
                    casillaX-=1;
                }
            }
            cantidadDisparos++;
        }
    }
     
    public void borrarComponente(JButton boton){
        System.out.println("borrarComponente");
        boton.setIcon(null);
    }
    
    public void ponerHoyoNegro()
    {
        int casillaRandomUno= (int) (Math.random() * 225);
        int casillaRandomDos= (int) (Math.random() * 225);
        JButton casillaUno=listaBotones.get(casillaRandomUno);
        JButton casillaDos=listaBotones.get(casillaRandomDos);
        casillaUno.setIcon(hoyoNegro);
        casillaDos.setIcon(hoyoNegro);
        int fila = casillaRandomUno/15;
        int columna = casillaRandomUno - (fila*15);
        jugadorAsociado.getCasillaMatriz(fila, columna).setComponente(new HoyoNegro(jugadorAsociado));
        fila = casillaRandomDos/15;
        columna = casillaRandomDos - (fila*15);
        jugadorAsociado.getCasillaMatriz(fila, columna).setComponente(new HoyoNegro(jugadorAsociado));
    }
    
    public ImageIcon getPlaneta() {
        return planeta;
    }

    public ImageIcon getConector() {
        return conector;
    }

    public ImageIcon getMina() {
        return mina;
    }

    public ImageIcon getArmeria() {
        return armeria;
    }

    public ImageIcon getMercado() {
        return mercado;
    }

    public ImageIcon getTemplo() {
        return templo;
    }
    
    public ImageIcon getHoyoNegro() {
        return hoyoNegro;
    }
}
