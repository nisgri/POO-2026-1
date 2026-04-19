import java.util.Scanner;

public class TesteVendedor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double venda, total= 0;
        char opcao;
        int vendedor;

        Fixo v1= new Fixo("Jorge", "123.456.789-10", 2000, 25, 2000);
        Fixo v2= new Fixo("Kennedy", "987.654.321-00", 1500, 33.3, 1500);
        
        do
        {
            System.out.println("----------Sistema de Vendas----------");
            System.out.println("Vendedores:\n1 - Jorge\n2 - Kennedy");
            System.out.print("Escolha o vendedor: ");
            vendedor= s.nextInt();
            System.out.println("");

            switch(vendedor)
            {
                case 1:
                {
                    System.out.print("Digite o valor da venda: R$");
                    venda= s.nextDouble();
                    total+= venda;
                    v1.calcularSalario(venda);
                    break;
                }
                case 2:
                {
                    System.out.print("Digite o valor da venda: R$");
                    venda= s.nextDouble();
                    total+= venda;
                    v2.calcularSalario(venda);
                    break;
                }
                default:
                {
                    System.out.println("Opção inválida!");
                }
            }

            System.out.println("");
            System.out.println("Deseja encerrar o programa? (S/N)");
            opcao= s.next().charAt(0);
            System.out.println("");
        } while(opcao== 'N' || opcao=='n');

        System.out.println("---------Salário dos Vendedores---------");
        System.out.println("Nome: "+ v1.getNome()+ "\n"+ "Salário Bruto: R$ "+ v1.getSalarioBruto());
        System.out.println("Nome: "+ v2.getNome()+ "\n"+ "Salário Bruto: R$ "+ v2.getSalarioBruto());
        System.out.println("------------Total Vendido------------");
        System.out.println("Total: R$"+ total);
    }
}
