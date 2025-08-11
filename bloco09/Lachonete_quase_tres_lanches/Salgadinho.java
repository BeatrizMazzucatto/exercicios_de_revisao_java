package bloco09.Lachonete_quase_tres_lanches;

public class Salgadinho extends Item {
    private String tipo; // frito ou assado
    private String massa;
    private String recheio;

    public Salgadinho(double preco, java.util.Date validade, double peso, 
                     String tipo, String massa, String recheio) {
        super(preco, validade, peso);
        this.tipo = tipo;
        this.massa = massa;
        this.recheio = recheio;
    }

    @Override
    public String descricao() {
        return String.format("Salgadinho - Tipo: %s, Massa: %s, Recheio: %s - R$%.2f", 
                            tipo, massa, recheio, preco);
    }

    // Getters e Setters específicos
    public String getTipo() { return tipo; }
    public String getMassa() { return massa; }
    public String getRecheio() { return recheio; }
}
