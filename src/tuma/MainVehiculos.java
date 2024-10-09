package tuma;

public class MainVehiculos {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Chevrolet", 200, 10.5);
        Bicicleta bicicleta1 = new Bicicleta("BMX", 180, "Cuadrada");

        coche1.mostrarInformacion();
        System.out.println();
        bicicleta1.mostrarInformacion();
    }
}
