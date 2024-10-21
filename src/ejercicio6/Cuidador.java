package ejercicio6;

public class Cuidador implements Gestionable{

    String nombre;

    public Cuidador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "Cuidador";
    }
}
