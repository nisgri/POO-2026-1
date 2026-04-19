
import java.time.LocalDate;

public class Venda implements FinalizarVenda{
    private Produto produto;
    private LocalDate dataDaCompra;
    private int quantidade;
    private double totalVenda;
    
    public Venda(Produto produto, LocalDate dataDaCompra, int quantidade) {
        this.produto = produto;
        this.dataDaCompra = dataDaCompra;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Venda [produto=" + produto + ", dataCompra=" + dataDaCompra + ", quantidade=" + quantidade
                + ", totalVenda=" + totalVenda + "]";
    }
 
    public Produto getProduto() {
        return produto;
    }

    public LocalDate getDataDaCompra() {
        return dataDaCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    @Override
    public void calcularVenda() {
        totalVenda= produto.getValor()* quantidade;
    }

    public String mostrarVenda() {
        return produto.getDescricao()+ " - "+ totalVenda;
    }
}