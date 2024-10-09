package tuma;
import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Perro","Buddy", 3));
        animales.add(new Gato("Gato","Siames", 2));
        animales.add(new Perro("Perro","Red", 2));
        animales.add(new Gato("Gato","Persa", 1));

        //mostrar lista
        for (Animal animal : animales) {
            animal.mostrarDatos();
            System.out.println();
        }
        //buscar animal
        boolean encontrado = false;
        int cont = 0;
        while (!encontrado && cont < animales.size()) {
            if (animales.get(cont).getNombre().equals("Siames")) {
                encontrado = true;
                System.out.println("Siames es un gato.");
            }
            cont++;
        }
    }
}
