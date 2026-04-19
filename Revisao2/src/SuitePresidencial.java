public class SuitePresidencial extends Quarto{

    public SuitePresidencial(int numero) {
        super(numero, 500);
    }

    @Override
    public String getTipo() {
        return "Suíte Presidencial";
    }
}
