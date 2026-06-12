package Laboratorio_final;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String cargo;
    private String direccion;
    private String fechaIngreso;
    private String horarioEntrada;
    private String horarioSalida;

    public Empleado(int id, String nombre, String cargo) {
        this.idEmpleado = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int id) { this.idEmpleado = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String dir) { this.direccion = dir; }
    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fecha) { this.fechaIngreso = fecha; }
    public String getHorarioEntrada() { return horarioEntrada; }
    public void setHorarioEntrada(String horario) { this.horarioEntrada = horario; }
    public String getHorarioSalida() { return horarioSalida; }
    public void setHorarioSalida(String horario) { this.horarioSalida = horario; }

    @Override
    public String toString() {
        return String.format(
            "--- EMPLEADO ---%n" +
            "ID:              %d%n" +
            "Nombre:          %s%n" +
            "Cargo:           %s%n" +
            "Horario entrada: %s%n" +
            "Horario salida:  %s",
            idEmpleado, nombre, cargo,
            horarioEntrada != null ? horarioEntrada : "N/A",
            horarioSalida != null ? horarioSalida : "N/A"
        );
    }
}

