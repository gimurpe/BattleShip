/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author Luis Diego
 */
public class JFrameServidor extends javax.swing.JFrame {
    
    Servidor servidor;

    /**
     * Creates new form JFrameServidor
     */
    public JFrameServidor() {
        initComponents();
        servidor = new Servidor(this);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txaMensajesServidor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaMensajesServidor.setColumns(20);
        txaMensajesServidor.setRows(5);
        jScrollPane2.setViewportView(txaMensajesServidor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JFrameServidor serv =new JFrameServidor();
        serv.setVisible(true);
        serv.servidor.runServer();
    }
    
    public void mostrar (String texto)
    {
        txaMensajesServidor.append(texto+"\n");
    }

    // Variables declaration - do not modify                    
    // End of variables declaration                   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaMensajesServidor;
    // End of variables declaration//GEN-END:variables
}
