package vista.operacion;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MateriaPrimaV extends javax.swing.JFrame {

    persistencia.DAOMateriaPrimaImpl dao = new persistencia.DAOMateriaPrimaImpl();
    
    public MateriaPrimaV() {
        initComponents();
        loadTable();
        initStyles();
        jBmodificar.setEnabled(false);
        jBeliminar.setEnabled(false);
    }

    private void initStyles() {
        this.jBmenu.putClientProperty("JButton.buttonType", "roundRect");
        this.jBsalir.putClientProperty("JButton.buttonType", "roundRect");
    }
    
      private void loadTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) this.jTlistamateriaprima.getModel();
            dao.leer().forEach((mate) -> model.addRow(new Object[]{mate.getId_materia_prima(), mate.getNombre(), mate.getUnidad(), mate.getDescripcion()}));
            
        } catch (Exception e) {
            System.out.println("El siguiente error se ha suscitado: " + e.toString());
        }
    }
     
      private void limpiarCampos() {
    jTidmateriaprima.setText("");
    jTnombre.setText("");
    jTunidad.setText("");
    jTdescripcion.setText("");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTunidad = new javax.swing.JTextField();
        jTdescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTidmateriaprima = new javax.swing.JTextField();
        jBañadir = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jBsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTlistamateriaprima = new javax.swing.JTable();
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
        jLproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLproductoMouseClicked(evt);
            }
        });
        jPbackground.add(jLproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 170, 30));

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

        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel6.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jTidmateriaprima))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTidmateriaprima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPbackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 390, 200));

        jBañadir.setText("Añadir");
        jBañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBañadirActionPerformed(evt);
            }
        });
        jPbackground.add(jBañadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        jPbackground.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, -1, -1));

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPbackground.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, -1, -1));
        jPbackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 280, 10));

        jBsalir.setBackground(new java.awt.Color(255, 102, 102));
        jBsalir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPbackground.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 160, 35));

        jTlistamateriaprima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Unidad", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTlistamateriaprima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTlistamateriaprimaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTlistamateriaprima);
        if (jTlistamateriaprima.getColumnModel().getColumnCount() > 0) {
            jTlistamateriaprima.getColumnModel().getColumn(0).setResizable(false);
            jTlistamateriaprima.getColumnModel().getColumn(1).setResizable(false);
            jTlistamateriaprima.getColumnModel().getColumn(2).setResizable(false);
            jTlistamateriaprima.getColumnModel().getColumn(3).setResizable(false);
        }

        jPbackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 400, 380));

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
        vista.inicio.MenuV menu= new vista.inicio.MenuV();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBmenuActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jLproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLproductoMouseClicked
        vista.operacion.ProductoV producto = new vista.operacion.ProductoV();
        producto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLproductoMouseClicked

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

    private void jBañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBañadirActionPerformed
        try {
        // Verificar que ningún campo esté vacío
        if (jTidmateriaprima.getText().trim().isEmpty() ||
            jTnombre.getText().trim().isEmpty() ||
            jTunidad.getText().trim().isEmpty() ||
            jTdescripcion.getText().trim().isEmpty())
        {  
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validar tipos de datos
        int idMateriaPrima;
        try {
            idMateriaPrima = Integer.parseInt(jTidmateriaprima.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID de MateriaPrima debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Crear el objeto MateriaPrimaM y asignar valores
        models.MateriaPrimaM materia = new models.MateriaPrimaM();
        materia.setId_materia_prima(idMateriaPrima);
        materia.setNombre(jTnombre.getText().trim());
        materia.setUnidad(jTunidad.getText().trim());
        materia.setDescripcion(jTdescripcion.getText().trim());
        
        // Persistencia de MateriaPrima
        persistencia.DAOMateriaPrimaImpl nuevoMateriaPrima = new persistencia.DAOMateriaPrimaImpl();
        nuevoMateriaPrima.registrar(materia);
        
        JOptionPane.showMessageDialog(null, "MateriaPrima registrado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
    } catch (Exception ex) {
        Logger.getLogger(ProductoV.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar MateriaPrima", "Error", JOptionPane.ERROR_MESSAGE);
    }
        limpiarCampos();        
    }//GEN-LAST:event_jBañadirActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        models.MateriaPrimaM materia = new models.MateriaPrimaM();
        materia.setId_materia_prima(Integer.parseInt(jTidmateriaprima.getText().trim()));
        materia.setNombre(jTnombre.getText().trim());
        materia.setUnidad(jTunidad.getText().trim());
        materia.setDescripcion(jTdescripcion.getText().trim());
        
        // Persistencia de MateriaPrima
        persistencia.DAOMateriaPrimaImpl modificarMateriaPrima = new persistencia.DAOMateriaPrimaImpl();
        
        try {
            modificarMateriaPrima.modificar(materia);
        } catch (Exception ex) {
            Logger.getLogger(ProductoV.class.getName()).log(Level.SEVERE, null, ex);
        }
         jBmodificar.setEnabled(false);
         jBeliminar.setEnabled(false);
         jBañadir.setEnabled(true);
         limpiarCampos();
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        int filaEliminar = jTlistamateriaprima.getSelectedRow();
        persistencia.DAOMateriaPrimaImpl materia = new persistencia.DAOMateriaPrimaImpl();
        try {
            materia.eliminar(filaEliminar);
        } catch (Exception ex) {
            Logger.getLogger(ProductoV.class.getName()).log(Level.SEVERE, null, ex);
        }
         jBmodificar.setEnabled(false);
         jBeliminar.setEnabled(false);
         jBañadir.setEnabled(true);
         limpiarCampos();
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jTlistamateriaprimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTlistamateriaprimaMouseClicked
        int fila = jTlistamateriaprima.getSelectedRow();
    
    // Verificar que haya una fila seleccionada
    if (fila >= 0) {
        jTidmateriaprima.setText(jTlistamateriaprima.getValueAt(fila, 0).toString());
        jTnombre.setText(jTlistamateriaprima.getValueAt(fila, 1).toString());
        jTunidad.setText(jTlistamateriaprima.getValueAt(fila, 2).toString());
        jTdescripcion.setText(jTlistamateriaprima.getValueAt(fila, 3).toString());
        // Continúa con más JTextField según sea necesario
        jBmodificar.setEnabled(true);
        jBeliminar.setEnabled(true);
        jBañadir.setEnabled(false);
    }
    }//GEN-LAST:event_jTlistamateriaprimaMouseClicked

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JLabel jLbarraSelecc;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JLabel jLmateriaprima;
    private javax.swing.JLabel jLproducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPbackground;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTdescripcion;
    private javax.swing.JTextField jTidmateriaprima;
    private javax.swing.JTable jTlistamateriaprima;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTunidad;
    // End of variables declaration//GEN-END:variables
}
