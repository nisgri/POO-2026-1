package br.com.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.serratec.conexao.ConnectionFactory;
import br.com.serratec.model.Cliente;

public class ClienteDao {
    private Connection connection;
    
    public ClienteDao() {
        connection= new ConnectionFactory().getConnection();
    }

    public void inserir(Cliente cliente) {
        String sql= "insert into cliente(nome, email) values (?, ?)";
        try {
            PreparedStatement stmt= connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.execute();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente não inserido.");
        } 
    }

    public void alterar(Cliente cliente) {
        String sql= "update cliente set nome= ?, email= ? where id= ?";
        try {
            PreparedStatement stmt= connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setInt(3, cliente.getId());
            stmt.execute();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente não alterado.");
        }
    }

    public void apagar(int codigo) {
        try {
            String sql= "delete from cliente where id= ?";
            PreparedStatement stmt= connection.prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente não removido.");
        }
    }

    public List<Cliente> listar() {
        String sql= "select * from cliente";
        List<Cliente> clientes= new ArrayList<>();
        try {
            PreparedStatement stmt= connection.prepareStatement(sql);
            ResultSet rs= stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente= new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
                clientes.add(cliente);
            }

            rs.close();
            stmt.close();
            connection.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao listar os clientes.");
        }

        return clientes;
    }

}
