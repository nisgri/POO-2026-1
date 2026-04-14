public class AlunoException extends Exception{
    public AlunoException(double nota) {
        super("Nota precisa ser maior que zero e menor que dez.");
    }
}
