public class Persona1{

    String nombre  ;
    String apellido  ;
    String direccion ;
    int cedula = 0;
    String telefono  ;

    public Persona1(String nombre, String apellido, String direccion, int cedula, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public int getCedula(){
        return this.cedula;
    }
    public String getTelefono(){
        return this.telefono;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void mostrarDatosPersonales(){
        System.out.println("--------------------------------------------");
        System.out.println("---------------Datos Persona----------------");
        System.out.println("--------------------------------------------");
        System.out.println("| Nombre: " + this.nombre);
        System.out.println("| Apellidos: " + this.apellido);
        System.out.println("| Direccion: " + this.direccion);
        System.out.println("| Cedula: " + this.cedula);
        System.out.println("| Telefono: " + this.telefono);
        System.out.println("--------------------------------------------");
    }
    public void resumenInformacion(){
        System.out.print("| Nombre: " + this.nombre + " -> ");
        System.out.print(" Apellidos: " + this.apellido + " -> ");
        System.out.println(" Cedula: " + this.cedula + " | ");
    }
}
 

 