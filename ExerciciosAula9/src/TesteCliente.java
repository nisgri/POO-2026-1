
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        int id, idade;
        String nome, telefone;
        Scanner s= new Scanner(System.in);
        List clientes= new ArrayList<>();
        int contador= 0;

        do { 
            System.out.println("***Digite um valor negativo abaixo para encerrar o programa***");
            System.out.print("Qual o ID do cliente? ");
            id= s.nextInt();
            s.nextLine();

            if(id>= 0) {
                System.out.print("Qual o nome do cliente? ");
                nome= s.nextLine();
                System.out.print("Qual a idade do cliente? ");
                idade= s.nextInt();
                s.nextLine();
                System.out.print("Qual o telefone do cliente? ");
                telefone= s.nextLine();

                clientes.add(new Cliente(id, idade, nome, telefone));
                
                contador++;

                System.out.println("\n");
            }
        } while (id> 0);

        if(contador> 0) {
            System.out.println("\n");
            for (Object cliente : clientes) {
                System.out.println(cliente);
            }
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }
    }
}
