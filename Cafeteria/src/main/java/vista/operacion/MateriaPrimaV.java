package vista.operacion;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;

public class MateriaPrimaV extends javax.swing.JFrame {

    public MateriaPrimaV() {
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
        jLproducto = new javax.swing.JLabel();
        jBmenu = new javax.swing.JButton();
        jLmateriaprima = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLlistamateriaprima = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTunidad = new javax.swing.JTextField();
        jTdescripcion = new javax.swing.JTextField();
        jBañadir = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
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

        jLproducto.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLproducto.setForeground(new java.awt.Color(255, 255, 255));
        jLproducto.setText("Producto");
        jPbackground.add(jLproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 170, 30));

        jBmenu.setBackground(new java.awt.Color(255, 102, 102));
        jBmenu.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBmenu.setText("Menu");
        jBmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmenuActionPerformed(evt);
            }
        });
        jPbackground.add(jBmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 160, 35));

        jLmateriaprima.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLmateriaprima.setForeground(new java.awt.Color(255, 255, 255));
        jLmateriaprima.setText("Materia Prima");
        jPbackground.add(jLmateriaprima, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("________________________________");
        jPbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLlistamateriaprima.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLlistamateriaprima);

        jPbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 400, 330));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lista de Materia Prima");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPbackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 400, 60));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel4.setText("Unidad:");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel5.setText("Descripción:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTnombre)
                            .addComponent(jTunidad, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPbackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 390, 160));

        jBañadir.setText("Añadir");
        jPbackground.add(jBañadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        jBmodificar.setText("Modificar");
        jPbackground.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        jBeliminar.setText("Eliminar");
        jPbackground.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));
        jPbackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 280, 10));

        jBsalir.setBackground(new java.awt.Color(255, 102, 102));
        jBsalir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPbackground.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 160, 35));

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
                new MateriaPrimaV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBañadir;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmenu;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JLabel jLbarraSelecc;
    private javax.swing.JList<String> jLlistamateriaprima;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JLabel jLmateriaprima;
    private javax.swing.JLabel jLproducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPbackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTdescripcion;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTunidad;
    // End of variables declaration//GEN-END:variables
}
