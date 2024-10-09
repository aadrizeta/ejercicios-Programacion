package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

        ArrayList<Smartphone> smartphones = new ArrayList<>();
        ArrayList<Tablet>tablets = new ArrayList<>();

        String rutaArchivo = "src/ejercicio2/mis-dispositivos.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {

            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] datos = line.split(",");
                String tipo = datos[0].toLowerCase();
                String marca = datos[1];

                if (tipo.equalsIgnoreCase("smartphone")) {
                    Smartphone smartphone = new Smartphone("Apagado", marca);
                    smartphones.add(smartphone);
                } else if (tipo.equalsIgnoreCase("tablet")){
                    Tablet tablet = new Tablet("Apagado", marca);
                    tablets.add(tablet);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nSmartphones:");
        for (Smartphone smartphone : smartphones) {
            smartphone.mostrarInfo();
        }

        System.out.println("\nTablets:");
        for (Tablet tablet : tablets) {
            tablet.mostrarInfo();
        }

        sc.close();
    }
}
