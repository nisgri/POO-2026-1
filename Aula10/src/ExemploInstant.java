
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class ExemploInstant {
    public static void main(String[] args) {
        Instant dataAtual= Instant.now();
        System.out.println(dataAtual);

        Instant data2= Instant.parse("2026-04-14T20:50:30Z");
        LocalDate dataLocal= LocalDate.ofInstant(data2, ZoneId.systemDefault());
        System.out.println(dataLocal);
    }
}
