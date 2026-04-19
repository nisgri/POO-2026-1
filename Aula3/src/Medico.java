public class Medico {
    private int crm;
    private String nome;
    private double valorConsulta;
    private static int total= 0;

    public Medico(int crm, String nome, double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.valorConsulta = valorConsulta;
        total++;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }
    
    public double getValorConsulta() {
        return valorConsulta;
    }

    public static int getTotal() {
        return total;
    }
}
