public class TesteJogador {
    public static void main(String[] args) {
        Time t= new Time("Santos", "Cuca", new Jogador[3]);

        Jogador j1= new Jogador("Neymar", 33, "Atacante");
        Jogador j2= new Jogador("Pelé", 40, "Meia");
        Jogador j3= new Jogador("Cássio", 40, "Goleiro");

        t.adicionarJogador(j1);
        t.adicionarJogador(j2);
        t.adicionarJogador(j3);

        System.out.println(t.getNome());
        t.listarJogadores();
    }
}
