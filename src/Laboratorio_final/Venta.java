package Laboratorio_final;
import java.util.ArrayList;

public class Venta {
    private int idVenta;
    private String fecha;
    private double total;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<DetalleVenta> detalles;

    public Venta(int id, String fecha, Cliente cli, Empleado emp) {
        this.idVenta = id;
        this.fecha = fecha;
        this.cliente = cli;
        this.empleado = emp;
        this.detalles = new ArrayList<>();
    }

    public int getIdVenta() { return idVenta; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cli) { this.cliente = cli; }
    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado emp) { this.empleado = emp; }

    public void agregarDetalle(DetalleVenta det) {
        detalles.add(det);
        this.setTotal(calcularTotal());
    }

    public double calcularTotal() {
        double suma = 0;
        for (DetalleVenta d : detalles) {
            suma += d.getSubtotal();
        }
        return suma;
    }

    public ArrayList<DetalleVenta> getDetalles() { return detalles; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("========================================\n");
        sb.append("            TICKET DE VENTA             \n");
        sb.append("========================================\n");
        sb.append(String.format("Venta #:   %d%n", idVenta));
        sb.append(String.format("Fecha:     %s%n", fecha));
        sb.append(String.format("Cliente:   %s%n", cliente.getNombre()));
        sb.append(String.format("Empleado:  %s%n", empleado.getNombre()));
        sb.append("\n--- DETALLE DE PRODUCTOS ---\n");
        sb.append(String.format("  %-3s %-18s %-4s   %8s   %8s%n", "#", "Producto", "Cant", "P.Unit", "Subtotal"));
        for (DetalleVenta d : detalles) {
            sb.append("  ").append(d.toString()).append("\n");
        }
        sb.append("----------------------------------------\n");
        sb.append(String.format("TOTAL A PAGAR:                    %8s%n", String.format("$%.2f", calcularTotal())));
        sb.append("========================================");
        return sb.toString();
    }

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}