public class AssistenteProducao extends Assistente{
    private String especialidade;

    public AssistenteProducao(int id, String nome, double salario, String turno, Setor setor, double adicional, String especialidade) {
        super(id, nome, salario, turno, setor, adicional);
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString()+ "especialidade:"+ especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
