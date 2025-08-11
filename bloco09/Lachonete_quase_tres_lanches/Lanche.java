package bloco09.Lachonete_quase_tres_lanches;

import java.util.Date;

public class Lanche extends Item {
    private String tipoPao;
    private String recheio;
    private String molho;

    public Lanche(double preco, Date dataValidade, double peso, 
                 String tipoPao, String recheio, String molho) {
        super(preco, dataValidade, peso);
        this.tipoPao = tipoPao;
        this.recheio = recheio;
        this.molho = molho;
    }

    @Override
    public String descricao() {
        return String.format("Lanche - Pão: %s, Recheio: %s, Molho: %s - R$%.2f", 
                            tipoPao, recheio, molho, preco);
    }

    // Getters e Setters específicos
    public String getTipoPao() { return tipoPao; }
    public String getRecheio() { return recheio; }
    public String getMolho() { return molho; }
}