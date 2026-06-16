/*
Imprimir preço de um produto com base no desconto à vista e o valor economizado.

1. Ler o preço
2. Ler % de desconto
3. Imprimir novo preço e valor economizado em reais

Ex.: R$100,00 com 10% de desconto = O preço com desconto é R$90,00
e o valor economizado foi de R$10,00
*/

import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        double valorProduto = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto:");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (percentualDesconto / 100);
        double valorFinal = valorProduto - percentualDesconto;

        // System.out.println("O preço com desconto é R$" + valorFinal + " e o valor economizado foi de " + valorComDesconto);
        System.out.printf("O preço com desconto é R$%.2f e o valor economizado foi de R$%.2f.", valorFinal, valorDesconto);

        scanner.close();
    }
}
