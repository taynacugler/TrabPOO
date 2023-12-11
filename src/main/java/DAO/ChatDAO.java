/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Chat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ChatDAO {
public void inserirMensagem(Connection conexao, int remetenteId, int destinatarioId, String mensagem) throws SQLException {
    try (PreparedStatement stmt = conexao.prepareStatement(
            "INSERT INTO Chat (remetente_id, destinatario_id, mensagem) VALUES (?, ?, ?)")) {

        stmt.setInt(1, remetenteId);
        stmt.setInt(2, destinatarioId);
        stmt.setString(3, mensagem);

        stmt.executeUpdate();

        System.out.println("Nova mensagem inserida com sucesso.");

    } catch (SQLException e) {
        throw new SQLException("Erro ao inserir mensagem no banco de dados: " + e.getMessage());
    }
}
 public List<Chat> obterMensagensRecebidas(Connection conexao, int destinatarioId) throws SQLException {
        List<Chat> mensagens = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(
                "SELECT remetente_id, destinatario_id, mensagem FROM Chat WHERE destinatario_id = ?")) {

            stmt.setInt(1, destinatarioId);

            try (ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    int remetenteId = resultSet.getInt("remetente_id");
                    String mensagemTexto = resultSet.getString("mensagem");

                  Chat mensagem = new Chat();
                  mensagem.setMensagem(mensagemTexto);
                  mensagem.setIdRemetente(remetenteId);
                  mensagem.setIdRecebidas(destinatarioId);
                  mensagens.add(mensagem);
                }
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao obter mensagens recebidas: " + e.getMessage());
        }

        return mensagens;
    }
  public List<Chat> obterMensagensDoRemetente(Connection conexao, int remetenteId) throws SQLException {
        List<Chat> mensagens = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(
                "SELECT remetente_id, destinatario_id, mensagem FROM Chat WHERE remetente_id = ?")) {

            stmt.setInt(1, remetenteId);

            try (ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    int destinatarioId = resultSet.getInt("destinatario_id");
                    String mensagemTexto = resultSet.getString("mensagem");

                  Chat mensagem = new Chat();
                  mensagem.setMensagem(mensagemTexto);
                  mensagem.setIdRemetente(remetenteId);
                  mensagem.setIdRecebidas(destinatarioId);
                  mensagens.add(mensagem);
                }
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao obter mensagens do remetente: " + e.getMessage());
        }

        return mensagens;
    }
  public void excluirChat(int pessoaId, Connection conexao) throws SQLException {
    String query = "DELETE FROM Chat WHERE remetente_id = ? OR destinatario_id = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        stmt.setInt(2, pessoaId);
        stmt.executeUpdate();
    }
}

  

}
