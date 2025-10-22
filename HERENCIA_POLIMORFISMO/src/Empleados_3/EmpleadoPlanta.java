package Empleados_3;

public class EmpleadoPlanta extends Empleado {
    private double sueldobase;

    public EmpleadoPlanta(String nombre, double sueldobase) {
        super(nombre);
        this.sueldobase = sueldobase;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldobase;
    }
}
