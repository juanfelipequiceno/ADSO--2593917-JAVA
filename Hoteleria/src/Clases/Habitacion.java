
package Clases;


public class Habitacion {
    
    private String numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private String precio;
    private String estado;
    
    public Habitacion(String numero, String piso, String descripcion, String caracteristicas, String precio, String estado) {
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
        this.estado = estado;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }
    
  
}
