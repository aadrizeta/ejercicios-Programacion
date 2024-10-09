package tuma;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Juan", 25, 75.5));
        estudiantes.add(new Estudiante("Maria", 30, 60.0));
        estudiantes.add(new Estudiante("Pedro", 28, 80.0));
        estudiantes.add(new Estudiante("Ana", 22, 65.0));

        //mostrar lista de estudiantes
        int i = 0;
        while (i < estudiantes.size()) {
            System.out.println(estudiantes.get(i));
            i++;
        }

        //eliminar estudiante por nombre
        boolean encontrado = false;
        int cont = 0;
        while (!encontrado && cont < estudiantes.size()) {
            if (estudiantes.get(cont).getNombre().equals("Maria")) {
                encontrado = true;
                estudiantes.remove(cont);
                System.out.println("Estudiante Maria eliminado");
            }
            cont++;
        }

        //calcular nota media de todos los estudiantes
        double sumaNotas = 0;
        int k = 0;
        while (k < estudiantes.size()) {
            sumaNotas += estudiantes.get(k).getNotaMedia();
            k++;
        }
        double media = sumaNotas / estudiantes.size();
        System.out.println("La nota media de los estudiantes es: " + media);

        //mostrar estudiiante con mayor nota media
        Estudiante estudianteNotaAlta = estudiantes.get(0);
        int l = 1;
        while (l < estudiantes.size()) {
            if (estudiantes.get(l).notaMedia > estudianteNotaAlta.notaMedia) {
                estudianteNotaAlta = estudiantes.get(l);
            }
            l++;
        }
        System.out.println("El estudiante con la nota más alta es: ");
        System.out.println(estudianteNotaAlta);
    }
}