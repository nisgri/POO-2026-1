import java.util.Date;

public class Reserva {
    private Quarto quarto;
    private Date dataInicio;
    private Date dataFIm;

    public Reserva(Quarto quarto, Date dataInicio, Date dataFIm) throws QuartoDisponivelException, DataInvalidaException{
        if(!quarto.isDisponivel()) {
            throw new QuartoDisponivelException(quarto.getNumero());
        }
        if(!dataFIm.after(dataInicio)) {
            throw new DataInvalidaException();
        }

        this.quarto= quarto;
        this.dataInicio= dataInicio;
        this.dataFIm= dataFIm;
        quarto.setDisponivel(false);
    }

    public int calcularDias() {
        long diff= dataFIm.getTime() - dataInicio.getTime();
        return (int) (diff/ (1000* 60* 60* 24));
    }

    public double calcularValorTotal() {
        return calcularDias()* quarto.getPrecoDiaria();
    }

    @Override
    public String toString() {
        return "Reserva [quarto=" + quarto + ", dias=" + calcularDias() + ", valorTotal=" + calcularValorTotal() + "]";
    }
}
