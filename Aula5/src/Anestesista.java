public class Anestesista extends Medico{
    private String tipoAnestesia;

    public Anestesista(String empresa, String crm, String nome, String tipoAnestesia) {
        super(empresa, crm, nome);
        this.tipoAnestesia = tipoAnestesia;
    }

    @Override
    public String toString()
    {
        return super.toString()+ ", tipoAnestesia:"+ tipoAnestesia;
    }

    public String getTipoAnestesia() {
        return tipoAnestesia;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento()+ 1500;
    }
}
