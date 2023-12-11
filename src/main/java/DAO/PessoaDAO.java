/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class PessoaDAO {
    DietaDAO dieta = new DietaDAO();
    AvalFisDAO aval = new AvalFisDAO();
   //PublicacoesDAO publicacoes = new PublicacoesDAO();
    ChatDAO chat = new ChatDAO();
    PreferenciasDAO preferencias = new PreferenciasDAO();
    PratoDAO prato = new PratoDAO();
    SeguirDAO seguir = new SeguirDAO();
    
    
    
public Pessoa buscaPorLogin (String login, Connection conexao) throws SQLException {
      try (PreparedStatement stmt = conexao.prepareStatement(
                "SELECT * FROM Pessoa WHERE login = ?")) {

            stmt.setString(1, login);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    Pessoa pessoa = new Pessoa();
//                  pessoa.setId(resultado.getInt("pessoa_id"));
                    pessoa.setNome(resultado.getString("nome"));
                    pessoa.setSexo(resultado.getString("sexo"));
                    pessoa.setLogin(resultado.getString("login"));
                    pessoa.setSenha(resultado.getString("senha"));


                    return pessoa;
                }
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar pessoa no banco de daods: " + e.getMessage());
        }

        return null; 
    }
        public Pessoa buscaPorID (int num, Connection conexao) throws SQLException {
              try (PreparedStatement stmt = conexao.prepareStatement(
                        "SELECT * FROM Pessoa WHERE pessoa_id = ?")) {

                    stmt.setInt(1, num);

                    try (ResultSet resultado = stmt.executeQuery()) {
                        if (resultado.next()) {
                            Pessoa pessoa = new Pessoa();
                            pessoa.setNome(resultado.getString("nome"));
                            pessoa.setSexo(resultado.getString("sexo"));
                            pessoa.setLogin(resultado.getString("login"));
                            pessoa.setSenha(resultado.getString("senha"));


                            return pessoa;
                        }
                    }

                } catch (SQLException e) {
                    throw new SQLException("Erro ao buscar pessoa no banco de dados: " + e.getMessage());
                }

                return null; 
            }


 public void inserirPessoa(Connection conexao, Pessoa pessoa) throws SQLException {
        try (PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO Pessoa (nome, sexo, login, senha) VALUES (?, ?, ?, ?)")) {

            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getLogin());
            stmt.setString(4, pessoa.getSenha());

            stmt.executeUpdate();

            System.out.println("Nova pessoa inserida com sucesso.");

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir pessoa no banco de dados: " + e.getMessage());
        }
    }
 
        public boolean verificarLoginExistente(String login, Connection conexao) throws SQLException {
         try (PreparedStatement stmt = conexao.prepareStatement(
                 "SELECT COUNT(*) FROM Pessoa WHERE login = ?")) {

             stmt.setString(1, login);

             try (ResultSet resultado = stmt.executeQuery()) {
                 if (resultado.next()) {
                     int count = resultado.getInt(1);
                     return count > 0; 
                 }
             }
         } catch (SQLException e) {
             throw new SQLException("Erro ao verificar login no banco de dados: " + e.getMessage());
         }

         return false; 
     }
        
    public boolean verificarSenhaPorLogin (String login, String senha, Connection conexao) throws SQLException {
        String query = "SELECT COUNT(*) FROM Pessoa WHERE login = ? AND senha = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, login);
            stmt.setString(2, senha);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    int count = resultado.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao verificar senha no banco de dados: " + e.getMessage());
        }

        return false;
    }
    public boolean verificarSenhaPorID (int id, String senha, Connection conexao) throws SQLException {
        String query = "SELECT COUNT(*) FROM Pessoa WHERE pessoa_id = ? AND senha = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.setString(2, senha);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    int count = resultado.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao verificar senha no banco de dados: " + e.getMessage());
        }

        return false;
    }
   public void mudarNome(int id, String novoNome, Connection conexao) throws SQLException {
        String query = "UPDATE Pessoa SET nome = ? WHERE pessoa_id = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, novoNome);
            stmt.setInt(2, id);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new SQLException("Usuário não encontrado.");
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar o nome no banco de dados: " + e.getMessage());
        }
    }
   public void mudarSenha (int id, String novaSenha, Connection conexao) throws SQLException {
        String query = "UPDATE Pessoa SET senha = ? WHERE pessoa = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, novaSenha);
            stmt.setInt(2, id);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new SQLException("Usuário não encontrado.");
            }

            System.out.println("Senha Atualizada!");
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a senha no banco de dados: " + e.getMessage());
        }
    }
   public void mudarSexo (int id, String novoSexo, Connection conexao) throws SQLException {
        String query = "UPDATE Pessoa SET sexo = ? WHERE pessoa_id = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, novoSexo);
            stmt.setInt(2, id);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new SQLException("Usuário não encontrado.");
            }

            System.out.println("Sexo Atualizado!");
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar o sexo no banco de dados: " + e.getMessage());
        }
    }
    public void excluirPublicacoes(int pessoaId, Connection conexao) throws SQLException {
    String query = "DELETE FROM Publicacoes WHERE pessoa_id = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, pessoaId);
        stmt.executeUpdate();
    }
}
   public void excluirPerfil(int id, Connection conexao) throws SQLException {
    try {
        prato.excluirPratos(id, conexao);
        dieta.excluirDieta(id, conexao);
        aval.excluirAvalFis(id, conexao);
        excluirPublicacoes(id, conexao);
        chat.excluirChat(id, conexao);
        preferencias.excluirPreferencias(id, conexao);
        seguir.excluirSeguindo(id, conexao);
        seguir.excluirSeguir(id, conexao);
        

      
        String query = "DELETE FROM Pessoa WHERE pessoa_id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new SQLException("Usuário não encontrado.");
            }

            System.out.println("Usuário excluído com sucesso.");
        }
    } catch (SQLException e) {
        throw new SQLException("Erro ao excluir perfil no banco de dados: " + e.getMessage());
    }
}

   public int getID (String login, Connection conexao) throws SQLException {
        String query = "SELECT pessoa_id FROM Pessoa WHERE login = ?";
        
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, login);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    return resultado.getInt("pessoa_id");
                } else {
                    throw new SQLException("Pessoa não encontrada.");
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao pegar ID por login: " + e.getMessage());
        }
    }
   public Pessoa obterPessoaPorId(int id, Connection conexao) throws SQLException  {
    String query = "SELECT nome, sexo, login FROM Pessoa WHERE pessoa_id = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(query)) {
        stmt.setInt(1, id);

        try (ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(id);
                pessoa.setNome(resultSet.getString("nome"));
                pessoa.setSexo(resultSet.getString("sexo"));
                pessoa.setLogin(resultSet.getString("login"));
                return pessoa;
            } else {
                return null; 
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Erro ao procurar pessoa" + e.getMessage());
    }
}
 

}




