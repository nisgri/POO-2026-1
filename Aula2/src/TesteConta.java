import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Conta conta = new Conta();
        int numero;
        String titular;
        double valor;
        char resposta;

        do
        {
            System.out.println("Digite o número da conta: ");
            //conta.numero = 123;
            numero= sc.nextInt();
            conta.numero= numero;

            System.out.println("Informe o nome do titular da conta: ");
            //conta.titular = "Maria";
            titular= sc.next();
            conta.titular= titular;

            System.out.println("Qual o valor do depósito? ");
            //conta.depositar(1000);
            valor= sc.nextDouble();
            conta.depositar(valor);

            System.out.println("Quanto deseja sacar? ");
            valor= sc.nextDouble();

            if (conta.saque(valor)) {
                System.out.println("Saque efetuado");
            } else {
                System.out.println("Saque não efetuado");
            }
            System.out.println("Saldo atual: R$"+conta.saldo);

            System.out.println("Deseja adicionar mais uma conta? (s/n)");
            resposta = sc.next().charAt(0);
        } while(resposta!= 'N' && resposta!= 'n');
    }
}