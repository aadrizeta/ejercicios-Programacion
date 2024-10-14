package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        FileManager fileManager = new FileManager("src/Ejercicio3/figuras.txt");

        System.out.println(fileManager.Exists());
        fileManager.importFromFile();
        fileManager.getDataFromFile()   ;
    }
}
