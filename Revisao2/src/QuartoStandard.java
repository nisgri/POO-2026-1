public class QuartoStandard extends Quarto{

    public QuartoStandard(int numero) {
        super(numero, 150.0);
    }

    @Override
    public String getTipo() {
        return "Standard";
    }
}
