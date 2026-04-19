public class TesteSorteio {
    public static void main(String[] args) {
        Funcionario f1= new Funcionario("João", 2000);
        Funcionario f2= new Funcionario("Maria", 4000);
        Funcionario f3= new Funcionario("Adriana", 2000);
        Funcionario f4= new Funcionario("Carlos", 3000);

        Sorteio<Funcionario> sorteio1= new Sorteio<>();
        sorteio1.adicionar(f1);
        sorteio1.adicionar(f2);
        sorteio1.adicionar(f3);
        sorteio1.adicionar(f4);

        System.out.println("Funcionário sorteado foi "+ sorteio1.sortear());

        Sorteio<Integer> sorteio2= new Sorteio<>();
        sorteio2.adicionar(10);
        sorteio2.adicionar(30);
        sorteio2.adicionar(40);

        System.out.println("O número sorteado foi "+ sorteio2.sortear());

        Sorteio<String> sorteio3= new Sorteio<>();
        sorteio3.adicionar("Celular");
        sorteio3.adicionar("Som");
        sorteio3.adicionar("TV");

        System.out.println("O equipamento sorteado foi "+ sorteio3.sortear());
    }
}
