import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        Proprietario p= new Proprietario("Nicolas");
        Carro c= new Carro("Mustang", LocalDate.of(2026, 8, 8), p, "Esportivo");

        c.trocarOleo();
        c.revisao();

        System.out.println(c);
    }
}
