package Animales_4;

public abstract class Animal {
    private final Tipo categoria;
    private String nombre;
    public Animal(Tipo categoria, String nombre) {
        this.categoria = categoria;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public Tipo getCategoria() {
        return categoria;
    }
    public abstract String hacerSonido();
    public abstract Tipo describirAnimal();
}
