package bloco09.Lachonete_quase_tres_lanches;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LanchoneteMain {
    public static void main(String[] args) throws Exception {
        // Criando alguns itens
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date validade = sdf.parse("30/12/2023");
        
        Pizza pizza = new Pizza(45.90, validade, 0.8, "Calabresa", "Recheada", "Tomate");
        Lanche lanche = new Lanche(22.50, validade, 0.4, "Australiano", "Frango", "Mostarda");
        Salgadinho salgado = new Salgadinho(8.90, validade, 0.2, "Frito", "Queijo", "Frango");
        
        // Criando um pedido
        Pedido pedido = new Pedido("João Silva", 0.10); // 10% de taxa
        
        // Adicionando itens ao pedido
        pedido.adicionarItem(pizza);
        pedido.adicionarItem(lanche);
        pedido.adicionarItem(salgado);
        
        // Gerando nota fiscal
        System.out.println(pedido.gerarNota());
        
        // Calculando troco
        double valorRecebido = 100.00;
        double troco = pedido.calcularTroco(valorRecebido);
        System.out.println("\nValor recebido: R$" + valorRecebido);
        System.out.println("Troco: R$" + String.format("%.2f", troco));
    }
}