import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo implements Oficina{
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double lavarVeiculo() {
        valorCobrado= valorCobrado+ TipoServico.LAVAGEM.getValorPorServico();
        return valorCobrado;
    }

    @Override
    public double trocarOleo() {
        if(dataConserto.getDayOfWeek()== DayOfWeek.SATURDAY)
        {
            valorCobrado= valorCobrado+ TipoServico.OLEO.getValorPorServico()- 50;
            return valorCobrado;
        }
        valorCobrado= valorCobrado+ TipoServico.OLEO.getValorPorServico();
        return valorCobrado;
    }

    @Override
    public double revisao() {
        if(dataConserto.getMonth()== Month.AUGUST)
        {
            valorCobrado= valorCobrado+ TipoServico.REVISAO.getValorPorServico()* 0.9;
            return valorCobrado;
        }
        valorCobrado= valorCobrado+ TipoServico.REVISAO.getValorPorServico();
        return valorCobrado;
    }
}
