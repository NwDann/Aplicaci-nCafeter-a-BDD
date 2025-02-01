package vista.operacion;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;

public class DatosVentaV extends javax.swing.JFrame {

    public DatosVentaV() {
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
        jBmenu = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLmenu3 = new javax.swing.JLabel();
        jLbarraSelecc1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalle = new javax.swing.JTable();
        jBRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVenta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPbackground.setBackground(new java.awt.Color(255, 255, 255));
        jPbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        jPbackground.add(jLlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 96, 50));

        jBmenu.setBackground(new java.awt.Color(255, 102, 102));
        jBmenu.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBmenu.setForeground(new java.awt.Color(255, 255, 255));
        jBmenu.setText("Menu");
        jBmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmenuActionPerformed(evt);
            }
        });
        jPbackground.add(jBmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 160, 35));

        jBsalir.setBackground(new java.awt.Color(255, 102, 102));
        jBsalir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(255, 255, 255));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPbackground.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 160, 35));

        jLmenu3.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLmenu3.setForeground(new java.awt.Color(255, 255, 255));
        jLmenu3.setText("datos");
        jPbackground.add(jLmenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 170, 30));

        jLbarraSelecc1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLbarraSelecc1.setForeground(new java.awt.Color(255, 255, 255));
        jLbarraSelecc1.setText("____________________");
        jPbackground.add(jLbarraSelecc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 130, 20));

        jTableDetalle.setBackground(new java.awt.Color(153, 153, 153));
        jTableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID DETALLE", "ID VENTA", "ID PRODUCTO", "CANTIDAD", "PRECIO UNITARIO"
            }
        ));
        jScrollPane1.setViewportView(jTableDetalle);

        jPbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 520, 230));

        jBRegresar.setBackground(new java.awt.Color(255, 102, 102));
        jBRegresar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jBRegresar.setText("REGRESAR");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });
        jPbackground.add(jBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, -1, -1));

        jTableVenta.setBackground(new java.awt.Color(153, 153, 153));
        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID VENTA", "ID SUCURSAL", "FECHA", "MONTO TOTAL", "ID EMPLEADO", "ID CLIENTE"
            }
        ));
        jScrollPane2.setViewportView(jTableVenta);

        jPbackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 540, 220));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lista de ventas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPbackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 540, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lista de detalles de venta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPbackground.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 520, 30));

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

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcOrangeIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosVentaV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jBmenu;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JLabel jLbarraSelecc1;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JLabel jLmenu3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPbackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDetalle;
    private javax.swing.JTable jTableVenta;
    // End of variables declaration//GEN-END:variables
}
