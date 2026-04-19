package br.com.serratec.conexao;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.serratec.model.Titular;
import br.com.serratec.persistence.TitularDao;

public class TesteConta {
    public static void main(String[] args) {
        //INSERIR
        TitularDao dao= new TitularDao();

        /*try {
            String titular= JOptionPane.showInputDialog("Digite o nome para cadastro:");
            Double saldo= Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do titular:"));
            dao.inserirConta(new Titular(null, titular, saldo));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Titular cadastrado com sucesso!");
        }*/



        //SAQUE/DEPÓSITO
        /*try {
            Integer numero_conta= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
            String titular= JOptionPane.showInputDialog("Digite o nome do titular:");
            Double saldo= Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo em conta:"));
            Integer opcao= Integer.parseInt(JOptionPane.showInputDialog("Digite a operação a ser realizada (1 - Saque | 2 - Depósito):"));
            Double valor= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado:"));

            dao.saqueDeposito(new Titular(numero_conta, titular, saldo), opcao, valor);
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números.", "Erro", 0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.", "Erro", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor de operação, saque ou depósito inválido.", "Erro", 0);
        }*/



        //BUSCAR CONTA
        /*Integer numero_conta= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
        String mensagem= "Conta encontrada!\n\n";

        try {
            JOptionPane.showMessageDialog(null, mensagem+ dao.buscarConta(numero_conta));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a busca.", "Erro", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A conta informada não existe.", "Erro", 0);
        }*/
        


        //LISTAR CONTAS
        /*String lista= "Lista de contas:\n";

        for (Titular titular : dao.listarContas()) {
            lista+= titular+ "\n\n";
        }

        JOptionPane.showMessageDialog(null, lista);*/



        //EXCLUIR CONTA
        Integer numero_conta= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));

        try {
            dao.removerConta(numero_conta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A conta informada não existe.", "Erro", 0);
        }
    }
}
