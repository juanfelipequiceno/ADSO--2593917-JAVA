package ModuloFacturas;

import Clases.Iten_factura;
import Clases.Persona;
import Clases.Producto;
import Principal.Alert;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import Principal.Menu;
import java.time.LocalDate;
import javax.swing.border.EmptyBorder;

public class CrearFactura extends JFrame{
    
    int acumTotal;
    int i;
    int j;
    int id_factura;
    Iten_factura lista_items [];
    int indice_item;
    
    
    // Metodos
    public CrearFactura(Menu ventanaMenu){
        this.ventanaMenu = ventanaMenu;
        this.i = 1;
        this.j = 0;
        this.id_factura = this.ventanaMenu.database.generarIdFactura();
        this.listaClientes = this.ventanaMenu.database.listaClientes();
        this.listaVendedores = this.ventanaMenu.database.listaVendedores();
        this.listaProductos = this.ventanaMenu.database.listaProducto();
        this.factura_producto = new Iten_factura[100];
        this.acumTotal = acumTotal;
        this.lista_items = new Iten_factura[100];
        this.indice_item = 0;
        initComponent();
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();

        System.out.println(this.id_factura);
        setTitle("FACTURA");
        setSize( ((int) (tamanio.width*0.4)) , ((int) (tamanio.height*0.9)) );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo(null);
        
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );

        JPanel contPrincipal = new JPanel();
        contPrincipal.setLayout(new GridBagLayout());
        contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 10) );
        GridBagConstraints restriccion = new GridBagConstraints();
        
        //etiqueta de titulo
        etq_datos_cliente = new JLabel("DATOS CLIENTE:");
        etq_datos_cliente.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_datos_cliente.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_datos_cliente, restriccion );
        
        //titulo de la cedula
        etq_cedula_cliente = new JLabel("CEDULA:");
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_cedula_cliente, restriccion );
        
        //campo para buscar cliente
        input_cedula_cliente = new JTextField();
        input_cedula_cliente.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 2;
        restriccion.weightx = 80;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_cedula_cliente, restriccion );
        
        //boton buscar
        btn_buscar_cliente = new JButton("BUSCAR");
        restriccion.gridy = 1;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( btn_buscar_cliente, restriccion );
        
        //etq tiutlo nombre
        etq_nombres_cliente = new JLabel("NOMBRES:");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(10, 0, 10, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_nombres_cliente, restriccion );
        
        //campo para buscar el nombre
        input_nombres_cliente = new JTextField();
        input_nombres_cliente.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2;
        restriccion.weightx = 90;
        restriccion.insets = new Insets(10, 10, 10, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_nombres_cliente, restriccion );
        
        //etq titulo direccion
        etq_direccion_cliente = new JLabel("DIRECCION:");
        restriccion.gridy = 3;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 10, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_direccion_cliente, restriccion );
        
        //campo para buscar la direccion
        input_direccion_cliente = new JTextField();
        input_direccion_cliente.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 3;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2;
        restriccion.weightx = 90;
        restriccion.insets = new Insets(0, 10, 10, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_direccion_cliente, restriccion );

        /*
                - Seccion vendedor
        */
        //titulo principal
        etq_datos_vendedor = new JLabel("DATOS VENDEDOR:");
        etq_datos_vendedor.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_datos_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.insets = new Insets(10, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_datos_vendedor, restriccion );
        
        //etq titulo cedula
        etq_vendedor_cliente = new JLabel("CEDULA:");
        restriccion.gridy = 5;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_vendedor_cliente, restriccion );
        
        //campo para la cedula
        input_cedula_vendedor = new JTextField();
        input_cedula_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
        restriccion.gridy = 5;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 2;
        restriccion.weightx = 80;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_cedula_vendedor, restriccion );
        
        //boton buscar vendedro
        btn_buscar_vendedor = new JButton("BUSCAR");
        restriccion.gridy = 5;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( btn_buscar_vendedor, restriccion );
        
        //etq titulo nombres
        etq_nombres_vendedor = new JLabel("NOMBRES:");
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(10, 0, 10, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_nombres_vendedor, restriccion );
        
        //campo datos de el vendedor
        input_nombres_vendedor = new JTextField();
        input_nombres_vendedor.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 6;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2;
        restriccion.weightx = 90;
        restriccion.insets = new Insets(10, 10, 10, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_nombres_vendedor, restriccion );

        /*
                - Seccion Productos
        */
        etq_datos_productos = new JLabel("LISTA PRODUCTOS FACTURADOS:");
        etq_datos_productos.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_datos_productos.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridy = 7;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.insets = new Insets(10, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_datos_productos, restriccion );

        etq_id_producto = new JLabel("ID");
        etq_id_producto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 8;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_id_producto, restriccion );

        etq_nombre_producto = new JLabel("NOMBRE");
        etq_nombre_producto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 8;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 70;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_nombre_producto, restriccion );

        etq_cant_producto = new JLabel("CANT.");
        etq_cant_producto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 8;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_cant_producto, restriccion );

        etq_btn_producto = new JLabel();
        restriccion.gridy = 8;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_btn_producto, restriccion );


        input_id_producto = new JTextField();
        input_id_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 9;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_id_producto, restriccion );

        input_nombre_producto = new JTextField();
        input_nombre_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 9;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 70;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_nombre_producto, restriccion );

        input_cant_producto = new JTextField();
        input_cant_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 9;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_cant_producto, restriccion );

        btn_add_producto = new JButton("ADD");
        restriccion.gridy = 9;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( btn_add_producto, restriccion );

        etq_resultado2 = new JPanel();
        scroll = new JScrollPane(etq_resultado2);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        etq_resultado2.setLayout(new GridBagLayout());
        restriccion.gridy = 10;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 89;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 10);
        contPrincipal.add( scroll, restriccion );

        etq_total = new JLabel("Total: $ 0");
        etq_total.setHorizontalAlignment( JLabel.RIGHT );
        etq_total.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_total.setOpaque(true);
        etq_total.setBackground( Color.white );
        etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 11;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 0, 10);
        contPrincipal.add( etq_total, restriccion );
        
        
        JButton btn_atras = new JButton("ATRAS");
        restriccion.gridy = 12;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 0);
        contPrincipal.add(btn_atras, restriccion);
        
        JButton btn_registrar = new JButton("REGISTRAR");
        restriccion.gridy = 12;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 10, 0, 10);
        contPrincipal.add(btn_registrar, restriccion);
        
        this.input_nombres_cliente.setEnabled(false);
        this.input_direccion_cliente.setEnabled(false);
        deshabilitarInput(this.input_nombres_cliente);
        deshabilitarInput(this.input_direccion_cliente);
        deshabilitarInput(this.input_nombres_vendedor);
        deshabilitarInput(this.input_id_producto);
        deshabilitarInput(this.input_nombre_producto);
        deshabilitarInput(this.input_cant_producto);

        add( contPrincipal );
        setResizable(false);
        setVisible(true);
        revalidate();
        repaint();

        ActionListener eventoClickBuscarCliente = new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        buscarCliente();
                }
        };

        KeyListener eventoKeyBuscarCliente = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                String texto = input_cedula_cliente.getText();
                if(texto.equalsIgnoreCase("")){
                    input_nombres_cliente.setText("");
                    input_direccion_cliente.setText("");
                }
                if (e.getKeyCode()==10) {
                    buscarCliente();
                }else{
                        input_nombres_cliente.setText("");
                    input_direccion_cliente.setText("");
                    deshabilitarInput(input_nombres_cliente);
                                        deshabilitarInput(input_direccion_cliente);
                }
            }

            public void keyTyped(KeyEvent e){
            }
        };

        ActionListener eventoClickBuscarVendedor = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    buscarVendedor();
            }
        };

        KeyListener eventoKeyBuscarVendedor = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                String texto = input_cedula_vendedor.getText();
                if(texto.equalsIgnoreCase("")){
                    input_nombres_vendedor.setText("");
                }
                if (e.getKeyCode()==10) {
                    buscarVendedor();
                }else{
                        input_nombres_vendedor.setText("");
                    deshabilitarInput(input_nombres_vendedor);

                    input_id_producto.setText("");
                                        deshabilitarInput(input_id_producto);
                                        input_nombre_producto.setText("");
                                        deshabilitarInput(input_nombre_producto);
                                        input_cant_producto.setText("");
                                        deshabilitarInput(input_cant_producto);
                }
            }

            public void keyTyped(KeyEvent e){
            }
        };

        btn_buscar_cliente.addActionListener( eventoClickBuscarCliente );
        input_cedula_cliente.addKeyListener( eventoKeyBuscarCliente );

        btn_buscar_vendedor.addActionListener( eventoClickBuscarVendedor );
        input_cedula_vendedor.addKeyListener( eventoKeyBuscarVendedor );

        KeyListener eventoKeyBuscarProducto = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                String texto = input_id_producto.getText();
                if(texto.equalsIgnoreCase("")){
                    input_nombre_producto.setText("");
                    input_cant_producto.setText("");
                }

                if (e.getKeyCode()==10) {
                    buscarProducto();
                }else if (e.getKeyCode()==8) {
                        input_nombre_producto.setText("");
                    input_cant_producto.setText("");
                    deshabilitarInput(input_nombre_producto);
                }else if (e.getKeyCode()!=16){
                        input_nombre_producto.setText("");
                    input_cant_producto.setText("");
                    deshabilitarInput(input_nombre_producto);
                    buscarProducto();
                }
            }

            public void keyTyped(KeyEvent e){
            }
        };
        input_id_producto.addKeyListener(eventoKeyBuscarProducto);
        ActionListener eventolclickAgregarProducto = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarProductosFactura();
            }
        };
        btn_add_producto.addActionListener(eventolclickAgregarProducto);
        
        ActionListener eventolclickAgregarFacturaDB = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subirDataBase();
            }
        };
        btn_registrar.addActionListener(eventolclickAgregarFacturaDB);
                
        ActionListener eventoAtras = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaMenu.setVisible(true);
                dispose();
            }
        };
        btn_atras.addActionListener(eventoAtras);
        btn_add_producto.setEnabled(false);
        
        
    }

    public boolean validarNumero(String texto){
        int contador = 0;
        for (int i=0; i<texto.length(); i++) {
                int codigo = (int) texto.charAt(i);
                if ((codigo<48 || codigo>57) && codigo!=44 && codigo!=45 && codigo!=46){
                        return false;
                }
                if (codigo==44 || codigo==46){
                        contador++;
                }
        }
        return (contador<=1);
    }

    public String formatoMoneda(String texto){
        Double numero = Double.parseDouble(texto.replace(",","."));
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return formatoMoneda.format(numero).replaceAll(",00","");
    }

    public void buscarCliente(){
        String texto = input_cedula_cliente.getText();
        boolean encontrado = false;
        Persona temporal = (this.ventanaMenu.database.buscarCliente(texto));
        
        //input_nombres_cliente = new JLabel(listaPersonas[i].getCedula()+" - "+listaPersonas[i].getNombres());
        if(temporal != null){
           input_nombres_cliente.setText(temporal.getNombres()+" "+temporal.getApellidos()); 
           input_direccion_cliente.setText(temporal.getDireccion());
           encontrado = true;
        }else{
           input_nombres_cliente.setText("El cliente no existe...."); 
        }
        if(encontrado){
                deshabilitarInput(this.input_nombres_cliente);
                deshabilitarInput(this.input_direccion_cliente);
                this.input_cedula_vendedor.requestFocus();
        }else{
                /*if (this.validarNumero(texto)) {
                        habilitarInput(this.input_nombres_cliente);
                        habilitarInput(this.input_direccion_cliente);
                        this.input_nombres_cliente.requestFocus();
                }*/
        }	
    }

    public void buscarVendedor(){
        String texto = input_cedula_vendedor.getText();
        boolean encontrado = false;
        Persona temporal = (this.ventanaMenu.database.buscarVendedor(texto));
        
        if (temporal != null) {
            this.input_nombres_vendedor.setText( temporal.getNombres()+" "+temporal.getApellidos());
            encontrado = true;
        }else{
           input_nombres_cliente.setText("El Vendedor no existe...."); 
        }
        

        if(!encontrado){
            this.input_id_producto.setText("");
            deshabilitarInput(this.input_id_producto);
            this.input_nombre_producto.setText("");
            deshabilitarInput(this.input_nombre_producto);
            this.input_cant_producto.setText("");
            deshabilitarInput(this.input_cant_producto);

            this.input_nombres_vendedor.setText("");
            this.input_cedula_vendedor.requestFocus();
        }else{
            this.input_id_producto.setText("");
            habilitarInput(this.input_id_producto);
            this.input_nombre_producto.setText("");
            deshabilitarInput(this.input_nombre_producto);
            this.input_cant_producto.setText("");
            habilitarInput(this.input_cant_producto);

            this.input_id_producto.requestFocus();
        }
    }

    public void buscarProducto(){
        String codigo = input_id_producto.getText();
        boolean encontrado = false;
        int input_id_producto = Integer.valueOf(codigo);
        Producto temporal = this.ventanaMenu.database.buscarProducto(input_id_producto);
        int precio_cargar= temporal.getPrecio();
        String precio = String.valueOf(precio_cargar);
        
        if (temporal != null) {
            this.input_nombre_producto.setText(temporal.getNombre());
            encontrado = true;
        }else{
           input_nombres_cliente.setText("El Vendedor no existe...."); 
        }
        if(!encontrado){
            this.input_nombre_producto.setText("");
            deshabilitarInput(this.input_nombre_producto);
            btn_add_producto.setEnabled(false);
            this.input_cant_producto.setText("");
            this.input_id_producto.requestFocus();
        }else{
            this.input_cant_producto.setText("");
            habilitarInput(this.input_cant_producto);
            this.input_cant_producto.requestFocus();
        }
        
        if(encontrado){
            btn_add_producto.setEnabled(true);
        }
        
    }
    public void agregarProductosFactura(){
        String cant = input_cant_producto.getText();
        int numEntero = Integer.parseInt(cant);
        String id = input_id_producto.getText();
        int validarCant = Integer.valueOf(id);
        Producto temporal = this.ventanaMenu.database.buscarProducto(validarCant);
        int precio_cargar= temporal.getPrecio();
        int total = numEntero * precio_cargar;
        acumTotal += total;
        String acum = String.valueOf(acumTotal);
       
        
        i++;
        if (j==0) {
            JLabel entrada = new JLabel ();
            Font font = new Font("Arial", Font.BOLD, 15);
            entrada.setFont(font);
            restriccion.gridy = 0;
            restriccion.gridx = 0;
            this.etq_resultado2.add(entrada,restriccion);
            System.out.println("01");
        }
        JLabel imprimir = new JLabel ("<html>Id: "+id+" Producto: "+input_nombre_producto.getText()+" Cantidad: "+cant);
        Font font = new Font("Arial", Font.BOLD, 15);    
        imprimir.setFont(font);
        restriccion.gridy = i;
        restriccion.gridx = 0;
        this.etq_resultado2.add(imprimir,restriccion);
        System.out.println("01");

        limpiarProducto();
        this.scroll.revalidate();
            etq_total.setText("Total: "+formatoMoneda(acum));
        j=1;
        
        this.lista_items[this.indice_item] = new Iten_factura(this.id_factura, validarCant, numEntero, total);
        this.indice_item++;
        
    }
    
    public void limpiarProducto(){
        input_id_producto.setText("");
        input_nombre_producto.setText("");
        input_cant_producto.setText("");
        
        input_id_producto.requestFocus();
        
    }
    
    public void subirDataBase(){
        String cedula_cliente = input_cedula_cliente.getText();
        String cedula_vendedor = input_cedula_vendedor.getText();
        LocalDate fechaActual = LocalDate.now();
        String fecha = fechaActual.toString();
        
        boolean proceso = this.ventanaMenu.database.inserFactura(this.id_factura, cedula_cliente, cedula_vendedor, fecha, acumTotal);
        for (int k = 0; k < this.indice_item; k++) {
            this.ventanaMenu.database.insertarItem( this.lista_items[k] );
        }
 
        if(proceso){
            this.ventanaMenu.setVisible(true);
            dispose();
            Alert alerta = new Alert("FACTURA", "la factura fue registrada con exito.", "success");
        }else{
            Alert alerta = new Alert("FACTURA", "la factura No fue registrada con exito.", "error");
        }
        
    }
    
    public void deshabilitarInput(JTextField input){
        input.setEditable(false);
        input.setEnabled(false);
        input.setDisabledTextColor(Color.black);
    }

    public void habilitarInput(JTextField input){
        input.setText("");
        input.setEditable(true);
        input.setEnabled(true);
    }
    
    
    // Atributos
    private Persona listaClientes [];
    private Persona listaVendedores [];
    private Producto listaProductos [];
    private Iten_factura factura_producto[];
    
    private JLabel etq_datos_cliente;
    private JLabel etq_cedula_cliente;
    private JLabel etq_nombres_cliente;
    private JLabel etq_direccion_cliente;
    private JLabel etq_datos_vendedor;
    private JLabel etq_vendedor_cliente;
    private JLabel etq_nombres_vendedor;
    private JLabel etq_datos_productos;
    private JLabel etq_id_producto;
    private JLabel etq_nombre_producto;
    private JLabel etq_cant_producto;
    private JLabel etq_btn_producto;
    private JLabel etq_resultado;
    private JLabel etq_total;
    private JTextField input_cedula_cliente;
    private JTextField input_nombres_cliente;
    private JTextField input_direccion_cliente;
    private JTextField input_cedula_vendedor;
    private JTextField input_nombres_vendedor;
    private JTextField input_id_producto;
    private JTextField input_nombre_producto;
    private JTextField input_cant_producto;
    private JButton btn_buscar_cliente;
    private JButton btn_buscar_vendedor;
    private JButton btn_add_producto;
    private GridBagConstraints restriccion = new GridBagConstraints();
    private JScrollPane scroll;
    private JPanel etq_resultado2;
    Menu ventanaMenu;
}