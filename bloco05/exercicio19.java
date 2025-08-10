package bloco05;

import java.util.HashMap;
import java.util.Map;

//Contador de Frequência de Palavras

public class exercicio19 {
    public static void main(String[] args) {
        String texto = "O rato roeu a roupa do rei de Roma e o rei ficou bravo";
        String[] palavras = texto.toLowerCase().split("\\s+"); // divide por espaços

        HashMap<String, Integer> frequencia = new HashMap<>();

        // Contar frequência
        for (String palavra : palavras) {
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        // Exibir resultados
        System.out.println("Frequência das palavras:");
        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
