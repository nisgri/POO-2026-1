import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeitura {
    public static void main(String[] args) {
        Scanner s;

        try {
            s= new Scanner(new File("\\aula\\arquivo.txt"));
            while(s.hasNext()) {
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado.");
        }
    }
}
