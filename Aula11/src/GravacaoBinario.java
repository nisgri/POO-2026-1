
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GravacaoBinario {
    public static void main(String[] args) {
        try {
            FileOutputStream arquivo= new FileOutputStream("\\aula\\arquivo.dat");
            DataOutputStream gravarArquivo= new DataOutputStream(arquivo);
            gravarArquivo.writeUTF("Hoje é aula de leitura de arquivos\n");
            gravarArquivo.close();
        } catch (Exception e) {
            System.err.println("Arquivo não encontrado!");
        }

    }
}
