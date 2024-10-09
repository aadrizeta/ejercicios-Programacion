package ejercicioInterfaz;

public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono();
        telefono.encender();
        telefono.apagar();
        telefono.cargar();
        telefono.nivelDeBateria(20);
        System.out.println();

        Ordenador ordenador = new Ordenador();
        ordenador.encender();
        ordenador.apagar();
        ordenador.cargar();
        ordenador.nivelDeBateria(80);
    }
}
