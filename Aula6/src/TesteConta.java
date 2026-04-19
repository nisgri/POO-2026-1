public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc= new ContaCorrente("Anderson", 1000);

        cc.deposito(500);
        cc.saque(200);

        System.out.println("Seu saldo é:"+ cc.getSaldo());
    }
}
