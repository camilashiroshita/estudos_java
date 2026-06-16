/*
Exercício 1

Dadas as 3 notas, imprimir a média aritmética do aluno

1. Ler 3 notas
2. Calcular média
3.Imprimir resultado

Fórmula: MA = (n1 + n2 + n3) / 3.
*/

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        double n1, n2, n3;              
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: "); 
        n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: "); 
        n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: "); 
        n3 = scanner.nextDouble();
        
        scanner.close();

        double mediaAritmetica = (n1 + n2 + n3) / 3;
        System.out.printf("A média do aluno é: %.2f", mediaAritmetica);

        

        
    }
}
