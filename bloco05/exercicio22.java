package bloco05;

import java.util.TreeMap;

// Listagem Ordenada (TreeMap)
// Alunos Ordenados

public class exercicio22 {
    public static void main(String[] args) {
        TreeMap<String, Double> notas = new TreeMap<>();

        // Adicionando alunos fora de ordem alfabética
        notas.put("Carlos", 8.5);
        notas.put("Ana", 9.0);
        notas.put("Eduardo", 6.7);
        notas.put("Beatriz", 7.2);
        notas.put("Daniel", 5.8);

        System.out.println("Alunos e notas (em ordem alfabética):");
        notas.forEach((nome, nota) -> System.out.println(nome + " → " + nota));
    }
}
