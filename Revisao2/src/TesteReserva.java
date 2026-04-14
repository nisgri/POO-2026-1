import java.util.Date;

public class TesteReserva {
    public static void main(String[] args) {

        Quarto standard = new QuartoStandard(101);
        Quarto luxo = new QuartoLuxo(201);
        Quarto suite = new SuitePresidencial(301);

        Date hoje = new Date();
        Date amanha = new Date(hoje.getTime() + (1000 * 60 * 60 * 24));
        Date depoisAmanha = new Date(hoje.getTime() + (1000 * 60 * 60 * 24 * 2));

        try {
            Reserva reserva1 = new Reserva(standard, hoje, amanha);
            System.out.println(reserva1);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Reserva reserva2 = new Reserva(luxo, hoje, depoisAmanha);
            System.out.println(reserva2);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Reserva reserva3 = new Reserva(suite, amanha, hoje);
            System.out.println(reserva3);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Reserva reserva4 = new Reserva(standard, hoje, amanha);
            System.out.println(reserva4);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}