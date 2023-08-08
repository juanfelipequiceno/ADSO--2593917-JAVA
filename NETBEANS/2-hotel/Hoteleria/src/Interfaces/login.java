
package Interfaces;

import Clases.Vendedor;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class login extends javax.swing.JFrame {
    
    Menu ventana;
    public InterFactura ventanaFactura;
    
    
    public login(Menu ventana) {
        this.ventana = ventana;
        
        initComponents();
        initAlternComponents();
        
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        
    }
    
    public void buscarVendedor(){
        String cedula = this.campo_usuario.getText();
        String contra = campo_contraseña.getText();
        Vendedor temp = this.ventana.data_base.buscarVendedor(cedula);
        
        
        if( temp != null){ 
            if (contra.equals("")) {
                Alert alerta = new Alert("ERROR", "No Hay Contraseña ", "error");
            }else{
                if(contra.equals(temp.getPassword()) == true){
                    this.ventanaFactura = new InterFactura(ventana, temp );
                    ventanaFactura.setVisible(true);
                    dispose();
                }else{
                    Alert alerta = new Alert("ERROR", "La Contraseña Es Incorrecta", "error");
                }
            }
        }else{
            Alert alerta = new Alert("ERROR", "Datos No Encontrados", "error");
            validarTodosInputs();
        }
        validarTodosInputs();
        
    }
    
    public void validarTodosInputs(){
        validarInput(campo_usuario);
        validarInput(campo_contraseña);
       
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
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        etq_usuario = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JTextField();
        etq_contra = new javax.swing.JLabel();
        campo_contraseña = new javax.swing.JTextField();
        boton_ingresar = new javax.swing.JButton();
        boton_menu = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(0, 0, 102));

        etq_usuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        etq_usuario.setForeground(new java.awt.Color(255, 255, 102));
        etq_usuario.setText("Cedula:");

        campo_usuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N

        etq_contra.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        etq_contra.setForeground(new java.awt.Color(255, 255, 102));
        etq_contra.setText("CONTRASEÑA:");

        campo_contraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N

        boton_ingresar.setBackground(new java.awt.Color(0, 0, 0));
        boton_ingresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        boton_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        boton_ingresar.setText("INGRESAR");
        boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarActionPerformed(evt);
            }
        });

        boton_menu.setBackground(new java.awt.Color(0, 0, 0));
        boton_menu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        boton_menu.setForeground(new java.awt.Color(255, 255, 255));
        boton_menu.setText("Atras");
        boton_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(boton_ingresar))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(boton_menu))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_contra)
                            .addComponent(etq_usuario)
                            .addComponent(campo_usuario)
                            .addComponent(campo_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etq_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_contra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelTitulo.setBackground(new java.awt.Color(0, 0, 0));

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 102));
        titulo.setText("INICIAR SESION");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titulo)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarActionPerformed
        buscarVendedor();
    }//GEN-LAST:event_boton_ingresarActionPerformed

    private void boton_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_menuActionPerformed
        dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_boton_menuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ingresar;
    private javax.swing.JButton boton_menu;
    private javax.swing.JTextField campo_contraseña;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel etq_contra;
    private javax.swing.JLabel etq_usuario;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
