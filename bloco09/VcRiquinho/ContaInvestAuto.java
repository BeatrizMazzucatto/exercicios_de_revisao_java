
import java.util.ArrayList;
import java.util.List;

public class ContaInvestAuto extends Conta {
    private List<ProdutoInvestimento> produtos;

    public ContaInvestAuto(double saldo, Cliente cliente) {
        super(saldo, cliente);
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoInvestimento produto) {
        produtos.add(produto);
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimentoTotal = 0;
        
        for (ProdutoInvestimento produto : produtos) {
            if (produto instanceof RendaFixa) {
                RendaFixa rendaFixa = (RendaFixa) produto;
                if (dias >= rendaFixa.getPeriodoCarencia()) {
                    rendimentoTotal += saldo * rendaFixa.getRendimentoMensal() * (dias / 30.0);
                }
            } else if (produto instanceof RendaVariavel) {
                RendaVariavel rendaVariavel = (RendaVariavel) produto;
                rendimentoTotal += saldo * rendaVariavel.getRendimentoEsperado() * (dias / 30.0);
            }
        }
        
        return rendimentoTotal;
    }

    @Override
    public double calcularTaxaServico(double rendimento) {
        if (cliente instanceof PessoaFisica) {
            return rendimento * 0.001; // 0.1% para PF
        } else if (cliente instanceof PessoaJuridica) {
            return rendimento * 0.0015; // 0.15% para PJ
        }
        return 0;
    }
}
