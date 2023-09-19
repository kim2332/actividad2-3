package vista;

import modelo.Cliente;

public class Frm_Clientes extends javax.swing.JFrame {

    Cliente cliente;
    Frm_Empleados fr;

    public Frm_Clientes() {
        initComponents();
        setSize(550, 480);
        setResizable(false);
        setTitle("Formulario de Clientes");
        setLocationRelativeTo(null);
        this.repaint();
        
        cliente = new Cliente();
        this.tbl_clientes.setModel(cliente.Leer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nit = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        jspanel_clientes = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_formEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nit.setText("NIT");

        lbl_nombres.setText("Nombres");

        lbl_apellidos.setText("Apellidos");

        lbl_direccion.setText("Dirección");

        lbl_telefono.setText("Teléfono");

        lbl_fecha.setText("Fecha_Nacimiento");

        btn_ingresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        tbl_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_clientesKeyReleased(evt);
            }
        });
        jspanel_clientes.setViewportView(tbl_clientes);

        jLabel1.setText("ID");

        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_id.setText("0");

        btn_actualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_formEmpleados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_formEmpleados.setText("Empleados");
        btn_formEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspanel_clientes)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fecha)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_formEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ingresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_direccion)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_formEmpleados)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fecha)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jspanel_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        cliente = new Cliente(0, this.txt_nit.getText(), this.txt_nombres.getText(), this.txt_apellidos.getText(),
                this.txt_direccion.getText(), this.txt_telefono.getText(), this.txt_fecha.getText());
        cliente.Agregar();
        this.tbl_clientes.setModel(cliente.Leer());
        
        //Limpiar los text
        this.txt_nit.setText("");
        this.txt_nombres.setText("");
        this.txt_apellidos.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.txt_fecha.setText("");
    }//GEN-LAST:event_btn_ingresarActionPerformed
    public void selec_datos() {
        int fila = this.tbl_clientes.getSelectedRow();
        this.lbl_id.setText(this.tbl_clientes.getValueAt(fila, 0).toString());
        this.txt_nit.setText(this.tbl_clientes.getValueAt(fila, 1).toString());
        this.txt_nombres.setText(this.tbl_clientes.getValueAt(fila, 2).toString());
        this.txt_apellidos.setText(this.tbl_clientes.getValueAt(fila, 3).toString());
        this.txt_direccion.setText(this.tbl_clientes.getValueAt(fila, 4).toString());
        this.txt_telefono.setText(this.tbl_clientes.getValueAt(fila, 5).toString());
        this.txt_fecha.setText(this.tbl_clientes.getValueAt(fila, 6).toString());

    }
    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        this.selec_datos();
    }//GEN-LAST:event_tbl_clientesMouseClicked

    private void tbl_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_clientesKeyReleased
        this.selec_datos();
    }//GEN-LAST:event_tbl_clientesKeyReleased

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        cliente = new Cliente(Integer.valueOf(this.lbl_id.getText()), this.txt_nit.getText(), this.txt_nombres.getText(), this.txt_apellidos.getText(),
                              this.txt_direccion.getText(), this.txt_telefono.getText(), this.txt_fecha.getText());
        cliente.Actualizar();
        this.tbl_clientes.setModel(cliente.Leer());
        
        //Limpiar los text
        this.txt_nit.setText("");
        this.txt_nombres.setText("");
        this.txt_apellidos.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.txt_fecha.setText("");
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        cliente = new Cliente();
        cliente.setId(Integer.valueOf(this.lbl_id.getText()));
        cliente.Eliminar();
        this.tbl_clientes.setModel(cliente.Leer());
        
        //Limpiar los text
        this.txt_nit.setText("");
        this.txt_nombres.setText("");
        this.txt_apellidos.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.txt_fecha.setText("");
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_formEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formEmpleadosActionPerformed
        fr = new Frm_Empleados();
        fr.setVisible(true);
        
    }//GEN-LAST:event_btn_formEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_formEmpleados;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jspanel_clientes;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
