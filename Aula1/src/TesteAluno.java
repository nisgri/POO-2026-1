public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1= new Aluno();
        Aluno aluno2= new Aluno();
        Aluno aluno3= aluno1;

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno1== aluno3);

        aluno1.nome= "José";
        aluno1.matricula= 123;
        aluno1.idade= 25;
        aluno1.nota1= 10;
        aluno1.nota2= 5;
        System.out.println("Média: "+ aluno1.calcularMedia());

        aluno2.nome= "Marcus";
        aluno2.matricula= 345;

        System.out.println(aluno1.nome);
        System.out.println(aluno2.nome);
    }
}
