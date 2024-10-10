package Empleados;

public interface Autenticable {
    void  iniciarSesion(String usuario, String contraseña);
    void cerrarSesion();
}
