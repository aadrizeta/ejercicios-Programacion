package ejercicio6;

public class Ave extends Animal{
    boolean puedeVolar;
    String tipo = "Ave";
    public Ave(String nombre, int edad, boolean puedeVolar) {
        super(nombre, edad);
        this.puedeVolar = puedeVolar;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "puedeVolar=" + puedeVolar +
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
