import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        String[] tarefas = new String[] {
            "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" };

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Cadastrar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Posiçao: ");
                    int numeroTarefa = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (numeroTarefa <= 0 || numeroTarefa > 10) {
                        System.out.println("Número da tarefa inválido.");
                        break;
                    }
                        
                    System.out.print("Tarefa: "); 
                    tarefas[numeroTarefa - 1] = scanner.nextLine();
                }        

                case 2 -> {
                    for (int i = 0; i < tarefas.length ; i++) {
                        System.out.println("Tarefa " + (i+1) + " - " + tarefas[i]);
                    }
                }

                default -> {
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;
                }
            }
        }
    }
}
