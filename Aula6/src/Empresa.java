public class Empresa implements Tributos{
    private String razaoSocial;
    private double rendimentos;

    public Empresa(String razaoSocial, double rendimentos) {
        this.razaoSocial = razaoSocial;
        this.rendimentos = rendimentos;
    }

    @Override
    public String toString() {
        return "razaoSocial:"+ razaoSocial+ ", rendimentos:"+ rendimentos;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    @Override
    public double calcularIcms() {
        return rendimentos* icms;
    }

    @Override
    public double calcularImpostoRenda() {
        return rendimentos* ImpostoRendaPJ;
    }
}
