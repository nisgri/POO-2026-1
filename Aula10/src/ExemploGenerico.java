import java.util.Arrays;
import java.util.List;

public class ExemploGenerico {
    public static void main(String[] args) {
        List<Integer> inteiros= Arrays.asList(10, 50, 30, 40, 12);
        List<String> cores= Arrays.asList("Azul", "Vermelho", "Verde", "Branco");

        System.out.println("Imprimir inteiros:");
        imprimirLista(inteiros);
        System.out.println("\n");
        System.out.println("Imprimir cores:");
        imprimirLista(cores);
    }

    public static void imprimirLista(List<?> lista) {
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}
