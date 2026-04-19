import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String responsavel;
    private List<Livro> lista;
    
    public Biblioteca(String responsavel) {
        this.responsavel = responsavel;
        lista= new ArrayList<>();
    }

    public String getResponsavel() {
        return responsavel;
    }

    public List<Livro> getLista() {
        return lista;
    }

    public void adicionar(Livro livro) {
        lista.add(livro);
    }

    public void listar() {
        for (Object livro : lista) {
            System.out.println(livro);
        }
    }

    public int pesquisarFaixaPreco(double valorInicial, double valorFinal) {
        int contador= 0;
        
        for (Livro livro : lista) {
            if(livro.getPreco()>= valorInicial && livro.getPreco()<= valorFinal)
                contador++;
        }

        return contador;
        
    }

    public double totalLivros() {
        double total= 0;

        for (Livro livro : lista) {
            total+= livro.getPreco();
        }

        return total;

    }

}
