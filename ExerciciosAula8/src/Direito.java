public class Direito extends Faculdade implements Oab, Eventos{
    private int tempoDuracao;

    public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
        super(nome, nomeFaculdade, bloco);
        this.tempoDuracao = tempoDuracao;
    }

    @Override
    public String toString() {
        return "Direito [tempoDuracao=" + tempoDuracao + "]";
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    @Override
    public String matrizCurricular() {
        return "Linguagem e Redação I - 72 horas\n"+
               "História do Direito - 36 horas\n"+
               "Introdução ao Direito - 72 horas\n"+
               "Ciência Política";
    }

    @Override
    public void fazerMatricula() {
        System.out.println("Matrícula realizada com sucesso.");
    }

    @Override
    public String programacao() {
        return "Projetos e Atividades de Extensão de 2 em duas semanas.";
    }

    @Override
    public void conteudoEventos() {
        System.out.println("Projetos e Atividades de Extensão de Curso");
    }

    @Override
    public boolean realizarProva() {
        if(tempoDuracao> 35640) {
            System.out.println("A prova será realizada.");
            return true;
        }
        System.out.println("A prova não será realizada.");
        return false;
    }
}
