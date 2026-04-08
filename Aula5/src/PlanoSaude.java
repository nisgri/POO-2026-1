public class PlanoSaude {
    protected String empresa;
    protected double valorPago = 80;
    protected double valorISS = 5;

    public PlanoSaude(String empresa) {
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return "empresa:" + empresa + ", valorPago:" + valorPago + ", valorISS:" + valorISS;
    }


    public String getEmpresa() {
        return empresa;
    }

    public double getValorPago() {
        return valorPago;
    }

    public double getValorISS() {
        return valorISS;
    }

    public double calcularPagamento()
    {
        return valorPago= valorPago- valorPago* valorISS/ 100;
    }
}