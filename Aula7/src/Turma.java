public class Turma {
    private String curso;
    private PeriodoCurso pc;

    public Turma(String curso, PeriodoCurso pc) {
        this.curso = curso;
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Turma [curso=" + curso + ", pc=" + pc + "]";
    }    

    public String getCurso() {
        return curso;
    }

    public PeriodoCurso getPc() {
        return pc;
    }
}
