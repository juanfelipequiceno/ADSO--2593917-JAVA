
package Modificar;

import Clases.Vendedor;
import Principal.Alert;

public class modificarContraseña extends javax.swing.JFrame {
    
    ModificarVendedor ventana;
    Vendedor modificarV;
   
    
    public modificarContraseña(ModificarVendedor ventana , Vendedor modificarV) {
        this.ventana = ventana;
        this.modificarV = modificarV;
        initComponents();
        initAlternComponents();
    }
    

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        antigua_contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        nueva_contraseña = new javax.swing.JPasswordField();
        btn_modifcar = new javax.swing.JButton();
        btn_modifcar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("MODIFICAR CONTRASEÑA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Ingrese su contraseña anterior: ");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Ingrese su nueva contraseña:");

        btn_modifcar.setBackground(new java.awt.Color(0, 0, 0));
        btn_modifcar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_modifcar.setForeground(new java.awt.Color(255, 255, 51));
        btn_modifcar.setText("Modificar");
        btn_modifcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifcarActionPerformed(evt);
            }
        });

        btn_modifcar1.setBackground(new java.awt.Color(0, 0, 0));
        btn_modifcar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_modifcar1.setForeground(new java.awt.Color(255, 255, 51));
        btn_modifcar1.setText("Atras");
        btn_modifcar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifcar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(antigua_contraseña)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nueva_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_modifcar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modifcar1)
                        .addGap(95, 95, 95))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(antigua_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(nueva_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modifcar)
                    .addComponent(btn_modifcar1))
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void btn_modifcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifcarActionPerformed

        cambiarContraseña();
    }//GEN-LAST:event_btn_modifcarActionPerformed

    private void btn_modifcar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifcar1ActionPerformed
        this.ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_modifcar1ActionPerformed

    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }
    
    public void cambiarContraseña(){
        String antigua_contraseña = this.antigua_contraseña.getText();
        String nueva_contraseña = this.nueva_contraseña.getText();
        if (antigua_contraseña.equals("")) {
            Alert alerta = new Alert("ERROR", "No Hay Contraseña ", "error");
        }else{
            if(antigua_contraseña.equals(modificarV.getPassword()) == true){
                if(nueva_contraseña.equals(" ")){
                    Alert alerta = new Alert("ERROR", "No Se Ha Ingresado Una Nueva Contraseña   ", "error");
                }else{
                    if (nueva_contraseña.equals(antigua_contraseña) == true) {
                        Alert alerta = new Alert("ERROR", "La Contraseña Nueva Es Igual A La Anterior.", "error");
                    } else {
                        boolean porceso = this.ventana.vendedor.ventana.data_base.editarContraseña(modificarV, nueva_contraseña);
                        if (porceso) {
                            Alert alerta = new Alert("EXITO", "Contraseña Modificada correctamente.", "success");
                            this.ventana.vendedor.actualizarVendedor();
                            dispose();
                            ventana.setVisible(true);
                        } else {
                            Alert alerta = new Alert("ERROR", "Datos NO Editados Correctamente.", "error");
                        }
                    }
                    
                    

                    
                }
                System.out.println("contraseña igual");
            }else{
                Alert alerta = new Alert("ERROR", "La Contraseña Es Incorrecta", "error");
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField antigua_contraseña;
    private javax.swing.JButton btn_modifcar;
    private javax.swing.JButton btn_modifcar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField nueva_contraseña;
    // End of variables declaration//GEN-END:variables
}
