/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author taynacardoso
 */
public class DBConnection implements AutoCloseable {
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/banco_poo";
    private static final String USERNAME = "taynacardoso";
    private static final String PASSWORD = "senha";

    private Connection connection;

    public DBConnection() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");

            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            System.out.println("O banco de dados foi conectado com sucesso!");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("A conexão do banco foi fechada!");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão do banco de dados", e);
        }
    }
}