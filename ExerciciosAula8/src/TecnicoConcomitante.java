
import java.time.LocalDate;

public class TecnicoConcomitante extends ColegioAplicacao{
    private String nomeCurso;

    public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
        super(nome, nomeCoordenador);
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    @Override
    public void fazerMatricula() {
        System.out.println("Matrícula realizada com sucesso");
    }

    @Override
    public void reuniaoDePais() {
        System.out.println("Reunião de pais e responsáveis marcada para "+ LocalDate.of(2026, 04, 12));
    }
}
