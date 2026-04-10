import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        Proprietario p= new Proprietario("Nicolas");
        Carro c= new Carro("Mustang", LocalDate.now(), p, "Esportivo");

        c.trocarOleo();

        System.out.println(c);
    }
}
