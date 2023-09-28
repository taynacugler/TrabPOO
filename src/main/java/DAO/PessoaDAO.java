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
    public Pessoa cadastro (Pessoa usuarios[])
    {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Cadastro:");
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
}
