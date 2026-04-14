
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        try {
            Aluno a1= new Aluno("Etelredo", 90, 10);
            System.out.println(a1);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Aluno a2= new Aluno("Dagoberto", 9.5, 10);
            System.out.println(a2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");
        System.out.println("--------------------------------------------------------------");
        System.out.println("\n");

        List alunos= new ArrayList<>();
        Scanner s= new Scanner(System.in);
        String nome;
        double nota1, nota2;
        int contador= 0;

        do { 
            System.out.println("***Digite um valor negativo abaixo para encerrar o programa***");
            System.out.print("Qual foi a nota 1? ");
            nota1= s.nextDouble();
            
            if(nota1>= 0) {
                System.out.print("Qual foi a nota 2? ");
                nota2= s.nextDouble();
                s.nextLine();
                System.out.print("Qual o nome do aluno? ");
                nome= s.nextLine();

                try {
                    alunos.add(new Aluno(nome, nota1, nota2));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("\n");
                }

                contador++;

                System.out.println("\n");
            }
        } while (nota1>= 0);

        if(contador> 0) {
            System.out.println("\n");

            for (Object aluno : alunos) {
                System.out.println(aluno);
            }
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }
    }
}
