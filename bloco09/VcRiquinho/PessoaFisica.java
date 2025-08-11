
public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    @Override
    public String getDocumento() {
        return cpf;
    }

    // Getter e Setter específico
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
}