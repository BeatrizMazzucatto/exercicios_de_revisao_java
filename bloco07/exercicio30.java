package bloco07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Agrupando Alunos por Nota

class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " (nota: " + nota + ")";
    }
}

public class exercicio30 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Ana", 8.5),
            new Aluno("Bruno", 6.2),
            new Aluno("Carlos", 4.8),
            new Aluno("Diana", 7.0),
            new Aluno("Eduardo", 5.5),
            new Aluno("Fernanda", 9.1)
        );

        // Map: faixa -> lista de alunos
        Map<String, List<Aluno>> grupos = new HashMap<>();
        grupos.put("Aprovados", new ArrayList<>());
        grupos.put("Recuperação", new ArrayList<>());
        grupos.put("Reprovados", new ArrayList<>());

        // Agrupar alunos
        for (Aluno aluno : alunos) {
            if (aluno.nota >= 7) {
                grupos.get("Aprovados").add(aluno);
            } else if (aluno.nota >= 5) {
                grupos.get("Recuperação").add(aluno);
            } else {
                grupos.get("Reprovados").add(aluno);
            }
        }

        // Exibir resultados
        grupos.forEach((faixa, lista) -> {
            System.out.println("\n" + faixa + " (" + lista.size() + " alunos):");
            lista.forEach(System.out::println);
        });
    }
}
