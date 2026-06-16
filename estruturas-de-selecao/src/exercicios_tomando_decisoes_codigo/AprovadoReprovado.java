/*
Leia três notas de um aluno e imprima se ele foi aprovado ou não.
Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
*/

package exercicios_tomando_decisoes_codigo;

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três notas do/a aluno/a:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.printf("Sua média é de: %.2f, aprovado!", media);
        }

        else 
            System.out.printf("Sua média é de: %.2f, reprovado!", media);

        scanner.close();

    }
}
