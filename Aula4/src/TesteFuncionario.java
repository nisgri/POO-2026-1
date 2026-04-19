public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente g= new Gerente(123,"Ana","12345",5000,"123456","ADM",10);
        Diretor d= new Diretor(567, "Maria", "3434", 10000, "Produção");
        
        g.autenticacao("123");

        System.out.println(g.imprimirContraCheque());
        System.out.println(g.toString());

        
    }
}
