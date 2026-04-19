import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatarData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um data:");
        String data = sc.next();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataLocal = LocalDate.parse(data, formatarData);
        System.out.println(dataLocal.format(formatarData));

    }
}