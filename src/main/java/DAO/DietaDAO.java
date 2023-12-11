/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Dieta;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.TipoDieta;
import DAO.TipoDietaDAO;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DietaDAO {
    public int criarDieta(Dieta dieta, Connection conexao) throws SQLException {
    String query = "INSERT INTO Dieta (pessoa_id, aval_id, tipo_dieta, objetivo, calorias, cal_carb, cal_prot, cal_gord, numRef) " +
                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    int dietaId = -1; 

    try (PreparedStatement stmt = conexao.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
        stmt.setInt(1, dieta.getPessoa_id()); 
        stmt.setInt(2, dieta.getAval_id());  
        stmt.setInt(3, dieta.getTipo());  
        stmt.setInt(4, dieta.getObjetivo());
        stmt.setDouble(5, dieta.getCalorias());
        stmt.setDouble(6, dieta.getCalCarb());
        stmt.setDouble(7, dieta.getCalProt());
        stmt.setDouble(8, dieta.getCalGord());
        stmt.setInt(9, dieta.getNumRef());

        stmt.executeUpdate();

       
        ResultSet generatedKeys = stmt.getGeneratedKeys();
        if (generatedKeys.next()) {
            dietaId = generatedKeys.getInt(1);
            System.out.println("Dieta cadastrada!");
        } else {
            System.out.println("Não foi possível retornar o ID");
        }
    } catch (SQLException e) {
        throw new SQLException("Não foi possível cadastrar a dieta: " + e.getMessage());
    }

    return dietaId;
}
    public int getUltimaDieta (int pessoaId, Connection conexao) throws SQLException {
    int idDieta = -1;
    String query = "SELECT MAX(dieta_id) AS ultimaDieta FROM Dieta WHERE pessoa_id = ?";
    
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        
        try (ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                idDieta = resultSet.getInt("ultimaDieta");
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Não foi possível pegar o ID da ultima dieta cadastrada: " + e.getMessage());
    }
    
    return idDieta;
    
}
    public int getQuantRef(int id, Connection conexao) throws SQLException {
    int numRef = -1;
    String query = "SELECT numRef FROM Dieta WHERE dieta_id = ?";
    
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, id);
        
        try (ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                numRef = resultSet.getInt("numRef");
            } else {
                throw new SQLException("Dieta não encontrada");
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Não foi possível pegar a quantidade de refeições " + e.getMessage());
    }
    
    return numRef;
}
        public Dieta getDietbyID(int idDieta, Connection conexao) throws SQLException {
        Dieta dieta = null;
        String query = "SELECT * FROM Dieta WHERE dieta_id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setInt(1, idDieta);

            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    dieta = new Dieta();
                    dieta.setPessoa_id(resultSet.getInt("pessoa_id"));
                    dieta.setAval_id(resultSet.getInt("aval_id"));
                    dieta.setTipo(resultSet.getInt("tipo_dieta"));
                    dieta.setObjetivo(resultSet.getInt("objetivo"));
                    dieta.setCalorias(resultSet.getDouble("calorias"));
                    dieta.setCalCarb(resultSet.getDouble("cal_carb"));
                    dieta.setCalProt(resultSet.getDouble("cal_prot"));
                    dieta.setCalGord(resultSet.getDouble("cal_gord"));
                    dieta.setNumRef(resultSet.getInt("numRef"));
              
                   
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Não foi possível obter dieta no banco de dados. " + e.getMessage());
        }

        return dieta;
    }
        
    public void excluirDieta(int pessoaId, Connection conexao) throws SQLException {
    String query = "DELETE FROM Dieta WHERE pessoa_id = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        stmt.executeUpdate();
    }
}
        

   
    
  
}
