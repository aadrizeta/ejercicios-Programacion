package ejercicio2;

abstract class Dispositivos {
    public String estado;
    public String marca;

    public Dispositivos(String estado, String marca) {
        this.estado = estado;
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract void encender();
    public abstract void mostrarInfo();

   //@Override
   //public String toString() {
   //    return "Dispositivo [estado=" + estado + ", marca=" + marca + "]";
   //}
}
