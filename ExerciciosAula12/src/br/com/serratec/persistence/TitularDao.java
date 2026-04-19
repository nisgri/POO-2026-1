package br.com.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.serratec.conexao.ConnectionFactory;
import br.com.serratec.model.Titular;

public class TitularDao {
    private Connection connection;

    public TitularDao() {
        connection= new ConnectionFactory().getConnection();
    }

    public void inserirConta(Titular titular) throws SQLException{
        String sql= "insert into titular(titular, saldo) values (?, ?)";
        PreparedStatement statement= connection.prepareStatement(sql);
        statement.setString(1, titular.getTitular());
        statement.setDouble(2, titular.getSaldo());
        statement.execute();
        statement.close();
        connection.close();
    }

    public void saqueDeposito(Titular titular, Integer opcao, Double valor) throws SQLException, NumberFormatException, Exception{
        PreparedStatement statement;
        
        switch (opcao) {
            case 1:
                if(valor<= titular.getSaldo()) {
                    String saque= "update titular set saldo= saldo- ? where numero_conta= ?";
                    statement= connection.prepareStatement(saque);
                    statement.setDouble(1, valor);
                    statement.setInt(2, titular.getNumero_conta());
                    statement.execute();
                    statement.close();
                    connection.close();
                } else
                    throw new Exception();
                
                break;
        
            case 2:
                if(valor> 0) {
                    String deposito= "update titular set saldo= saldo+ ? where numero_conta= ?";
                    statement= connection.prepareStatement(deposito);
                    statement.setDouble(1, valor);
                    statement.setInt(2, titular.getNumero_conta());
                    statement.execute();
                    statement.close();
                    connection.close();
                } else
                    throw new Exception();
                
                break;

            default:
                throw new Exception();
                
        }
    }

    public Titular buscarConta(Integer numero_conta) throws SQLException, Exception{
        Titular titular= new Titular();
        
        String sql= "select * from titular where numero_conta= ?";
        PreparedStatement statement= connection.prepareStatement(sql);
        statement.setInt(1, numero_conta);

        ResultSet rs= statement.executeQuery();
        if(rs.next()) {
                titular= new Titular(rs.getInt("numero_conta"), rs.getString("titular"), rs.getDouble("saldo"));
                rs.close();
                statement.close();
                connection.close();

                return titular;
        }
            
        throw new Exception();
    }

    public List<Titular> listarContas() throws SQLException{
        List<Titular> titulares= new ArrayList<>();
        
        String sql= "select * from titular";
        PreparedStatement statement= connection.prepareStatement(sql);
        ResultSet rs= statement.executeQuery();

        while(rs.next()) {
            Titular titular= new Titular(rs.getInt("numero_conta"), rs.getString("titular"), rs.getDouble("saldo"));
            titulares.add(titular);
        }

        rs.close();
        statement.close();
        connection.close();

        return titulares;
    }

    public Titular removerConta(Integer numero_conta) throws SQLException, Exception{
        Titular titular= new Titular();
        
        String sql= "delete from titular where numero_conta= ?";
        PreparedStatement statement= connection.prepareStatement(sql);
        statement.setInt(1, numero_conta);

        ResultSet rs= statement.executeQuery();
        if(rs.next()) {
                titular= new Titular(rs.getInt("numero_conta"), rs.getString("titular"), rs.getDouble("saldo"));
                rs.close();
                statement.close();
                connection.close();
                
                return titular;
        }
            
        throw new Exception();
    }
}
