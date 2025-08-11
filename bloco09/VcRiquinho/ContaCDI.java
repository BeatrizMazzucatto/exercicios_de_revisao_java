
public class ContaCDI extends Conta {
    private static final double TAXA_SERVICO = 0.0007; // 0.07%
    private static final double CDI_DIARIO = 0.0035; // Aproximação do CDI diário

    public ContaCDI(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimento = 0;
        double saldoAtual = saldo;
        
        for (int i = 0; i < dias; i++) {
            double rendimentoDia = saldoAtual * (CDI_DIARIO / 30);
            saldoAtual += rendimentoDia;
            rendimento += rendimentoDia;
        }
        
        return rendimento;
    }

    @Override
    public double calcularTaxaServico(double rendimento) {
        return rendimento * TAXA_SERVICO;
    }
}