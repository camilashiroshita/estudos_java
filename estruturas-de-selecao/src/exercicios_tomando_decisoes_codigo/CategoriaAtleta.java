package exercicios_tomando_decisoes_codigo;

import java.util.Scanner;

/*
Dada a idade do atleta, imprima sua categoria:

Mirim: 10 a 12 anos
Infantil: 13 a 15 anos
Juvenil: 16 a 18
*/
public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do atleta:");
        int idade = scanner.nextInt();

        if (idade > 9 && idade < 13)
            System.out.println("Categoria MIRIM.");
        else if (idade > 12 && idade < 16) 
            System.out.println("Categoria INFANTIL.");    
        else if (idade > 15 && idade < 19)
            System.out.println("Categoria JUVENIL.");
        else
            System.out.println("Idade inválida.");
        

        scanner.close();
    }
}
