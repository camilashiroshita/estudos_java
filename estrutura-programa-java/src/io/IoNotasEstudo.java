package io;

import java.util.Scanner;

/*
Entrada e Saída (I/O) de dados nno Java.

Entrada de dados: Ler dados digitados pelo usuário.
Saída de dados: Escrever dados para o usuário.
 */
public class IoNotasEstudo {
    //Leitura de dados de entrada
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner scanner = new Scanner(System.in);
        int valorDigitado = scanner.nextInt();
        System.out.println(valorDigitado);
        scanner.close();

        // Saída de dados
        System.out.printf("O número digitado foi %d", valorDigitado);
        // %d para inteiros, %f para float.
    }
}
