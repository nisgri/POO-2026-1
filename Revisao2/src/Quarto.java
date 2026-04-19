public abstract class Quarto {
    private int numero;
    private double precoDiaria;
    private boolean disponivel;
    
    public Quarto(int numero, double precoDiaria) {
        this.numero = numero;
        this.precoDiaria = precoDiaria;
        this.disponivel= true;
    }

    @Override
    public String toString() {
        return "Quarto [numero=" + numero + ", precoDiaria=" + precoDiaria + ", disponivel=" + disponivel + "]";
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public abstract String getTipo();
}
