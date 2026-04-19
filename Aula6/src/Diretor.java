public class Diretor extends Funcionario{
    private String categoria;

    public Diretor(int id, String nome, double salario, String turno, Setor setor, String categoria) {
        super(id, nome, salario, turno, setor);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString()+ "categoria:"+ categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public void reajustarSalario() {
        salario*= 1.1+ 1000;
    }
}
