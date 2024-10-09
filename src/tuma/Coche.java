package tuma;

public class Coche extends Vehiculo  {

    private double capacidadCombustible;
    public Coche(String marca, int velocidadMaxima, double capacidadCombustible) {
        super(marca, velocidadMaxima);
        this.capacidadCombustible = capacidadCombustible;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidad máxima: " + getVelocidadMaxima());
        System.out.println("Capacidad de combustible: " + capacidadCombustible + " litros");
    }

    public void acelerar(){
        System.out.println("El coche está acelerando... Brum Brum");
    }
}
