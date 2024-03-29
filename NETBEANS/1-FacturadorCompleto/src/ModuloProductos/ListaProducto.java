
package ModuloProductos;


import Clases.Producto;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class ListaProducto extends javax.swing.JFrame {

    Menu ventanaMenu;
    private JLabel etqTemporal;
    
    
    public ListaProducto(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents(){
        setTitle("Usuarios");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        this.EtqTitulo.setText("LISTAR ");
        
        contenUsuarios.setLayout( new BoxLayout(contenUsuarios, BoxLayout.Y_AXIS) );
        contenUsuarios.setBackground(Color.WHITE);
        imprimirProductos();
    }
    
     public void imprimirProductos(){
        Producto ListaProducto [] =  this.ventanaMenu.database.listaProducto();
        
        if (ListaProducto!=null) {
            for(int i = 0; i < ListaProducto.length; i++){
                if(ListaProducto[i] != null){
                    etqTemporal = new JLabel(ListaProducto[i].getId()+" - "+ListaProducto[i].getNombre()+" "+ListaProducto[i].getPrecio());
                    etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
                    contenUsuarios.add(etqTemporal);
                }else{
                    break;
                }
            }
            revalidate();
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        principalContainer = new javax.swing.JPanel();
        EtqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenUsuarios = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalContainer.setBackground(new java.awt.Color(153, 153, 255));

        EtqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EtqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtqTitulo.setText("LISTAR");
        EtqTitulo.setToolTipText("");

        javax.swing.GroupLayout contenUsuariosLayout = new javax.swing.GroupLayout(contenUsuarios);
        contenUsuarios.setLayout(contenUsuariosLayout);
        contenUsuariosLayout.setHorizontalGroup(
            contenUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
        contenUsuariosLayout.setVerticalGroup(
            contenUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenUsuarios);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalContainerLayout = new javax.swing.GroupLayout(principalContainer);
        principalContainer.setLayout(principalContainerLayout);
        principalContainerLayout.setHorizontalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(principalContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(EtqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        principalContainerLayout.setVerticalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalContainerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(EtqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtqTitulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel contenUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principalContainer;
    // End of variables declaration//GEN-END:variables
}
