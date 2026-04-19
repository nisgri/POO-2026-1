public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularInss()
    {
        double resultado= salario* 0.11;
        return resultado;
    }

    public double calcularValeTransporte()
    {
        double resultado= salario* 0.06;
        return resultado;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }    
}
