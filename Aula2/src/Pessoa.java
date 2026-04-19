public class Pessoa {
    private int id;
    private String nome;
    private double peso,altura;

    public void setId(int id)
    {
        this.id= id;
    }
    public int getId()
    {
        return id;
    }

    public void setNome(String nome)
    {
        this.nome= nome;
    }
    public String getNome()
    {
        return nome;
    }

    public void setPeso(double peso)
    {
        if(peso> 0 && peso< 300)
            this.peso= peso;
        else
            this.peso= 0;
    }
    public double getPeso()
    {
        return peso;
    }

    public void setAltura(double altura)
    {
        if(altura> 0 && altura< 3)
            this.altura= altura;
        else
            this.altura= 0;
    }
    public double getAltura()
    {
        return altura;
    }

    private double calcularIMC(double peso, double altura)
    {
        return peso/ (altura* altura);
    }

    public String resultado()
    {
        if(calcularIMC(peso, altura)< 18.5)
            return "Abaixo do peso.";
        else if(calcularIMC(peso, altura)<= 24.9)
            return "Peso normal.";
        else
            return "Acima do peso.";

    }
}
