package Vehiculo_1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[]args){
        ArrayList<Auto> autos = new ArrayList<>();
        
        Auto auto1 = new Auto(4, "Toyota", "Corolla");
        Auto auto2 = new Auto(2, "Ford", "Mustang");
        Auto auto3 = new Auto(5, "Volkswagen", "Tiguan");
        Auto auto4 = new Auto(3, "Fiat", "Punto");
        Auto auto5 = new Auto(4, "Honda", "Civic");
        Auto auto6 = new Auto(2, "Chevrolet", "Camaro");
        
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);
        autos.add(auto6);
        
        for (Auto auto : autos) {
            auto.mostrarInfo();
        }
    }
}
