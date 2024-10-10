package Empleados;

public class Programador extends Empleado implements Autenticable, Bonificable {

    public double salarioTotal;
    public Programador(String nombre, double salario, double bono) {
        super(nombre, salario, bono);
    }

    @Override
    void calcularSalario() {
        salarioTotal = salario + bono;
        salario = salarioTotal;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario + '\'' +
                ", bono=" + bono +
                '}';
    }

    @Override
    public void iniciarSesion(String usuario, String contraseña) {
        System.out.println("El usuario:  " + usuario +  " ha iniciado sesión.");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("El usuario ha cerrado sesión.");
    }

    @Override
    public void calcularBonificacion() {
        // Bonificacion 5% anual
        double bonificacion = salario * 0.05;
        bono += bonificacion;
    }
}
