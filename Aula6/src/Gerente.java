public class Gerente extends Funcionario{
    private String nivel;

    public Gerente(int id, String nome, double salario, String turno, Setor setor, String nivel) {
        super(id, nome, salario, turno, setor);
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString()+ "nivel:"+ nivel;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public void reajustarSalario() {
        salario*= 1.15;
    }
}
