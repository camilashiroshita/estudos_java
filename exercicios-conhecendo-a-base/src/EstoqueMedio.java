/*
Faça um programa para calular o estoque médio de uma peça, seguindo a fórmula:
estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2

Ex.: quantidadeMinima = 3, quantideMaxima = 7: O estoque médio é de 5 unidades.
*/

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade mínima:");
        int quantidadeMinima = scanner.nextInt();

        System.out.println("Digite a quantidade máxima:");
        int quantidadeMaxima = scanner.nextInt();

        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.printf("O estoque médio é: %d.", estoqueMedio);

        

        scanner.close();
    }
    
}
