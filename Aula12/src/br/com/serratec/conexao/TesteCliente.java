package br.com.serratec.conexao;

import javax.swing.JOptionPane;

import br.com.serratec.model.Cliente;
import br.com.serratec.persistence.ClienteDao;

public class TesteCliente {
    public static void main(String[] args) {
        ClienteDao dao= new ClienteDao();

        String nome= JOptionPane.showInputDialog("Digite o nome do cliente:");
        String email= JOptionPane.showInputDialog("Digite o email do cliente:");

        dao.inserir(new Cliente(null, nome, email));
        JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");



        /*Integer codigo= Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente que deseja alterar:"));
        String nome= JOptionPane.showInputDialog("Digite o nome do cliente:");
        String email= JOptionPane.showInputDialog("Digite o email do cliente:");

        dao.alterar(new Cliente(codigo, nome, email));
        JOptionPane.showMessageDialog(null, "Informações alteradas com sucesso!");*/



        /*Integer codigo= Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente que deseja remover:"));

        dao.apagar(codigo);
        JOptionPane.showMessageDialog(null, "Cliente removido com sucesso.");*/

    }
}
