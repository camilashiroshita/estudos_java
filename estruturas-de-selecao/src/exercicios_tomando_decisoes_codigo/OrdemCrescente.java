package exercicios_tomando_decisoes_codigo;

import java.util.Scanner;

/*
Leia três números e imprima-os em ordem crescente
*/
public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1 > n2) {
            if (n2 > n3) {
                System.out.printf("Ordem crescente: %d, %d e %d", n3, n2, n1);
            }
            else
                System.out.printf("Ordem crescente: %d, %d e %d", n2, n3, n1);
        }

        else if (n2 > n1) {
            if (n1 > n3) {
                System.out.printf("Ordem crescente: %d, %d e %d", n3, n1, n2);
            }
            else
                System.out.printf("Ordem crescente: %d, %d e %d", n1, n3, n2);
            
        }

        else if (n3 > n1) {
            if (n1 > n2) {
                System.out.printf("Ordem crescente: %d, %d e %d", n2, n1, n3);
            }
            else 
                System.out.printf("Ordem crescente: %d, %d e %d", n1, n2, n3);
        }

        else
            System.out.println("Não foi possível concluir a instrução!");

        scanner.close();
    }
}
