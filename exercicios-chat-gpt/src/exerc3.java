import java.util.Scanner;

// Inverter um array

public class exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        System.out.println("Digite 6 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nArray original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\nArray invertido: ");
        for (int i = (numeros.length - 1); i <= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
