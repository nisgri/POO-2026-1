import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TesteVendaJO {
    public static void main(String[] args) {
        do { 
            try {
            String descricao= JOptionPane.showInputDialog("Qual o nome do produto que deseja comprar?");
            double valor= Double.parseDouble(JOptionPane.showInputDialog("Qual o preço?"));
            int quantidade= Integer.parseInt(JOptionPane.showInputDialog("Quantos(as)?"));
            
            Produto p= new Produto(1, descricao, valor, Categoria.NULL);

            Venda v= new Venda(p, LocalDate.now(), quantidade);
            v.calcularVenda();

            String total= "Total:\n"+
                          "-----------------------------------------\n"+
                          v.mostrarVenda()+ "\n"+
                          "-----------------------------------------\n"+
                          "Total Geral Venda:"+ v.getTotalVenda();
            JOptionPane.showMessageDialog(null, total);

            if(JOptionPane.showConfirmDialog(null, "Deseja realizar a compra de mais um produto?", "Mensagem", 0)== 1)
                break;

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Informe um nome válido.", "Erro", 0);
            } catch (PrecoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números.", "Erro", 0);
            }
        } while(true);
    }
}
