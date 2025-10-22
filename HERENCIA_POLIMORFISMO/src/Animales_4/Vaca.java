package Animales_4;

public class Vaca extends Animal{

    public Vaca(Tipo categoria, String nombre) {
        super(categoria, nombre);
    }

    @Override
    public String hacerSonido() {
        return "La vaca hace muuuu";
    }

    @Override
    public Tipo describirAnimal() {
        return super.getCategoria();
    }
    
}
