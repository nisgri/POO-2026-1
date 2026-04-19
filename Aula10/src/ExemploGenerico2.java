
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploGenerico2 {
    public static void main(String[] args) {
        List<Integer> inteiros= Arrays.asList(20, 30, 40, 60);
        List<Double> decimais= Arrays.asList(22.0, 35.0, 40.0, 90.3);
        List<Object> objetos= new ArrayList<>();

        copiar(decimais, objetos);
        imprimirLista(objetos);
    }

    public static void imprimirLista(List<?> lista) {
        for (Object object : lista) {
            System.out.println(object);
        }
    }

    public static void copiar(List<? extends Number> origem, List<? super Number> destino) {
        for (Number numero : origem) {
            destino.add(numero);
        }
    }
}
