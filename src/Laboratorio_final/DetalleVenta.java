package Laboratorio_final;

public class DetalleVenta {
    private int idDetalle;
    private int cantidad;
    private double subtotal;
    private Producto producto;

    public DetalleVenta(int id, int cant, Producto prod) {
        this.idDetalle = id;
        this.cantidad = cant;
        this.producto = prod;
        this.subtotal = calcularSubtotal();
    }

    public int getIdDetalle() { return idDetalle; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cant) {
        this.cantidad = cant;
        this.subtotal = calcularSubtotal();
    }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto prod) {
        this.producto = prod;
        this.subtotal = calcularSubtotal();
    }

    public double calcularSubtotal() {
        return cantidad * producto.getPrecioVenta();
    }

    public double getSubtotal() { return subtotal; }

    @Override
    public String toString() {
        return "DetalleVenta{id=" + idDetalle + ", producto=" + producto.getNombre() +
               ", cantidad=" + cantidad + ", subtotal=" + subtotal + "}";
    }
}