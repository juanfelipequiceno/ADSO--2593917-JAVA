
package Principal;

import java.sql.*;

public class RegistroUsusarioBD {
    public static void main(String[] args) {
        
        Connection conexion;
        Statement manipularBD;

        String hostname = "localhost";
        String puerto = "3306";
        String datebase_name = "app_java";
        String datebase_user = "root";
        String datebase_password = "";

        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+datebase_name;

            try{
                conexion = DriverManager.getConnection(url, datebase_user, datebase_password);
                manipularBD = conexion.createStatement();
                System.out.println("Conexion Exitosa a Base de Datos "+datebase_name);
            } catch (SQLException e) {
                System.out.println("Mensaje de error: " + e.getMessage());
                conexion = null;
                manipularBD = null;
            }
        }
    
        if( conexion != null){
            try{
                  //extrayanedo de la base de datos
              String consulta = "SELECT * FROM  persona";
              ResultSet registro = manipularBD.executeQuery(consulta);
              registro.next();
              if(registro.getRow() == 1){
                  do{
                      System.out.println("--------------------------------------------------");
                      System.out.println("FILA "+registro.getRow());
                      System.out.println("Cedula : "+ registro.getString("cedula")); 
                      System.out.println("Nombre : "+ registro.getString("nombres")); 
                      System.out.println("Apellido : "+ registro.getString("apellidos")); 
                      System.out.println("Telefono : "+ registro.getString("telefono")); 
                      System.out.println("Direccion : "+ registro.getString("direccion")); 
                      System.out.println("Correo : "+ registro.getString("email")); 
                      System.out.println("--------------------------------------------------");
                      
                  }while (registro.next() );                      
              }else{
                  System.out.println("NO HAY PERSONA REGISTRADA");
              }
            }catch(SQLException e){
               System.out.println("Mensaje de error: " + e.getMessage());
            }
        }
        
    String cedula = "1225";
    String nombre = "felipe";
    String apellido = "quiceno";
    String telefono = "313737";
    String direccion = "gudalclaml";
    String correo = "felipe@gmail.com";

    String consulta = "INSERT INTO personas(cedula, nombres, apellidos, telefono, direccion, email ) VALUES ('"+cedula+"','"+nombre+"','"+apellido+"','"+telefono+"','"+direccion+"','"+correo+"')";

    try{
        int respuesta = manipularBD.executeUpdate(consulta);
    }catch(SQLException e){
            System.out.println("ERROR al insertar: "+e.getMessage());
    }
        
}