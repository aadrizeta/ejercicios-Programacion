package tuma;

public class Perro extends Animal  {

    public  Perro(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    public void hacerRuido() {
        System.out.println(this.nombre + " dice: "+"Guau guau!");
    }
}
