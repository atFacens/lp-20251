package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;

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
}
