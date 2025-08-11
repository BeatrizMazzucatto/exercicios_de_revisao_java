
public class RendaFixa extends ProdutoInvestimento {
    private double rendimentoMensal;
    private int periodoCarencia; // em dias

    public RendaFixa(String nome, String descricao, double rendimentoMensal, int periodoCarencia) {
        super(nome, descricao);
        this.rendimentoMensal = rendimentoMensal;
        this.periodoCarencia = periodoCarencia;
    }

    // Getters e Setters específicos
    public double getRendimentoMensal() { return rendimentoMensal; }
    public void setRendimentoMensal(double rendimentoMensal) { this.rendimentoMensal = rendimentoMensal; }
    public int getPeriodoCarencia() { return periodoCarencia; }
    public void setPeriodoCarencia(int periodoCarencia) { this.periodoCarencia = periodoCarencia; }
}