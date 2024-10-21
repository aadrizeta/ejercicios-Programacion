package ejercicio6;

public class Mamifero extends Animal{
    Boolean tienePelo;
    String tipo = "mamifero";

    public Mamifero(String nombre, int edad, boolean tienePelo) {
        super(nombre, edad);
        this.tienePelo = tienePelo;
        this.tipo = "mamifero";
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "tienePelo=" + tienePelo +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "Animal";
    }
}
