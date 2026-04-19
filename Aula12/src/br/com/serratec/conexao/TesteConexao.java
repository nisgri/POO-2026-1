package br.com.serratec.conexao;

import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        /*ConnectionFactory cf= new ConnectionFactory();

        cf.getConnection();*/

        Connection c= new ConnectionFactory().getConnection();
    }
}
