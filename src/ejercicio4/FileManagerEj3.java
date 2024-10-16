package ejercicio4;
import java.io.*;

public class FileManagerEj3 {
        public String ruta;
        public File file;

    public FileManagerEj3(String ruta) {
        this.ruta = ruta;
        file = new File(ruta);
    }
    public void leerArchivo(){
        try {
            if(file.exists()){
                byte[] bytes = new byte[(int)file.length()];
                FileInputStream reader = new FileInputStream(file);
                reader.read(bytes);
                reader.close();

                FileOutputStream writer = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\Programacion IntelliJ\\pruebas1\\src\\ejercicio4\\Salida.bin");
                writer.write(bytes);
                writer.close();
            } else {
                System.out.println("Archivo no encontrado");
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    private long getBits(File file) {
        return  file.length() * 8;
    }
}
