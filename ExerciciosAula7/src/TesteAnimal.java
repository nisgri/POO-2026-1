
import java.time.LocalDate;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro c= new Cachorro("Tibúrcio", LocalDate.now(), "Dachsund", false);

        System.out.println(c);
        
        c.levarVeterinario();

        System.out.println(c);

        c.alimentar();
    }
}
