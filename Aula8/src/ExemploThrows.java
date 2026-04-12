import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploThrows {
    public static void main(String[] args) throws FileNotFoundException{
        FileReader leitura= new FileReader("\\teste.txt");
    }
}
