/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DAO.PublicacoesDAO;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Publicacoes;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import com.mycompany.trabpoo.DBConnection;
import DAO.PessoaDAO;



public class controlPerfil {
    PublicacoesDAO opPub = new PublicacoesDAO();
    PessoaDAO pessoaDAO = new PessoaDAO();
 public void cadastros() {
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        pessoa.setNome(scan.nextLine());
        while (pessoa.getNome().length() <= 3) {
            System.out.println("Insira um nome com mais de 3 caracteres:");
            pessoa.setNome(scan.nextLine());
        }

        System.out.println("Insira seu sexo, f para feminino e m para masculino:");
        pessoa.setSexo(scan.nextLine());
        while (!pessoa.getSexo().equals("f") && !pessoa.getSexo().equals("m")) {
            System.out.println("Sexo inválido. Insira seu sexo f para feminino e m para masculino:");
            pessoa.setSexo(scan.nextLine());
        }

        System.out.println("Crie um login:");
        pessoa.setLogin(scan.nextLine());
        
        try (DBConnection dbConnection = new DBConnection()) {
            
        boolean loginExiste = true;        
        while (loginExiste) {
        loginExiste = pessoaDAO.verificarLoginExistente(pessoa.getLogin(), dbConnection.getConnection());
        System.out.println("Login já utilizado, crie um novo login:");
        pessoa.setLogin(scan.nextLine());
    }

             System.out.println("Cadastro realizado com sucesso.");
         } catch (SQLException e) {
             System.err.println("Erro ao cadastrar pessoa no banco de dados: " + e.getMessage());
         }

//       
        System.out.println("Crie uma senha:");
        pessoa.setSenha(scan.nextLine());

              try (DBConnection dbConnection = new DBConnection()) {
             pessoaDAO.inserirPessoa(dbConnection.getConnection(), pessoa);

             System.out.println("Cadastro realizado com sucesso.");
         } catch (SQLException e) {
             System.err.println("Erro ao cadastrar pessoa no banco de dados: " + e.getMessage());
         }

    }

   public String fazerLogin() {
       
    Scanner scan = new Scanner(System.in);
     
     
        System.out.println("LOGIN");
        System.out.println("Insira seu login:");
        String login = scan.nextLine();
        int id = 0;
       try (DBConnection dbConnection = new DBConnection()) {
            while (!pessoaDAO.verificarLoginExistente(login, dbConnection.getConnection()))
            {
                System.out.println("Login não encontrado, digite novamente");
                login = scan.nextLine();
            }
            System.out.println("Insira sua senha:");
            String senha = scan.nextLine();
            while (!pessoaDAO.verificarSenhaPorLogin(login, senha, dbConnection.getConnection()))
            {
                System.out.println("Senha incorreta, digite novamente");
                senha = scan.nextLine();
            }
          
               
            
            
       } catch (SQLException e) {
             System.err.println("Erro ao fazer login: " + e.getMessage());
         }

       
      return login;
    } 
  
   

   public void criarPublicacoes (int id) {
       
       System.out.println("Escreva sua publicação");
       Scanner scan = new Scanner(System.in); 
       Publicacoes publicacao = new Publicacoes();
       String pub = scan.nextLine();
       publicacao.setPublicacao(pub);
       publicacao.setPessoa_id(id);
       
       try (DBConnection dbConnection = new DBConnection()) {
             opPub.inserirPublicacao(publicacao, dbConnection.getConnection());
             
         } catch (SQLException e) {
             System.err.println("Erro ao fazer publicacao" + e.getMessage());
         }
       
       
   }
   public void mostrarPerfil (int id) {
        Pessoa pessoa = new Pessoa();
       try (DBConnection dbConnection = new DBConnection()) {
             pessoa = pessoaDAO.obterPessoaPorId(id, dbConnection.getConnection());
                 System.out.println("Nome: " + pessoa.getNome());
                 System.out.println("Login: " + pessoa.getLogin());
                 System.out.println("ID: " + pessoa.getId());
             
         } catch (SQLException e) {
             System.err.println("Erro ao procurar pessoa" + e.getMessage());
         }
   }

    public void mudarInformacoes (int id) {
        Scanner scan = new Scanner(System.in);
        String inf;
        String senha;
        int opc;
        System.out.println("Qual informação você quer mudar?");
        System.out.println("1- Mudar senha");        
        System.out.println("2- Mudar nome");
        System.out.println("3- Mudar sexo");
        opc = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite nova informacao:");
        inf = scan.nextLine();
        System.out.println("Digite senha:");
        senha = scan.nextLine();
        try (DBConnection dbConnection = new DBConnection()) {
            while (!pessoaDAO.verificarSenhaPorID(id, senha, dbConnection.getConnection()))
            {
                System.out.println("Senha incorreta, digite novamente");
                senha = scan.nextLine();
            }
            System.out.println(opc);
         switch (opc) {
            case 1:
                pessoaDAO.mudarSenha(id, inf, dbConnection.getConnection());
                break;
            case 2:
                pessoaDAO.mudarNome(id, inf, dbConnection.getConnection());
                break;
            case 3:
                pessoaDAO.mudarSexo(id, inf, dbConnection.getConnection());
                break;
            default:
                break;
        }
                    
            
            
       } catch (SQLException e) {
             System.err.println("Erro ao mudar informações " + e.getMessage());
       }   
       
        
    }
        public int excluir (int id) {
        Scanner scan = new Scanner(System.in);
        String senha;
         System.out.println("Digite senha:");
        senha = scan.nextLine();
        try (DBConnection dbConnection = new DBConnection()) {
            while (!pessoaDAO.verificarSenhaPorID(id, senha, dbConnection.getConnection()))
            {
                System.out.println("Senha incorreta, digite novamente");
                senha = scan.nextLine();
            }
       
                pessoaDAO.excluirPerfil(id, dbConnection.getConnection());
                return 1;
        } catch (SQLException e) {
             System.err.println("Erro ao mudar informações " + e.getMessage());
             return 0;
       }   
        
    }
    

    
}

