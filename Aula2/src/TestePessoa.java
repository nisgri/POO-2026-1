import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p= new Pessoa();
        Scanner sc= new Scanner(System.in);

        System.out.print("Código ID: ");
        p.setId(sc.nextInt());
        //p.id= sc.nextInt();

        System.out.print("Nome: ");
        p.setNome(sc.next());
        //p.nome= sc.next();

        System.out.print("Altura: ");
        p.setAltura(sc.nextDouble());
        //p.altura= sc.nextDouble();

        System.out.print("Peso: ");
        p.setPeso(sc.nextDouble());
        //p.peso= sc.nextDouble();

        System.out.println(p.getNome()+ " está com "+ p.resultado());
    }
}
