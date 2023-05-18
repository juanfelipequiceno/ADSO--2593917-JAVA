package Principal;
import javax.swing.*;
public class Menu extends JFrame {
    
    CrearUsuario ventana;
    ModificarUsuario vent;
    EliminarUsuario eliminar;
    int indexPerosna;
    Persona listapersona [] ;
   
    public Menu() {
        this.listapersona = new Persona [100];
        setLocationRelativeTo(null);
        indexPerosna = 0;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conteMenu = new javax.swing.JPanel();
        etqMenu = new javax.swing.JLabel();
        contePrincipal = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnListarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        conteMenu.setBackground(new java.awt.Color(0, 0, 0));
        conteMenu.setForeground(new java.awt.Color(255, 255, 255));

        etqMenu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        etqMenu.setForeground(new java.awt.Color(255, 255, 255));
        etqMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenu.setText("Menú");

        javax.swing.GroupLayout conteMenuLayout = new javax.swing.GroupLayout(conteMenu);
        conteMenu.setLayout(conteMenuLayout);
        conteMenuLayout.setHorizontalGroup(
            conteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conteMenuLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        conteMenuLayout.setVerticalGroup(
            conteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        contePrincipal.setBackground(new java.awt.Color(204, 204, 204));
        contePrincipal.setPreferredSize(new java.awt.Dimension(300, 300));

        btnCrearUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnCrearUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearUsuario.setText("Crear Ususario");
        btnCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrearUsuario.setFocusable(false);
        btnCrearUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificarUsuario.setFocusable(false);
        btnModificarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarUsuario.setFocusable(false);
        btnEliminarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnListarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnListarUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnListarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnListarUsuario.setText("Listar Usuario");
        btnListarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnListarUsuario.setFocusable(false);
        btnListarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contePrincipalLayout = new javax.swing.GroupLayout(contePrincipal);
        contePrincipal.setLayout(contePrincipalLayout);
        contePrincipalLayout.setHorizontalGroup(
            contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contePrincipalLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contePrincipalLayout.setVerticalGroup(
            contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contePrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(conteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarUsuarioActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        setVisible(false);
        CrearUsuario ventana = new CrearUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        setVisible(false);
        ModificarUsuario vent = new ModificarUsuario(this);
        vent.setVisible(true);
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        setVisible(false);
        EliminarUsuario eliminar = new  EliminarUsuario(this);
        eliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnListarUsuario;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JPanel conteMenu;
    private javax.swing.JPanel contePrincipal;
    private javax.swing.JLabel etqMenu;
    // End of variables declaration//GEN-END:variables

}