package vista.operacion;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;

public class SucursalV extends javax.swing.JFrame {

    public SucursalV() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        this.jBmenu.putClientProperty("JButton.buttonType", "roundRect");
        this.jBsalir.putClientProperty("JButton.buttonType", "roundRect");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPbackground = new javax.swing.JPanel();
        jLlogo = new javax.swing.JLabel();
        jLbarraSelecc = new javax.swing.JLabel();
        jLmenu1 = new javax.swing.JLabel();
        jBmenu = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPbackground.setBackground(new java.awt.Color(255, 255, 255));
        jPbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        jPbackground.add(jLlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 96, 50));

        jLbarraSelecc.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLbarraSelecc.setForeground(new java.awt.Color(255, 255, 255));
        jLbarraSelecc.setText("____________________");
        jPbackground.add(jLbarraSelecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, 20));

        jLmenu1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLmenu1.setForeground(new java.awt.Color(255, 255, 255));
        jLmenu1.setText("Sucursal");
        jPbackground.add(jLmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 170, 30));

        jBmenu.setBackground(new java.awt.Color(255, 102, 102));
        jBmenu.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBmenu.setText("Menu");
        jBmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmenuActionPerformed(evt);
            }
        });
        jPbackground.add(jBmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 160, 35));

        jBsalir.setBackground(new java.awt.Color(255, 102, 102));
        jBsalir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPbackground.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 160, 35));

        jLbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Gestion.jpg"))); // NOI18N
        jPbackground.add(jLbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmenuActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcOrangeIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SucursalV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBmenu;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JLabel jLbarraSelecc;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JLabel jLmenu1;
    private javax.swing.JPanel jPbackground;
    // End of variables declaration//GEN-END:variables
}
