package Ejercicio3;

public class Cuadrado extends Figura {
    public int lado;

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }
    @Override
    public String toString() {
        return "Cuadrado con color " + color + " y lado " + lado;
    }
}
