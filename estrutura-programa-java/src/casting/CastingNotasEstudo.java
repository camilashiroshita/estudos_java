package casting;

/*
Casting: Operação de transformar um tipo de dado em outro
Widening Casting VS Narrowing Casting
*/
public class CastingNotasEstudo {
    public static void main(String[] args) {
        // Widening Casting (Implícito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        // System.out.println(variavelGrande);
        // System.out.println(variavelInt);

        // Narrowing Casting (Explícito), passível à perda de dados
        long variavelLong = 6546723457233532L;
        int variavelInt2 = (int) variavelLong;
        // System.out.println(variavelInt2);

        // Operações de divião entre números inteiros
        int numero1 = 9;
        int numero2 = 2;
        // int resultadoDivisao = numero1 / numero2;
        // Para fazer a divisão de dois números inteiros e ter o resultado decimal
        float resultadoDivisao = (float) numero1 / numero2;
        System.out.println(resultadoDivisao);        
    }
    
}
