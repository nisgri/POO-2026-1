public class FreeLancer extends Vendedor{
    private int diasTrabalhados;
    private double valorDia;

    public FreeLancer(String cpf, String nome, int diasTrabalhados, double valorDia) {
        super(cpf, nome);
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }
}
