public class Imovel {
    private String tipo;
    private String endereco;
    private double preco;
    private Proprietario p;

    public Imovel(String tipo, String endereco, double preco, Proprietario p) {
        this.endereco = endereco;
        this.p = p;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tipo:"+ tipo+ ", endereco:"+ endereco+ 
            ", valor:"+ preco + ", proprietario:"+ p;
    }    

    public String getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public Proprietario getP() {
        return p;
    }
}
