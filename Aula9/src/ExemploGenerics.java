
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploGenerics {
    public static void main(String[] args) {
        List<Funcionario> funcionarios= new ArrayList<>();
        Set<String> cores= new HashSet<>();
        Funcionario funca= new Funcionario("Rodrigo", "Programador", 9000);
        funca.abonoSalario(0.2);

        funcionarios.add(new Funcionario("Marcelo", "Consultor de Monster", 9000));
        funcionarios.add(new Funcionario("Mariana", "Programadora", 9000));
        funcionarios.add(funca);

        funcionarios.get(1).abonoSalario(0.15);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
