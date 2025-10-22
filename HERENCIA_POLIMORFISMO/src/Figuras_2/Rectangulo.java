package Figuras_2;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
    
}
