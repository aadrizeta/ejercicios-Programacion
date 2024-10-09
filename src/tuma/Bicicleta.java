package tuma;

public class Bicicleta extends Vehiculo  {

    private String tipoBicleta;
    public Bicicleta(String marca, int velocidadMaxima, String tipoBicleta) {
        super(marca, velocidadMaxima);
        this.tipoBicleta = tipoBicleta;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidad máxima: " + getVelocidadMaxima());
        System.out.println("Tipo de bicicleta: " + tipoBicleta);
    }

    public void acelerar(){
        System.out.println("La bicicleta está acelerando...");
    }
}
