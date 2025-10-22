package Vehiculo_1;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    private int getCantidadPuertas() {
        return cantidadPuertas;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nCantidad de puertas: "+getCantidadPuertas());
    }
}
