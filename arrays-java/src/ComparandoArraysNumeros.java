import java.util.Scanner;

public class ComparandoArraysNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite os dois tamanhos dos arrays: ");
        int tamanhoVetorA = scanner.nextInt();
        int tamanhoVetorB = scanner.nextInt();

        int [] arrayA = new int[tamanhoVetorA];
        int [] arrayB = new int[tamanhoVetorB];
        System.out.printf("Digite os número do Array A: (%d números)\n", tamanhoVetorA);
        for (int i = 0; i < tamanhoVetorA; i++) {
            arrayA[i] = scanner.nextInt();
        }
        System.out.printf("Agora, digite os números do Array B: (%d números)\n", tamanhoVetorB);
        for (int i = 0; i < tamanhoVetorB; i++) {
            arrayB[i] = scanner.nextInt();
        }

        System.out.print("A = { ");        
        for (int i = 0; i < tamanhoVetorA; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.print("}\n");

        System.out.print("B = { ");        
        for (int i = 0; i < tamanhoVetorB; i++) {
            System.out.print(arrayB[i] + " ");
        }
        System.out.println("}");

        System.out.print("Números em comum: ");

        for (int i = 0; i < tamanhoVetorA; i++) {
            for (int j = 0; j < tamanhoVetorB; j++) {
                if (arrayA[i] == arrayB[j])
                    System.out.print(arrayA[i] + " ");
                continue;
            }
        }

        scanner.close();
    }
}