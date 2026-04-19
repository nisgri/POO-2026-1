public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc= new ContaCorrente(123, "Maria", 2000);
        
        try {
            cc.deposito(100);
            cc.saque(5000);
        System.out.println("Saldo atual:"+ cc.getSaldo());
        } catch (ContaException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Saldo atual:"+ cc.getSaldo());
        }
    }
}
