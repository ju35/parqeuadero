/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parqueofinal.vistas;

/**
 *
 * @author Hp
 */
public class VistaSalida extends javax.swing.JFrame {

    /**
     * Creates new form VistaSalida
     */
    public VistaSalida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaplacasalida = new javax.swing.JTextField();
        btnsalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDV = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaplacasalida.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.add(cajaplacasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 155, 37));

        btnsalida.setBackground(new java.awt.Color(255, 255, 255));
        btnsalida.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        btnsalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/correccion.png"))); // NOI18N
        btnsalida.setText("ACEPTAR");
        jPanel1.add(btnsalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, 37));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel1.setText("Placa :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 107, 25));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel2.setText("Modulo Salida Parqueadero");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chao.png"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 280, 250));

        btnDV.setBackground(new java.awt.Color(0, 153, 0));
        btnDV.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        btnDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-hacia-atras.png"))); // NOI18N
        btnDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDVMouseClicked(evt);
            }
        });
        jPanel1.add(btnDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 100, 60));

        btnatras.setBackground(new java.awt.Color(255, 255, 255));
        btnatras.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        btnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-hacia-atras.png"))); // NOI18N
        btnatras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnatrasMouseClicked(evt);
            }
        });
        jPanel1.add(btnatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 100, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDVMouseClicked
        // TODO add your handling code here:
        this.toBack();

    }//GEN-LAST:event_btnDVMouseClicked

    private void btnatrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnatrasMouseClicked
        // TODO add your handling code here:
        
         this.toBack();
    }//GEN-LAST:event_btnatrasMouseClicked

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
            java.util.logging.Logger.getLogger(VistaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDV;
    public javax.swing.JButton btnatras;
    public javax.swing.JButton btnsalida;
    public javax.swing.JTextField cajaplacasalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
