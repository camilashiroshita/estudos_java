import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tabuleiro 3x3 inicializado com espaços vazios
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        int jogadas = 0;

        System.out.println("=== JOGO DA VELHA ===");

        while (jogoAtivo) {
            // 1. MOSTRAR O TABULEIRO
            System.out.println("\n  0   1   2"); // Índices das colunas
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " "); // Índice da linha
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j]);
                    if (j < 2) System.out.print(" | "); // Divisória vertical
                }
                System.out.println();
                if (i < 2) System.out.println("  ---------"); // Divisória horizontal
            }

            // 2. PERMITIR JOGADA E VALIDAR POSIÇÃO
            int linha = -1, coluna = -1;
            boolean jogadaValida = false;

            while (!jogadaValida) {
                System.out.println("\nJogador [" + jogadorAtual + "], digite sua jogada.");
                System.out.print("Linha (0-2): ");
                linha = scanner.nextInt();
                System.out.print("Coluna (0-2): ");
                coluna = scanner.nextInt();

                // Valida se os índices existem e se a posição está vazia
                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                    if (tabuleiro[linha][coluna] == ' ') {
                        jogadaValida = true;
                    } else {
                        System.out.println("Essa posição já está ocupada! Tente novamente.");
                    }
                } else {
                    System.out.println("Posição inválida! Escolha números entre 0 e 2.");
                }
            }

            // Aplica a jogada e contabiliza o turno
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            // 3. VERIFICAR VITÓRIA OU EMPATE
            boolean venceu = false;

            // Verifica Linhas e Colunas
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                    venceu = true; // Vitória na Linha i
                }
                if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                    venceu = true; // Vitória na Coluna i
                }
            }

            // Verifica Diagonais
            if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
                venceu = true; // Diagonal Principal
            }
            if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
                venceu = true; // Diagonal Secundária
            }

            // Processa o fim do jogo ou alterna o jogador
            if (venceu) {
                System.out.println("\nParabéns! O Jogador [" + jogadorAtual + "] VENCEU o jogo!");
                jogoAtivo = false;
            } else if (jogadas == 9) {
                System.out.println("\nDeu VELHA! O jogo terminou em empate.");
                jogoAtivo = false;
            } else {
                // Alterna entre 'X' e 'O' usando operador ternário
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        // Mostra o tabuleiro finalizado
        System.out.println("\nTabuleiro Final:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + (j < 2 ? " | " : ""));
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }

        scanner.close();
    }
}
