import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para cálculo do fatorial:");
        int n = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {

            fatorial *= i;                
        }

        scanner.close();

        System.out.println(fatorial);
    }
}
