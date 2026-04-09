public class Pessoa {

    enum EstadoCivil
    {
        CASADO('C'), SOLTEIRO('S'), VIUVO('V'), DIVORCIADO('D');
        private char tipo;

        private EstadoCivil(char tipo) {
            this.tipo = tipo;
        }
    }

    private int id;
    private String nome;
    private EstadoCivil estadoCivil;

    public Pessoa(int id, String nome, EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", estadoCivil=" + estadoCivil + "]";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
}
