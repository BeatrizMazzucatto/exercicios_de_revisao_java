
public class RendaVariavel extends ProdutoInvestimento {
    private double rendimentoEsperado;

    public RendaVariavel(String nome, String descricao, double rendimentoEsperado) {
        super(nome, descricao);
        this.rendimentoEsperado = rendimentoEsperado;
    }

    // Getter e Setter específico
    public double getRendimentoEsperado() { return rendimentoEsperado; }
    public void setRendimentoEsperado(double rendimentoEsperado) { this.rendimentoEsperado = rendimentoEsperado; }
}