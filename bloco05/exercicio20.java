package bloco05;

import java.util.HashMap;
import java.util.Scanner;

//Agenda de Contatos

public class exercicio20 {
   public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Agenda de Contatos ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar telefone");
            System.out.println("3. Listar todos os contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    agenda.put(nome, telefone);
                    System.out.println("Contato adicionado.");
                    break;

                case 2:
                    System.out.print("Nome para buscar: ");
                    String busca = sc.nextLine();
                    if (agenda.containsKey(busca)) {
                        System.out.println("Telefone: " + agenda.get(busca));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    if (agenda.isEmpty()) {
                        System.out.println("Agenda vazia.");
                    } else {
                        System.out.println("Contatos:");
                        agenda.forEach((n, t) -> System.out.println(n + " → " + t));
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
