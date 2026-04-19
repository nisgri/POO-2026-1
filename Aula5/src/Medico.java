public class Medico extends PlanoSaude {
    protected String crm;
    protected String nome;

    public Medico(String empresa, String crm, String nome) {
        super(empresa);
        this.crm = crm;
        this.nome = nome;
    }

     @Override
    public String toString() {
        return super.toString() + ", crm:" + crm + ", nome:" + nome;
    }

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() * 1.1;
    }
}
