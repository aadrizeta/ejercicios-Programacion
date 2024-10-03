package tuma;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 25, 75.5));
        personas.add(new Persona("Maria", 30, 60.0));
        personas.add(new Persona("Pedro", 28, 72.0));
        personas.add(new Persona("Ana", 22, 65.0));
        personas.add(new Persona("Jose", 35, 80.0));

        System.out.println("i¡Introduce el nombre de la persona que deseas buscar: ");
        String nombreBuscado = sc.nextLine();

        boolean encontrado = false;
        int cont = 0;
        while (!encontrado && cont < personas.size()) {
            if (personas.get(cont).getNombre().equals(nombreBuscado)) {
                encontrado = true;
                System.out.println(personas.get(cont).toString());
            }
            cont++;
        }
    }
}
