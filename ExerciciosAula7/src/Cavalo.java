import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao{
    private String marcaFerradura;

    public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
        super(nome, dataVacinacao, raca);
        this.marcaFerradura = marcaFerradura;
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando...");
    }

    @Override
    public String emitirSom() {
        return "Prrrrrr";
    }

    @Override
    public void trocarFerradura() {
        System.out.println("Trocando ferradura...");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando...");
    }
}
