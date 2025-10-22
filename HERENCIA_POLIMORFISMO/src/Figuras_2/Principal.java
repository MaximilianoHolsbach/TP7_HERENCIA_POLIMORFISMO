package Figuras_2;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Rectángulos
        Rectangulo r1 = new Rectangulo("Rectángulo A", 5.0, 3.0);
        Rectangulo r2 = new Rectangulo("Rectángulo B", 8.5, 2.5);
        Rectangulo r3 = new Rectangulo("Rectángulo C", 4.0, 6.0);

        // Círculos
        Circulo c1 = new Circulo("Círculo X", 2.0);
        Circulo c2 = new Circulo("Círculo Y", 4.5);
        Circulo c3 = new Circulo("Círculo Z", 3.2);
        
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(r3);
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(c3);
        
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre()+": "+figura.calcularArea());
        }
    }
    
}
