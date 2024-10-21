package ejercicio6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    
    private ArrayList<Animal> animales;

    public Zoologico(){
        animales = new ArrayList<>();
    }
    
    public void agregarMamifero(String nombre, int edad, boolean tienePelo){
        Mamifero mamifero = new Mamifero(nombre, edad, tienePelo);
        animales.add(mamifero);
    }
    
    public void agregarAve(String nombre, int edad, boolean puedeVolar){

        Ave ave = new Ave(nombre, edad, puedeVolar);
        animales.add(ave);
    }
    
    public void AgregarAnimal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tipo de Animal (Ave/Mamifero): ");
        String tipo = sc.next().toLowerCase();
        
        if (tipo == null){
            System.out.println("El tipo de animal es obligatorio.");
        } else {
            if (tipo.equals("mamifero")){
                
                System.out.println("Introduzca uno a uno los datos del animal");
                
                System.out.println("Nombre del animal: ");
                String nombre = sc.next().toLowerCase();
                
                System.out.println("Edad del animal: ");
                int edad = sc.nextInt();
                
                boolean tienePelo;
                System.out.println("Tiene pelo? (S/N): ");
                String resBoolean = sc.next().toLowerCase();
                if (resBoolean.equals("s")){
                    tienePelo = true;
                } else if (resBoolean.equals("n")) {
                    tienePelo = false;
                } else {
                    System.out.println("Respuesta incorrecta. Debe introducir S o N.");
                    return;
                }
                agregarMamifero( nombre, edad, tienePelo);
            } else if (tipo.equals("ave")) {
                
                System.out.println("Introduzca uno a uno los datos del animal");
                
                System.out.println("Nombre del animal: ");
                String nombre = sc.next().toLowerCase();
                
                System.out.println("Edad del animal: ");
                int edad = sc.nextInt();
                
                boolean puedeVolar = false;
                System.out.println("Puede volar? (S/N): ");
                String resBoolean = sc.next().toLowerCase();
                if (resBoolean.equals("s")){
                     puedeVolar = true;
                } else if (resBoolean.equals("n")) {
                     puedeVolar = false;
                }
                agregarAve(nombre, edad, puedeVolar);
            } else {
                System.out.println("El tipo de animal introducido no es válido. Debe ser Ave o Mamifero.");
            }
        }
    }
    public ArrayList getAnimales(){
        return animales;
    }
    public void escribir(ArrayList<Animal>animales, String ruta){
        try (FileOutputStream fos = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(animales);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void leer(String ruta){
        try (FileInputStream fis = new FileInputStream(ruta);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            System.out.println(ois.readObject().toString());

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
