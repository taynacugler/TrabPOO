/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;

import com.mycompany.trabpoo.Bean.Alimento;
import com.mycompany.trabpoo.Bean.Pessoa;
import java.util.Scanner;

/**
 *
 * @author taynacardoso
 */
public class Programa {
    Pessoa usuarios [] = new Pessoa [10];
    Alimento alimentos [] = new Alimento [19];
    static Pessoa[] setarPessoas (Pessoa usuarios[])
    {
        Pessoa p1 = new Pessoa();
        p1.setNome("Tayna"); 
        p1.setSexo("f");
        p1.setLogin("tayna");
        p1.setSenha("1234");
        usuarios [0] = p1;
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Silvio");
        p2.setSexo("m");
        p2.setLogin("silvio");
        p2.setSenha("5678");
        usuarios [1] = p2;
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Malu");
        p3.setSexo("f");
        p3.setLogin("Malu");
        p3.setSenha("1256");
        usuarios [2] = p3;
        return usuarios;
    }
    static Alimento[] setarAlimen (Alimento alimentos[]) {
        Alimento arroz = new Alimento();
        arroz.setNome("arroz");
        arroz.setCarb(28.1);
        arroz.setProt(2.5);
        arroz.setGord(0.2);
        arroz.setPorcao(100);
        arroz.setTipoUsuario("1");
        arroz.setCal(arroz.getCal(), arroz.getCarb(), arroz.getProt(), arroz.getGord());
        System.out.println("Calorias de " + arroz.getPorcao() + " gramas de " + arroz.getNome() +": " + arroz.getCal());
        alimentos [0] = arroz;
        
        Alimento macarrao = new Alimento();
        macarrao.setNome("macarrão");
        macarrao.setCarb(77.9);
        macarrao.setProt(10);
        macarrao.setGord(1.3);
        macarrao.setPorcao(100);
        macarrao.setTipoUsuario("1");
        macarrao.setCal(macarrao.getCal(), macarrao.getCarb(), macarrao.getProt(), macarrao.getGord());
        System.out.println("Calorias de " + macarrao.getPorcao() + " gramas de " + macarrao.getNome() +": " + macarrao.getCal());
        alimentos [1] = macarrao;
        
        
        Alimento pao = new Alimento();
        pao.setNome("pão francês");
        pao.setCarb(58.6);
        pao.setProt(80);
        pao.setGord(3);
        pao.setPorcao(100);
        pao.setTipoUsuario("1");
        pao.setCal(pao.getCal(), pao.getCarb(), pao.getProt(), pao.getGord());
        System.out.println("Calorias de " + pao.getPorcao() + " gramas de " + pao.getNome() +": " + pao.getCal());
        alimentos [2] = pao;
       
        Alimento batataDoce = new Alimento();
        batataDoce.setNome("batata doce");
        batataDoce.setCarb(18.4);
        batataDoce.setProt(0.6);
        batataDoce.setGord(0.1);
        batataDoce.setPorcao(100);
        batataDoce.setTipoUsuario("1");
        batataDoce.setCal(batataDoce.getCal(), batataDoce.getCarb(), batataDoce.getProt(), batataDoce.getGord());
        System.out.println("Calorias de " + batataDoce.getPorcao() + " gramas de " + batataDoce.getNome() +": " + batataDoce.getCal());
        alimentos [3] = batataDoce;

        
        Alimento batataInglesa = new Alimento();
        batataInglesa.setNome("batata inglesa");
        batataInglesa.setCarb(11.9);
        batataInglesa.setProt(1.2);
        batataInglesa.setGord(0);
        batataInglesa.setPorcao(100);
        batataInglesa.setTipoUsuario("1");
        batataInglesa.setCal(batataInglesa.getCal(), batataInglesa.getCarb(), batataInglesa.getProt(), batataInglesa.getGord());
        System.out.println("Calorias de " + batataInglesa.getPorcao() + " gramas de " + batataInglesa.getNome() +": " + batataInglesa.getCal());
        alimentos [4] = batataInglesa;
        
        Alimento tapioca = new Alimento();
        tapioca.setNome("tapioca");
        tapioca.setCarb(22);
        tapioca.setProt(2);
        tapioca.setGord(3.9);
        tapioca.setPorcao(100);
        tapioca.setTipoUsuario("1");
        tapioca.setCal(tapioca.getCal(), tapioca.getCarb(), tapioca.getProt(),tapioca.getGord());
        System.out.println("Calorias de " + tapioca.getPorcao() + " gramas de " + tapioca.getNome() +": " + tapioca.getCal());
        alimentos [5] = tapioca;
        
        Alimento banana = new Alimento();
        banana.setNome("banana");
        banana.setCarb(23);
        banana.setProt(1.1);
        banana.setGord(0.3);
        banana.setPorcao(100);
        banana.setTipoUsuario("1");
        banana.setCal(banana.getCal(), banana.getCarb(), banana.getProt(),banana.getGord());
        System.out.println("Calorias de " + banana.getPorcao() + " gramas de " + banana.getNome() +": " + banana.getCal());
        alimentos [6] = banana;
        
        //Alimentos fonte de proteina
        
        Alimento peitoFrango = new Alimento();
        peitoFrango.setNome("peito de frango");
        peitoFrango.setCarb(0);
        peitoFrango.setProt(32);
        peitoFrango.setGord(14);
        peitoFrango.setPorcao(100);
        peitoFrango.setTipoUsuario("2");
        peitoFrango.setCal(peitoFrango.getCal(), peitoFrango.getCarb(), peitoFrango.getProt(),peitoFrango.getGord());
        System.out.println("Calorias de " + peitoFrango.getPorcao() + " gramas de " + peitoFrango.getNome() +": " + peitoFrango.getCal());
        alimentos [7] = peitoFrango;
        
        Alimento patinho = new Alimento();
        patinho.setNome("patinho");
        patinho.setCarb(0);
        patinho.setProt(35.9);
        patinho.setGord(7.3);
        patinho.setPorcao(100);
        patinho.setTipoUsuario("2");
        patinho.setCal(patinho.getCal(), patinho.getCarb(), patinho.getProt(),patinho.getGord());
        System.out.println("Calorias de " + patinho.getPorcao() + " gramas de " + patinho.getNome() +": " + patinho.getCal());
        alimentos [8] = patinho ;
        
        Alimento tilapia = new Alimento();
        tilapia.setNome("tilápia");
        tilapia.setCarb(0);
        tilapia.setProt(23);
        tilapia.setGord(2);
        tilapia.setPorcao(100);
        tilapia.setTipoUsuario("2");
        tilapia.setCal(tilapia.getCal(), tilapia.getCarb(), tilapia.getProt(),tilapia.getGord());
        System.out.println("Calorias de " + tilapia.getPorcao() + " gramas de " + tilapia.getNome() +": " + tilapia.getCal());
        alimentos [9] = tilapia;
        
        Alimento soja = new Alimento();
        soja.setNome("proteína de soja");
        soja.setCarb(8);
        soja.setProt(23);
        soja.setGord(1);
        soja.setPorcao(100);
        soja.setTipoUsuario("2");
        soja.setCal(soja.getCal(), soja.getCarb(), soja.getProt(),soja.getGord());
        System.out.println("Calorias de " + soja.getPorcao() + " gramas de " + soja.getNome() +": " + soja.getCal());
        alimentos [10] = soja;
        
        Alimento ovoCozido = new Alimento();
        ovoCozido.setNome("ovo cozido");
        ovoCozido.setCarb(1.1);
        ovoCozido.setProt(13);
        ovoCozido.setGord(11);
        ovoCozido.setPorcao(100);
        ovoCozido.setTipoUsuario("2");
        ovoCozido.setCal(ovoCozido.getCal(), ovoCozido.getCarb(), ovoCozido.getProt(),ovoCozido.getGord());
        System.out.println("Calorias de " + ovoCozido.getPorcao() + " gramas de " + ovoCozido.getNome() +": " + ovoCozido.getCal());
        alimentos [11] = ovoCozido;
        
        Alimento atum = new Alimento();
        atum.setNome("Atum");
        atum.setCarb(0);
        atum.setProt(23);
        atum.setGord(1);
        atum.setPorcao(100);
        atum.setTipoUsuario("2");
        atum.setCal(atum.getCal(), atum.getCarb(), atum.getProt(),atum.getGord());
        System.out.println("Calorias de " + atum.getPorcao() + " gramas de " + atum.getNome() +": " + atum.getCal());
        alimentos [12] = atum;
        
        //Alimentos fonte de gordura
        Alimento abacate = new Alimento();
        abacate.setNome("abacate");
        abacate.setCarb(6);
        abacate.setProt(1.2);
        abacate.setGord(8.4);
        abacate.setPorcao(100);
        abacate.setTipoUsuario("3");
        abacate.setCal(abacate.getCal(), abacate.getCarb(),abacate.getProt(),abacate.getGord());
        System.out.println("Calorias de " + abacate.getPorcao() + " gramas de " + abacate.getNome() +": " + abacate.getCal());
        alimentos [13] = abacate;
        
        Alimento pastaAmendoim = new Alimento();
        pastaAmendoim.setNome("pasta de amendoim");
        pastaAmendoim.setCarb(20);
        pastaAmendoim.setProt(25);
        pastaAmendoim.setGord(50);
        pastaAmendoim.setPorcao(100);
        pastaAmendoim.setTipoUsuario("3");
        pastaAmendoim.setCal(pastaAmendoim.getCal(), pastaAmendoim.getCarb(), pastaAmendoim.getProt(),pastaAmendoim.getGord());
        System.out.println("Calorias de " + pastaAmendoim.getPorcao() + " gramas de " + pastaAmendoim.getNome() +": " + pastaAmendoim.getCal());
        alimentos [14] = pastaAmendoim;
        
        Alimento azeite = new Alimento();
        azeite.setNome("azeite");
        azeite.setCarb(0);
        azeite.setProt(0);
        azeite.setGord(100);
        azeite.setPorcao(100);
        azeite.setTipoUsuario("3");
        azeite.setCal(azeite.getCal(), azeite.getCarb(), azeite.getProt(),azeite.getGord());
        System.out.println("Calorias de " + azeite.getPorcao() + " gramas de " + azeite.getNome() +": " + azeite.getCal());
        alimentos [15] = azeite;
        
        Alimento manteiga = new Alimento();
        manteiga.setNome("manteiga");
        manteiga.setCarb(0.1);
        manteiga.setProt(0.4);
        manteiga.setGord(82.4);
        manteiga.setPorcao(100);
        manteiga.setTipoUsuario("3");
        manteiga.setCal(manteiga.getCal(), manteiga.getCarb(), manteiga.getProt(),manteiga.getGord());
        System.out.println("Calorias de " + manteiga.getPorcao() + " gramas de " + manteiga.getNome() +": " + manteiga.getCal());
        alimentos [16] = manteiga;
        
        Alimento nozes = new Alimento();
        nozes.setNome("nozes");
        nozes.setCarb(18.4);
        nozes.setProt(14);
        nozes.setGord(59);
        nozes.setPorcao(100);
        nozes.setTipoUsuario("3");
        nozes.setCal(nozes.getCal(), nozes.getCarb(), nozes.getProt(),nozes.getGord());
        System.out.println("Calorias de " + nozes.getPorcao() + " gramas de " + nozes.getNome() +": " + nozes.getCal());
        alimentos [17] = nozes;
        
        Alimento castanhas = new Alimento();
        castanhas.setNome("castanhas");
        castanhas.setCarb(29.1);
        castanhas.setProt(18.5);
        castanhas.setGord(46.3);
        castanhas.setPorcao(100);
        castanhas.setTipoUsuario("3");
        castanhas.setCal(castanhas.getCal(), castanhas.getCarb(), castanhas.getProt(),castanhas.getGord());
        System.out.println("Calorias de " + castanhas.getPorcao() + " gramas de " + castanhas.getNome() +": " + castanhas.getCal());
        alimentos [18] = castanhas;
        
        
        return alimentos;
    }
    final void menu () {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Inicial");
            System.out.println("Para fazer login, digite 1");
            System.out.println("Para fazer cadastro, digite 2");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu fazer login.");
                    login(usuarios);
                    return;

                case 2:
                    System.out.println("Você escolheu fazer cadastro.");
                   cadastro(usuarios);
                   return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    void cadastro (Pessoa usuarios[])
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
//        boolean loginRepetido = true;
//
//        while (loginRepetido) {
//            loginRepetido = false; 
//            for (Pessoa usuario : usuarios) {
//                if (pessoa.getLogin().equals(usuario.getLogin())) {
//                    System.out.println("Login já utilizado, crie um novo login:");
//                    pessoa.setLogin(scan.nextLine());
//                    loginRepetido = true; 
//                    break;
//                }
//            }
//        }              
        System.out.println("Crie um senha:");
        pessoa.setSenha(scan.nextLine());
               for (int y= 0; y < usuarios.length; y++)
        {
           if (usuarios[y] == null)
                   {
                       usuarios[y] = pessoa;
                       return;
                       
                   }
           
        }
        
    }
    
    void login (Pessoa usuarios[])
    {
        String login;
        String senha;
        Scanner scan = new Scanner(System.in);
        System.out.println("Login");
        System.out.println("Insira seu login:"); 
        login = scan.nextLine();
//        boolean loginEncontrado = true;
//
//        while (loginEncontrado) {
//            loginEncontrado = false;
//
//            for (Pessoa usuario : usuarios) {
//                if (login.equals(usuario.getLogin())) {
//                    loginEncontrado = true;
//                    System.out.println("Login não existe, coloque um login valido");
//                    login = scan.nextLine();
//                    break; 
//                }
//            }
//        }
        System.out.println(login);
        System.out.println("Insira sua Senha:"); 
        senha = scan.nextLine();
        System.out.println(senha);
    }

    /**
     *
     */
    public Programa() {
        setarPessoas(usuarios);
        setarAlimen(alimentos);
        menu();
        System.out.println(usuarios[0].getNome() + usuarios[1].getNome() + usuarios[2].getNome());
    }
    
    
    
}
