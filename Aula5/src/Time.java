public class Time {
    private String nome;
    private String tecnico;
    private Jogador[] jogadores;

    public Time(String nome, String tecnico, Jogador[] jogadores) {
        this.jogadores = jogadores;
        this.nome = nome;
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "nome:"+ nome+ ", tecnico:"+ tecnico;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador j)
    {
        for (int i = 0; i < jogadores.length; i++)
            if(jogadores[i]== null)
            {
                jogadores[i]= j;
                return;
            }
    }

    public void listarJogadores()
    {
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i]);
        }
    }
}
