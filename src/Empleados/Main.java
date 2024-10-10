package Empleados;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 10000, 0);
        Programador programador1 = new Programador("Pedro", 5000, 2000);

        gerente1.iniciarSesion("admin", "password");
        gerente1.calcularBonificacion();
        gerente1.calcularSalario();
        System.out.println(gerente1.toString());
        gerente1.cerrarSesion();

        programador1.iniciarSesion("user", "password");
        programador1.calcularBonificacion();
        programador1.calcularSalario();
        System.out.println(programador1.toString());
        programador1.cerrarSesion();
    }
}
