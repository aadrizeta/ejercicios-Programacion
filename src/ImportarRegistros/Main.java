package ImportarRegistros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String rutaArchivo = "src\\ImportarRegistros\\alumnos.txt";

        ArrayList<Alumno> alumnos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))){

            String linea;

            while ((linea = reader.readLine())!= null) {
                String[] datos = linea.split(",");

                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String curso = datos[2];
                double notaMedia = Double.parseDouble(datos[3]);

                Alumno alumno = new Alumno(nombre, edad, curso, notaMedia);
                alumnos.add(alumno);
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        Alumno alumnoConNotaMasAlta = alumnos.stream()
               .max((a1, a2) -> Double.compare(a1.getNotaMedia(), a2.getNotaMedia()))
               .orElse(null);

        if (alumnoConNotaMasAlta!= null) {
            System.out.println("\nAlumno con más nota media: " + alumnoConNotaMasAlta);
        } else {
            System.out.println("\nNo hay alumnos cargados.");
        }
    }
}