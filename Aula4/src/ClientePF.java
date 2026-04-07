public class ClientePF extends Cliente{
    private String cpf;
    private String rg;

    public ClientePF(int codigo, String email, String nome, String cpf, String rg) {
        super(codigo, email, nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}
