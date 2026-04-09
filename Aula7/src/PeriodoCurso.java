public enum PeriodoCurso {
    MANHA("ter e qui", 40, 1000), NOITE("seg e qua", 80, 2500), INTEGRAL("sex", 120, 4000);

    private String dia;
    private int cargaHoraria;
    private double valor;

    private PeriodoCurso(String dia, int cargaHoraria, double valor) {
        this.dia = dia;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

    public String getDia() {
        return dia;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }
}
