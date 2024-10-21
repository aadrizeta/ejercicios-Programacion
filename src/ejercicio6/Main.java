package ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "src/ejercicio6/animales.ser";
        Zoologico zoologico = new Zoologico();
        System.out.println("Sistema del zoologico");
        boolean salir = false;
        while (!salir) {
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Añadir animal");
            System.out.println("2. Añadir cuidador");
            System.out.println("3. Escribir archivo");
            System.out.println("4. Leer archivo");
            System.out.println("5. Salir");
            int respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    zoologico.agregarAnimal();
                    break;
                case 2:
                    zoologico.agregarCuidador();
                    break;
                case 3:
                    zoologico.escribir(zoologico.getAnimalesCuidadores(), ruta);
                case 4:
                    zoologico.leer(ruta);
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }
            zoologico.escribir(zoologico.getAnimalesCuidadores(), ruta);
            zoologico.leer(ruta);
        }

    }
}
