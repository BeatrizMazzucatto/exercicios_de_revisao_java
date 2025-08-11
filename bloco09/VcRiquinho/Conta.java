
public abstract class Conta {
    protected double saldo;
    protected Cliente cliente;

    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public abstract double calcularRendimento(int dias);
    public abstract double calcularTaxaServico(double rendimento);

    // Getters e Setters
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public Cliente getCliente() { return cliente; }
}