import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        int opcao;
        Scanner s= new Scanner(System.in);

        do
        {
            double valor1;
            double valor2;

            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao= s.nextInt();

            switch(opcao)
            {
                case 1:
                {
                    System.out.println("\n");
                    System.out.print("Qual é o primeiro valor? ");
                    valor1= s.nextInt();
                    System.out.print("Digite a opção desejada: ");
                    valor2= s.nextInt();
                    System.out.println("O resultado da soma é "+ Calculadora.soma(valor1, valor2));
                    System.out.println("\n");
                    break;
                }

                case 2:
                {
                    System.out.println("\n");
                    System.out.print("Qual é o primeiro valor? ");
                    valor1= s.nextInt();
                    System.out.print("Digite a opção desejada: ");
                    valor2= s.nextInt();
                    System.out.println("O resultado da subtração é "+ Calculadora.subtracao(valor1, valor2));
                    System.out.println("\n");
                    break;
                }

                case 3:
                {
                    System.out.println("\n");
                    System.out.print("Qual é o primeiro valor? ");
                    valor1= s.nextInt();
                    System.out.print("Digite a opção desejada: ");
                    valor2= s.nextInt();
                    System.out.println("O resultado da multiplicação é "+ Calculadora.multiplicacao(valor1, valor2));
                    System.out.println("\n");
                    break;
                }

                case 4:
                {
                    System.out.println("\n");
                    System.out.print("Qual é o primeiro valor? ");
                    valor1= s.nextInt();
                    System.out.print("Digite a opção desejada: ");
                    valor2= s.nextInt();
                    System.out.println("O resultado da divisão é "+ Calculadora.divisao(valor1, valor2));
                    System.out.println("\n");
                    break;
                }

                case 5:
                {
                    System.out.println("\n");
                    System.out.println("Saindo...");
                    System.out.println("\n");
                    break;
                }

                default:
                { 
                    System.out.println("\n");
                    System.out.println("Opção inválida!");
                    System.out.println("\n");
                    break;
                }
            }
        } while(opcao!= 5);
    }
}
