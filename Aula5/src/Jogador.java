public class Jogador {
    private String nome;
    private int idade;
    private String posicao;

    public Jogador(String nome, int idade, String posicao) {
        this.idade = idade;
        this.nome = nome;
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "nome:"+ nome+ ", idade:"+ idade+ ", posicao:"+ posicao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    
}
