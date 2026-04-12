import java.time.LocalDate;

public class TesteVenda {
    public static void main(String[] args) {
        try {
            Produto p1= new Produto(1, "iPhone 15", 3000, Categoria.ELETRÔNICO);
            Produto p2= new Produto(2, "MacBook Pro M4", 10000, Categoria.ELETRÔNICO);
            Produto p3= new Produto(3, "MacBook Pro M4 Max", 25000, Categoria.ELETRÔNICO);

            Venda v1= new Venda(p1, LocalDate.now(), 3);
            v1.calcularVenda();

            Venda v2= new Venda(p3, LocalDate.now(), 1);
            v2.calcularVenda();

            Venda v3= new Venda(p2, LocalDate.now(), 2);
            v3.calcularVenda();

            double total= v1.getTotalVenda()+ v2.getTotalVenda()+ v3.getTotalVenda();

            System.out.println("Total por Item:");
            System.out.println("-----------------------------------------");
            System.out.println(v1.mostrarVenda());
            System.out.println(v2.mostrarVenda());
            System.out.println(v3.mostrarVenda());
            System.out.println("-----------------------------------------");
            System.out.println("Total Geral Venda:"+ total);

        } catch (PrecoException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
