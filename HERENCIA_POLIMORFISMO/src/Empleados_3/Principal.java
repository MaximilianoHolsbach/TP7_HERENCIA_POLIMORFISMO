package Empleados_3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[]args){
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Ana", 120000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 1500));
        empleados.add(new EmpleadoPlanta("Carlos", 95000));
        empleados.add(new EmpleadoTemporal("Sofía", 60, 1800));
        
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: "+empleado.getNombre());
            System.out.println("Sueldo: $"+empleado.calcularSueldo());
            if(empleado instanceof EmpleadoPlanta){
                System.out.println("Tipo: Planta");
            }else{
                System.out.println("Tipo: Temporal");
            }
            System.out.println("---------------------------------------");
        }

    }
}
