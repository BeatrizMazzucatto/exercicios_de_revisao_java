
public class Main {

    public static void main(String[] args) {
        // 1. Inicializar o gerenciador principal
        VeRiquinhoManager manager = new VeRiquinhoManager();

        // 2. Criar e adicionar clientes
        System.out.println("--- Adicionando Clientes ---");
        Cliente clientePF = new PessoaFisica("João da Silva", "joao.silva@email.com", "123.456.789-00");
        Cliente clientePJ = new PessoaJuridica("Empresa XYZ", "contato@empresa.xyz", "11.222.333/0001-44");
        
        manager.adicionarCliente(clientePF);
        manager.adicionarCliente(clientePJ);
        System.out.println("Cliente Pessoa Física adicionado: " + clientePF.getNome());
        System.out.println("Cliente Pessoa Jurídica adicionado: " + clientePJ.getNome());
        System.out.println("--------------------------------\n");

        // 3. Criar e adicionar produtos de investimento
        System.out.println("--- Adicionando Produtos de Investimento ---");
        ProdutoInvestimento cdb = new RendaFixa("CDB Banco X", "CDB com liquidez diária", 0.01, 1); // 1% ao mês
        ProdutoInvestimento acoes = new RendaVariavel("Ações da Empresa Y", "Ações do setor de tecnologia", 0.02); // 2% de rendimento esperado

        manager.adicionarProduto(cdb);
        manager.adicionarProduto(acoes);
        System.out.println("Produto de Renda Fixa adicionado: " + cdb.getNome());
        System.out.println("Produto de Renda Variável adicionado: " + acoes.getNome());
        System.out.println("------------------------------------------\n");
        
        // 4. Buscar um cliente para demonstração
        Cliente clienteEncontrado = manager.buscarClientePorDocumento("123.456.789-00");

        if (clienteEncontrado != null) {
            System.out.println("--- Iniciando Simulação de Rendimento ---");
            // 5. Simular o rendimento para o cliente encontrado por 30 dias
            // O método getContasDoCliente() em VeRiquinhoManager cria contas de exemplo.
            String simulacao = manager.simularRendimento(clienteEncontrado, 30);
            System.out.println(simulacao);
            System.out.println("------------------------------------------\n");
        } else {
            System.out.println("Cliente não encontrado para simulação.");
        }
        
        // 6. Demonstrar a remoção de um cliente
        System.out.println("--- Removendo um Cliente ---");
        boolean removido = manager.removerCliente("11.222.333/0001-44");
        if (removido) {
            System.out.println("Cliente com documento '11.222.333/0001-44' foi removido.");
        } else {
            System.out.println("Não foi possível remover o cliente.");
        }
        
        Cliente clienteRemovido = manager.buscarClientePorDocumento("11.222.333/0001-44");
        if (clienteRemovido == null) {
            System.out.println("Confirmação: Cliente não encontrado após remoção.");
        }
        System.out.println("----------------------------");
    }
}