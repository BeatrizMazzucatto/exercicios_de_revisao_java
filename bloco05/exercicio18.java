package bloco05;

import java.util.HashMap;
import java.util.Scanner;

//Dicionário Simples (HashMap)

public class exercicio18 {
    public static void main(String[] args) {
        HashMap<String, String> dicionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Adicionando 5 palavras
        dicionario.put("casa", "house");
        dicionario.put("gato", "cat");
        dicionario.put("água", "water");
        dicionario.put("livro", "book");
        dicionario.put("sol", "sun");

        System.out.print("Digite uma palavra em português: ");
        String palavra = sc.nextLine().toLowerCase();

        if (dicionario.containsKey(palavra)) {
            System.out.println("Tradução: " + dicionario.get(palavra));
        } else {
            System.out.println("Palavra não encontrada no dicionário.");
        }

        sc.close();
    }
}
