public class DataInvalidaException extends Exception{
    public DataInvalidaException() {
        super("Data inválida. A deve de check-in deve ser antes da data de check-out.");
    }
}
