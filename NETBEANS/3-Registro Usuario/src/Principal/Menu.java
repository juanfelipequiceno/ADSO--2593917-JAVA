package Principal;
import javax.swing.*;
public class Menu extends JFrame {
    
    
    int indexPerosna;
    int indexVendedor;
    int indexproducto;
    
    Persona listapersona [] ;
    Persona listavendedor [];
    Producto listaProducto[];
    
   
    public Menu() {
        this.listapersona = new Persona [100];
        this.listavendedor = new Persona [100];
        this.listaProducto = new Producto[100];
        setLocationRelativeTo(null);
        indexPerosna = 0;
        indexVendedor = 0;
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
        btnCrearVendedor = new javax.swing.JButton();
        btnModificarVendedor = new javax.swing.JButton();
        btnEliminarVendedor = new javax.swing.JButton();
        btnListarVendedor = new javax.swing.JButton();
        btnCrearProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnListarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        factura = new javax.swing.JButton();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
        );
        conteMenuLayout.setVerticalGroup(
            conteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

        btnCrearVendedor.setBackground(new java.awt.Color(0, 0, 0));
        btnCrearVendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCrearVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearVendedor.setText("Crear Vendedor");
        btnCrearVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrearVendedor.setFocusable(false);
        btnCrearVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVendedorActionPerformed(evt);
            }
        });

        btnModificarVendedor.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarVendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificarVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarVendedor.setText("Modificar Vendedor");
        btnModificarVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificarVendedor.setFocusable(false);
        btnModificarVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVendedorActionPerformed(evt);
            }
        });

        btnEliminarVendedor.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarVendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminarVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarVendedor.setText("Eliminar Vendedor");
        btnEliminarVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarVendedor.setFocusable(false);
        btnEliminarVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVendedorActionPerformed(evt);
            }
        });

        btnListarVendedor.setBackground(new java.awt.Color(0, 0, 0));
        btnListarVendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnListarVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnListarVendedor.setText("Lista Vendedores");
        btnListarVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnListarVendedor.setFocusable(false);
        btnListarVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendedorActionPerformed(evt);
            }
        });

        btnCrearProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnCrearProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCrearProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearProducto.setText("Crear Producto");
        btnCrearProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrearProducto.setFocusable(false);
        btnCrearProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnModificarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProducto.setText("Modificar Producto");
        btnModificarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificarProducto.setFocusable(false);
        btnModificarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarProducto.setFocusable(false);
        btnEliminarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnListarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnListarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnListarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnListarProducto.setText("Listar Productos");
        btnListarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnListarProducto.setFocusable(false);
        btnListarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProductoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIOS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VENDEDOR");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRODUCTO");

        factura.setBackground(new java.awt.Color(0, 0, 0));
        factura.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        factura.setForeground(new java.awt.Color(255, 255, 255));
        factura.setText("FACTURA");
        factura.setFocusable(false);
        factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contePrincipalLayout = new javax.swing.GroupLayout(contePrincipal);
        contePrincipal.setLayout(contePrincipalLayout);
        contePrincipalLayout.setHorizontalGroup(
            contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contePrincipalLayout.createSequentialGroup()
                .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contePrincipalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(contePrincipalLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contePrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(385, 385, 385))
        );
        contePrincipalLayout.setVerticalGroup(
            contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contePrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contePrincipalLayout.createSequentialGroup()
                        .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contePrincipalLayout.createSequentialGroup()
                        .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(conteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuarioActionPerformed
        setVisible(false);
        ListaUsuario ventana = new ListaUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarUsuarioActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        setVisible(false);
        CrearUsuario ventana = new CrearUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        setVisible(false);
        ModificarUsuario ventana = new ModificarUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        setVisible(false);
        EliminarUsuario ventana = new  EliminarUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnCrearVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVendedorActionPerformed
       setVisible(false);
       CrearVendedor ventana = new CrearVendedor(this);
       ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearVendedorActionPerformed

    private void btnModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVendedorActionPerformed
        setVisible(false);
        ModificarVendedor ventana = new ModificarVendedor(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarVendedorActionPerformed

    private void btnEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVendedorActionPerformed
        setVisible(false);
        EliminarUsuario ventana = new  EliminarUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarVendedorActionPerformed

    private void btnListarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendedorActionPerformed
        setVisible(false);
        ListarVendedor ventana = new ListarVendedor(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarVendedorActionPerformed

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        setVisible(false);
        CrearProducto ventana = new CrearProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        setVisible(false);
        ModificarProducto ventana = new ModificarProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        setVisible(false);
        EliminarProducto ventana = new EliminarProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnListarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProductoActionPerformed
        setVisible(false);
        ListaProducto ventana = new ListaProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarProductoActionPerformed

    private void facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaActionPerformed
        setVisible(false);
        Factura ventana = new Factura(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_facturaActionPerformed

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
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnCrearVendedor;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnEliminarVendedor;
    private javax.swing.JButton btnListarProducto;
    private javax.swing.JButton btnListarUsuario;
    private javax.swing.JButton btnListarVendedor;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnModificarVendedor;
    private javax.swing.JPanel conteMenu;
    private javax.swing.JPanel contePrincipal;
    private javax.swing.JLabel etqMenu;
    private javax.swing.JButton factura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}