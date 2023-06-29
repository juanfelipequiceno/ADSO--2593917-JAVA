
package Modificar;

import Clases.Habitacion;
import Clases.Persona;
import Interfaces.InterHabitacion;
import Interfaces.InterPersona;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ModificarHabitacion extends javax.swing.JFrame {
    
    
    InterHabitacion habitacion;
    
    public ModificarHabitacion(InterHabitacion habitacion) {
        
        this.habitacion = habitacion;
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        etqCedula = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        campoPiso = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoCaracteristicas = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        etqEmail1 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Usuarios");
        setResizable(false);

        contentTitulo.setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MODIFICAR HABITACION");

        javax.swing.GroupLayout contentTituloLayout = new javax.swing.GroupLayout(contentTitulo);
        contentTitulo.setLayout(contentTituloLayout);
        contentTituloLayout.setHorizontalGroup(
            contentTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentTituloLayout.setVerticalGroup(
            contentTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        contentPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        etqCedula.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        etqCedula.setText("Numero:");

        campoNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNumero.setMargin(new java.awt.Insets(2, 5, 2, 5));
        campoNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eventoKeyCedula(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqNombres.setForeground(new java.awt.Color(51, 51, 51));
        etqNombres.setText("Piso:");
        etqNombres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoPiso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoPiso.setEnabled(false);
        campoPiso.setMargin(new java.awt.Insets(2, 5, 2, 5));
        campoPiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eventoKeyCampos(evt);
            }
        });

        etqApellidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(51, 51, 51));
        etqApellidos.setText("Descripcion:");
        etqApellidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoDescripcion.setEnabled(false);
        campoDescripcion.setMargin(new java.awt.Insets(2, 5, 2, 5));
        campoDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eventoKeyCampos(evt);
            }
        });

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(51, 51, 51));
        etqTelefono.setText("Caracteristicas:");
        etqTelefono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoCaracteristicas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCaracteristicas.setEnabled(false);
        campoCaracteristicas.setMargin(new java.awt.Insets(2, 5, 2, 5));
        campoCaracteristicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eventoKeyCampos(evt);
            }
        });

        etqEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(51, 51, 51));
        etqEmail.setText("Precio:");
        etqEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoPrecio.setEnabled(false);
        campoPrecio.setMargin(new java.awt.Insets(2, 5, 2, 5));
        campoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eventoKeyCampos(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.setEnabled(false);
        btnModificar.setFocusable(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuario encontrado:");

        etqEmail1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqEmail1.setForeground(new java.awt.Color(51, 51, 51));
        etqEmail1.setText("Estado:");
        etqEmail1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoEstado.setEnabled(false);
        campoEstado.setMargin(new java.awt.Insets(2, 5, 2, 5));
        campoEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoEstadoeventoKeyCampos(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPrincipalLayout.createSequentialGroup()
                                    .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(etqTelefono)
                                        .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(etqEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(campoCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(campoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(43, 43, 43)
                        .addComponent(btnModificar)
                        .addGap(67, 67, 67)))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etqEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.habitacion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String numero = campoNumero.getText();
        
        Habitacion temporal = this.habitacion.ventana.data_base.buscarHabitacion(numero);
        
        if (temporal != null) {
            habilitarCampo(campoPiso);
            habilitarCampo(campoDescripcion);
            habilitarCampo(campoCaracteristicas);
            habilitarCampo(campoPrecio);
            habilitarCampo(campoEstado);
            campoPiso.setText(temporal.getPiso());
            campoDescripcion.setText(temporal.getDescripcion());
            campoCaracteristicas.setText(temporal.getCaracteristicas());
            campoPrecio.setText(temporal.getPrecio());
            campoEstado.setText(temporal.getEstado());
            campoPiso.requestFocus();
            btnModificar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            campoPiso.setText("");
            campoDescripcion.setText("");
            campoCaracteristicas.setText("");
            campoEstado.setText("");
            deshabilitarCampo(campoPiso);
            deshabilitarCampo(campoDescripcion);
            deshabilitarCampo(campoCaracteristicas);
            deshabilitarCampo(campoPrecio);
            deshabilitarCampo(campoEstado);
            campoNumero.requestFocus();
            btnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String numero = campoNumero.getText();
        String piso = campoPiso.getText();
        String descripcion = campoDescripcion.getText();
        String caracteristicas = campoCaracteristicas.getText();
        String precio = campoPrecio.getText();
        String estado = campoEstado.getText();
        Habitacion temporal = new Habitacion(numero, piso, descripcion, caracteristicas, precio, estado);
        
        if (!numero.equals("") && !piso.equals("") && !descripcion.equals("") && !caracteristicas.equals("") && !precio.equals("") && !estado.equals("") ) {
            boolean proceso =  this.habitacion.ventana.data_base.editarHabitacion(temporal) ;
            dispose();
            this.habitacion.actualizarHabitacion();
            this.habitacion.setVisible(true);
            Alert alerta = new Alert("EXITO", "Datos editados correctamente.", "success");
            
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void eventoKeyCampos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventoKeyCampos
        JTextField campo = (JTextField) evt.getSource();
        validarInput(campo);
    }//GEN-LAST:event_eventoKeyCampos

    private void eventoKeyCedula(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventoKeyCedula
        String numero = campoNumero.getText();
        campoPiso.setText("");
        campoDescripcion.setText("");
        campoCaracteristicas.setText("");
        campoPrecio.setText("");
        campoEstado.setText("");
        deshabilitarCampo(campoPiso);
        deshabilitarCampo(campoDescripcion);
        deshabilitarCampo(campoCaracteristicas);
        deshabilitarCampo(campoPrecio);
        deshabilitarCampo(campoEstado);
        campoNumero.requestFocus();
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_eventoKeyCedula

    private void campoEstadoeventoKeyCampos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEstadoeventoKeyCampos
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstadoeventoKeyCampos

    public void deshabilitarCampo(JTextField campo){
        JTextField referencia = new JTextField();
        campo.setBorder( referencia.getBorder() );
        campo.setEnabled(false);
        campo.setBackground(Color.GRAY );
    }
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        setTitle("Usuarios");
        
        deshabilitarCampo(campoPiso);
        deshabilitarCampo(campoDescripcion);
        deshabilitarCampo(campoCaracteristicas);
        deshabilitarCampo(campoPrecio);
        deshabilitarCampo(campoEstado);
    }
    
    public void validarTodosInputs(){
        validarInput(campoPrecio);
        validarInput(campoCaracteristicas);
        validarInput(campoDescripcion);
        validarInput(campoPiso);
        validarInput(campoEstado);
    }
    
    public void validarInput(JTextField campo){
        if (campo.getText().equals("")) {
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2,5,2,5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            campo.setBorder(borderRojo);
            campo.requestFocus();
        }else{
            JTextField referencia = new JTextField();
            campo.setBorder( referencia.getBorder() );
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField campoCaracteristicas;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoPiso;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JPanel contentTitulo;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqEmail1;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
