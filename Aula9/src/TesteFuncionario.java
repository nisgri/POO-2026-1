public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario[] funcionarios= new Funcionario[2];
        funcionarios[0]= new Funcionario("Marcelo", "Consultor de Monster", 9000);
        funcionarios[1]= new Funcionario("Astolfo", "Gerente", 5000);

        for (Funcionario f: funcionarios) {
            System.out.println(f);
        }

        System.out.println("\n");

        funcionarios[0].abonoSalario(0.3);
        funcionarios[1].abonoSalario(0.5);

        for (Funcionario f: funcionarios) {
            System.out.println(f);
        }
    }
}
