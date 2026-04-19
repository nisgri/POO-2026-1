
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLeituraGravacao {
    public static void main(String[] args) {
        try {
            Scanner s= new Scanner(System.in);
            System.out.print("Digite o nome do arquivo:");
            String nomeArquivo= s.next();

            File file= new File(nomeArquivo);
            Scanner sArquivo= new Scanner(file, "UTF-8");
            List<Funcionario> funcionarios= new ArrayList<>();

            while(sArquivo.hasNext()) {
                String linha= sArquivo.nextLine();
                if(!linha.isEmpty()) {
                    String[] dadosLinha= linha.split("|");
                    String nome= dadosLinha[0];
                    String profissao= dadosLinha[1];
                    funcionarios.add(new Funcionario(nome, profissao));
                }
            }
            s.close();
            System.out.println("Gravar em um novo arquivo");

            for(Funcionario funcionario: funcionarios) {
                System.out.println(funcionario);
            }

            System.out.println("Gravar em um novo arquivo");
            FileWriter caminho= new FileWriter("\\aula\\funcionario.csv");
            PrintWriter gravarArquivo= new PrintWriter(caminho);
            for (Funcionario funcionario : funcionarios) {
                String linhaArquivo= funcionario.getNome()+ "|"+ funcionario.getProfissao()+ "\n";
                gravarArquivo.printf(linhaArquivo);
            }
            gravarArquivo.close();

        } catch (Exception e) {
            System.out.println("Arquivo não encontrado! Verifique se digitou o nome corretamente.");
        }
    }
}
