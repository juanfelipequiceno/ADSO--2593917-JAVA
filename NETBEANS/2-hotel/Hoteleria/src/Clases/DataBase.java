
package Clases;

import java.sql.*;

public class DataBase {
    Statement manipularDB;
    
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "hoteldb";
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
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("email") );
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
    
    public Vendedor[] listaVendedor(){
        Vendedor [] listaVendedor = new Vendedor [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedor");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Vendedor temp = new Vendedor(registros.getString("cedula"),registros.getString("nombre"), registros.getString("apellido"), registros.getString("telefono"), registros.getString("correo"), registros.getString("password"));
                    listaVendedor[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaVendedor;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaVendedor;
        }
    }
    
    public Habitacion[] listaHabitacion(){
        Habitacion [] listaHabitacion = new Habitacion [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM habitacion");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Habitacion temp = new Habitacion(registros.getString("numero"),registros.getString("piso"), registros.getString("descripcion"), registros.getString("caracteristicas"), registros.getString("precio"), registros.getString("estado"));
                    listaHabitacion[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaHabitacion;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaHabitacion;
        }
    }
    
    public ReservaHabitacion[] listareserReservaHabitaciones(){
        ReservaHabitacion[] listareserReservaHabitacions = new ReservaHabitacion [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM reservahabitacion");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    ReservaHabitacion temp = new ReservaHabitacion(registros.getString("numerohabitacion"),registros.getString("cliente"), registros.getString("trabajador"), registros.getString("tiporeserva"),  registros.getString("fechaingreso"),registros.getString("fechasalida"),registros.getString("precio"),registros.getString("estadoreserva"),registros.getString("por"),registros.getString("dias"),registros.getString("total"));
                    listareserReservaHabitacions[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listareserReservaHabitacions;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listareserReservaHabitacions;
        }
    }
    
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Vendedor buscarVendedor(String cedula){
        Vendedor temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedor WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Vendedor( registros.getString("cedula"),registros.getString("nombre"), registros.getString("apellido"), registros.getString("telefono"), registros.getString("correo"), registros.getString("password"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Habitacion buscarHabitacion(String numero){
        Habitacion temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM habitacion WHERE numero='"+numero+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Habitacion( registros.getString("numero"),registros.getString("piso"), registros.getString("descripcion"), registros.getString("caracteristicas"), registros.getString("precio"), registros.getString("estado"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    
    public boolean insertarCliente(String cedula, String nombres, String apellidos, String telefono,  String email){
        String consulta = "INSERT INTO clientes(cedula, nombres, apellidos, telefono, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+email+"') ";    
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
    
    public boolean insertarVendedor(String cedula, String nombres, String apellidos, String telefono,  String email, String password){
        String consulta = "INSERT INTO vendedor(cedula, nombre, apellido, telefono, correo, password) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+email+"','"+password+"') ";    
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
    
    public boolean insertarHabitacion(String numero, String piso, String descripcion, String caracteristicas,  String precio, String estado){
       String consulta = "INSERT INTO habitacion(numero, piso, descripcion, caracteristicas, precio, estado) VALUES ('"+numero+"','"+piso+"','"+descripcion+"','"+caracteristicas+"','"+precio+"','"+estado+"') ";    
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
    
    public boolean reservaHabitacion(String numeroHabitacion, String cliente, String trabajador, String tipoReserva, String fechaIngreso, String fechaSalida, String precio,String estadoReserva,String por, int diaSemana,int total ){
        String consulta = "INSERT INTO reservahabitacion(numerohabitacion, cliente, trabajador, tiporeserva, fechaingreso, fechasalida, precio, estadoreserva,  por, dias, total) VALUES ('"+numeroHabitacion+"','"+cliente+"','"+trabajador+"','"+tipoReserva+"','"+fechaIngreso+"','"+fechaSalida+"','"+precio+"','"+estadoReserva+"','"+por+"','"+diaSemana+"','"+total+"') ";    
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
    
    public boolean editarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE clientes SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarVendedor(Vendedor vendedor){
        boolean respuesta = false;
        String cedula = vendedor.getCedula();
        String nombres = vendedor.getNombres();
        String apellidos = vendedor.getApellidos();
        String telefono = vendedor.getTelefono();
        String email = vendedor.getEmail();
        
        try {
            String consulta = "UPDATE vendedor SET nombre='"+nombres+"', apellido='"+apellidos+"', telefono='"+telefono+"', correo='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarContraseña(Vendedor vendedor , String contraseña){
        boolean respuesta = false;
        String cedula = vendedor.getCedula();
        
        try {
            String consulta = "UPDATE vendedor SET password='"+contraseña+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarHabitacion(Habitacion habitacion){
        boolean respuesta = false;
        String numero = habitacion.getNumero();
        String piso = habitacion.getPiso();
        String descripcion = habitacion.getDescripcion();
        String caracteristicas = habitacion.getCaracteristicas();
        String precio = habitacion.getPrecio();
        String estado = habitacion.getEstado();
        
        try {
            String consulta = "UPDATE habitacion SET  piso='"+piso+"', descripcion='"+descripcion+"', caracteristicas='"+caracteristicas+"', precio='"+precio+"', estado='"+estado+"'  WHERE numero='"+numero+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarEstadoHabitacion(Habitacion habitacion){
        boolean respuesta = false;
        String numero = habitacion.getNumero();
        String estado = habitacion.getEstado();
        
        if (estado.equals("Activo")) {
            estado = "Inactivo";
        } else {
            estado = "Activo";
        }
        
        try {
            String consulta = "UPDATE habitacion SET  estado='"+estado+"'  WHERE numero='"+numero+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarEstadoFactura(ReservaHabitacion habitacion, int numero){
        boolean respuesta = false;
        numero = numero + 1;
        String numero2 = numero+"";
        String estado = habitacion.getEstadoReserva();
       
        if (estado.equals("Pagada")) {
            estado = "Pendiente";
        } else {
            estado = "Pagada";
        }
        
        try {
            String consulta = "UPDATE reservahabitacion SET  estadoreserva='"+estado+"'  WHERE id='"+numero2+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
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
            
            String consulta = "DELETE FROM vendedor WHERE cedula ='"+cedula+"' ";
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
    
    public boolean deleteHabitacion(String numero){
       
        boolean respuesta = false;
        
        try {
            String  documento = numero;
            
            String consulta = "DELETE FROM habitacion WHERE numero ='"+numero+"' ";
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
    
}
