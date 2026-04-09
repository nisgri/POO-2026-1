public abstract class Funcionario {
    protected int id;
    protected String nome;
    protected double salario;
    protected String turno;
    protected Setor setor;

    public Funcionario(int id, String nome, double salario, String turno, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "id:"+ id+ ", nome:"+ nome+ ", salario:"+ salario+ ",turno:"+ turno+ ", setor:"+ setor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public Setor getSetor() {
        return setor;
    }

    public abstract void reajustarSalario();
}
