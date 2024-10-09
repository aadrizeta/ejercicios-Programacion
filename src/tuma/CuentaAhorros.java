package tuma;

public class CuentaAhorros extends CuentaBancaria  {
    private double interesMensual;

    public CuentaAhorros(double saldo, double interesMensual) {
        super(saldo);
        this.interesMensual = interesMensual;
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
