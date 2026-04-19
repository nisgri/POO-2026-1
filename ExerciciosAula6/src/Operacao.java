public class Operacao implements Livraria, Acrescimo{
    private String tipo;
    private double valorOperacao;
    private Livro livro;
    
    public Operacao(String tipo, Livro livro) {
        this.tipo = tipo;
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Tipo:" + tipo + " Valor:" + valorOperacao + " Autor:" + livro.getAutor() + " Titulo:"+ livro.getTitulo();
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void venderLivro()
    {
        valorOperacao= livro.getValor() * venda;
    }

    @Override
    public void emprestarLivro()
    {
        valorOperacao= livro.getValor() * emprestimo + taxaEmprestimo;
    }
}
