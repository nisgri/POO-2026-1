
public class Setor {
    private int codigo;
    private String nome;

    public Setor(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "codigo:"+ codigo+ ", nome:"+ nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
