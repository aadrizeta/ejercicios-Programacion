package ejercicio6;

public class Main {

    public static void main(String[] args) {
        String ruta = "src/ejercicio6/animales.ser";
        Zoologico zoologico = new Zoologico();
        System.out.println("Sistema del zoologico");
        System.out.println("Selecciona una opcion:");
        System.out.println("1. Añadir animal");
        System.out.println("2. Serializar animales");

        zoologico.AgregarAnimal();

        zoologico.escribir(zoologico.getAnimales(), ruta);
        zoologico.leer(ruta);
    }
}
