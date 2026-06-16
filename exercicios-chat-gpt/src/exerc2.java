import java.util.Scanner;

// Média e números acima da média

public class exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notasAlunos = new double[8];
        double soma = 0;

        System.out.println("Digite as notas dos 8 alunos: ");

        for (int i = 0; i < notasAlunos.length; i++) {
            notasAlunos[i] = scanner.nextDouble();
        }

        for (int i = 0; i < notasAlunos.length; i++) {
            soma += notasAlunos[i];
        }

        double media = soma / notasAlunos.length;

        System.out.printf("Média da turma: %.2f\n", media);

        System.out.println("Alunos acima da média: ");

        for (int i = 0; i < notasAlunos.length; i++) {
            if (notasAlunos[i] > media) {
                System.out.println("Aluno " + (i + 1) + " -> " + notasAlunos[i]);
            }
        }

        scanner.close();
    }
}
