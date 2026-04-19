public class BoletoBancario implements Pagavel{
    private String codigoBarras;

    public BoletoBancario(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "BoletoBancario [codigoBarras=" + codigoBarras + "]";
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void pagar(double valor) throws Exception {
        if(valor<= 0)
            throw new Exception("Valor de pagamento inválido.");

        System.out.println("Pagamento no valor de R$"+ valor+ " usando "+ this.toString()+ " realizado com sucesso.");
    }
}
