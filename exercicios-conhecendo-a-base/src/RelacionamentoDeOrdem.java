/*
Escreva um programa que informe os relacionamentos 
de ordem existentes entre dois números.:
Igual, não igual, maior, menor maior ou igual, menor ou igual.

1. Ler 2 números
2. Imprimir relacionamentos de ordem

Ex.: Dados os números 2 e 3:
2 = 3 ? false, 2!= 3 ? true, ... , 2 <= 3 ? true.
*/

import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println(n1 + " = " + n2 + " ? " + (n1 == n2));    
        System.out.println(n1 + " != " + n2 + " ? " + (n1 != n2));    
        System.out.println(n1 + " > " + n2 + " ? " + (n1 > n2));    
        System.out.println(n1 + " < " + n2 + " ? " + (n1 < n2));    
        System.out.println(n1 + " >= " + n2 + " ? " + (n1 >= n2));    
        System.out.println(n1 + " <= " + n2 + " ? " + (n1 <= n2));    

        scanner.close();
    }
}
