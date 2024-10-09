package tuma;

public class CuentaCorriente extends CuentaBancaria  {

    private double envios;

    public CuentaCorriente(double saldo, double envios) {
        super(saldo);
        this.envios = envios;
    }

    public void depositar(double cantidad) {
        double nuevoSaldo = getSaldo() + cantidad;
        setSaldo(nuevoSaldo);
        System.out.println("Se ha depositado $" + cantidad + ", su nuevo saldo es $" + nuevoSaldo);
    }

    public void retirar(double cantidad) {
        if (getSaldo() >= cantidad) {
            double nuevoSaldo = getSaldo() - cantidad;
            setSaldo(nuevoSaldo);
            System.out.println("Se ha retirado $" + cantidad + ", su nuevo saldo es $" + nuevoSaldo);

        } else {
            System.out.println("No hay suficiente saldo para retirar $" + cantidad);
        }
    }
}
