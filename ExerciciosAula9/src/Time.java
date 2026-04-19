
import java.util.List;

public class Time {
    private String nomeTime;
    private String tecnico;
    private String diretor;
    private List<Atleta> atleta;
    
    public Time(String nomeTime, String tecnico, String diretor) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Time [nomeTime=" + nomeTime + ", tecnico=" + tecnico + ", diretor=" + diretor + ", atletas:\n" + atleta
                + "]";
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getTecnico() {
        return tecnico;
    }

    public String getDiretor() {
        return diretor;
    }

    public List<Atleta> getAtleta() {
        return atleta;
    }

    public void setAtleta(List<Atleta> atleta) {
        this.atleta = atleta;
    }
}
