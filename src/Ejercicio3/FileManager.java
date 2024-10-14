package Ejercicio3;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class FileManager {
    public String ruta;
    public ArrayList<Figura> figuras = new ArrayList<Figura>();
    public File file;
    public File file2;
    Scanner myReader;

    public FileManager(String ruta) {
        this.ruta = ruta;
        //this.figuras = new ArrayList<>();
        file = new File(ruta);
    }
    public boolean Exists(){
        return file.exists();
    }
    public void importFromFile(){
        try {
            myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
            }
        }catch (Exception e){
            System.out.println("Error al abrir el archivo");
        }
    }
    public void getDataFromFile() {
        try {
            myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String linea = myReader.nextLine();
                String datos[] = linea.toLowerCase().split(",");
                if (linea.contains("#")){
                    if (datos[0].equals("rectangulo")) {
                        int base = Integer.parseInt(datos[1]);
                        int altura = Integer.parseInt(datos[2]);
                        Rectangulo rectangulo = new Rectangulo(datos[3], base, altura);
                        figuras.add(rectangulo);
                    }else if (datos[0].equals("cuadrado")) {
                        int lado = Integer.parseInt(datos[1]);
                        Cuadrado cuadrado = new Cuadrado(datos[2], lado);
                        figuras.add(cuadrado);
                    } else if (datos[0].equals("circulo")) {
                        int radio = Integer.parseInt(datos[1]);
                        Circulo circulo = new Circulo(datos[2], radio);
                        figuras.add(circulo);
                    }
                } else {
                    System.out.println("Error: Linea incorrecta");
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        for (Figura figura : figuras) {
            System.out.println(figura);
        }
        myReader.close();
    }
    public void exportToFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2 = new File("C:\\Users\\ALUMNO\\Desktop\\Programacion IntelliJ\\pruebas1\\src\\Ejercicio3")));
            for (Figura figura : figuras) {
                writer.write(figura.toString() + "\n");
            }
            writer.close();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
