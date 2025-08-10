package bloco07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Invertendo uma Frase

public class exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        // Dividir a frase em palavras
        String[] palavras = frase.split("\\s+");

        // Usar Deque como pilha
        Deque<String> pilha = new ArrayDeque<>();
        for (String palavra : palavras) {
            pilha.push(palavra); // empilha
        }

        // Desempilhar para formar a frase invertida
        StringBuilder fraseInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            fraseInvertida.append(pilha.pop()).append(" ");
        }

        System.out.println("Frase invertida: " + fraseInvertida.toString().trim());
        sc.close();
    }
}
