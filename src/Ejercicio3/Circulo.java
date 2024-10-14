package Ejercicio3;

public class Circulo extends Figura  {
    public int radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "Circulo con color " + color + ", y radio " + radio;
    }
}
