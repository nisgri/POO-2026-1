
import javax.swing.JOptionPane;

public class ExemploExceptionJO {
    public static void main(String[] args) {
        do
        {
            try {
                int a= Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
                int b= Integer.parseInt(JOptionPane.showInputDialog("Informe mais um valor:"));

                JOptionPane.showMessageDialog(null, calcular(a, b));

                if(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Mensagem", 0)== 1)
                    break;
            } catch (ArithmeticException e)
            {
                JOptionPane.showMessageDialog(null, "Divisão por 0.", "Erro", 0);
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Digite apenas números.", "Erro", 0);
            }
        } while(0== 0);
    }

    public static int calcular(int a, int b)
    {
        return a/ b;
    }
}
