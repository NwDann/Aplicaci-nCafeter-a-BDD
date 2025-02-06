package vista.inicio;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import vista.operacion.EmpleadoV;
import vista.operacion.SucursalV;

public class MenuV extends javax.swing.JFrame {

    public MenuV() {
        initComponents();
        initStyles();
    }
    
    private void initStyles() {
        this.jBcerrarSesion.putClientProperty("JButton.buttonType", "roundRect");
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
        jLlinea = new javax.swing.JLabel();
        jLmenu = new javax.swing.JLabel();
        jPgestor = new javax.swing.JPanel();
        jPtitulo = new javax.swing.JPanel();
        jLtitulo = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jBcerrarSesion = new javax.swing.JButton();
        jLempleado = new javax.swing.JLabel();
        jBempleado = new javax.swing.JButton();
        jLcliente = new javax.swing.JLabel();
        jBcliente = new javax.swing.JButton();
        jLsucursal = new javax.swing.JLabel();
        jBsucursal = new javax.swing.JButton();
        jLventaDetalle = new javax.swing.JLabel();
        jBventaDetalle = new javax.swing.JButton();
        jLproductoMateria = new javax.swing.JLabel();
        jBproductoMateria = new javax.swing.JButton();
        jLinventario = new javax.swing.JLabel();
        jBinventario = new javax.swing.JButton();
        jLbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPbackground.setBackground(new java.awt.Color(255, 255, 255));
        jPbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        jPbackground.add(jLlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 96, 50));

        jLlinea.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLlinea.setText("_____________");
        jPbackground.add(jLlinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, 20));

        jLmenu.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLmenu.setText("Menu");
        jPbackground.add(jLmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 170, 30));

        jPgestor.setBackground(new java.awt.Color(153, 153, 153));

        jPtitulo.setBackground(new java.awt.Color(0, 0, 0));

        jLtitulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulo.setText("Menu Principal");

        jBsalir.setBackground(new java.awt.Color(255, 102, 102));
        jBsalir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(255, 255, 255));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBcerrarSesion.setBackground(new java.awt.Color(255, 102, 102));
        jBcerrarSesion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBcerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jBcerrarSesion.setText("Cerrar Sesion");
        jBcerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPtituloLayout = new javax.swing.GroupLayout(jPtitulo);
        jPtitulo.setLayout(jPtituloLayout);
        jPtituloLayout.setHorizontalGroup(
            jPtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPtituloLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jBcerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPtituloLayout.setVerticalGroup(
            jPtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPtituloLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBcerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jLempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Empleados.jpg"))); // NOI18N

        jBempleado.setBackground(new java.awt.Color(33, 18, 18));
        jBempleado.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBempleado.setForeground(new java.awt.Color(255, 255, 255));
        jBempleado.setText("Empleado");
        jBempleado.setBorder(null);
        jBempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBempleadoActionPerformed(evt);
            }
        });

        jLcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clientes.jpg"))); // NOI18N

        jBcliente.setBackground(new java.awt.Color(33, 18, 18));
        jBcliente.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBcliente.setForeground(new java.awt.Color(255, 255, 255));
        jBcliente.setText("Cliente");
        jBcliente.setBorder(null);
        jBcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclienteActionPerformed(evt);
            }
        });

        jLsucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sucursal.jpg"))); // NOI18N

        jBsucursal.setBackground(new java.awt.Color(33, 18, 18));
        jBsucursal.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBsucursal.setForeground(new java.awt.Color(255, 255, 255));
        jBsucursal.setText("Sucursal");
        jBsucursal.setBorder(null);
        jBsucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsucursalActionPerformed(evt);
            }
        });

        jLventaDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VentaYDetalle.jpg"))); // NOI18N

        jBventaDetalle.setBackground(new java.awt.Color(33, 18, 18));
        jBventaDetalle.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBventaDetalle.setForeground(new java.awt.Color(255, 255, 255));
        jBventaDetalle.setText("Venta y Detalle");
        jBventaDetalle.setBorder(null);

        jLproductoMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProductoYMateriaPrima.jpg"))); // NOI18N

        jBproductoMateria.setBackground(new java.awt.Color(33, 18, 18));
        jBproductoMateria.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBproductoMateria.setForeground(new java.awt.Color(255, 255, 255));
        jBproductoMateria.setText("Producto y Materia");
        jBproductoMateria.setBorder(null);
        jBproductoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBproductoMateriaActionPerformed(evt);
            }
        });

        jLinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InventarioMateriaPrima.jpg"))); // NOI18N

        jBinventario.setBackground(new java.awt.Color(33, 18, 18));
        jBinventario.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBinventario.setForeground(new java.awt.Color(255, 255, 255));
        jBinventario.setText("Inventario");
        jBinventario.setBorder(null);

        javax.swing.GroupLayout jPgestorLayout = new javax.swing.GroupLayout(jPgestor);
        jPgestor.setLayout(jPgestorLayout);
        jPgestorLayout.setHorizontalGroup(
            jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPgestorLayout.createSequentialGroup()
                .addGroup(jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBproductoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPgestorLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLsucursal))))
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLproductoMateria)))
                .addGroup(jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBventaDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPgestorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPgestorLayout.createSequentialGroup()
                                .addComponent(jLempleado)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPgestorLayout.createSequentialGroup()
                                .addComponent(jLventaDetalle)
                                .addGap(112, 112, 112)))))
                .addGroup(jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBinventario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLcliente))
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLinventario)))
                .addGap(37, 37, 37))
        );
        jPgestorLayout.setVerticalGroup(
            jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPgestorLayout.createSequentialGroup()
                .addComponent(jPtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addComponent(jLempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addComponent(jLcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addComponent(jLsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPgestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addComponent(jLventaDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBventaDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addComponent(jLproductoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBproductoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPgestorLayout.createSequentialGroup()
                        .addComponent(jLinventario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBinventario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        jPbackground.add(jPgestor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 800, 450));

        jLbackground.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu.jpg"))); // NOI18N
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

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBcerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcerrarSesionActionPerformed
        IniciarSesionV inc = new IniciarSesionV();
        inc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBcerrarSesionActionPerformed

    private void jBsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsucursalActionPerformed
        SucursalV suc = new SucursalV();
        suc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBsucursalActionPerformed


    private void jBproductoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBproductoMateriaActionPerformed
        
    }//GEN-LAST:event_jBproductoMateriaActionPerformed

    private void jBclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclienteActionPerformed
        
    }//GEN-LAST:event_jBclienteActionPerformed

    private void jBempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBempleadoActionPerformed
        
    }//GEN-LAST:event_jBempleadoActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcOrangeIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcerrarSesion;
    private javax.swing.JButton jBcliente;
    private javax.swing.JButton jBempleado;
    private javax.swing.JButton jBinventario;
    private javax.swing.JButton jBproductoMateria;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBsucursal;
    private javax.swing.JButton jBventaDetalle;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JLabel jLcliente;
    private javax.swing.JLabel jLempleado;
    private javax.swing.JLabel jLinventario;
    private javax.swing.JLabel jLlinea;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JLabel jLmenu;
    private javax.swing.JLabel jLproductoMateria;
    private javax.swing.JLabel jLsucursal;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JLabel jLventaDetalle;
    private javax.swing.JPanel jPbackground;
    private javax.swing.JPanel jPgestor;
    private javax.swing.JPanel jPtitulo;
    // End of variables declaration//GEN-END:variables
}
