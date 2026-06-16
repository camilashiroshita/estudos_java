import java.util.Scanner;

// Soma dos elementos de uma matriz (multidimensional)

public class exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaTotal = 0;
        int somaDiagonalPrincipal = 0;

        System.out.println("Digite os elementos para uma matriz 3x3:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                somaTotal += matriz[i][j];
            }
        } 

        System.err.printf("\n\nSoma total = %d", somaTotal);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }

        System.err.printf("\nSoma da diagonal principal = %d", somaDiagonalPrincipal);

        scanner.close();
    }
}
