
import java.util.ArrayList;
import java.util.List;

public class VeRiquinhoManager {
    private List<Cliente> clientes;
    private List<ProdutoInvestimento> produtos;

    public VeRiquinhoManager() {
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
    }

    // CRUD Clientes
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorDocumento(String documento) {
        for (Cliente cliente : clientes) {
            if (cliente.getDocumento().equals(documento)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean atualizarCliente(String documento, Cliente novoCliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento().equals(documento)) {
                clientes.set(i, novoCliente);
                return true;
            }
        }
        return false;
    }

    public boolean removerCliente(String documento) {
        return clientes.removeIf(cliente -> cliente.getDocumento().equals(documento));
    }

    // CRUD Produtos
    public void adicionarProduto(ProdutoInvestimento produto) {
        produtos.add(produto);
    }

    public ProdutoInvestimento buscarProdutoPorNome(String nome) {
        for (ProdutoInvestimento produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public boolean atualizarProduto(String nome, ProdutoInvestimento novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.set(i, novoProduto);
                return true;
            }
        }
        return false;
    }

    public boolean removerProduto(String nome) {
        return produtos.removeIf(produto -> produto.getNome().equals(nome));
    }

    // Simulação de rendimento
    public String simularRendimento(Cliente cliente, int dias) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Simulação para ").append(cliente.getNome()).append(" (").append(dias).append(" dias):\n");
        
        double rendimentoTotal = 0;
        double taxaTotal = 0;
        
        // Supondo que cada cliente tem uma lista de contas
        // Na implementação real, você precisaria adicionar essa relação
        List<Conta> contas = getContasDoCliente(cliente);
        
        for (Conta conta : contas) {
            double rendimento = conta.calcularRendimento(dias);
            double taxa = conta.calcularTaxaServico(rendimento);
            
            resultado.append("Conta ").append(conta.getClass().getSimpleName())
                    .append(": Rendimento = R$").append(String.format("%.2f", rendimento))
                    .append(", Taxa = R$").append(String.format("%.2f", taxa)).append("\n");
            
            rendimentoTotal += rendimento;
            taxaTotal += taxa;
        }
        
        resultado.append("TOTAL: Rendimento = R$").append(String.format("%.2f", rendimentoTotal))
                .append(", Taxa = R$").append(String.format("%.2f", taxaTotal));
        
        return resultado.toString();
    }

    // Método auxiliar (na implementação real, isso viria de uma base de dados)
    private List<Conta> getContasDoCliente(Cliente cliente) {
        List<Conta> contas = new ArrayList<>();
        // Exemplo - na prática, você teria uma estrutura de dados para mapear cliente-contas
        contas.add(new ContaCorrente(1000, cliente));
        contas.add(new ContaCDI(5000, cliente));
        return contas;
    }
}