package bloco04;

import java.util.TreeSet;

//Objetos Personalizados em TreeSet
//Produtos Ordenados

class Produto implements Comparable<Produto> {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return nome + " (R$" + preco + ")";
    }
}

public class exercicio17 {
    public static void main(String[] args) {
        TreeSet<Produto> produtos = new TreeSet<>();
        produtos.add(new Produto("Arroz", 5.0));
        produtos.add(new Produto("Feijão", 8.0));
        produtos.add(new Produto("Açúcar", 3.5));
        System.out.println("Produtos ordenados por preço: " + produtos);
    }
}
