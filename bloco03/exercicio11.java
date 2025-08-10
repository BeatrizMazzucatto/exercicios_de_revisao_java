package bloco03;

import java.util.*;

//Manipulando o Início e o Fim (LinkedList)
//FilaAtendimento

public class exercicio11 {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");
        fila.add("Diana");
        fila.add("Eduardo");

        fila.removeFirst(); // atende
        fila.removeFirst();

        fila.addFirst("Fernanda"); // prioritário
        fila.addFirst("Gustavo");

        System.out.println("Fila final: " + fila);
    }
}
