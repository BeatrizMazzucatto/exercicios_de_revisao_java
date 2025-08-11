
public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    @Override
    public double calcularRendimento(int dias) {
        return 0; // Conta corrente não gera rendimento
    }

    @Override
    public double calcularTaxaServico(double rendimento) {
        return 0; // Sem taxa para conta corrente
    }
}