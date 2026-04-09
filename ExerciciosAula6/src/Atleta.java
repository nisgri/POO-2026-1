public class Atleta implements Olimpiadas{
    private String nome;
    private double peso;
    private String modalidade;
    private static int totalParticipantes= 0;
    private Pais pais;

    public Atleta(String nome, double peso, Pais pais) {
        this.nome = nome;
        this.peso = peso;
        this.pais= pais;
    }

    @Override
    public String verificarSituacao() {
        if(peso> 90)
        {
            totalParticipantes++;
            modalidade= "peso pesado";
            return "participará";
        } else if(peso>= 60 && peso< 90)
        {
            totalParticipantes++;
            modalidade= "peso médio";
            return "participará";
        }
        return "não participará";
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public static int getTotalParticipantes() {
        return totalParticipantes;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Pais getPais() {
        return pais;
    }
}
