package bloco05;

import java.util.LinkedHashMap;

//Mantendo a Ordem de Cadastro (LinkedHashMap)
// Ordem de Cadastro

public class exercicio21 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();

        // Adicionando produtos fora de ordem numérica
        produtos.put(3, "Teclado");
        produtos.put(1, "Mouse");
        produtos.put(5, "Monitor");
        produtos.put(2, "Webcam");
        produtos.put(4, "Fone");

        System.out.println("Produtos na ordem de inserção:");
        produtos.forEach((codigo, nome) -> System.out.println(codigo + " → " + nome));
    }
}
