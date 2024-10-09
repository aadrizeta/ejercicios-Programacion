package tuma;

public class MainCuentasBancarias {
    public static void main(String[] args) {
        CuentaCorriente cuentaCoriente1 = new CuentaCorriente(1000, 0);
        CuentaCorriente cuentaCoriente2 = new CuentaCorriente(2000, 0);

        CuentaAhorros cuentaAhorros1 = new CuentaAhorros(500, 1.59);
        CuentaAhorros cuentaAhorros2 = new CuentaAhorros(1000, 0.05);

        cuentaCoriente1.depositar(500);
    }
}
