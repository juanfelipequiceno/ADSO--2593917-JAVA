
package Eliminar;


import Clases.Habitacion;
import Interfaces.InterHabitacion;
import Principal.Alert;
import Principal.Menu;


public class EliminarHabitacion extends javax.swing.JFrame {
    
      Menu ventanaMenu;
      InterHabitacion habitacion;

    
    public EliminarHabitacion(Menu ventanaMenu, InterHabitacion habitacion) {
        this.ventanaMenu = ventanaMenu;
        this.habitacion = habitacion;
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        CampoPiso.setEnabled(false);
        CampoDescripcion.setEnabled(false);
        CampoCaracteristicas.setEnabled(false);
        CampoPrecio.setEnabled(false);
        eliminarUsuario.setEnabled(false);
        CampoEstado.setEditable(false);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        etqApellidos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CampoDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        CampoCaracteristicas = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        CampoPrecio = new javax.swing.JTextField();
        campoNumero = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        etqNombres = new javax.swing.JLabel();
        eliminarUsuario = new javax.swing.JButton();
        CampoPiso = new javax.swing.JTextField();
        etqEmail1 = new javax.swing.JLabel();
        CampoEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ELIMINAR  HABITACION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        etqApellidos.setText("Descripcion:");
        etqApellidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        CampoDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CampoDescripcion.setEnabled(false);
        CampoDescripcion.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Habitacion encontrada:");

        etqTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(255, 255, 102));
        etqTelefono.setText("Caracteristicas:");
        etqTelefono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        CampoCaracteristicas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CampoCaracteristicas.setEnabled(false);
        CampoCaracteristicas.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqEmail.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(255, 255, 102));
        etqEmail.setText("Precio:");
        etqEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        etqCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqCedula.setForeground(new java.awt.Color(255, 255, 102));
        etqCedula.setText("Numero:");

        CampoPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CampoPrecio.setEnabled(false);
        CampoPrecio.setMargin(new java.awt.Insets(2, 5, 2, 5));

        campoNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNumero.setMargin(new java.awt.Insets(2, 5, 2, 5));

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
        etqNombres.setText("Piso:");
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

        CampoPiso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CampoPiso.setEnabled(false);
        CampoPiso.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqEmail1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        etqEmail1.setForeground(new java.awt.Color(255, 255, 102));
        etqEmail1.setText("Estado:");
        etqEmail1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        CampoEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CampoEstado.setEnabled(false);
        CampoEstado.setMargin(new java.awt.Insets(2, 5, 2, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqEmail1)
                    .addComponent(etqApellidos)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CampoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CampoPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CampoCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CampoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(eliminarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String numero = campoNumero.getText();
        Habitacion temp = this.ventanaMenu.data_base.buscarHabitacion(numero);
       
        if(temp !=null){
            CampoPiso.setText(temp.getPiso());
            CampoDescripcion.setText(temp.getDescripcion());
            CampoCaracteristicas.setText(temp.getCaracteristicas());
            CampoPrecio.setText(temp.getPrecio());
            CampoEstado.setText(temp.getEstado());
            eliminarUsuario.setEnabled(true);
        }else{
            CampoPiso.setText("");
            CampoDescripcion.setText("");
            CampoCaracteristicas.setText("");
            CampoPrecio.setText("");
             CampoEstado.setText("");
            eliminarUsuario.setEnabled(false);
            Alert alerta = new Alert("ERROR", "Datos NO encontrados.", "warning");
            
        }
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.habitacion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        boolean temp = this.ventanaMenu.data_base.deleteHabitacion(campoNumero.getText());
        if( temp == true){    
            this.habitacion.setVisible(true);
            Alert alerta = new Alert("EXITO", "Datos eliminados  correctamente.", "success");
            dispose();
            this.habitacion.actualizarHabitacion();
            
        }else{
            Alert alerta = new Alert("ERROR", "Datos No Eliminados", "error");
        }
           
           
           
    }//GEN-LAST:event_eliminarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCaracteristicas;
    private javax.swing.JTextField CampoDescripcion;
    private javax.swing.JTextField CampoEstado;
    private javax.swing.JTextField CampoPiso;
    private javax.swing.JTextField CampoPrecio;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JButton eliminarUsuario;
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
