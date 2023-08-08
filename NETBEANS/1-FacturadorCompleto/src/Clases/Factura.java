
package Clases;

  

public class Factura {
    
    private int id;
    private String cedula_cliente;
    private String cedula_vendedor;
    private String fecha;
    private int total;

    public Factura(int id, String cedula_cliente, String cedula_vendedor, String fecha, int total) {
        this.id = id;
        this.cedula_cliente = cedula_cliente;
        this.cedula_vendedor = cedula_vendedor;
        this.fecha = fecha;
        this.total = total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public void setCedula_vendedor(String cedula_vendedor) {
        this.cedula_vendedor = cedula_vendedor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getCedula_cliente() {
        return cedula_cliente;
    }

    public String getCedula_vendedor() {
        return cedula_vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public int getTotal() {
        return total;
    }

}
