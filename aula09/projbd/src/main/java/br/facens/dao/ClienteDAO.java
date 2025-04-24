package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.facens.model.Cliente;

public class ClienteDAO {
    private static final String url = "jdbc:mysql://localhost:3306/aulalp_facens";
    private static final String username = "profFacens"; //root
    private static final String password = "aula"; //root


    public static void conectBD() {
        Connection connection;

        try {
            System.out.println("Conectando ao BD...");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado com sucesso!");

            connection.close();
            System.out.println("Desconectado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void criarTabelaCliente() {
        Connection connection;

        try {
            System.out.println("Conectando ao BD...");
            connection = DriverManager.getConnection(url, username, password);

            String sql = "create table cliente (id int, nome varchar(150), email varchar(100));";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Tabela criada");

            statement.close();
            connection.close();
            System.out.println("Conexão terminada");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean inserir(Cliente cliente) {
        Connection connection;

        try {
            System.out.println("Conectando ao BD...");
            connection = DriverManager.getConnection(url, username, password);

            String sql = "insert into cliente values(?,?,?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, cliente.getId());
            preparedStatement.setString(2, cliente.getName());
            preparedStatement.setString(3, cliente.getEmail());

            int result = preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

            return (result > 0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}

