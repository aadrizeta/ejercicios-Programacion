package ejercicio2;

public class Tablet extends Dispositivos implements Conectable{
    public Tablet(String estado, String marca) {
        super(estado, marca);
    }

    @Override
    public void encender() {
        if (estado.equalsIgnoreCase("Encendido")) {
            System.out.println("El dispositivo ya está encendido");
        } else {
            estado = "Encendido";
            System.out.println("Dispositivo encendido");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Dispositivo: Tablet");
        System.out.println("Estado: " + estado);
        System.out.println("Marca: " + marca);
    }

    @Override
    public void conectarWifi() {
        System.out.println("Wifi conectado con éxito");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Wifi desconectado");
    }
}
