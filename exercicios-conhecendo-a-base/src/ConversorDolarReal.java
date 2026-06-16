/*
Faça um programa que converta um valor em dólar em reais.

Ex.: Dólares = 100, Cotação = 4,92 => O valor em reais é R$492,00.
*/

import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos dólares você tem?");
        double valorEmDolar = scanner.nextDouble();

        System.out.println("Qual a cotação do dólar?");
        double cotacaoDolar = scanner.nextDouble();
        
        double valorEmReal = valorEmDolar * cotacaoDolar;

        System.out.printf("O valor em reais é: R$%.2f", valorEmReal);

        scanner.close();
        
    }
}
