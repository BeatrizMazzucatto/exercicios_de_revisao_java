package bloco09.Lachonete_quase_tres_lanches;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private List<Item> itens;
    private double taxaServico;

    public Pedido(String cliente, double taxaServico) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.taxaServico = taxaServico;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        // MUDANÇA: Corrigido o método de referência para pegar o preço do item
        double subtotal = itens.stream().mapToDouble(Item::getPreco).sum();
        return subtotal + (subtotal * taxaServico);
    }

    public String gerarNota() {
        StringBuilder nota = new StringBuilder();
        nota.append("Nota Fiscal - Cliente: ").append(cliente).append("\n");
        nota.append("Itens:\n");
        
        for (Item item : itens) {
            nota.append("- ").append(item.descricao()).append("\n");
        }
        
        double subtotal = itens.stream().mapToDouble(Item::getPreco).sum();
        double taxa = subtotal * taxaServico;
        double total = subtotal + taxa;
        
        nota.append(String.format("\nSubtotal: R$%.2f\n", subtotal));
        nota.append(String.format("Taxa de serviço (%.0f%%): R$%.2f\n", taxaServico*100, taxa));
        nota.append(String.format("Total: R$%.2f", total));
        
        return nota.toString();
    }

    public double calcularTroco(double valorRecebido) {
        return valorRecebido - calcularTotal();
    }

    // Getters e Setters
    public String getCliente() { return cliente; }
    public List<Item> getItens() { return itens; }
    public double getTaxaServico() { return taxaServico; }
}