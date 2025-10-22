package Empleados_3;

public class EmpleadoTemporal extends Empleado {
    private int hsTrabajadas;
    private double valorHs;
    public EmpleadoTemporal(String nombre, int hsTrabajadas, double valorHs) {
        super(nombre);
        this.hsTrabajadas = hsTrabajadas;
        this.valorHs = valorHs;
    }
    @Override
    public double calcularSueldo() {
        return this.hsTrabajadas * this.valorHs;
    }
}
