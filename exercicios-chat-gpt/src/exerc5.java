import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notasAlunos = new double[5][4];

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            double soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                if (j == 3) {
                    notasAlunos[i][j] = soma / 3.0;
                }
                else {
                    notasAlunos[i][j] = scanner.nextDouble();
                } 
                soma += notasAlunos[i][j];
            }
               
            
        }

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("\nAluno " + (i + 1) + "-> ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                if (j == 3) {
                    System.out.print("Média: ");
                }
                System.out.printf("%.2f | ", notasAlunos[i][j]);

            }
        }

        scanner.close();
    }
}
