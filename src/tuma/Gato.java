package tuma;

public class Gato extends Animal{

    public Gato(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    public void hacerRuido() {
        System.out.println(this.nombre + " dice: "+"Miau!");
    }
}
