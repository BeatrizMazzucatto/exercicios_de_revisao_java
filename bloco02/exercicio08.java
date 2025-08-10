package bloco02;

//Exceção Personalizada SaldoInsuficienteException

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso.");
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() { return saldo; }
}

// Teste
public class exercicio08 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);
        try {
            conta.sacar(150);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}