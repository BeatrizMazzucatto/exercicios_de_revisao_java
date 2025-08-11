package bloco09.Lachonete_quase_tres_lanches;

import java.util.Date;

public abstract class Item {
    protected double preco;
    protected Date dataValidade;
    protected double peso;

    public Item(double preco, Date dataValidade, double peso) {
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.peso = peso;
    }

    public abstract String descricao();

    public double calcularTotal() {
        return preco;
    }

    // Getters e Setters
    public double getPreco() { return preco; }
    public Date getDataValidade() { return dataValidade; }
    public double getPeso() { return peso; }
}