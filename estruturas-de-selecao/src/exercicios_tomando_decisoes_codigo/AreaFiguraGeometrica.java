/*
Dada uma figura geomátrica (retângulo, triângulo, círculo), informar 
a sua área.

retângulo = base x altura
triângulo = (base x altura) / 2
círculo = pi x (raio x raio)
*/

package exercicios_tomando_decisoes_codigo;

import java.util.Scanner;

public class AreaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a figura geométrica: ");
        String figuraGeometrica = scanner.next();             

        switch (figuraGeometrica) {
            case "retangulo" -> {
                System.out.println("Digite a base e altura");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();

                double areaRetangulo = base * altura;

                System.out.printf("A área é: %.2f", areaRetangulo);
            }
            case "triangulo" -> {
                System.out.println("Digite a base e altura");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();

                double areaTriangulo = (base * altura) / 2;
               

                System.out.printf("A área é: %.2f", areaTriangulo);
            }
            case "circulo" -> {
                System.out.println("Digite o raio");
                double raio = scanner.nextDouble();

                double areaCirculo = 3.14 * (raio * raio);

                System.out.printf("A área é: %.2f", areaCirculo);
            }
            default ->
                System.out.println("Figura não suportada!");
        }

        scanner.close();
    }
}
