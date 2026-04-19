
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ExemploLocalDate {
    public static void main(String[] args) {
        LocalDate dataAtual= LocalDate.now();
        LocalDate dataManual= LocalDate.of(2026, 4, 14);
        LocalDateTime dataHoraAtual= LocalDateTime.now();
        LocalTime hora= LocalTime.now();

        System.out.println(dataAtual.minusDays(30));
        System.out.println(dataAtual.isLeapYear()? "É bissexto.": "Não é bissexto.");
        System.out.println(dataHoraAtual);
        System.out.println(hora);

        ZoneId fuso= ZoneId.systemDefault();
        System.out.println(fuso);

        for (String fusos : ZoneId.getAvailableZoneIds()) {
            System.out.println(fusos);
        }
    }
}
