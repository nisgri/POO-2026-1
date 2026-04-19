
import java.util.Arrays;
import java.util.List;

public class ExemploArrays {
    public static void main(String[] args) {
        List produtos= Arrays.asList("Celular", "TV", "Relógio", "Kindle");
        //produtos.add("Som");
        produtos.set(1, "TV 42'");
        //produtos.remove(0);

        for (Object o: produtos) {
            System.out.println(o);
        }
    }
}
