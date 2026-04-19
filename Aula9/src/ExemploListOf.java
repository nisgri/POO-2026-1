
import java.util.List;

public class ExemploListOf {
    public static void main(String[] args) {
        List produtos= List.of("Celular", "TV", "Relógio");
        //produtos.add("Pen Drive");
        //produtos.set(0, "iPhone");
        for (Object o: produtos) {
            System.out.println(o);
        }
    }
}
