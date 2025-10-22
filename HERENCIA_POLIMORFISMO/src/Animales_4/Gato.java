package Animales_4;

public class Gato extends Animal {

    public Gato(Tipo categoria, String nombre) {
        super(categoria, nombre);
    }
    
    @Override
    public String hacerSonido() {
        return "El gato hace miau miau";
    }

    @Override
    public Tipo describirAnimal() {
        return super.getCategoria();
    }
    
}
