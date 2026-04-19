
import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        char opcao;
        Scanner s= new Scanner(System.in);
        
        do
        {
            System.out.print("Produto: ");
            String descricao= s.nextLine();
            System.out.print("Valor: ");
            double valor= s.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade= s.nextInt();

            Produto p= new Produto(descricao, quantidade, valor);

            double icms= p.calcularIcms();
            double total= p.getValor()* p.getQuantidade();

            System.out.println("Descrição: "+ p.getDescricao());
            System.out.println("Valor: "+ p.getValor());
            System.out.println("Total: "+ total);
            System.out.println("ICMS: "+ icms);

            System.out.print("\nDeseja encerrar o programa? (S/N): ");
            opcao= s.next().charAt(0);
            s.nextLine();
            System.out.print("\n");
        } while(opcao!= 'S' && opcao!= 's');
    }
}
