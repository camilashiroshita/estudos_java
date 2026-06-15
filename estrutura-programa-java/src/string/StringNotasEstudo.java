package string;

import java.util.Scanner;

/* 
String é um tipo de referência que representa uma cadeia de caracteres
*/
public class StringNotasEstudo {
    public static void main(String[] args) {
        String texto = "Um texto para ser impresso";
        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);

        scanner.close();
    }
    
}
