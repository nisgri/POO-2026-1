package br.com.serratec.conexao;

import javax.swing.JOptionPane;

import br.com.serratec.model.Cliente;
import br.com.serratec.persistence.ClienteDao;

public class TesteListar {
    public static void main(String[] args) {
        ClienteDao dao= new ClienteDao();
        String lista= "Lista dos clientes:\n";

        for (Cliente cliente : dao.listar()) {
            lista+= cliente+ "\n\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }
}
