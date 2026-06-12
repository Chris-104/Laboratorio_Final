package Laboratorio_final;

public class Main {
    public static void main(String[] args) {

        // Crear categorias
        Categoria cat1 = new Categoria(1, "Electronicos");
        Categoria cat2 = new Categoria(2, "Alimentos");

        // Crear productos
        Producto p1 = new Producto(1, "Laptop", 500.00, 750.00, cat1);
        Producto p2 = new Producto(2, "Pan", 0.50, 1.00, cat2);
        Producto p3 = new Producto(3, "Auriculares", 20.00, 45.00, cat1);

        // Crear cliente y empleado
        Cliente cliente1 = new Cliente(1, "Juan Perez", "7777-1234");
        cliente1.setDireccion("Calle Principal #5, San Salvador");

        Empleado empleado1 = new Empleado(1, "Maria Lopez", "Cajera");
        empleado1.setHorarioEntrada("08:00");
        empleado1.setHorarioSalida("17:00");

        // Crear venta
        Venta venta1 = new Venta(1, "2026-06-12", cliente1, empleado1);

        // Agregar detalles
        DetalleVenta det1 = new DetalleVenta(1, 1, p1);
        DetalleVenta det2 = new DetalleVenta(2, 3, p2);
        DetalleVenta det3 = new DetalleVenta(3, 2, p3);

        venta1.agregarDetalle(det1);
        venta1.agregarDetalle(det2);
        venta1.agregarDetalle(det3);

        // Mostrar resultados
        System.out.println("===== SISTEMA DE VENTAS =====");
        System.out.println(cliente1);
        System.out.println(empleado1);
        System.out.println();
        System.out.println("===== DETALLE DE VENTA =====");
        System.out.println(venta1);
        System.out.println();
        for (DetalleVenta d : venta1.getDetalles()) {
            System.out.println("  -> " + d);
        }
        System.out.println();
        System.out.printf("TOTAL A PAGAR: $%.2f%n", venta1.calcularTotal());
    }
}