public class ClientePJ extends Cliente{
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public ClientePJ(int codigo, String email, String nome, String cnpj, String razaoSocial, String inscricaoEstadual) {
        super(codigo, email, nome);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
}
