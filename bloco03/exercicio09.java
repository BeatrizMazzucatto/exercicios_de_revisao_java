package bloco03;

import java.util.ArrayList;
import java.util.Scanner;

//Lista de Tarefas (ArrayList)

public class exercicio09 {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Adicionar tarefa\n2. Remover tarefa\n3. Listar tarefas\n0. Sair");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tarefa: ");
                    tarefas.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Índice para remover: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < tarefas.size()) {
                        tarefas.remove(idx);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 3:
                    System.out.println("Tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ": " + tarefas.get(i));
                    }
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}