public class Maratona {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double altura;

    public Maratona(String nome, String sexo, int idade, double altura) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public boolean verificaSituacao()
    {
        if(idade> 17 && altura> 1.79)
        {
            System.out.println(nome+ " poderá participar da maratona.");
            return true;
        }

        System.out.println(nome+ " não poderá participar da maratona.");
        return false;
    }

    @Override
    public String toString()
    {
        return "Atleta: "+ nome+ "\nSexo: "+ sexo+ "\nIdade: "+ idade+ "\nAltura: "+ altura;
    }
}
