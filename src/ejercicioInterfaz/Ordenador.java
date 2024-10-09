package ejercicioInterfaz;

public class Ordenador implements Conectable, Recargable {

    public Ordenador() {
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el ordenador...");
    }
    @Override
    public void apagar() {
        System.out.println("Apagando el ordenador...");
    }

    @Override
    public void cargar() {
        System.out.println("Cargando el ordenador...");
    }

    @Override
    public void nivelDeBateria(int porcentaje) {
        System.out.println("Nivel de bateria del ordenador: " + porcentaje + "%");
    }
}
