/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import progra.iii.Jugador;

/**
 *
 * @author familia
 */
public class vMercado extends javax.swing.JFrame {
    
    private Jugador jugador;
    private int componenteIntercambiar;
    
    public vMercado() {
        initComponents();
    }
    
    public vMercado(Jugador pJugador) {
        initComponents();
        jugador = pJugador;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbPlayer3 = new javax.swing.JRadioButton();
        rbPlayer1 = new javax.swing.JRadioButton();
        rbPlayer2 = new javax.swing.JRadioButton();
        monto = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        rbPlayer4 = new javax.swing.JRadioButton();
        salir = new javax.swing.JButton();
        misil = new javax.swing.JButton();
        bomba = new javax.swing.JButton();
        multiShot = new javax.swing.JButton();
        comboShot = new javax.swing.JButton();
        naveEspia = new javax.swing.JButton();
        mina = new javax.swing.JButton();
        templo = new javax.swing.JButton();
        mercado = new javax.swing.JButton();
        conector = new javax.swing.JButton();
        planeta = new javax.swing.JButton();
        armeriaMisil = new javax.swing.JButton();
        armeriaMultiShot = new javax.swing.JButton();
        armeriaBomba = new javax.swing.JButton();
        armeriaComboShot = new javax.swing.JButton();
        labelComponenteIntercambiar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbPlayer3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        rbPlayer3.setText("Player 3");
        rbPlayer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlayer3ActionPerformed(evt);
            }
        });
        getContentPane().add(rbPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        rbPlayer1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        rbPlayer1.setText("Player 1");
        rbPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlayer1ActionPerformed(evt);
            }
        });
        getContentPane().add(rbPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        rbPlayer2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        rbPlayer2.setText("Player 2");
        rbPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(rbPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoActionPerformed(evt);
            }
        });
        getContentPane().add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, -1));

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        rbPlayer4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbPlayer4.setForeground(new java.awt.Color(255, 255, 255));
        rbPlayer4.setText("Player 4");
        rbPlayer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlayer4ActionPerformed(evt);
            }
        });
        getContentPane().add(rbPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        misil.setText("Misil");
        misil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misilActionPerformed(evt);
            }
        });
        getContentPane().add(misil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        bomba.setText("Bomba");
        bomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bombaActionPerformed(evt);
            }
        });
        getContentPane().add(bomba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        multiShot.setText("Multi-Shot");
        multiShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiShotActionPerformed(evt);
            }
        });
        getContentPane().add(multiShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, -1));

        comboShot.setText("Combo-Shot");
        comboShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboShotActionPerformed(evt);
            }
        });
        getContentPane().add(comboShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, -1));

        naveEspia.setText("Nave Espia");
        naveEspia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naveEspiaActionPerformed(evt);
            }
        });
        getContentPane().add(naveEspia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));

        mina.setText("Mina");
        mina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minaActionPerformed(evt);
            }
        });
        getContentPane().add(mina, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, -1));

        templo.setText("Templo");
        templo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temploActionPerformed(evt);
            }
        });
        getContentPane().add(templo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));

        mercado.setText("Mercado");
        mercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercadoActionPerformed(evt);
            }
        });
        getContentPane().add(mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, -1));

        conector.setText("Conector");
        conector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorActionPerformed(evt);
            }
        });
        getContentPane().add(conector, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));

        planeta.setText("Planeta");
        planeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetaActionPerformed(evt);
            }
        });
        getContentPane().add(planeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 100, -1));

        armeriaMisil.setText("Armeria Misil");
        armeriaMisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armeriaMisilActionPerformed(evt);
            }
        });
        getContentPane().add(armeriaMisil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 130, -1));

        armeriaMultiShot.setText("Armeria Mult-Shot");
        armeriaMultiShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armeriaMultiShotActionPerformed(evt);
            }
        });
        getContentPane().add(armeriaMultiShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 130, -1));

        armeriaBomba.setText("Armeria Bomba");
        armeriaBomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armeriaBombaActionPerformed(evt);
            }
        });
        getContentPane().add(armeriaBomba, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 130, -1));

        armeriaComboShot.setText("Armeria ComboShot");
        armeriaComboShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armeriaComboShotActionPerformed(evt);
            }
        });
        getContentPane().add(armeriaComboShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        labelComponenteIntercambiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelComponenteIntercambiar.setForeground(new java.awt.Color(240, 240, 240));
        labelComponenteIntercambiar.setText("Componente Intercambiar:");
        getContentPane().add(labelComponenteIntercambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 470, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mercdadoimg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, -1, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlayer1ActionPerformed
        rbPlayer2.setSelected(false);
        rbPlayer3.setSelected(false);
        rbPlayer4.setSelected(false);
    
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPlayer1ActionPerformed

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
       
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void rbPlayer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlayer4ActionPerformed
        rbPlayer1.setSelected(false);
        rbPlayer2.setSelected(false);
        rbPlayer3.setSelected(false);
    }//GEN-LAST:event_rbPlayer4ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();        
    }//GEN-LAST:event_salirActionPerformed

    private void rbPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlayer2ActionPerformed
        rbPlayer1.setSelected(false);
        rbPlayer3.setSelected(false);
        rbPlayer4.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_rbPlayer2ActionPerformed

    private void rbPlayer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlayer3ActionPerformed
        rbPlayer1.setSelected(false);
        rbPlayer2.setSelected(false);
        rbPlayer4.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_rbPlayer3ActionPerformed

    private void armeriaBombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armeriaBombaActionPerformed
        componenteIntercambiar = 11;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Armeria Bomba" );           // TODO add your handling code here:
    }//GEN-LAST:event_armeriaBombaActionPerformed

    private void misilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misilActionPerformed
        componenteIntercambiar = 0;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Misil" );      
    }//GEN-LAST:event_misilActionPerformed

    private void bombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bombaActionPerformed
        componenteIntercambiar =1;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Bomba" );           // TODO add your handling code here:
    }//GEN-LAST:event_bombaActionPerformed

    private void multiShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiShotActionPerformed
        componenteIntercambiar = 2;
        labelComponenteIntercambiar.setText("Componente Intercambiar: MultiShot" );           // TODO add your handling code here:
    }//GEN-LAST:event_multiShotActionPerformed

    private void comboShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboShotActionPerformed
        componenteIntercambiar = 3;
        labelComponenteIntercambiar.setText("Componente Intercambiar: ComboShot" );   
    }//GEN-LAST:event_comboShotActionPerformed

    private void naveEspiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naveEspiaActionPerformed
        componenteIntercambiar = 4;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Nave Espia" );           // TODO add your handling code here:
    }//GEN-LAST:event_naveEspiaActionPerformed

    private void minaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minaActionPerformed
        componenteIntercambiar = 5;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Mina" );           // TODO add your handling code here:
    }//GEN-LAST:event_minaActionPerformed

    private void temploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temploActionPerformed
        componenteIntercambiar = 6;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Templo" );           // TODO add your handling code here:
    }//GEN-LAST:event_temploActionPerformed

    private void mercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercadoActionPerformed
        componenteIntercambiar = 7;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Mercado" );           // TODO add your handling code here:
    }//GEN-LAST:event_mercadoActionPerformed

    private void planetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetaActionPerformed
        componenteIntercambiar = 8;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Planeta" );           // TODO add your handling code here:
    }//GEN-LAST:event_planetaActionPerformed

    private void conectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorActionPerformed
        componenteIntercambiar = 9;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Coneector" );           // TODO add your handling code here:
    }//GEN-LAST:event_conectorActionPerformed

    private void armeriaMisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armeriaMisilActionPerformed
        componenteIntercambiar = 10;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Armeria Misil" );           // TODO add your handling code here:
    }//GEN-LAST:event_armeriaMisilActionPerformed

    private void armeriaMultiShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armeriaMultiShotActionPerformed
        componenteIntercambiar = 12;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Armeria MultiShot" );           // TODO add your handling code here:
    }//GEN-LAST:event_armeriaMultiShotActionPerformed

    private void armeriaComboShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armeriaComboShotActionPerformed
        componenteIntercambiar = 13;
        labelComponenteIntercambiar.setText("Componente Intercambiar: Armeria ComboShot" );           // TODO add your handling code here:
    }//GEN-LAST:event_armeriaComboShotActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String strMontoAcuerdo = monto.getText();
        int jugadorIntercambiar = -1;
        int montoAcuerdo = -1;
        int componente = -1;
        try{
            montoAcuerdo = Integer.parseInt(strMontoAcuerdo);
            if (rbPlayer1.isSelected() && jugador.getNumero() !=1 )
                jugadorIntercambiar = 1;
            else if (rbPlayer2.isSelected() && jugador.getNumero() != 2)
                jugadorIntercambiar = 2;
            else if (rbPlayer3.isSelected() && jugador.getNumero() != 3){
                if (jugador.getNumeroJugadores()>=3)
                    jugadorIntercambiar = 3;
                else{
                    jugadorIntercambiar = jugador.getNumeroJugadores();
                }
            }
            else if (rbPlayer4.isSelected() && jugador.getNumero() != 4){
                if(jugador.getNumeroJugadores()>=4)
                    jugadorIntercambiar = 4;
                else
                    jugadorIntercambiar = jugador.getNumeroJugadores();
            }
            if (componenteIntercambiar == 0 && jugador.getHayMisil())   
                componente = 0;
            else if (componenteIntercambiar == 1 && jugador.getHayBomba())   
                componente = 1;
            else if (componenteIntercambiar == 2 && jugador.getHayMultiShot()) 
                componente = 2;
            else if (componenteIntercambiar == 3 && jugador.getHayComboShot())  
                componente = 3;
            else if (componenteIntercambiar == 4 && jugador.getHayNave())    
                componente = 4;
            else if (componenteIntercambiar == 5 && jugador.getHayMina())   
                componente = 5;
            else if (componenteIntercambiar == 6 && jugador.getHayTemplo())   
                componente = 6;
            else if (componenteIntercambiar == 7 && jugador.getHayMercado())    
                componente = 7;
            else if (componenteIntercambiar == 8 && jugador.getHayMundo())    
                componente = 8;
            else if (componenteIntercambiar == 9 && jugador.getHayConector())    
                componente = 9;
            else if (componenteIntercambiar == 10 && jugador.getHayArmeriaMisil())    
                componente = 10;
            else if (componenteIntercambiar == 11 && jugador.getHayArmeriaBomba())    
                componente = 11;
            else if (componenteIntercambiar == 12 && jugador.getHayArmeriaMultiShot())   
                componente = 12;
            else if (componenteIntercambiar == 13 && jugador.getHayArmeriaComboShot())    
                componente = 13;
            // Ejecuto la funcion
            if (componente != -1 && montoAcuerdo != -1 && jugadorIntercambiar != -1){
                jugador.intercambar(montoAcuerdo,componente,jugadorIntercambiar);
                
                
            }
                
        
        }catch(Exception e){
            
        }
            
        
              
    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(vMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vMercado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton armeriaBomba;
    private javax.swing.JButton armeriaComboShot;
    private javax.swing.JButton armeriaMisil;
    private javax.swing.JButton armeriaMultiShot;
    private javax.swing.JButton bomba;
    private javax.swing.JButton comboShot;
    private javax.swing.JButton conector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelComponenteIntercambiar;
    private javax.swing.JButton mercado;
    private javax.swing.JButton mina;
    private javax.swing.JButton misil;
    private javax.swing.JTextField monto;
    private javax.swing.JButton multiShot;
    private javax.swing.JButton naveEspia;
    private javax.swing.JButton planeta;
    private javax.swing.JRadioButton rbPlayer1;
    private javax.swing.JRadioButton rbPlayer2;
    private javax.swing.JRadioButton rbPlayer3;
    private javax.swing.JRadioButton rbPlayer4;
    private javax.swing.JButton salir;
    private javax.swing.JButton templo;
    // End of variables declaration//GEN-END:variables
}
