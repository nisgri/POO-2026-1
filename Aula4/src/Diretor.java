public class Diretor extends Funcionario{
    private String setor;

    public Diretor(int matricula, String nome, String cpf, double salario, String setor) {
        super(matricula, nome, cpf, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    @Override
    public double reajusteSalario()
    {
        return salario= super.reajusteSalario()+ 1000;
    }
}
