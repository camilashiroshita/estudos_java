package estrutura_if;

import java.util.Scanner;

public class ChecadorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        // if (idade >= 18)
        //    System.out.println("Pode comprar o ingresso!");
        // else 
        //    System.out.println("Esse filme é para maiores de 18 anos!");
        
        // If ternário: condição ? expressão1 : expressão2  
        String mensagem = (idade >= 18) ? "Pode comprar o ingresso!" : "Esse filme é para maiores de 18 anos!";
        System.out.println(mensagem);

        scanner.close();
    }
}
