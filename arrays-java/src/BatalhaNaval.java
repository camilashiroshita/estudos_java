import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] tabuleiro = new char[5][5];
        int tentativas = 10;
        int naviosRestantes = 3;
        
        // Inicializar tabuleiro
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '~';  
            }
        }

        // Colocar os navios
        System.out.println("Digite as posições dos navios: ");
        System.out.println("Navio 1: ");
        int linhaNavio1 = scanner.nextInt();
        int colunaNavio1 = scanner.nextInt();
        System.out.println("Navio 2: ");
        int linhaNavio2 = scanner.nextInt();
        int colunaNavio2 = scanner.nextInt();
        System.out.println("Navio 3: ");
        int linhaNavio3 = scanner.nextInt();
        int colunaNavio3 = scanner.nextInt();
        tabuleiro[linhaNavio1][colunaNavio1] = 'N';
        tabuleiro[linhaNavio2][colunaNavio2] = 'N';
        tabuleiro[linhaNavio3][colunaNavio3] = 'N';

        System.out.println("Bem-vindo ao jogo de Batalha Naval!");
        System.out.println("Você tem 10 tentativas para afundar 3 navios.");

        while (tentativas > 0 && naviosRestantes > 0) {
          // Exibir tabuleiro
          System.out.println("\n  0 1 2 3 4");
          for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
              System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
          }
    
          System.out.println("Tentativas restantes: " + tentativas);
          System.out.print("Digite a linha e a coluna (0-4): ");
          int linha = scanner.nextInt();
          int coluna = scanner.nextInt();
    
          if (linha < 0 || linha > 4 || coluna < 0 || coluna > 4) {
            System.out.println("Posição inválida. Tente novamente.");
            continue;
          }
    
          if (tabuleiro[linha][coluna] == 'X') {
            System.out.println("Você já tentou essa posição. Tente novamente.");
            continue;
          } else if (tabuleiro[linha][coluna] == 'N') {
            System.out.println("Você acertou um navio!");
            tabuleiro[linha][coluna] = 'X';
            naviosRestantes--;
          } else {
            System.out.println("Você errou.");
            tabuleiro[linha][coluna] = 'X';
          }
    
          tentativas--;
        }
    
        if (naviosRestantes == 0) {
          System.out.println("Parabéns! Você afundou todos os navios.");
        } else {
          System.out.println("Você perdeu. Os navios sobreviveram.");
        }
    
        scanner.close();
    }
}
        


    


