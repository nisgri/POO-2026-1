public class AtletaProfissional extends Maratona{
    private double peso;

    public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
        super(nome, sexo, idade, altura);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}