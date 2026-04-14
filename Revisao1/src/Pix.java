public class Pix implements Pagavel{
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String toString() {
        return "Pix de [chavePix=" + chavePix + "]";
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) throws Exception {
        if(valor<= 0)
            throw new Exception("Valor de pagamento inválido.");

        System.out.println(this.toString()+ " no valor de R$"+ valor+ " realizado com sucesso.");
    }
}
