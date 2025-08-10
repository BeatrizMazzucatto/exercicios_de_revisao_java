package bloco04;

import java.util.LinkedHashSet;
import java.util.Set;

//Ordem de Inserção (LinkedHashSet)
// Dias da Semana

public class exercicio15 {
    public static void main(String[] args) {
        Set<String> dias = new LinkedHashSet<>();
        dias.add("Quarta");
        dias.add("Segunda");
        dias.add("Sexta");
        System.out.println("Ordem de inserção: " + dias);
    }
}
