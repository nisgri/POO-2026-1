public class Cliente {
    protected int codigo;
    protected String nome;
    protected String email;

    public Cliente(int codigo, String email, String nome) {
        this.codigo = codigo;
        this.email = email;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
