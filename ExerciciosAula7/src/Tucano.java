import java.time.LocalDate;

public class Tucano extends Ave{
    private double peso;

    public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
        super(nome, dataVacinacao, cor);
        this.peso = peso;
    }

    @Override
    public String voar() {
        return "Voando...";
    }

    @Override
    public String emitirSom() {
        return "Cá cá cá!";
    }
}
