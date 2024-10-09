package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Smartphone smartphone1 = new Smartphone("Apagado", "");

        System.out.println("Introduzca la marca del dispositivo (Smartphone): ");
        String marcaSmartphone1 = sc.nextLine();

        smartphone1.setMarca(marcaSmartphone1);
        smartphone1.encender();
        smartphone1.mostrarInfo();
        smartphone1.conectarWifi();
        smartphone1.desconectarWifi();

        Tablet tablet1 = new Tablet("Encendido", "");

        System.out.println("Introduzca la marca del dispositivo (Tablet): ");
        String marcaTablet1 = sc.nextLine();

        tablet1.setMarca(marcaTablet1);
        tablet1.encender();
        tablet1.mostrarInfo();
        tablet1.conectarWifi();
        tablet1.desconectarWifi();

        sc.close();
    }
}
