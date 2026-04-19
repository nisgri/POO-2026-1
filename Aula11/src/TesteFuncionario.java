public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1= new Funcionario(1, "Marcelo", "Programador");
        Funcionario f2= new Funcionario(2, "Marcelo", "Programador");

        System.out.println(f1.equals(f2)? "Iguais": "Diferentes");
        System.out.println(f1.getProfissao().equals(f2.getProfissao())? "Profissões iguais": "Profissões diferentes");
        //System.out.println(f1.getMatricula().equals(f2.getMatricula())? "Matrículas iguais": "Matrículas diferentes");
    }
}
