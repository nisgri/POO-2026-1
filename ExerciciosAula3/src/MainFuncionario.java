import javax.swing.JOptionPane;

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario f= new Funcionario("Ambrósio",5000);

        double inss= f.calcularInss();
        double valeTransporte= f.calcularValeTransporte();
        double salario= f.getSalario();
        salario= salario- (inss+ valeTransporte);

        String texto= "Nome: "+ f.getNome()+ "\nSalário: "+ f.getSalario()+ "\nINSS: "+ inss+ "\nVale Transporte: "+ valeTransporte+ "\nSalário Líquido: "+ salario;
        JOptionPane.showMessageDialog(null, texto);
    }
}
