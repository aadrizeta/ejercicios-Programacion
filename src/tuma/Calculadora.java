package tuma;

public class Calculadora {

    public double dividir(double numerador, double denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }
        return numerador / denominador;
    }
    public int factorial(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Error: El número no puede ser negativo");
        }
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public Calculadora(){

    }
}
