import java.time.LocalDate;

public abstract class Veiculo {
    protected String modelo;
    protected double valorCobrado;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;
    
    public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
                + ", proprietario=" + proprietario + "]";
    }

    public double getValorCobrado() {
        return valorCobrado;
    }
}
