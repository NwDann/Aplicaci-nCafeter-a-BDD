package vista.operacion;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.inicio.MenuV;

public class VentaV extends javax.swing.JFrame {
    
    public VentaV() {
        initComponents();
        initStyles();
        loadClienteTable();
        loadEmpleadoTable();
    }

    private void initStyles() {
        this.jBmenu.putClientProperty("JButton.buttonType", "roundRect");
        this.jBsalir.putClientProperty("JButton.buttonType", "roundRect");
        this.jBcontinuar.putClientProperty("JButton.buttonType", "roundRect");
        this.jBverdatos.putClientProperty("JButton.buttonType", "roundRect");
    }
    
    private void loadClienteTable() {
        try {
            persistencia.DAOClienteImpl daoCli = new persistencia.DAOClienteImpl();
            DefaultTableModel model = (DefaultTableModel) this.jTableCliente.getModel();
            daoCli.leer().forEach((cliente) -> model.addRow(new Object[]{cliente.getId_cliente(), cliente.getNombre(), cliente.getTelefono()}));
            
        } catch (Exception e) {
            System.out.println("El siguiente error se ha suscitado: " + e.toString());
        }
    }
    
    private void loadEmpleadoTable() {
        try {
            persistencia.DAOEmpleadoImpl daoEmp = new persistencia.DAOEmpleadoImpl();
            DefaultTableModel model = (DefaultTableModel) this.jTableEmpleado.getModel();
            daoEmp.leer().forEach((emp) -> model.addRow(new Object[]{emp.getId_empleado(), emp.getNombre(), emp.getTelefono(), emp.getId_sucursal()}));
            
        } catch (Exception e) {
            System.out.println("El siguiente error se ha suscitado: " + e.toString());
        }
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
        jLbarraSelecc = new javax.swing.JLabel();
        jLlogo = new javax.swing.JLabel();
        jLnuevaventa = new javax.swing.JLabel();
        jBmenu = new javax.swing.JButton();
        jLdetalleventa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBcontinuar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jBverdatos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleado = new javax.swing.JTable();
        jLbackground = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPbackground.setBackground(new java.awt.Color(255, 255, 255));
        jPbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbarraSelecc.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLbarraSelecc.setForeground(new java.awt.Color(255, 255, 255));
        jLbarraSelecc.setText("______________________");
        jPbackground.add(jLbarraSelecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 20));

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        jPbackground.add(jLlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 96, 50));

        jLnuevaventa.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLnuevaventa.setForeground(new java.awt.Color(255, 255, 255));
        jLnuevaventa.setText("Nueva Venta");
        jPbackground.add(jLnuevaventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 170, 30));

        jBmenu.setBackground(new java.awt.Color(255, 102, 102));
        jBmenu.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBmenu.setText("Menu");
        jBmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmenuActionPerformed(evt);
            }
        });
        jPbackground.add(jBmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 160, 35));

        jLdetalleventa.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLdetalleventa.setForeground(new java.awt.Color(153, 153, 153));
        jLdetalleventa.setText("Detalle de la Venta");
        jPbackground.add(jLdetalleventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 210, 30));

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel6.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPbackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 360, 140));

        jBcontinuar.setBackground(new java.awt.Color(255, 102, 102));
        jBcontinuar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBcontinuar.setText("Continuar");
        jBcontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcontinuarActionPerformed(evt);
            }
        });
        jPbackground.add(jBcontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 130, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPbackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 300, 10));

        jBverdatos.setBackground(new java.awt.Color(255, 102, 102));
        jBverdatos.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBverdatos.setText("Ver Datos");
        jBverdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBverdatosActionPerformed(evt);
            }
        });
        jPbackground.add(jBverdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 130, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lista de Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPbackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 410, 40));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de Empleados");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPbackground.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 500, 40));

        jBsalir.setBackground(new java.awt.Color(255, 102, 102));
        jBsalir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPbackground.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 160, 35));

        jTableCliente.setBackground(new java.awt.Color(153, 153, 153));
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.setName(""); // NOI18N
        jScrollPane3.setViewportView(jTableCliente);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setResizable(false);
            jTableCliente.getColumnModel().getColumn(1).setResizable(false);
            jTableCliente.getColumnModel().getColumn(2).setResizable(false);
        }

        jPbackground.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 410, 200));

        jTableEmpleado.setBackground(new java.awt.Color(153, 153, 153));
        jTableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "NOMBRE", "TELEFONO", "ID SUCURSAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEmpleado);
        if (jTableEmpleado.getColumnModel().getColumnCount() > 0) {
            jTableEmpleado.getColumnModel().getColumn(0).setResizable(false);
            jTableEmpleado.getColumnModel().getColumn(1).setResizable(false);
            jTableEmpleado.getColumnModel().getColumn(2).setResizable(false);
            jTableEmpleado.getColumnModel().getColumn(3).setResizable(false);
        }

        jPbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 500, 200));

        jLbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Gestion.jpg"))); // NOI18N
        jPbackground.add(jLbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

        jButton1.setText("jButton1");
        jPbackground.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 160, 30));

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
        MenuV menu = new MenuV();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBmenuActionPerformed

    private void jBcontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcontinuarActionPerformed
        int locCliente = this.jTableCliente.getSelectedRow();
        int locEmpleado = this.jTableEmpleado.getSelectedRow();
        if (locCliente == -1 || locEmpleado == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un empleado y un cliente asociado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String id = this.jTid.getText();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rellene el campo de ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        models.VentaM venta = new models.VentaM();
        venta.setId_venta(Integer.parseInt(id));
        venta.setId_sucursal((int) this.jTableEmpleado.getValueAt(locEmpleado, 3));
        venta.setId_empleado((int) this.jTableEmpleado.getValueAt(locEmpleado, 0));
        venta.setId_cliente((int) this.jTableCliente.getValueAt(locCliente, 0));
        
        DetalleVentaV detalleVenta = new DetalleVentaV(venta);
        detalleVenta.setVisible(true);
    }//GEN-LAST:event_jBcontinuarActionPerformed

    private void jBverdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBverdatosActionPerformed
        DatosVentaV datosVenta = new DatosVentaV();
        datosVenta.setVisible(true);
    }//GEN-LAST:event_jBverdatosActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcOrangeIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcontinuar;
    private javax.swing.JButton jBmenu;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jBverdatos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JLabel jLbarraSelecc;
    private javax.swing.JLabel jLdetalleventa;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JLabel jLnuevaventa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPbackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableEmpleado;
    private javax.swing.JTextField jTid;
    // End of variables declaration//GEN-END:variables
}
