package interfaz;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import progra.iii.Jugador;


public class VArmasDisp extends javax.swing.JFrame {

    Jugador jugador;
    
    public VArmasDisp() {
        initComponents();
    }
    
    public VArmasDisp(Jugador pJugador){
        initComponents();
        jugador = pJugador;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        labelNaveEspia = new javax.swing.JLabel();
        labelMultiShot = new javax.swing.JLabel();
        labelComboShot = new javax.swing.JLabel();
        labelMisil = new javax.swing.JLabel();
        labelBomba = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Armas Disponibles");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        labelNaveEspia.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        labelNaveEspia.setForeground(new java.awt.Color(240, 240, 240));
        labelNaveEspia.setText("Nave Espacial");
        getContentPane().add(labelNaveEspia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, -1));

        labelMultiShot.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        labelMultiShot.setForeground(new java.awt.Color(240, 240, 240));
        labelMultiShot.setText("MultiShot");
        getContentPane().add(labelMultiShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, -1));

        labelComboShot.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        labelComboShot.setForeground(new java.awt.Color(240, 240, 240));
        labelComboShot.setText("ComboShot");
        getContentPane().add(labelComboShot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, -1));

        labelMisil.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        labelMisil.setForeground(new java.awt.Color(240, 240, 240));
        labelMisil.setText("Misil");
        getContentPane().add(labelMisil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, -1));

        labelBomba.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        labelBomba.setForeground(new java.awt.Color(240, 240, 240));
        labelBomba.setText("Bomba");
        getContentPane().add(labelBomba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoInicio.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -70, 480, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VArmasDisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VArmasDisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VArmasDisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VArmasDisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VArmasDisp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBomba;
    private javax.swing.JLabel labelComboShot;
    private javax.swing.JLabel labelMisil;
    private javax.swing.JLabel labelMultiShot;
    private javax.swing.JLabel labelNaveEspia;
    // End of variables declaration//GEN-END:variables

    
    public JLabel getLabelBomba(){
        return labelNaveEspia;
    }
     public JLabel getLabelMisil(){
        return labelMisil;
    } 
     public JLabel getLabelComboShot(){
        return labelComboShot;
    } 
     public JLabel getLabelMultiShot(){
        return labelMultiShot;
    }
     public JLabel getLabelNaveEspia(){
        return labelNaveEspia;
    }
}
