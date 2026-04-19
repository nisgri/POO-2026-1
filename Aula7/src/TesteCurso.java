public class TesteCurso {
    public static void main(String[] args) {
        Turma t1= new Turma("Java O.O", PeriodoCurso.MANHA);
        Turma t2= new Turma("React", PeriodoCurso.INTEGRAL);

        System.out.println(t1.getCurso());
        System.out.println(t1.getPc().getDia());
        System.out.println(t1.getPc().getValor());
        System.out.println(t1.getPc().getCargaHoraria());
    }
}
