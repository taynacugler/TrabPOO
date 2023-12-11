/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Alimento;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Preferencias;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PreferenciasDAO {

    public void inserirPreferencia(int pessoaId, int tipo, int alimentoId, Connection conexao) throws SQLException {
        String query = "INSERT INTO Preferencias (pessoa_id, tipo, alimento_id) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setInt(1, pessoaId);
            stmt.setInt(2, tipo);
            stmt.setInt(3, alimentoId);

            stmt.executeUpdate();

            System.out.println("Preferência cadastrada com sucesso.");
        } catch (SQLException e) {
            throw new SQLException("Não foi possível cadatrar preferencia" + e.getMessage());
        }
    }
    public boolean verificarPref(int pessoaId, Connection conexao) throws SQLException {
        String query = "SELECT COUNT(*) AS total FROM Preferencias WHERE pessoa_id = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setInt(1, pessoaId);

            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    int total = resultSet.getInt("total");
                    return total > 0;
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Não foi possível verificar preferencia dentro do banco." + e.getMessage());
        }

        return false; 
    }
    public void excluirPreferencias(int pessoaId, Connection conexao) throws SQLException {
        String query = "DELETE FROM Preferencias WHERE pessoa_id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setInt(1, pessoaId);

            int linhasAfetadas = stmt.executeUpdate();
            
        } catch (SQLException e) {
            throw new SQLException("Não foi possível excluir preferencias. " + e.getMessage());
        }
    }
    
    
}
