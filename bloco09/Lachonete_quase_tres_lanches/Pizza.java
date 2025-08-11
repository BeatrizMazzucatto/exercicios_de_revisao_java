package bloco09.Lachonete_quase_tres_lanches;

import java.util.Date;

public class Pizza extends Item {
    private String recheio;
    private String borda;
    private String molho;

    public Pizza(double preco, Date dataValidade, double peso, 
                 String recheio, String borda, String molho) {
        super(preco, dataValidade, peso);
        this.recheio = recheio;
        this.borda = borda;
        this.molho = molho;
    }

    public String descricao() {
        return String.format("Pizza - Recheio: %s, Borda: %s, Molho: %s - R$%.2f", 
                            recheio, borda, molho, preco);
    }

    // Getters e Setters específicos
    public String getRecheio() { return recheio; }
    public String getBorda() { return borda; }
    public String getMolho() { return molho; }
}
