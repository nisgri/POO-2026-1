import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List produtos= new ArrayList<>();

        produtos.add("Celular");
        produtos.add("TV");
        produtos.add(1000);
        produtos.add("Alexa");
        //produtos.remove(3);
        //produtos.set(0, "Celular Samsung");
        //ystem.out.println(produtos.get(1));
        System.out.println(produtos.isEmpty()? "Lista vazia.": "Lista preenchida.");

        for (Object o: produtos) {
            System.out.println(o);
        }
    }
}
