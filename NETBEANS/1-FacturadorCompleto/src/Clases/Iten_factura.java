
package Clases;


public class Iten_factura {
         private int id_factura;
        private int id_producto;
        private int cantidad;
        private int subtotal;
        
    public Iten_factura(int id_factura, int id_producto, int cantidad, int subtotal) {
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getId_factura() {
        return id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }
   
}
