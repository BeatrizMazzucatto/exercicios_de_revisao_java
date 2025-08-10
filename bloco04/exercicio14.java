package bloco04;

import java.util.HashSet;
import java.util.Set;

//Unicidade de E-mails (HashSet)

public class exercicio14 {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();
        emails.add("a@ex.com");
        emails.add("b@ex.com");
        emails.add("a@ex.com"); // duplicado
        System.out.println("Tamanho: " + emails.size()); // 2
    }
}
