
import javax.swing.JOptionPane;

public class Exemplo {
    public static void main(String[] args) {
        double num1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n°: "));
        double num2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n°: "));
        JOptionPane.showMessageDialog(null, (num1+num2)/2);
    }
}
