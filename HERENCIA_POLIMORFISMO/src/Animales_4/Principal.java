package Animales_4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[]args){
        ArrayList<Animal> animales = new ArrayList<>();
        // Gato
        Gato gato1 = new Gato(Tipo.MASCOTA, "Naranjoso");

        // Perro
        Perro perro1 = new Perro(Tipo.MASCOTA, "Preto");

        // Vaca
        Vaca vaca1 = new Vaca(Tipo.GRANJA, "Lola");

        animales.add(gato1);
        animales.add(perro1);
        animales.add(vaca1);
        
        for (Animal animal : animales) {
            System.out.println(animal.getNombre());
            System.out.println(animal.describirAnimal());
            System.out.println(animal.hacerSonido());
            System.out.println("------------------------------");
        }
    }
}
