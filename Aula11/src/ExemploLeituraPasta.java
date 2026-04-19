
import java.io.File;
import java.util.Scanner;

public class ExemploLeituraPasta {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.print("Informe o nome da pasta ou o nome do arquivo:");
        String nome= ler.nextLine();

        File file= new File(nome);

        if(file.exists()) {
            if(file.isFile()) {
                System.out.printf("\nArquivo (%s) existe - tamanho: %d em bytes.\n", file.getName(), file.length());
            } else {
                System.out.println("\nConteúdo da pasta:");
                String[] pasta= file.list();
                for(String item: pasta) {
                    System.out.println(item);
                }
            }
        } else {
            System.out.println("\nArquivo ou pasta não encontrados.");
        }

        ler.close();

    }
}