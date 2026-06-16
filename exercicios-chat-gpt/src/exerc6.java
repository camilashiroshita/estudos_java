import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                jogoDaVelha[i][j] = " ";
            }
        }

        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print(jogoDaVelha[i][j]);
            }

            System.out.println();
        }

        scanner.close();
    }
}
