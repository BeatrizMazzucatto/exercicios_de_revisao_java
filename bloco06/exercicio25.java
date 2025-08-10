package bloco06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Pilha de Livros (Deque como Stack)
// Pilha de Livros

public class exercicio25 {
    public static void main(String[] args) {
        // Criando a pilha de livros
        Deque<String> pilhaLivros = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pilha de Livros ===");

        // Empilhar 3 livros
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do livro " + (i+1) + ": ");
            String livro = sc.nextLine();
            pilhaLivros.push(livro);
            System.out.println("📚 '" + livro + "' foi empilhado.");
        }

        // Desempilhar um livro (pop)
        if (!pilhaLivros.isEmpty()) {
            String livroRemovido = pilhaLivros.pop();
            System.out.println("\n🗑️  Livro removido da pilha: " + livroRemovido);
        } else {
            System.out.println("A pilha está vazia!");
        }

        // Espiar o topo da pilha (peek)
        if (!pilhaLivros.isEmpty()) {
            String topo = pilhaLivros.peek();
            System.out.println("👀 Livro no topo da pilha: " + topo);
        } else {
            System.out.println("A pilha está vazia!");
        }

        sc.close();
    }
}
