
package interfaz;

import progra.iii.*;

/**
 *
 * @author Calo
 */
public class MercadoComponentes extends javax.swing.JFrame {

    Jugador jugador;
    public MercadoComponentes() {
        initComponents();
    }
    public MercadoComponentes(Jugador jugador) {
        initComponents();
        this.jugador = jugador;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        btnComprarMundo = new javax.swing.JButton();
        btnComprarMina = new javax.swing.JButton();
        btnComprarTemplo = new javax.swing.JButton();
        btnComprarArmeriaComboShot = new javax.swing.JButton();
        btnComprarConector = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnComprarArmeriaMultiShot = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnComprarArmeriaBombas = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnComprarArmeriaMisiles = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnMercado = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercado Componentes");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarMundo.setText("Mundo");
        btnComprarMundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarMundoActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarMundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 130, -1));

        btnComprarMina.setText("Mina Acero");
        btnComprarMina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarMinaActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarMina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, -1));

        btnComprarTemplo.setText("Templo");
        btnComprarTemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTemploActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarTemplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 130, -1));

        btnComprarArmeriaComboShot.setText("Armeria ComboShot");
        btnComprarArmeriaComboShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarArmeriaComboShotActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarArmeriaComboShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, -1));

        btnComprarConector.setText("Conector");
        btnComprarConector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarConectorActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarConector, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 130, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("$100");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("$12000");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("$2500");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("$1500");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, 10));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("$1000");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 90, -1));

        btnComprarArmeriaMultiShot.setText("Armeria MultiShot");
        btnComprarArmeriaMultiShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarArmeriaMultiShotActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarArmeriaMultiShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("$1500");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, 10));

        btnComprarArmeriaBombas.setText("Armeria Bombas");
        btnComprarArmeriaBombas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarArmeriaBombasActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarArmeriaBombas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("$1500");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 10));

        btnComprarArmeriaMisiles.setText("Armeria Misiles");
        btnComprarArmeriaMisiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarArmeriaMisilesActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarArmeriaMisiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("$2000");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, 10));

        btnMercado.setText("Mercado");
        btnMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMercadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("$1500");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoInicio.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 490, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarMinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarMinaActionPerformed
        if (this.jugador.getDinero() >= 1000){
            Mina mina = new Mina (this.jugador);
            jugador.getComponentesDisponibles().add(mina);
            jugador.setDinero(jugador.getDinero()-1000);
        }

    }//GEN-LAST:event_btnComprarMinaActionPerformed

    private void btnComprarArmeriaComboShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarArmeriaComboShotActionPerformed
        if (this.jugador.getDinero() >= 1500){
            Armeria armeria = new Armeria (this.jugador,3);
            jugador.getComponentesDisponibles().add(armeria);
            jugador.setDinero(jugador.getDinero()-1500);
        }
    }//GEN-LAST:event_btnComprarArmeriaComboShotActionPerformed

    private void btnComprarTemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTemploActionPerformed
        if (this.jugador.getDinero() >= 2500){
            Templo templo = new Templo (this.jugador);
            jugador.getComponentesDisponibles().add(templo);
            jugador.setDinero(jugador.getDinero()-2500);
        }
    }//GEN-LAST:event_btnComprarTemploActionPerformed

    private void btnComprarMundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarMundoActionPerformed
        if (this.jugador.getDinero() >= 12000){
            Mundo mundo = new Mundo (this.jugador);
            jugador.getComponentesDisponibles().add(mundo);
            jugador.setDinero(jugador.getDinero()-12000);
        }
    }//GEN-LAST:event_btnComprarMundoActionPerformed

    private void btnComprarConectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarConectorActionPerformed
        if (this.jugador.getDinero() >= 100){
            Conector conector = new Conector(this.jugador);
            jugador.getComponentesDisponibles().add(conector);
            jugador.setDinero(jugador.getDinero()-100);

        }
    }//GEN-LAST:event_btnComprarConectorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnComprarArmeriaMultiShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarArmeriaMultiShotActionPerformed
        if (this.jugador.getDinero() >= 1500){
            Armeria armeria = new Armeria (this.jugador,2);
            jugador.getComponentesDisponibles().add(armeria);
            jugador.setDinero(jugador.getDinero()-1500);
        }
    }//GEN-LAST:event_btnComprarArmeriaMultiShotActionPerformed

    private void btnComprarArmeriaBombasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarArmeriaBombasActionPerformed
        if (this.jugador.getDinero() >= 1500){
            Armeria armeria = new Armeria (this.jugador,1);
            jugador.getComponentesDisponibles().add(armeria);
            jugador.setDinero(jugador.getDinero()-1500);
        }
    }//GEN-LAST:event_btnComprarArmeriaBombasActionPerformed

    private void btnComprarArmeriaMisilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarArmeriaMisilesActionPerformed
        if (this.jugador.getDinero() >= 1500){
            Armeria armeria = new Armeria (this.jugador,0);
            jugador.getComponentesDisponibles().add(armeria);
            jugador.setDinero(jugador.getDinero()-1500);
        }
    }//GEN-LAST:event_btnComprarArmeriaMisilesActionPerformed

    private void btnMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMercadoActionPerformed
        if (this.jugador.getDinero() >= 0){
            Mercado mercado = new Mercado(this.jugador);
            jugador.getComponentesDisponibles().add(mercado);
            jugador.setDinero(jugador.getDinero()-1500);
        }
    }//GEN-LAST:event_btnMercadoActionPerformed

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
            java.util.logging.Logger.getLogger(MercadoComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MercadoComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MercadoComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MercadoComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MercadoComponentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarArmeriaBombas;
    private javax.swing.JButton btnComprarArmeriaComboShot;
    private javax.swing.JButton btnComprarArmeriaMisiles;
    private javax.swing.JButton btnComprarArmeriaMultiShot;
    private javax.swing.JButton btnComprarConector;
    private javax.swing.JButton btnComprarMina;
    private javax.swing.JButton btnComprarMundo;
    private javax.swing.JButton btnComprarTemplo;
    private javax.swing.JButton btnMercado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

}

