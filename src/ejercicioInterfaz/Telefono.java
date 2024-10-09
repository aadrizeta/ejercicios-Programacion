package ejercicioInterfaz;

public class Telefono implements Conectable, Recargable{

    public Telefono() {
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el telefono");
    }
    @Override
    public void apagar() {
        System.out.println("Apagando el telefono");
    }
    @Override
    public void cargar(){
        System.out.println("Cargando el telefono");
    }

    @Override
    public void nivelDeBateria(int porcentaje){
        System.out.println("Nivel de bateria del telefono: " + porcentaje + "%");
    }
}
