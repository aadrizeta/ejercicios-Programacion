package tuma;

public class Perro extends Animal  {

    public  Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void hacerRuido() {
        System.out.println(this.nombre + " dice: "+"Guau guau!");
    }
}
