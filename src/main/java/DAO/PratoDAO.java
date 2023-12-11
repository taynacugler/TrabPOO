package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.trabpoo.Bean.Prato;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author taynacardoso
 */
public class PratoDAO {
   public void inserirPrato(Connection conexao, Prato prato) throws SQLException {
    int idGerado = -1;

    try (PreparedStatement stmt = conexao.prepareStatement(
            "INSERT INTO Prato (dieta_id, fonteProt_id, fonteCarb_id, fonteGord_id, proteina, gordura, carboidratos) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

        stmt.setInt(1, prato.getDieta_id());
        stmt.setInt(2, prato.getFonteProt());
        stmt.setInt(3, prato.getFonteCarb());
        stmt.setInt(4, prato.getFonteGord());
        stmt.setDouble(5, prato.getPorcaoProt());
        stmt.setDouble(6, prato.getPorcaoGord());
        stmt.setDouble(7, prato.getPorcaoCarb());

        stmt.executeUpdate();

        ResultSet generatedKeys = stmt.getGeneratedKeys();
        if (generatedKeys.next()) {
            idGerado = generatedKeys.getInt(1);
            System.out.println("ID do prato: " + idGerado);
        } else {
            System.out.println("Falha ao pegar ID.");
        }

    } catch (SQLException e) {
        throw new SQLException("Não foi possível inserir prato no banco de dados: " + e.getMessage());
    }
}
   public List<Prato> getPratos(Connection conexao, int dietaId) throws SQLException {
        List<Prato> pratos = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(
                "SELECT * FROM Prato WHERE dieta_id = ?")) {

            stmt.setInt(1, dietaId);

            try (ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    Prato prato = new Prato();
                    prato.setDieta_id(resultSet.getInt("dieta_id"));
                    prato.setFonteProt(resultSet.getInt("fonteProt_id"));
                    prato.setFonteCarb(resultSet.getInt("fonteCarb_id"));
                    prato.setFonteGord(resultSet.getInt("fonteGord_id"));
                    prato.setPorcaoProt(resultSet.getDouble("proteina"));
                    prato.setPorcaoGord(resultSet.getDouble("gordura"));
                    prato.setPorcaoCarb(resultSet.getDouble("carboidratos"));

                    pratos.add(prato);
                }
            }

        } catch (SQLException e) {
            throw new SQLException("Não foi possível pratos por dieta_id: " + e.getMessage());
        }

        return pratos;
    }
    public void excluirPratos(int pessoaId, Connection conexao) throws SQLException {
    
    String query = "DELETE FROM Prato WHERE dieta_id IN (SELECT dieta_id FROM Dieta WHERE pessoa_id = ?)";
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        stmt.executeUpdate();
    }
}
}
