
package Principal;

public class EliminarUsuario extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    int temp;
  
    public EliminarUsuario(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.temp=0;
        initComponents();
        initAlternComponents();
        initComponents();
    }
      public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));
        espaCampoNombre.setEnabled(false);
        espaCampoApellido.setEnabled(false);
        espaCampoTelefono.setEnabled(false);
        espaCampoDireccion.setEnabled(false);
        espaCampoCorreo.setEnabled(false);
        eliminarUsuario.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buscarUsuarioEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        EspaNombre = new javax.swing.JLabel();
        espaCampoNombre = new javax.swing.JTextField();
        EspaNombre1 = new javax.swing.JLabel();
        espaCampoApellido = new javax.swing.JTextField();
        EspaNombre2 = new javax.swing.JLabel();
        espaCampoTelefono = new javax.swing.JTextField();
        EspaNombre3 = new javax.swing.JLabel();
        espaCampoDireccion = new javax.swing.JTextField();
        EspaNombre4 = new javax.swing.JLabel();
        espaCampoCorreo = new javax.swing.JTextField();
        eliminarCancelar = new javax.swing.JButton();
        eliminarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINAR USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese Cedula: ");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        buscarUsuarioEliminar.setBackground(new java.awt.Color(0, 0, 0));
        buscarUsuarioEliminar.setForeground(new java.awt.Color(255, 255, 255));
        buscarUsuarioEliminar.setText("BUSCAR");
        buscarUsuarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioEliminarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        EspaNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EspaNombre.setForeground(new java.awt.Color(0, 0, 0));
        EspaNombre.setText("Nombre: ");
        EspaNombre.setFocusable(false);

        espaCampoNombre.setBackground(new java.awt.Color(255, 255, 255));
        espaCampoNombre.setFocusable(false);

        EspaNombre1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EspaNombre1.setForeground(new java.awt.Color(0, 0, 0));
        EspaNombre1.setText("Apellido:");
        EspaNombre1.setFocusable(false);

        espaCampoApellido.setBackground(new java.awt.Color(255, 255, 255));
        espaCampoApellido.setFocusable(false);

        EspaNombre2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EspaNombre2.setForeground(new java.awt.Color(0, 0, 0));
        EspaNombre2.setText("Telefono:");
        EspaNombre2.setFocusable(false);

        espaCampoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        espaCampoTelefono.setFocusable(false);

        EspaNombre3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EspaNombre3.setForeground(new java.awt.Color(0, 0, 0));
        EspaNombre3.setText("Direccion: ");
        EspaNombre3.setFocusable(false);

        espaCampoDireccion.setBackground(new java.awt.Color(255, 255, 255));
        espaCampoDireccion.setFocusable(false);

        EspaNombre4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EspaNombre4.setForeground(new java.awt.Color(0, 0, 0));
        EspaNombre4.setText("Correo:");
        EspaNombre4.setFocusable(false);

        espaCampoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        espaCampoCorreo.setFocusable(false);

        eliminarCancelar.setBackground(new java.awt.Color(153, 0, 0));
        eliminarCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        eliminarCancelar.setForeground(new java.awt.Color(255, 255, 255));
        eliminarCancelar.setText("CANCELAR");
        eliminarCancelar.setFocusable(false);
        eliminarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCancelarActionPerformed(evt);
            }
        });

        eliminarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        eliminarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        eliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        eliminarUsuario.setText("ELIMINAR");
        eliminarUsuario.setFocusable(false);
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarUsuarioEliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EspaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espaCampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EspaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espaCampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EspaNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espaCampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EspaNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espaCampoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EspaNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espaCampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(eliminarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarUsuarioEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EspaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EspaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EspaNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EspaNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EspaNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaCampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCancelarActionPerformed
       this.ventanaMenu.setVisible(true);
       dispose();
    }//GEN-LAST:event_eliminarCancelarActionPerformed

    private void buscarUsuarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioEliminarActionPerformed
        String cedula = buscarUsuarioEliminar.getText();
        for(int i=0; i<this.ventanaMenu.indexPerosna;i++){
            
            if(this.ventanaMenu.listapersona[i].getCedula().equals(cedula)){
                espaCampoNombre.setText(this.ventanaMenu.listapersona[i].getNombre());
                espaCampoApellido.setText(this.ventanaMenu.listapersona[i].getApellido());
                espaCampoTelefono.setText(this.ventanaMenu.listapersona[i].getTelefono());
                espaCampoDireccion.setText(this.ventanaMenu.listapersona[i].getDireccion());
                espaCampoCorreo.setText(this.ventanaMenu.listapersona[i].getCorreo());
                
                espaCampoNombre.setEnabled(true);
                espaCampoApellido.setEnabled(true);
                espaCampoTelefono.setEnabled(true);
                espaCampoDireccion.setEnabled(true);
                espaCampoCorreo.setEnabled(true);
                eliminarUsuario.setEnabled(true);
                this.temp = i;
            }
        }
    }//GEN-LAST:event_buscarUsuarioEliminarActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
       
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EspaNombre;
    private javax.swing.JLabel EspaNombre1;
    private javax.swing.JLabel EspaNombre2;
    private javax.swing.JLabel EspaNombre3;
    private javax.swing.JLabel EspaNombre4;
    private javax.swing.JButton buscarUsuarioEliminar;
    private javax.swing.JButton eliminarCancelar;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JTextField espaCampoApellido;
    private javax.swing.JTextField espaCampoCorreo;
    private javax.swing.JTextField espaCampoDireccion;
    private javax.swing.JTextField espaCampoNombre;
    private javax.swing.JTextField espaCampoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
