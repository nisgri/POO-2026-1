public class TestePagamento {
    public static void main(String[] args) {
        try {
            Cartao c= new CartaoCredito("87155715764575715", "30/09/2022", 2400);
            c.pagar(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Cartao c= new CartaoCredito("87155715764575715", "30/09/2022", 3000);
            c.pagar(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            BoletoBancario bb= new BoletoBancario("6871684515785757681978977686896685");
            bb.pagar(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            BoletoBancario bb= new BoletoBancario("6871684515785757681978977686896685");
            bb.pagar(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Pix p= new Pix("nicolasgriittner@gmail.com");
            p.pagar(9600);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Pix p= new Pix("nicolasgriittner@gmail.com");
            p.pagar(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
