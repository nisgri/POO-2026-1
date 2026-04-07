public class Fixo extends Vendedor{
    private double salarioBase;
    private double comissao;
    private double salarioBruto;

    public Fixo(String nome, String cpf, double salarioBase, double comissao, double salarioBruto) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.salarioBruto = salarioBruto;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void calcularSalario(double valorVenda)
    {
        double calculoComissao= valorVenda* comissao/100;

        salarioBruto= salarioBruto+ calculoComissao;
    }
}
