
package exercicios_tomando_decisoes_codigo;

import java.util.Scanner;

/*
Leia um número e imprima se ele é par ou ímpar
*/
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0)
            System.out.println("O número é par!");
        else
            System.out.println("O número é ímpar!");

        scanner.close();
    }
}
