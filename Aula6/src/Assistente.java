public class Assistente extends Funcionario{
    protected double adicional;

    public Assistente(int id, String nome, double salario, String turno, Setor setor, double adicional) {
        super(id, nome, salario, turno, setor);
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return super.toString()+ "adicional:" + adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    @Override
    public void reajustarSalario() {
        salario*= 1.1;
    }
}
