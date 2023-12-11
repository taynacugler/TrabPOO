/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import com.mycompany.trabpoo.Bean.Alimento;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AlimentoDAO {
    public void mostrarTodosAlimentos(Connection conexao) throws SQLException {
    String query = "SELECT nome, cal FROM Alimento";

    try (PreparedStatement pstmt = conexao.prepareStatement(query);
         ResultSet resultSet = pstmt.executeQuery()) {

        while (resultSet.next()) {
            String nome = resultSet.getString("nome");
            double calorias = resultSet.getDouble("cal");

            // Exibe o nome e a quantidade de calorias
            System.out.println(nome + ": " + calorias + " kcal");
        }
    }
}
     public void mostrarAlimentosCarb (Connection conexao) throws SQLException {
    String query = "SELECT nome, cal FROM Alimento Where alimento_id BETWEEN 1 AND 6";

    try (PreparedStatement pstmt = conexao.prepareStatement(query);
         ResultSet resultSet = pstmt.executeQuery()) {

        while (resultSet.next()) {
            String nome = resultSet.getString("nome");
            double calorias = resultSet.getDouble("cal");

            // Exibe o nome e a quantidade de calorias
            System.out.println(nome + ": " + calorias + " kcal");
        }
    }
}
        public void mostrarAlimentosProt (Connection conexao) throws SQLException {
    String query = "SELECT nome, cal FROM Alimento Where alimento_id BETWEEN 7 AND 11";

    try (PreparedStatement pstmt = conexao.prepareStatement(query);
         ResultSet resultSet = pstmt.executeQuery()) {

        while (resultSet.next()) {
            String nome = resultSet.getString("nome");
            double calorias = resultSet.getDouble("cal");

            // Exibe o nome e a quantidade de calorias
            System.out.println(nome + ": " + calorias + " kcal");
        }
    }
}
     public void mostrarAlimentosGord (Connection conexao) throws SQLException {
    String query = "SELECT nome, cal FROM Alimento Where alimento_id BETWEEN 12 AND 17";

    try (PreparedStatement pstmt = conexao.prepareStatement(query);
         ResultSet resultSet = pstmt.executeQuery()) {

        while (resultSet.next()) {
            String nome = resultSet.getString("nome");
            double calorias = resultSet.getDouble("cal");

            // Exibe o nome e a quantidade de calorias
            System.out.println(nome + ": " + calorias + " kcal");
        }
    }
}
    public Double getCalorias (int idAlimento, Connection conexao) throws SQLException {
    Alimento alimento = null;
    String query = "SELECT * FROM Alimento WHERE alimento_id = ?";
    double calorias = 0;
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, idAlimento);

        try (ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                alimento = new Alimento();
                alimento.setNome(resultSet.getString("nome"));
                alimento.setCarb(resultSet.getDouble("carb"));
                alimento.setProt(resultSet.getDouble("prot"));
                alimento.setGord(resultSet.getDouble("gord"));
                alimento.setPorcao(resultSet.getDouble("porcao"));
             
                //ver a formula certa
                calorias = alimento.getCarb()*4 + alimento.getPorcao()*4 + alimento.getGord()*9;
     
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Erro ao obter alimento: " + e.getMessage());
    }

    return calorias;
}
    public String getNome (int idAlimento, Connection conexao) throws SQLException {
    Alimento alimento = null;
    String query = "SELECT * FROM Alimento WHERE alimento_id = ?";
    String nome = null;
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, idAlimento);

        try (ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                alimento = new Alimento();
                alimento.setNome(resultSet.getString("nome"));
                alimento.setCarb(resultSet.getDouble("carb"));
                alimento.setProt(resultSet.getDouble("prot"));
                alimento.setGord(resultSet.getDouble("gord"));
                alimento.setPorcao(resultSet.getDouble("porcao"));
             
                //ver a formula certa
                nome = alimento.getNome();
     
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Erro ao obter alimento: " + e.getMessage());
    }

    return nome;
}
     

    
}

