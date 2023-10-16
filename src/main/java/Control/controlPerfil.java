/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DAO.PublicacoesDAO;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Publicacoes;
import java.util.Scanner;


public class controlPerfil {
    PublicacoesDAO opPub = new PublicacoesDAO();
   public Pessoa cadastros (Pessoa[] usuarios) {
        
        Pessoa pessoa = new Pessoa();       
        Scanner scan = new Scanner(System.in);      
        System.out.println("Insira seu nome:"); 
        pessoa.setNome(scan.nextLine());
        while (pessoa.getNome().length() <= 3) {
        System.out.println("Insira um nome com mais de 3 caracteres:");
        pessoa.setNome(scan.nextLine());}
        System.out.println("Insira seu sexo, f para feminino e m para masculino:");
        pessoa.setSexo(scan.nextLine());
        while (!pessoa.getSexo().equals("f") && !pessoa.getSexo().equals("m")) {
        System.out.println("Sexo invalido. Insira seu sexo f para femino e m para masculino:");
        pessoa.setSexo(scan.nextLine());
        }
        //buscar logins para ver se ja existe igual
        System.out.println("Crie um login:");
        pessoa.setLogin(scan.nextLine());
        boolean loginRepetido = true;

        while (loginRepetido) {
            loginRepetido = false;
            for (Pessoa usuario : usuarios) {
                if (usuario != null && pessoa.getLogin().equals(usuario.getLogin())) {
                    System.out.println("Login já utilizado, crie um novo login:");
                    pessoa.setLogin(scan.nextLine());
                    loginRepetido = true;
                    break;
                }
            }
        }  
        System.out.println("Crie um senha:");
        pessoa.setSenha(scan.nextLine());
        
      
        return pessoa;
        
       }
   public int login(Pessoa usuarios[]) {
       
   Scanner scan = new Scanner(System.in);
    boolean loginEncontrado = false;
    int numArray = 0;
    
    while (!loginEncontrado) {
        System.out.println("LOGIN");
        System.out.println("Insira seu login:");
        String login = scan.nextLine();
        
        Pessoa usuarioEncontrado = null;
        for (Pessoa usuario : usuarios) {
            if (usuario != null && login.equals(usuario.getLogin())) {
                usuarioEncontrado = usuario;
                break;
            }
            numArray++;
        }

        if (usuarioEncontrado != null) {
            boolean senhaCorreta = false;
            
            while (!senhaCorreta) {
                System.out.println("Insira sua senha:");
                String senha = scan.nextLine();
                if (senha.equals(usuarioEncontrado.getSenha())) {
                    System.out.println("Login bem-sucedido! Bem-vindo, " + usuarioEncontrado.getNome() + "!");
                    senhaCorreta = true; 
                    loginEncontrado = true;
                    return numArray;
                } else {
                    System.out.println("Senha incorreta. Tente novamente.");
                }
            }
        } else {
            System.out.println("Login não encontrado. Por favor, insira um login válido.");
        }
    } 
    return -1;
   }
   
   public void mostrarPublicacoes (Pessoa[] usuarios, int numArray) {
       int x = 0;
       if (usuarios[numArray].getPublicacoes()[x] == null ) {
           System.out.println("Não há publicações ainda!");
       }
       while (x < 10 && usuarios[numArray].getPublicacoes()[x] != null) {
       System.out.println("Você publicou: " + usuarios[numArray].getPublicacoes()[x].getPublicacao());
       x++;
      }
   }
   public void criarPublicacoes (Pessoa[] usuarios, int numArray, Publicacoes[] pubTodos) {
       
       System.out.println("Escreva sua publicação");
       Scanner scan = new Scanner(System.in); 
       Publicacoes publicacao = new Publicacoes();
       String pub = scan.nextLine();
       publicacao.setPublicacao(pub);
       publicacao.setPessoa(usuarios[numArray]);
       int y = opPub.buscarPubVazia(usuarios[numArray]);
       int z = opPub.timelineVazio(pubTodos);
       if (y != -1) {
         usuarios[numArray].getPublicacoes()[y] = publicacao;
       } else {
          System.out.println("Não foi possível fazer publicação");
               }
       if (z != -1) {
           pubTodos[z] = publicacao;
       } else {
       System.out.println("Não foi possível publicar na timeline");
           }
   }
   public void mostrarPerfil (Pessoa[] usuarios, int numArray) {
        System.out.println("SUAS INFOMAÇÕES:");
        System.out.println("Nome:" + usuarios[numArray].getNome());
        System.out.println("Login:" + usuarios[numArray].getLogin());
        System.out.println("id:" + usuarios[numArray].getId());
        if (usuarios[numArray].getSexo().equals("f")) {
        System.out.println("Sexo: feminino");
        } else {
        System.out.println("Sexo: masculino");
        }
   }
   public void mudarNome (Pessoa[] usuarios, int numArray) {
       String nome;
       String senha;
       Scanner scan = new Scanner(System.in);
       System.out.println("Insira novo nome:");
       nome = scan.nextLine();
       while (nome.length() <= 3) {
       System.out.println("Insira um nome com mais de 3 caracteres:");
       nome = scan.nextLine();
        }
       System.out.println("Confirme sua senha");
       senha = scan.nextLine();
       if (senha.equals(usuarios[numArray].getSenha()))
       {
       usuarios[numArray].setNome(nome);
      }
      else {
        System.out.println("Senha Incorreta!");
      }
   }
    public void mudarSexo(Pessoa[] usuarios, int numArray) {
        String senha;
        Scanner scan = new Scanner(System.in);
        String sexo;
        System.out.println("2- Insira seu sexo, f para feminino e m para masculino:");
        scan.nextLine();
        sexo = scan.nextLine();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Sexo invalido. Insira seu sexo f para feminino e m para masculino:");
            sexo = scan.nextLine();
        }
        System.out.println("Confirme sua senha");
        senha = scan.nextLine();
        if (senha.equals(usuarios[numArray].getSenha())) {
            usuarios[numArray].setSexo(sexo);
        } else {
            System.out.println("Senha Incorreta!");
        }

    }
    public void mudarLogin(Pessoa[] usuarios, int numArray) {
        String login;
        String senha;
        Scanner scan = new Scanner(System.in);
        System.out.println("3- Insira novo login:");
        scan.nextLine();
        login = scan.nextLine();
        boolean loginRepetido = true;

        while (loginRepetido) {
            loginRepetido = false;
            for (Pessoa usuario : usuarios) {
                if (usuario != null && login.equals(usuario.getLogin())) {
                    System.out.println("Login já utilizado, crie um novo login:");
                    login = scan.nextLine();
                    loginRepetido = true;
                    break;
                }
            }
        }
        System.out.println("Confirme sua senha");
        senha = scan.nextLine();
        if (senha.equals(usuarios[numArray].getSenha())) {
            usuarios[numArray].setLogin(login);
        } else {
            System.out.println("Senha Incorreta!");
        }
    }

    public void mudarSenha(Pessoa[] usuarios, int numArray) {
        String senhaNova;
        String senha;
        Scanner scan = new Scanner(System.in);
        System.out.println("4- Insira nova senha:");
        scan.nextLine();
        senhaNova = scan.nextLine();
        System.out.println("Confirme sua senha antiga");
        senha = scan.nextLine();
        if (senha.equals(usuarios[numArray].getSenha())) {
            usuarios[numArray].setSenha(senhaNova);
        } else {
            System.out.println("Senha Incorreta!");
        }
    }
    public int excluirPerfil (Pessoa[] usuarios, int numArray) {
        int op;
        Scanner scan = new Scanner(System.in);

        String senha;
        while (true) {
            System.out.println("Tem certeza que deseja excluir sua conta, aperte 1 para confirmar e 2 para voltar para seu perfil");
            op = scan.nextInt();
            int x = 0;
            switch (op) {
                case 1:
                    scan.nextLine();
                    System.out.println("Confirme sua senha");
                    senha = scan.nextLine();
                    if (senha.equals(usuarios[numArray].getSenha())) {
                        for (Pessoa usuario : usuarios) {
                            if (usuario != null && usuarios[numArray].getLogin().equals(usuario.getLogin())) {
                                usuarios[numArray].setAvaliacoes(null);
                                usuarios[numArray].setDietas(null);
                                usuarios[numArray].setLogin(null);
                                usuarios[numArray].setNome(null);
                                usuarios[numArray].setSenha(null);
                                usuarios[numArray].setSexo(null);
                                x = 1;
                                return x;
                            }
                        }
                        return x;
                    } else {
                        System.out.println("Senha Incorreta!");
                    }
                    return x;
                case 2:
                    return x;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    return x;
            }
        }
    }
}

