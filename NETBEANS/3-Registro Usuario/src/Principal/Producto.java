
package Principal;


public class Producto {
    private String  id;
    private String  nombre; 
    private String  valor;
    private String  cantidad; 

    public Producto(String id, String nombre, String valor, String cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }

    public String getCantidad() {
        return cantidad;
    }
}

