public class TesteBiblioteca {
    public static void main(String[] args) {
        Livro l1= new Livro("As Crônicas de Nárnia", "C. S. Lewis", 50.0);
        Livro l2= new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 60.0);
        Livro l3= new Livro("O Hobbit", "J. R. R. Tolkien", 40.0);
        Livro l4= new Livro("Mitologia Soviética", "Thiago Braga", 50.0);

        Biblioteca b= new Biblioteca("Raim Santos");

        b.adicionar(l1);
        b.adicionar(l2);
        b.adicionar(l3);
        b.adicionar(l4);

        b.listar();

        System.out.println("Existem "+ b.pesquisarFaixaPreco(40.0, 55.0)+ " na faixa de preço entre R$40,00 e R$55,00");

        System.out.println("O valor de todos os livros somados é R$"+ b.totalLivros());

    }
}
