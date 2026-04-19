public class QuartoLuxo extends Quarto{

    public QuartoLuxo(int numero) {
        super(numero, 300);
    }

    @Override
    public String getTipo() {
        return "Luxo";
    }
}
