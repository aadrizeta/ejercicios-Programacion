package ImportarRegistros;

public class Alumno {

    public String nombre;
    public int edad;
    public String curso;
    public double notaMedia;

    public Alumno(String nombre, int edad, String curso, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                ", notaMedia=" + notaMedia +
                '}';
    }
}
