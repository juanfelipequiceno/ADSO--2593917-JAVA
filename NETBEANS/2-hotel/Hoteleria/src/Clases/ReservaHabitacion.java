
package Clases;


public class ReservaHabitacion {
    
    private String id; 
    private String numeroHabitacion;
    private String cliente;
    private String trabajador;
    private String tipoReserva;
    private String fechaIngreso;
    private String fechaSalida ;
    private String precio;
    private String estadoReserva;
    private String por;
    private String diaSemana;
    private String total;

    public ReservaHabitacion(String numeroHabitacion, String cliente, String trabajador, String tipoReserva, String fechaIngreso, String fechaSalida, String precio, String estadoReserva, String por, String diaSemana, String total) {
        this.numeroHabitacion = numeroHabitacion;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.tipoReserva = tipoReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
        this.estadoReserva = estadoReserva;
        this.por = por;
        this.diaSemana = diaSemana;
        this.total = total;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public void setPor(String por) {
        this.por = por;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    public void setid(String id) {
        this.id = id;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getCliente() {
        return cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getPrecio() {
        return precio;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public String getPor() {
        return por;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getTotal() {
        return total;
    }
    
    public String getid() {
        return id;
    }
  
}
    
