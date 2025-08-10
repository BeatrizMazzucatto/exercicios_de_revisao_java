package bloco07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Catálogo de Produtos por Categoria

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " (R$" + preco + ")";
    }
}

public class exercicio26 {
    public static void main(String[] args) {
        // Map: categoria -> lista de produtos
        Map<String, List<Produto>> catalogo = new HashMap<>();

        // Criando listas de produtos
        List<Produto> eletronicos = Arrays.asList(
            new Produto("Notebook", 3500.0),
            new Produto("Mouse", 80.0),
            new Produto("Teclado", 150.0)
        );
        List<Produto> livros = Arrays.asList(
            new Produto("Java Guia do Programador", 120.0),
            new Produto("Clean Code", 95.0)
        );

        // Adicionando ao catálogo
        catalogo.put("Eletrônicos", eletronicos);
        catalogo.put("Livros", livros);

        // Listar produtos de uma categoria
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a categoria: ");
        String categoria = sc.nextLine();

        if (catalogo.containsKey(categoria)) {
            System.out.println("\nProdutos da categoria '" + categoria + "':");
            catalogo.get(categoria).forEach(System.out::println);
        } else {
            System.out.println("Categoria não encontrada.");
        }

        sc.close();
    }
}
