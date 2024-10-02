package tuma;

public class Main{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (valor == 4) {
                    valor++;
                }
                matriz[i][j] = valor;
                valor++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}