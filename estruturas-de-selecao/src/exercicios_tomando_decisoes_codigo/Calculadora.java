package exercicios_tomando_decisoes_codigo;

import java.util.Scanner;

/*
Crie uma calculadora que dados dois números e uma operação
(adição, subtração, multiplicação ou divisão), retorne o
resultado dessa operação entre os dois números.
*/
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números e um operador aritmético:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        String operador = scanner.next();

        switch (operador) {
            case "+" -> {
                System.out.printf("%d %s %d = %d", n1, operador, n2, n1 + n2);
            }    
            case "-" -> {
               System.out.printf("%d %s %d = %d", n1, operador, n2, n1 - n2);
            }
            case "*" -> {
                System.out.printf("%d %s %d = %d", n1, operador, n2, n1 * n2);
            }
            case "/" -> {
                System.out.printf("%d %s %d = %d", n1, operador, n2, n1 / n2);
            }
            default -> System.out.println("Não válido!");
        }   

        scanner.close();
    }
}
