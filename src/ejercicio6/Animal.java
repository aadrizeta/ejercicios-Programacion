package ejercicio6;

import java.io.Serializable;

public abstract class Animal implements Serializable, Gestionable{
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}
