package EjercicioExamen1;

public class Main {
    public static void main(String[] args) {

        GestorInventario gestorInventario = new GestorInventario();

        gestorInventario.leerArchivoInventario("src/EjercicioExamen1/inventario.txt");
    }
}
