package br.com.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {
    private String url= "jdbc:postgresql://localhost:5432/conta";
    private String usuario= "postgres";
    private String senha= "2050";

    private Connection connection;

    public Connection getConnection() {
        System.out.println("Conectando ao banco de dados...");
        try {
            connection= DriverManager.getConnection(url, usuario, senha);
            if(connection!= null) {
                System.out.println("Conectado com sucesso!");
                return connection;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas no driver ou senha incorreta no banco.");
        }

        return connection;
    }
}
