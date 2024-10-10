package Empleados;

public class Gerente extends Empleado  implements Autenticable, Bonificable{

    public double salarioTotal;
    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario, bono);
    }

    @Override
    void calcularSalario() {
        salarioTotal = salario + bono;
        salario = salarioTotal;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre= '" + nombre + '\'' +
                ", salario= " + salario + '\'' +
                ", bono= " + bono +
                '}';
    }

    @Override
    public void calcularBonificacion() {
        //Bonificacion 10% anual
        double bonificacion = salario * 0.1;
        bono += bonificacion;
    }

    @Override
    public void iniciarSesion(String usuario, String contraseña) {
        System.out.println("El usuario: " + usuario +  " ha iniciado sesión.");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("El usuario ha cerrado sesión.");
    }

}
