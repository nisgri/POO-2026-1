public class TesteImovel {
    public static void main(String[] args) {
        Proprietario p1= new Proprietario(1, "Arthur");
        Proprietario p2= new Proprietario(2, "Carol");
        Imovel i1= new Imovel("Casa", "Rua Bingen", 195000, p1);
        Imovel i2= new Imovel("Apto", "Rua Fonseca Ramos", 250000, p2);

        System.out.println(i1);
        System.out.println(i2);
    }
}
