
package Interfaces;

import Clases.Habitacion;
import Clases.Persona;
import Clases.ReservaHabitacion;
import Clases.Vendedor;
import Consultar.ConsultarClientes;
import Consultar.ConsultarHabitacion;
import Principal.Menu;
import java.text.NumberFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableModel;


public class InterFactura extends javax.swing.JFrame {
    
    public Menu ventana;
    Vendedor ingresado;
    ReservaHabitacion listaReservaHabitacion[];
    DefaultTableModel modelo;
    
    
    public InterFactura(Menu ventana, Vendedor ingresado ) {
        this.ventana = ventana;
        this.ingresado = ingresado;
        this.listaReservaHabitacion = this.ventana.data_base.listareserReservaHabitaciones();
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        this.modelo = (DefaultTableModel) this.tablaFactura.getModel();
        campoTrabajador.setText(ingresado.getNombres()+" "+ingresado.getApellidos());
        campoTrabajador.setEnabled(false);
        campoCliente.setEnabled(false);
        campoHabitacion.setEnabled(false);
        campoPrecio.setEnabled(false);
        actualizarReservaHabitaciones();
        
    }
     
    public void limpiardatos(){
       this.campoHabitacion.setText("");
       this.campoCliente.setText("");
       this.campoPrecio.setText("");
       this.fechaIngreso.setDate(null);
       this.fechaSalida.setDate(null);

       
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new LIB.JEImagePanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoHabitacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnVolverMenu = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        campoTrabajador = new javax.swing.JTextField();
        tipoReserva = new javax.swing.JComboBox<>();
        btnConsultarHabitacion = new javax.swing.JButton();
        campoCliente = new javax.swing.JTextField();
        btnConultarCliente = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        estadoReserva = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        reservaPor = new javax.swing.JComboBox<>();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        fechaSalida = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        acum = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Reserva...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("Habitacion:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Reserva Habitacion");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Cliente:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("Trabajador:");

        btnVolverMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnVolverMenu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnVolverMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverMenu.setText("Volver al Menu");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 102));
        jLabel12.setText("Tipo Reserva:");

        tipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alquiler" }));

        btnConsultarHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        btnConsultarHabitacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnConsultarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarHabitacion.setText("...");
        btnConsultarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarHabitacionActionPerformed(evt);
            }
        });

        btnConultarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnConultarCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnConultarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnConultarCliente.setText("...");
        btnConultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConultarClienteActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 102));
        jLabel14.setText("Fecha Ingreso:");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 102));
        jLabel15.setText("Fecha Salida:");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 102));
        jLabel16.setText("Estado Reserva:");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 102));
        jLabel17.setText("Precio:");

        estadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagada", "Pendiente" }));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnReservar.setBackground(new java.awt.Color(0, 0, 0));
        btnReservar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 102));
        jLabel18.setText("Por:");

        reservaPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dia", "semana" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(55, 55, 55)
                        .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(97, 97, 97)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(reservaPor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(38, 38, 38)
                                    .addComponent(fechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(24, 24, 24)
                                    .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConsultarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarHabitacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConultarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(reservaPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(estadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Habitacion", "Cliente", "Trabajador", "Tipo Reserva", "Fecha Ingreso", "Fecha Salida", "Precio", "Estado Reserva", "Por", "Dias", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFactura.getTableHeader().setReorderingAllowed(false);
        tablaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFactura);
        if (tablaFactura.getColumnModel().getColumnCount() > 0) {
            tablaFactura.getColumnModel().getColumn(0).setResizable(false);
            tablaFactura.getColumnModel().getColumn(1).setResizable(false);
            tablaFactura.getColumnModel().getColumn(2).setResizable(false);
            tablaFactura.getColumnModel().getColumn(3).setResizable(false);
            tablaFactura.getColumnModel().getColumn(4).setResizable(false);
            tablaFactura.getColumnModel().getColumn(5).setResizable(false);
            tablaFactura.getColumnModel().getColumn(6).setResizable(false);
            tablaFactura.getColumnModel().getColumn(7).setResizable(false);
            tablaFactura.getColumnModel().getColumn(8).setResizable(false);
            tablaFactura.getColumnModel().getColumn(9).setResizable(false);
            tablaFactura.getColumnModel().getColumn(10).setResizable(false);
        }

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Habitaciones Reservadas...");

        acum.setBackground(new java.awt.Color(255, 255, 255));
        acum.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        acum.setForeground(new java.awt.Color(255, 255, 102));
        acum.setText("Habitaciones Reservadas:  0");

        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 102));
        total.setText("Total: $ 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(acum)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
       dispose();
       this.ventana.setVisible(true);
    }//GEN-LAST:event_btnVolverMenuActionPerformed
        
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiardatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        
        String numeroHabitacion = campoHabitacion.getText();
        String cliente = campoCliente.getText();
        String trabajador = campoTrabajador.getText();
        String tipoReserva = (String) this.tipoReserva.getSelectedItem();
        
        String habitacion = this.campoHabitacion.getText();
        
        
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        

// Obtener fecha de ingreso
        Date fechaIngresoDate = fechaIngreso.getDate();
        String fechaIngreso = formatoFecha.format(fechaIngresoDate);

        // Obtener fecha de salida
        Date fechaSalidaDate = fechaSalida.getDate();
        String fechaSalida = formatoFecha.format(fechaSalidaDate);

        // Calcular diferencia de días
        long diferenciaMilisegundos = fechaSalidaDate.getTime() - fechaIngresoDate.getTime();
        long diferenciaDias = TimeUnit.DAYS.convert(diferenciaMilisegundos, TimeUnit.MILLISECONDS);

        // Convertir a int
        int cantidadDias = (int) diferenciaDias;
        
        String precio = campoPrecio.getText();
        int numero1 = Integer.valueOf(precio);
        String por = (String) this.reservaPor.getSelectedItem();
        int numero2 = Integer.valueOf(cantidadDias);
        String estadoReserva = (String) this.estadoReserva.getSelectedItem();
        int total = 0;
        int multi = 0;

        if (por.equals("dia")) {
            total = numero1 * numero2;
            if (!numeroHabitacion.equals("") && !cliente.equals("") && !trabajador.equals("") && !tipoReserva.equals("") && !fechaIngreso.equals("") && !fechaSalida.equals("") && !precio.equals("") && !estadoReserva.equals("") && !por.equals("")) {
                boolean proceso = this.ventana.data_base.reservaHabitacion(numeroHabitacion, cliente, trabajador, tipoReserva, fechaIngreso, fechaSalida, precio, estadoReserva, por, cantidadDias, total);
            }
            actualizarReservaHabitaciones();
            limpiardatos();
        } else  if (por.equals("semana")){
            multi = numero1 * 7;
            total = multi * numero2;
            if (!numeroHabitacion.equals("") && !cliente.equals("") && !trabajador.equals("") && !tipoReserva.equals("") && !fechaIngreso.equals("") && !fechaSalida.equals("") && !precio.equals("") && !estadoReserva.equals("") && !por.equals("")) {
                boolean proceso = this.ventana.data_base.reservaHabitacion(numeroHabitacion, cliente, trabajador, tipoReserva, fechaIngreso, fechaSalida, precio, estadoReserva, por, cantidadDias, total);
            }
            actualizarReservaHabitaciones();
            limpiardatos();
        }
        
        Habitacion nuevaHabitacion = this.ventana.data_base.buscarHabitacion(habitacion);
        ventana.data_base.editarEstadoHabitacion(nuevaHabitacion);
       
        
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnConsultarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHabitacionActionPerformed
        ConsultarHabitacion consulta = new ConsultarHabitacion(this);
        consulta.setVisible(true);  
    }//GEN-LAST:event_btnConsultarHabitacionActionPerformed

    private void btnConultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConultarClienteActionPerformed
        ConsultarClientes consultaCliente = new ConsultarClientes(this);
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_btnConultarClienteActionPerformed

    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked
        //arreglar este codigo
        int filaSeleccionada = tablaFactura.getSelectedRow();
        this.listaReservaHabitacion = this.ventana.data_base.listareserReservaHabitaciones();
        this.ventana.data_base.editarEstadoFactura(this.listaReservaHabitacion[filaSeleccionada] , filaSeleccionada);
        actualizarReservaHabitaciones();
        
        
    }//GEN-LAST:event_tablaFacturaMouseClicked
   
    public void actualizarReservaHabitaciones(){
        int acum_Habitacion = 0;
        int total = 0;
        this.listaReservaHabitacion = this.ventana.data_base.listareserReservaHabitaciones();
        this.modelo.setRowCount(0);
        for (int i = 0; i < this.listaReservaHabitacion.length ; i++) {
            if(this.listaReservaHabitacion[i] !=  null){
                Object array [] = { this.listaReservaHabitacion[i].getNumeroHabitacion(), this.listaReservaHabitacion[i].getCliente(), this.listaReservaHabitacion[i].getTrabajador(), this.listaReservaHabitacion[i].getTipoReserva(), this.listaReservaHabitacion[i].getFechaIngreso(), this.listaReservaHabitacion[i].getFechaSalida(),this.listaReservaHabitacion[i].getPrecio(), this.listaReservaHabitacion[i].getEstadoReserva(), this.listaReservaHabitacion[i].getPor(), this.listaReservaHabitacion[i].getDiaSemana(), this.listaReservaHabitacion[i].getTotal()};
                this.modelo.addRow(array);
                
                acum_Habitacion++;
                int numero2 = Integer.valueOf(this.listaReservaHabitacion[i].getTotal());
                if(this.listaReservaHabitacion[i].getEstadoReserva().equals("Pagada") == true){
                   total += numero2 ;
                   totalacum(total); 
                }else{
                    int numeroRestar = Integer.valueOf(this.listaReservaHabitacion[i].getTotal());
                    int total2 = total - numeroRestar;
                    totalacum(total2);
                }
                
                reservaHabitaciones(acum_Habitacion);
            }
        }
    }
    
    public void reservaHabitaciones(int acum){
        int acum_Reserva = acum;
        String acum_int = Integer. toString(acum_Reserva);
        this.acum.setText("Reserva Habitaciones: "+acum_int);
    }
    
    public void actualizarCliente(Persona cliente){
        campoCliente.setText(cliente.getCedula());
    }
    
    public void actualizarHabitacion(Habitacion numero){
        campoHabitacion.setText(numero.getNumero());
        campoPrecio.setText(numero.getPrecio());
    }
    
     public void totalacum(int acum){
        int acum_Reserva = acum;
        String acum_int = Integer. toString(acum_Reserva);
         if (acum_int.equals("-15000") == true) {
             this.total.setText("Total: 0");
         } else {
             String formato = formatearMoneda(acum_int);
             
            this.total.setText("Total: "+formato);
         }
        
    }
    
    public static String formatearMoneda(String cantidad) {
        
        double cantidadNumerica = Double.parseDouble(cantidad);
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
        String cantidadFormateada = formatoMoneda.format(cantidadNumerica);

        return cantidadFormateada;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acum;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultarHabitacion;
    private javax.swing.JButton btnConultarCliente;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextField campoHabitacion;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoTrabajador;
    private javax.swing.JComboBox<String> estadoReserva;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private com.toedter.calendar.JDateChooser fechaSalida;
    private com.toedter.calendar.JCalendar jCalendar1;
    private LIB.JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> reservaPor;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JComboBox<String> tipoReserva;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
