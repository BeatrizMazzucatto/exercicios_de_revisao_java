package bloco07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Sorteio de Ganhadores Únicos

public class exercicio27 {
     public static void main(String[] args) {
        // Lista com nomes repetidos
        List<String> participantes = Arrays.asList(
            "Ana", "Bruno", "Ana", "Carlos", "Diana", "Bruno", "Eduardo"
        );

        // Remover duplicatas mantendo apenas um por participante
        Set<String> participantesUnicos = new HashSet<>(participantes);
        List<String> listaUnica = new ArrayList<>(participantesUnicos);

        // Embaralhar e sortear 3 ganhadores
        Collections.shuffle(listaUnica);
        int quantidadeSorteio = Math.min(3, listaUnica.size()); // evita erro se houver menos de 3

        List<String> ganhadores = listaUnica.subList(0, quantidadeSorteio);

        System.out.println("Ganhadores do sorteio:");
        for (int i = 0; i < ganhadores.size(); i++) {
            System.out.println((i + 1) + "º lugar: " + ganhadores.get(i));
        }
    }
}
