import java.util.Scanner;

public class ImprimirArrayNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++)
            numeros[i] = scanner.nextInt();    
        for (int i = 0; i < numeros.length; i++)
            System.out.println(numeros[i]);

        scanner.close();
    }
}
