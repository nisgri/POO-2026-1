public class TesteProduto {
    public static void main(String[] args) {
        Produto p= new Produto(1, "Celular", "iPhone SE 2022");

        System.out.println(p);

        System.out.println("---------------------");
        System.out.println(p.nome());
        p.imprimir();
    }
}
