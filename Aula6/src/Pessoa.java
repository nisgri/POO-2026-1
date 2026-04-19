public class Pessoa implements Tributos{
    private String nome;
    private double rendimentos;

    public Pessoa(String nome, double rendimentos) {
        this.nome = nome;
        this.rendimentos = rendimentos;
    }

    @Override
    public String toString() {
        return "nome:"+ nome+ ", rendimentos:"+ rendimentos;
    }

    public String getNome() {
        return nome;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    @Override
    public double calcularIcms() {
        return 0;
    }

    @Override
    public double calcularImpostoRenda() {
        return rendimentos* ImpostoRendaPF;
    }
}
