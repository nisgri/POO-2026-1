import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico{
    private boolean castrado;

    public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
        super(nome, dataVacinacao, raca);
        this.castrado = castrado;
    }

    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + ", raca=" + raca + ", dataVacinacao=" + dataVacinacao + ", castrado="
                + castrado + "]";
    }

    @Override
    public String emitirSom() {
        return "Roof roof!";
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando...");
    }

    @Override
    public boolean levarVeterinario() {
        if(!castrado)
        {
            castrado= true;
            return true;
        }
        return false;
    }

    @Override
    public boolean alimentar() {
        System.out.println("Pet alimentado!");
        return true;
    }
}
