/*
Escreva um programa que leia uma idade em anos e imprima essa idade em dias

Ex.: 1 ano => 365 dias de idade
*/

import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        int dias = idade * 365;
        System.out.printf("Você tem %d dias de idade!", dias);

        scanner.close();


    }
}
