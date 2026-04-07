
import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Qual o nome do produto? ");
        String nome= s.nextLine();
        System.out.print("Qual o código do produto? ");
        int id= s.nextInt();
        System.out.print("E o preço? R$");
        double preco= s.nextDouble();

        Produto p= new Produto(id, nome, preco);

        System.out.println("Produto: "+ p.getNome());
        System.out.println("ID do produto: "+ p.getId());
        System.out.println("Preco: R$"+ p.getPreco());
    }
}
