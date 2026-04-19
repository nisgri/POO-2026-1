import java.util.InputMismatchException;
import java.util.Scanner;

public class TexteException {
    public static void main(String[] args) {
        int numero;
        boolean sucesso= false;
        
        do { 
            try {
                Scanner s= new Scanner(System.in);
                System.out.print("Informe um valor:");
                numero= s.nextInt();
                System.out.println("O número digitado foi "+ numero);
                sucesso= true;

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");

            }
        } while (!sucesso);
    }
}
