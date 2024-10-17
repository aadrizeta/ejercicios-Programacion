package ejercicio5;
import Ejercicio3.FileManager;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado("Juan", 26, 1500);
        Empleado empleado2 = new Empleado("Maria", 30, 2000);
        empleados.add(empleado1);
        empleados.add(empleado2);

        System.out.println("Introduzca la opción deseada: ");
        System.out.println("1. Añadir un nevo empleado");
        System.out.println("2. Serializar la lista de empleados");
        System.out.println("3. Mostrar la lista de empleados");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduzca el nombre del empleado: ");
                String nombre = sc.next();
                System.out.println("Introduzca la edad del empleado: ");
                int edad = sc.nextInt();
                System.out.println("Introduzca el sueldo del empleado: ");
                int sueldo = sc.nextInt();
                Empleado empleado = new Empleado(nombre, edad, sueldo);
                empleados.add(empleado);
                break;
            case 2:
                escribirArchivo(empleados);
                System.out.println("Los datos se han serializado correctamente.");
                break;
            case 3:
                leerArchivo();
                break;
            default:
                System.out.println("Opción no válida.");
        }

    }
    public  static void escribirArchivo(ArrayList<Empleado> empleados){
        try (FileOutputStream fos = new FileOutputStream("src/ejercicio5/empleados.ser");
         ObjectOutputStream salida = new ObjectOutputStream(fos)) {
            salida.writeObject(empleados);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void leerArchivo(){
        try (FileInputStream fis = new FileInputStream("src/ejercicio5/empleados.ser");
         ObjectInputStream entrada = new ObjectInputStream(fis)) {
            System.out.println(entrada.readObject().toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
