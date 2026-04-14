import java.util.ArrayList;
import java.util.List;

public class TesteTime {
    public static void main(String[] args) {
        Time t= new Time("Santos", "Cuca", "Alexandre Mattos");
        List<Atleta> atletas= new ArrayList<>();

        atletas.add(new Atleta("Gabigol", 29, "Atacante"));
        atletas.add(new Atleta("Neymar", 34, "Meia-Atacante"));
        atletas.add(new Atleta("Pelé", 31, "Atacante"));
        atletas.add(new Atleta("Cássio", 38, "Goleiro"));

        t.setAtleta(atletas);

        System.out.println(t);
    }
}
