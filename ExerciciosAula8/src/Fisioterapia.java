public class Fisioterapia extends Faculdade implements Eventos{

    public Fisioterapia(String nome, String nomeFaculdade, int bloco) {
        super(nome, nomeFaculdade, bloco);
    }

    @Override
    public String matrizCurricular() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fazerMatricula() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String programacao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void conteudoEventos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
