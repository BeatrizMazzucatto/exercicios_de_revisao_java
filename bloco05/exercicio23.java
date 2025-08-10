package bloco05;

import java.util.HashMap;
import java.util.Scanner;

//Verificando a Existência de Chave e Valor
//Verifica Chave Valor

public class exercicio23 {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Populando com alguns contatos
        agenda.put("Ana", "9999-1111");
        agenda.put("Bruno", "9999-2222");
        agenda.put("Carlos", "9999-3333");
        agenda.put("Diana", "9999-4444");

        System.out.print("Digite um nome para verificar: ");
        String nome = sc.nextLine();
        if (agenda.containsKey(nome)) {
            System.out.println("Nome '" + nome + "' existe na agenda.");
        } else {
            System.out.println("Nome '" + nome + "' não encontrado.");
        }

        System.out.print("Digite um telefone para verificar: ");
        String telefone = sc.nextLine();
        if (agenda.containsValue(telefone)) {
            System.out.println("Telefone '" + telefone + "' está cadastrado.");
        } else {
            System.out.println("Telefone '" + telefone + "' não encontrado.");
        }

        sc.close();
    }
}
