package operadores;

public class OperadoresNotasEstudos {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;
        // System.out.println(soma);
        // System.out.println("A soma é: " + soma);

        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;
        // System.out.println(subtracao);

        double numero5 = 2.5;
        double numero6 = 4;
        double multiplicacao = numero5 * numero6;
        // System.out.println(multiplicacao);

        int numero7 = 7;
        int numero71 = 71;
        int divisao = numero71 / numero7;
        // System.out.println(divisao);

        int modulo = numero71 % numero7;  // Resto da divisao.
        // System.out.println(modulo);
        
        int contador = 0; // Operador de incremento.
        contador++;
        contador++;
        // System.out.println(contador);
        contador--; // Operador de decremento.
        contador--;
        // System.out.println(contador);

        double decimal1 = 1.0;
        double decimal2 = 2.0;
        // System.out.println(decimal2 > decimal1);
        boolean ehMaior = decimal2 > decimal1;
        // System.out.println(ehMaior);

        // System.out.println(decimal2 == decimal1); // comparação, igualdade
        // System.out.println(decimal2 != decimal1); // comparação, desigualdade

        int variavel = 1;
        // variavel += 4; // variavel = variavel + 4.
        // variavel -= 1; // variavel = variavel - 1.
        // variavel *= 5; // variavel = variavel * 5.
        // variavel /= -1; // variavel = variavel * -1.
        variavel %= 1; // variavel = variavel % 1.
        // System.out.println(variavel);

        int valor1 = 4;
        int valor2 = 2;
        boolean expressaoAnd = valor1 < 10 && valor2 < 10;
        // System.out.println(expressaoAnd);

        boolean expressaoOr = valor1 < 10 || valor2 < 10;
        // System.out.println(expressaoOr);

        boolean expressaoNegada = 2 < 1; // ou System.out.println(!(2 < 1))
        System.out.println(!expressaoNegada);
        

    }
}
