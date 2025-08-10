package bloco04;

import java.util.Set;
import java.util.TreeSet;

//Nomes em Ordem Alfabética (TreeSet)

public class exercicio16 {
    public static void main(String[] args) {
        Set<String> nomes = new TreeSet<>();
        nomes.add("Zeca");
        nomes.add("Ana");
        nomes.add("Bruno");
        System.out.println("Ordem alfabética: " + nomes);
    }
}
