import java.util.Scanner;

//Maior e menor valor de um array (Unidimensional)

public class exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] array = new int[10];
        
        System.out.println("Digite 10 números para incluir no Array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        int maior = array[0];
        int menor = array[0];
        
        int posicaoMaior = 1;
        int posicaoMenor = 1;
        

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
                posicaoMaior = i + 1;
            }

            if (array[i] < menor) {
                menor = array[i];
                posicaoMenor = i + 1;
            }    
        }
        
        System.out.printf("Maior valor: %d, posição %d\nMenor valor: %d, posição %d",
            maior, posicaoMaior, menor, posicaoMenor); 
        
        scanner.close();
    }


}
