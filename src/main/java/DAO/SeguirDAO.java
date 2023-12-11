/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author taynacardoso
 */
public class SeguirDAO {
    public boolean verifSeguindo(int id, int idSeguido, Connection conexao) {
        String sql = "SELECT * FROM Seguir WHERE seguindoID = ? AND seguidoID = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setInt(2,idSeguido);

            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
           
            return false;
        }
    }
    
    public void inserirSeguir(int id, int idSeguido, Connection conexao) {
        String sql = "INSERT INTO Seguir (seguindoID, seguidoID) VALUES (?, ?)";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setInt(2, idSeguido);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void pararSeguir(int id, int idSeguido, Connection conexao) {
        String sql = "DELETE FROM Seguir WHERE seguindoID = ? AND seguidoID = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setInt(2, idSeguido);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
           
        }
    }
        public int contarSeguindo(int id, Connection conexao) {
        String sql = "SELECT COUNT(*) FROM Seguir WHERE seguindoID = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return 0; 
        }
        public int contarSeguidores(int idPessoa, Connection conexao) {
        String sql = "SELECT COUNT(*) FROM Seguir WHERE seguidoID = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setInt(1, idPessoa);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return 0; 
    }
        public List<String> obterNomesSeguindo(int id, Connection conexao) {
        List<String> nomesSeguindo = new ArrayList<>();
        String sql = "SELECT p.nome FROM Pessoa p " +
                     "JOIN Seguir s ON p.pessoa_id = s.seguidoID " +
                     "WHERE s.seguindoID = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    nomesSeguindo.add(nome);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return nomesSeguindo;
    }
        public List<String> obterNomesSeguidores(int id, Connection conexao) {
        List<String> nomesSeguido = new ArrayList<>();
        String sql = "SELECT p.nome FROM Pessoa p " +
                     "JOIN Seguir s ON p.pessoa_id = s.seguindoID " +
                     "WHERE s.seguidoID = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    nomesSeguido.add(nome);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return nomesSeguido;
    }
    public void excluirSeguir (int pessoaId, Connection conexao) throws SQLException {
    String query = "DELETE FROM Seguir WHERE seguindoID = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        stmt.executeUpdate();
    }
}
    public void excluirSeguindo (int pessoaId, Connection conexao) throws SQLException {
    String query = "DELETE FROM Seguir WHERE seguidoID = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        stmt.executeUpdate();
    }
} 
    
}
