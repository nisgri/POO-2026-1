public class EnsinoMedio extends ColegioAplicacao{
    private int numeroAlunos;

    public EnsinoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
        super(nome, nomeCoordenador);
        this.numeroAlunos = numeroAlunos;
    }

    @Override
    public void fazerMatricula() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void reuniaoDePais() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
