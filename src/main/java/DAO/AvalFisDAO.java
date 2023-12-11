/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Pessoa;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;





public class AvalFisDAO {
    public int cadastrarAvaliacaoFisica(AvalFis avaliacao, int idPessoa, Connection conexao) throws SQLException {
    String query = "INSERT INTO AvalFis (pessoa_id, peso, altura, idade, pescoco, cintura, quadril, atvFis, abdomem, IMC, TMB, BF, massaGorda, massaMagra) " +
                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement stmt = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
        stmt.setInt(1, idPessoa);
        stmt.setDouble(2, avaliacao.getPeso());
        stmt.setDouble(3, avaliacao.getAltura());
        stmt.setDouble(4, avaliacao.getIdade());
        stmt.setDouble(5, avaliacao.getPescoco());
        stmt.setDouble(6, avaliacao.getCintura());
        stmt.setDouble(7, avaliacao.getQuadril());
        stmt.setDouble(8, avaliacao.getAtvFis());
        stmt.setDouble(9, avaliacao.getAbdomem());
        stmt.setDouble(10, avaliacao.getIMC());
        stmt.setDouble(11, avaliacao.getTMB());
        stmt.setDouble(12, avaliacao.getBF());
        stmt.setDouble(13, avaliacao.getMassaGorda());
        stmt.setDouble(14, avaliacao.getMassaMagra());

        int linhasAfetadas = stmt.executeUpdate();

        if (linhasAfetadas == 0) {
            throw new SQLException("Não foi possível cadastrar avaliação física no banco de dados.");
        }

        try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                int idAvaliacao = generatedKeys.getInt(1);
                System.out.println("Avaliação física cadastrada com sucesso. ID: " + idAvaliacao);
                return idAvaliacao;
            } else {
                throw new SQLException("Não foi possível recuperar o ID gerado para a avaliação física.");
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Não foi possível cadastrar avaliação física no banco de dados: " + e.getMessage());
    }
}
    public double getPeso (int idAvaliacao, Connection conexao) throws SQLException {
    double peso = 0.0;
    String query = "SELECT peso FROM AvalFis WHERE aval_id = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, idAvaliacao);

        try (ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                peso = resultSet.getDouble("peso");
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Não foi possível obter peso: " + e.getMessage());
    }

    return peso;
}

       public boolean buscaIDPessoa (int id, Connection conexao) throws SQLException {
           
        String query = "SELECT COUNT(*) FROM AvalFis WHERE pessoa_id = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setInt(1, id);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    int count = resultado.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Não foi possível ao verificar existência de avaliação física para a pessoa: " + e.getMessage());
        }

        return false;
    }
    public String obterSexoPorId(int id, Connection conexao) throws SQLException {
    String query = "SELECT sexo FROM Pessoa WHERE pessoa_id = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, id);

        try (ResultSet resultado = stmt.executeQuery()) {
            if (resultado.next()) {
                return resultado.getString("sexo");
            } else {
                throw new SQLException("Pessoa não encontrada.");
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Não foi possível ao obter sexo : " + e.getMessage());
    }
}
    public AvalFis getAval (int idPessoa,  Connection conexao) throws SQLException {
    String query = "SELECT * FROM AvalFis" +
                   " WHERE pessoa_id = ?" +
                   " ORDER BY dataCriacao DESC" + 
                   " LIMIT 1";

    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
         stmt.setInt(1, idPessoa);
         

        try (ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                AvalFis avalFis = new AvalFis();
                avalFis.setPessoa_id(resultSet.getInt("pessoa_id"));
                avalFis.setPeso(resultSet.getDouble("peso"));
                avalFis.setAltura(resultSet.getDouble("altura"));
                avalFis.setIdade(resultSet.getDouble("idade"));
                avalFis.setPescoco(resultSet.getDouble("pescoco"));
                avalFis.setCintura(resultSet.getDouble("cintura"));
                avalFis.setQuadril(resultSet.getDouble("quadril"));
                avalFis.setAtvFis(resultSet.getDouble("atvFis"));
                avalFis.setAbdomem(resultSet.getDouble("abdomem"));
                avalFis.setIMC_calculado(resultSet.getDouble("IMC"));
                avalFis.setTMB_calculado(resultSet.getDouble("TMB"));
                avalFis.setBF_calculado(resultSet.getDouble("BF"));
                avalFis.setMassaGorda_calculado(resultSet.getDouble("massaGorda"));
                avalFis.setMassaMagra_calculado(resultSet.getDouble("massaMagra"));
                avalFis.setDataCriacao(resultSet.getTimestamp("dataCriacao").toLocalDateTime());
                avalFis.setDataModificacao(resultSet.getTimestamp("dataModificacao").toLocalDateTime());

                return avalFis;
            } else {
                return null;
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Não foi possível a pegar a avaliação: " + e.getMessage());
    }
}
    public void excluirAvalFis(int pessoaId, Connection conexao) throws SQLException {
    String query = "DELETE FROM AvalFis WHERE pessoa_id = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        stmt.executeUpdate();
    }
}
       
       
}