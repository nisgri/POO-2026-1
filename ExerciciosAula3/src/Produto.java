public class Produto {
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto(String descricao, int quantidade, double valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularIcms()
    {
        double resultado= (valor * quantidade) * 0.12;
        return resultado;
    }
}
