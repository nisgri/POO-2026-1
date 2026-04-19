public class TesteLivro {
    public static void main(String[] args) {
        Livro l1= new Livro("Marco Antônio", "Cisco CCNA", 85);
        Livro l2= new Livro("Kathy Sierra", "Use a Cabeça Java", 98);

        Operacao o1= new Operacao("venda", l1);
        Operacao o2= new Operacao("empréstimo", l2);

        l1.reajuste(0.06);
        o1.venderLivro();
        o2.emprestarLivro();

        System.out.println(o1);
        System.out.println(o2);
    }
}
