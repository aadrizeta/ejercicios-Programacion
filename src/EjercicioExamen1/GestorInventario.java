package EjercicioExamen1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorInventario {

    public File file;
    public ArrayList<Producto> productos;

    public GestorInventario(){

        productos = new ArrayList<>();
    }

    public void leerArchivoInventario(String ruta){
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))){

            String line;
            reader.readLine();

            while ((line = reader.readLine())!= null) {
                String datos[] = line.split(",");
                String cod = datos[0];
                String nombre = datos[1];
                int cantidad = Integer.parseInt(datos[2]);
                double precio = Double.parseDouble(datos[3]);
                Producto producto = new Producto(cod, nombre, precio, cantidad);
                productos.add(producto);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        for (Producto producto : productos){
            System.out.println(producto);
        }

    }

}
