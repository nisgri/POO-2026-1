
import java.util.Map;
import java.util.TreeMap;

public class AgendaTelefonica {
    private Map<String, String> colecao;

    public AgendaTelefonica() {
        colecao = new TreeMap<>();
    }

    public void inserir(String nome, String numero) {
        colecao.put(nome, numero);
    }

    public String buscarNumero(String numero) {
        if(colecao.containsValue(numero))
            return "'"+ numero+ "' está presente na lista!";
        return "Este número não está presente na lista. Certifique-se de que digitou corretamente.";

    }

    public void remover(String nome) {
        colecao.remove(nome);
    }

    public int tamanho() {
        return colecao.size();
    }

    public void listar() {
        System.out.println("Lista de contatos:");
        
        for (Map.Entry<String, String> contato: colecao.entrySet()) {
            System.out.println(contato.getKey()+ "-"+ contato.getValue());
        }

    }
}
