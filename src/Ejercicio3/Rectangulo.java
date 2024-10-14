package Ejercicio3;

public class Rectangulo extends Figura  {
    public int base;
    public int altura;

    public Rectangulo(String color, int altura, int base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }
    @Override
    public String toString() {
        return "Rectangulo con color " + color + ", base " + base + " y altura " + altura;
    }
}
