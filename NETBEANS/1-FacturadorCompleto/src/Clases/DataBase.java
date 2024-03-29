package Clases;

import java.sql.*;

public class DataBase {
    
    Statement manipularDB;
    
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "almacenes";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }
    
    public Persona[] listaClientes(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Persona[] listaVendedores(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Persona buscarVendedor(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public boolean editarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE clientes SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarVendedor(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE vendedores SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean insertarCliente(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO clientes(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean insertarVendedor(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO vendedores(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean deleteClientes(String cedula){
       
        boolean respuesta = false;
        
        try {
            String  documento = cedula;
            
            String consulta = "DELETE FROM clientes WHERE cedula ='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error Delete: "+ e.getMessage());
        }
        if(respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
        
    }
    public boolean deleteVendedor(String cedula){
       
        boolean respuesta = false;
        
        try {
            String  documento = cedula;
            
            String consulta = "DELETE FROM vendedores WHERE cedula ='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error Delete: "+ e.getMessage());
        }
        if(respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
        
    }
     
    public boolean inserProducto(int id, String nombre, int precio){
          boolean respuesta = false;
            try {
                String consulta = "INSERT INTO productos(id, nombre, precio) VALUES ('"+id+"','"+nombre+"','"+precio+"')";
                int resp_consulta = manipularDB.executeUpdate(consulta);
                if (resp_consulta>0) {
                    respuesta = true;
                }
            } catch (SQLException ex) {
                System.out.println("--> Error Insert: " + ex.getMessage());
            }
            if (respuesta){
                System.out.println("Insertado con exito");
            }else{
                System.out.println("No se pudo insertar");
            }
        return respuesta;
     }
    
    public Producto buscarProducto(int id){
        Producto temp = null;
        
        try {
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos WHERE id='"+id+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Producto(registros.getInt("id"), registros.getString("nombre"), registros.getInt("precio"));
            }
            return temp;
        } catch (SQLException e) {
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
          
    }
    
    public boolean editarProducto(Producto producto){
        boolean respuesta = false;
        int id = producto.getId();
        String nombre = producto.getNombre();
        int precio = producto.getPrecio();
       
        
        try {
            String consulta = "UPDATE productos SET nombre='"+nombre+"', precio='"+precio+"' WHERE id='"+id+"' ";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean deleteProductos(int id){
        boolean respuesta = false;
        
        try {
            int codigo = id;
            
            String consulta = "DELETE FROM productos WHERE id='"+codigo+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error Delete: "+ e.getMessage());
        }
        if(respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
        
    }
    
    public Producto[] listaProducto(){
        Producto [] listaProductos = new Producto [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Producto temp = new Producto(registros.getInt("id"),registros.getString("nombre"), registros.getInt("precio"));
                    listaProductos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaProductos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaProductos;
        }
    }
    public boolean inserFactura(int id, String cedula_cliente, String cedula_vendedor,String fecha , int total){
          boolean respuesta = false;
            try {
                String consulta = "INSERT INTO facturas(id, cedula_cliente,cedula_vendedor,fecha,total) VALUES ('"+id+"','"+cedula_cliente+"','"+cedula_vendedor+"','"+fecha+"','"+total+"')";
                int resp_consulta = manipularDB.executeUpdate(consulta);
                if (resp_consulta>0) {
                    respuesta = true;
                }
            } catch (SQLException ex) {
                System.out.println("--> Error Insert: " + ex.getMessage());
            }
            if (respuesta){
                System.out.println("Insertado con exito");
            }else{
                System.out.println("No se pudo insertar");
            }
        return respuesta;
     }
    
     public int generarIdFactura(){
        int temp = 1;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM facturas ORDER BY id DESC");
            registros.next();
            if (registros.getRow()==1) {
                temp = registros.getInt("id")+1;
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public boolean insertarItem (Iten_factura item){
        boolean respuesta = false;
            try {
                String consulta = "INSERT INTO items_factura(id_factura,id_producto,cantidad,subtotal) VALUES ('"+item.getId_factura()+"','"+item.getId_producto()+"','"+item.getCantidad()+"','"+item.getSubtotal()+"')";
                int resp_consulta = manipularDB.executeUpdate(consulta);
                if (resp_consulta>0) {
                    respuesta = true;
                }
            } catch (SQLException ex) {
                System.out.println("--> Error Insert: " + ex.getMessage());
            }
            if (respuesta){
                System.out.println("Insertado con exito");
            }else{
                System.out.println("No se pudo insertar");
            }
        return respuesta;
    }
    
}
