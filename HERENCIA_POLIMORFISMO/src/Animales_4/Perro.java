package Animales_4;

public class Perro extends Animal {

    public Perro(Tipo categoria, String nombre) {
        super(categoria, nombre);
    }
    

    @Override
    public String hacerSonido() {
        return "El perro hace guau guau";
    }

    @Override
    public Tipo describirAnimal() {
        return super.getCategoria();
    }
    
}
