/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Pessoa;
import java.util.Scanner;
/**
 *
 * @author taynacardoso
 */
public class PessoaDAO {
public int buscarUsuarioVazio (Pessoa usuarios[], Pessoa pessoa) {
     for (int y= 0; y < usuarios.length; y++)
        {
           if (usuarios[y] == null)
                   {
                       usuarios[y] = pessoa;
                       return y;
                       
                   }
           
        }
     return -1;

        }

public void mudarInf (Pessoa usuarios[], int arrayNum)
{
    int opcao = 0;
    Scanner scan = new Scanner(System.in);
    while (true) {
    System.out.println("Deseja mudar alguma informação da sua conta?");
    System.out.println("1- Nome");
    System.out.println("2- Sexo");
    System.out.println("3- Login");
    System.out.println("4- Senha");
    System.out.println("5- Voltar para perfil");
    String senha;
    opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    String nome;
                    System.out.println("Insira novo nome:");
                    scan.nextLine();
                    nome = scan.nextLine();
                    while (nome.length() <= 3) {
                    System.out.println("Insira um nome com mais de 3 caracteres:");
                    nome = scan.nextLine();
                    }
                    System.out.println("Confirme sua senha");
                    senha = scan.nextLine();
                    if (senha.equals(usuarios[arrayNum].getSenha()))
                    {
                        usuarios[arrayNum].setNome(nome);
                    }
                    else {
                        System.out.println("Senha Incorreta!");
                    }
                    return;
                    
                case 2:
                    String sexo;
                    System.out.println("2- Insira seu sexo, f para feminino e m para masculino:");
                    scan.nextLine();
                    sexo = scan.nextLine();
                    while (!sexo.equals("f") && !sexo.equals("m")) {
                    System.out.println("Sexo invalido. Insira seu sexo f para femino e m para masculino:");
                    sexo = scan.nextLine();
                    }
                    System.out.println("Confirme sua senha");
                    senha = scan.nextLine();
                    if (senha.equals(usuarios[arrayNum].getSenha()))
                    {
                        usuarios[arrayNum].setSexo(sexo);
                    }
                    else {
                        System.out.println("Senha Incorreta!");
                    }
                    
                    
                    return;
                    
                case 3:
                    String login;
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
                    if (senha.equals(usuarios[arrayNum].getSenha()))
                    {
                        usuarios[arrayNum].setLogin(login);
                    }                            
                    else {
                        System.out.println("Senha Incorreta!");
                    }
                        
               
                            
            
                    
                    return;
                    
                case 4:
                    String senhaNova;
                    System.out.println("4- Insira nova senha:");
                    scan.nextLine();
                    senhaNova = scan.nextLine();
                    System.out.println("Confirme sua senha antiga");
                    senha = scan.nextLine();
                    if (senha.equals(usuarios[arrayNum].getSenha()))
                    {
                        usuarios[arrayNum].setSenha(senhaNova);
                    }
                    else {
                        System.out.println("Senha Incorreta!");
                    }
                    return;
                    
                case 5:
                    System.out.println("5- Voltar pro perfil");
                    return;
                            
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    return;
                
                    
    
    
    }
    }
}
public void excluirPessoa (Pessoa usuarios[], int arrayNum) {
                int opcao = 0;
                String senha;
                Scanner scan = new Scanner(System.in);
                while (true) {
                System.out.println("Tem certeza que deseja excluir sua conta, aperte 1 para confirmar e 2 para voltar para seu perfil");
                opcao = scan.nextInt();
                switch (opcao) {
                            case 1:
                                scan.nextLine();
                                System.out.println("Confirme sua senha");
                                senha = scan.nextLine();
                                if (senha.equals(usuarios[arrayNum].getSenha()))
                                {
                                    for (Pessoa usuario : usuarios) {
                                     if (usuario != null && usuarios[arrayNum].getLogin().equals(usuario.getLogin())) {
                                        usuarios[arrayNum].setAvaliacoes(null);
                                        usuarios[arrayNum].setDietas(null);
                                        usuarios[arrayNum].setLogin(null);
                                        usuarios[arrayNum].setNome(null);
                                        usuarios[arrayNum].setSenha(null);
                                        usuarios[arrayNum].setSexo(null);
                                        
                                        return;
                                    }
                                }
                                }
                                else {
                                    System.out.println("Senha Incorreta!");
                    }
                                return;
                            case 2:
                                return;
                                
                            default:
                            System.out.println("Opção inválida. Tente novamente.");
                            return;
                }


                }
            }    
    
}
