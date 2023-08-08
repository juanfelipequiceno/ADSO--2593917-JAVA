
package Eliminar;


import Clases.Vendedor;
import Interfaces.InterVendedor;
import Principal.Alert;
import Principal.Menu;


public class EliminarVendedor extends javax.swing.JFrame {
    
    InterVendedor ventana;
    Menu ventanaMenu;

    
    public EliminarVendedor(InterVendedor ventana, Menu ventanMenu) {
        this.ventana = ventana;
        this.ventanaMenu = ventanMenu;
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        espaCampoNombre.setEnabled(false);
        espaCampoApellido.setEnabled(false);
        espaCampoTelefono.setEnabled(false);
        espaCampoCorreo.setEnabled(false);
        eliminarUsuario.setEnabled(false);
        espaCampoContrasena.setEditable(false);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        etqApellidos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        espaCampoApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        espaCampoTelefono = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        espaCampoCorreo = new javax.swing.JTextField();
        campoCedula = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        etqNombres = new javax.swing.JLabel();
        eliminarUsuario = new javax.swing.JButton();
        espaCampoNombre = new javax.swing.JTextField();
        etqEmail1 = new javax.swing.JLabel();
        espaCampoContrasena = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ELIMINAR VENDEDOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqApellidos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(255, 255, 102));
        etqApellidos.setText("Apellidos:");
        etqApellidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        espaCampoApellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        espaCampoApellido.setForeground(new java.awt.Color(255, 255, 102));
        espaCampoApellido.setEnabled(false);
        espaCampoApellido.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Usuario encontrado:");

        etqTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(255, 255, 102));
        etqTelefono.setText("Teléfono:");
        etqTelefono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        espaCampoTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        espaCampoTelefono.setForeground(new java.awt.Color(255, 255, 102));
        espaCampoTelefono.setEnabled(false);
        espaCampoTelefono.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqEmail.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(255, 255, 102));
        etqEmail.setText("Correo:");
        etqEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        etqCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqCedula.setForeground(new java.awt.Color(255, 255, 102));
        etqCedula.setText("Cedula:");

        espaCampoCorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        espaCampoCorreo.setForeground(new java.awt.Color(255, 255, 102));
        espaCampoCorreo.setEnabled(false);
        espaCampoCorreo.setMargin(new java.awt.Insets(2, 5, 2, 5));

        campoCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCedula.setMargin(new java.awt.Insets(2, 5, 2, 5));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqNombres.setForeground(new java.awt.Color(255, 255, 102));
        etqNombres.setText("Nombres:");
        etqNombres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        eliminarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        eliminarUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        eliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        eliminarUsuario.setText("ELIMINAR");
        eliminarUsuario.setEnabled(false);
        eliminarUsuario.setFocusable(false);
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });

        espaCampoNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        espaCampoNombre.setForeground(new java.awt.Color(255, 255, 102));
        espaCampoNombre.setEnabled(false);
        espaCampoNombre.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqEmail1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqEmail1.setForeground(new java.awt.Color(255, 255, 102));
        etqEmail1.setText("Contraseña:");
        etqEmail1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        espaCampoContrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        espaCampoContrasena.setForeground(new java.awt.Color(255, 255, 102));
        espaCampoContrasena.setEnabled(false);
        espaCampoContrasena.setMargin(new java.awt.Insets(2, 5, 2, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(eliminarUsuario)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqEmail1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(espaCampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(espaCampoCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(espaCampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(espaCampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(espaCampoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = campoCedula.getText();
       Vendedor temp = this.ventana.ventana.data_base.buscarVendedor(cedula);
        if(temp !=null){
            espaCampoNombre.setText(temp.getNombres());
            espaCampoApellido.setText(temp.getApellidos());
            espaCampoTelefono.setText(temp.getTelefono());
            espaCampoCorreo.setText(temp.getEmail());
            espaCampoContrasena.setText(temp.getPassword());
            eliminarUsuario.setEnabled(true);
        }else{
            espaCampoNombre.setText("");
            espaCampoApellido.setText("");
            espaCampoTelefono.setText("");
            espaCampoCorreo.setText("");
             espaCampoContrasena.setText("");
            eliminarUsuario.setEnabled(false);
            Alert alerta = new Alert("ERROR", "Datos NO encontrados.", "warning");
            
        }
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        boolean temp = this.ventana.ventana.data_base.deleteVendedor(campoCedula.getText());
        if( temp == true){    
            this.ventana.setVisible(true);
            Alert alerta = new Alert("EXITO", "Datos eliminados  correctamente.", "success");
            dispose();
            this.ventana.actualizarVendedor();
            
        }else{
            Alert alerta = new Alert("ERROR", "Datos No Eliminados", "error");
        }
           
           
           
    }//GEN-LAST:event_eliminarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JTextField espaCampoApellido;
    private javax.swing.JTextField espaCampoContrasena;
    private javax.swing.JTextField espaCampoCorreo;
    private javax.swing.JTextField espaCampoNombre;
    private javax.swing.JTextField espaCampoTelefono;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqEmail1;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
