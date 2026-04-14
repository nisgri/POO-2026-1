public abstract class Cartao implements Pagavel{
    protected String numero;
    protected String dataValidade;
    
    public Cartao(String numero, String dataValidade) {
        this.numero = numero;
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Cartao [numero=" + numero + ", dataValidade=" + dataValidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
