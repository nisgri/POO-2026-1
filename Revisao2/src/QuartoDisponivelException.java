public class QuartoDisponivelException extends Exception{
    public QuartoDisponivelException(int numero){
        super("Quarto "+ numero+ " não está disponível para reserva.");
    }
}
