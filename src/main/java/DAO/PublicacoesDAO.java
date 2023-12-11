/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Publicacoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PublicacoesDAO {
    PessoaDAO pessoaDAO = new PessoaDAO(); 

    
    public void inserirPublicacao (Publicacoes publicacao, Connection conexao)throws SQLException {
         try (PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO Publicacoes (publicacao, pessoa_id) VALUES (?, ?)")) {

            stmt.setString(1, publicacao.getPublicacao());
            stmt.setInt(2, publicacao.getPessoa_id());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException("Erro ao fazer publicacao " + e.getMessage());
        }
        
    }
        public void mostrarPublicacoes(Connection conexao) throws SQLException {
            String query = "SELECT * FROM Publicacoes";
            Pessoa pessoa = new Pessoa();
            try (PreparedStatement pstmt = conexao.prepareStatement(query);
                 ResultSet resultSet = pstmt.executeQuery()) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("pessoa_id");
                    pessoa = pessoaDAO.obterPessoaPorId(id, conexao);
                    String pub = resultSet.getString("publicacao");
                    System.out.println(pessoa.getNome() + " publicou: " + pub);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
            public void mostrarPubPessoa(int pessoaId, Connection conexao) throws SQLException {
                String query = "SELECT * FROM Publicacoes WHERE pessoa_id = ?";

                try (PreparedStatement pstmt = conexao.prepareStatement(query)) {
                    pstmt.setInt(1, pessoaId);

                    try (ResultSet resultSet = pstmt.executeQuery()) {
                        while (resultSet.next()) {
                            int idPublicacao = resultSet.getInt("publicacao_id");
                            Pessoa pessoa = pessoaDAO.obterPessoaPorId(pessoaId, conexao);
                            String pub = resultSet.getString("publicacao");
                            System.out.println(pessoa.getNome() + " publicou" + pub);
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
    public void excluirPublicacoes(int pessoaId, Connection conexao) throws SQLException {
    String query = "DELETE FROM Publicacoes WHERE pessoa_id = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        stmt.executeUpdate();
    }
}

}
