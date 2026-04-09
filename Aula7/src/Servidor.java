public class Servidor {
    protected String cpf;
    protected String nome;
    // Atributo constante
    protected final String lotacao;

    public Servidor(String cpf, String nome, String lotacao) {
        this.cpf = cpf;
        this.lotacao = lotacao;
        this.nome = nome;
    }

    

    //o método não ser sobrescrito
    public final String imprimirDados() {
        return "Dados dos servidores";
    }

}