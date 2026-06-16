/*
Escreva um programa que cheque se um ano é bissexto.
Um ano bissexto é um ano divisível por 4, com exceção dos anos
divisíveis por 100, mas não divisíveis por 400.

Ex.: O ano 2000 foi um ano bissexto porque é divisível por 400,
mas o ano 1900 não foi porque é divisível por 100 e não por 400.
*/

package exercicios_tomando_decisoes_codigo;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();

        if (ano <= 400) {
            if (ano % 4 == 0) {
                System.out.println("Ano bissexto!");
            }
            else
                System.out.println("Ano não bissexto!");
        }
        else {
            if (ano % 4 == 0) {
                if ( ano % 400 == 0)
                    System.out.println("Ano bissexto!");
                else
                    System.out.println("Ano não bissexto!");
            }
            else
                System.out.println("Ano não bissexto!");
        }    
        scanner.close();

    }
}
