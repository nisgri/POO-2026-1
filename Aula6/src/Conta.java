public interface Conta {
    public final static int taxaSaque= 7;    
    public abstract void saque(double valor);
    public abstract void deposito(double valor);
    
}
