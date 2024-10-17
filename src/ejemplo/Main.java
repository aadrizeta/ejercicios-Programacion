package ejemplo;
import java.io.*;

public class Main {
    public static void main(String[] args){

        Persona persona1 = new Persona("Adrián", 23);

        try (FileOutputStream fos = new FileOutputStream("src/ejercicio5/persona.ser");
            ObjectOutputStream salida = new ObjectOutputStream (fos)){

            salida.writeObject(persona1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        leerArchivo();
    }
    public static void leerArchivo(){
        Persona persona2 = null;
        try (FileInputStream fis = new FileInputStream("src/ejercicio5/persona.ser");
        ObjectInputStream entrada = new ObjectInputStream(fis)){

            persona2 = (Persona)entrada.readObject();
            System.out.println(persona2.toString());

        }catch (Exception e) {
            System.out.println("Error reading");
        }
    }

}