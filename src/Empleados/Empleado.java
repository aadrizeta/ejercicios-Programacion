package Empleados;

abstract class Empleado {

    public String nombre;
    public double salario;
    public double bono;

    public Empleado(String nombre, double salario, double bono) {
        this.nombre = nombre;
        this.salario = salario;
        this.bono = bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    abstract void calcularSalario();
}
