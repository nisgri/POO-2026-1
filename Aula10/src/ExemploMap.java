import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, String> estados= new HashMap<>();
        estados.put("AC", "Acre");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("MG", "Minas Gerais");
        estados.put("SP", "São Paulo");

        for (String sigla : estados.keySet()) {
            System.out.println(sigla);
        }

        for (String valor : estados.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<String, String> tudo : estados.entrySet()) {
            System.out.println(tudo);
            System.out.println(tudo.getKey()+ "-"+ tudo.getValue());
        }
    }
}
