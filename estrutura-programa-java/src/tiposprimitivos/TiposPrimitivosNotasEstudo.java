package tiposprimitivos;

/*
*Notas de estudo sobre os tipos primitivos do Java.
*Tipos primitivos são providos pela linguagem nativamente
*/
public class TiposPrimitivosNotasEstudo {
    public static void main(String[] args) {
    // Caracteres ou Characters
    char primeiraLetraDoNome = 'G';
    char primeiraLetraDoNomeASCII = 71;

    System.out.println(primeiraLetraDoNome);
    System.out.println(primeiraLetraDoNomeASCII);

    // Inteiros ou Integers
    byte nota = 10; // -128 até 127
    short itensComprados = 2; // -32768 até 32767
    int quantidadeEstoque = 23366; // -2.147.483.648 até 2.147.843.647
    long numeroMuitoGrande = 47647862378462378L; // 19 dígitos

    // Decimais
    float peso = 1.5f; // 6 a 7 casa decimais
    double preco = 24.99; // ~15 casa decimais

    // Booleanos ou Booleans
    boolean verdadeiro = true;
    boolean falso = false;   
    }
}
