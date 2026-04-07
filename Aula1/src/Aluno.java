public class Aluno {
    int matricula,idade;
    String nome,telefone;
    double nota1,nota2;

    public void imprimir()
    {
        System.out.println("Bem vindo à escola!");
    }

    public double calcularMedia()
    {
        return (nota1+nota2)/2;
    }
}
