public class CartaoCredito extends Cartao{
    private double limite;

    public CartaoCredito(String numero, String dataValidade, double limite) {
        super(numero, dataValidade);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString()+ ", limite=" + limite + "]";
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void pagar(double valor) throws Exception{
        if(valor<= 0)
            throw new Exception("Valor de pagamento inválido.");
        if(valor> limite)
            throw new Exception("Valor acima do limite do cartão.");

        System.out.println("Pagamento no valor de R$"+ valor+ " usando "+ this.toString()+ " realizado com sucesso.");
    }    
}
