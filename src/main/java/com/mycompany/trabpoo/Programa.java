/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;

import Control.ControlDieta;
import DAO.PessoaDAO;
import DAO.AvalFisDAO;
import DAO.PreferenciasDAO;
import com.mycompany.trabpoo.Bean.Alimento;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Dieta;
import com.mycompany.trabpoo.Bean.Refeicoes;
import com.mycompany.trabpoo.Bean.Preferencias;
import com.mycompany.trabpoo.Bean.Publicacoes;
import com.mycompany.trabpoo.Bean.Chat;
import DAO.ChatDAO;
import DAO.DietaDAO;
import DAO.RefeicoesDAO;
import DAO.AlimentoDAO;
import DAO.PublicacoesDAO;
import Control.controlPerfil;
import java.util.Scanner;

/**
 *
 * @author taynacardoso
 */
public class Programa {
    Pessoa usuarios [] = new Pessoa [10];
    Alimento alimentos [] = new Alimento [19];
    Publicacoes pubTodos [] = new Publicacoes [40];
    PessoaDAO op = new PessoaDAO();
    AvalFisDAO opAF = new AvalFisDAO();
    DietaDAO opD = new DietaDAO();
    RefeicoesDAO opR = new RefeicoesDAO();
    PreferenciasDAO opP = new PreferenciasDAO();
    AlimentoDAO opA = new AlimentoDAO();
    PublicacoesDAO opPub = new PublicacoesDAO();
    ChatDAO opC = new ChatDAO();
    controlPerfil cp = new controlPerfil();
    ControlDieta cd = new ControlDieta();   
    
    
    Pessoa[] setarPessoas (Pessoa usuarios[])
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
    
    Alimento[] setarAlimen (Alimento alimentos[]) {
        Alimento arroz = new Alimento();
        arroz.setNome("arroz");
        arroz.setCarb(28.1);
        arroz.setProt(2.5);
        arroz.setGord(0.2);
        arroz.setPorcao(100);
        arroz.setTipoUsuario("1");
        arroz.setCal(arroz.getCal(), arroz.getCarb(), arroz.getProt(), arroz.getGord());
        alimentos [0] = arroz;
        
        Alimento macarrao = new Alimento();
        macarrao.setNome("macarrão");
        macarrao.setCarb(77.9);
        macarrao.setProt(10);
        macarrao.setGord(1.3);
        macarrao.setPorcao(100);
        macarrao.setTipoUsuario("1");
        macarrao.setCal(macarrao.getCal(), macarrao.getCarb(), macarrao.getProt(), macarrao.getGord());
        alimentos [1] = macarrao;
        
        
        Alimento pao = new Alimento();
        pao.setNome("pão francês");
        pao.setCarb(58.6);
        pao.setProt(80);
        pao.setGord(3);
        pao.setPorcao(100);
        pao.setTipoUsuario("1");
        pao.setCal(pao.getCal(), pao.getCarb(), pao.getProt(), pao.getGord());
        alimentos [2] = pao;
       
        Alimento batataDoce = new Alimento();
        batataDoce.setNome("batata doce");
        batataDoce.setCarb(18.4);
        batataDoce.setProt(0.6);
        batataDoce.setGord(0.1);
        batataDoce.setPorcao(100);
        batataDoce.setTipoUsuario("1");
        batataDoce.setCal(batataDoce.getCal(), batataDoce.getCarb(), batataDoce.getProt(), batataDoce.getGord());
        alimentos [3] = batataDoce;

        
        Alimento batataInglesa = new Alimento();
        batataInglesa.setNome("batata inglesa");
        batataInglesa.setCarb(11.9);
        batataInglesa.setProt(1.2);
        batataInglesa.setGord(0);
        batataInglesa.setPorcao(100);
        batataInglesa.setTipoUsuario("1");
        batataInglesa.setCal(batataInglesa.getCal(), batataInglesa.getCarb(), batataInglesa.getProt(), batataInglesa.getGord());
        alimentos [4] = batataInglesa;
        
        Alimento tapioca = new Alimento();
        tapioca.setNome("tapioca");
        tapioca.setCarb(22);
        tapioca.setProt(2);
        tapioca.setGord(3.9);
        tapioca.setPorcao(100);
        tapioca.setTipoUsuario("1");
        tapioca.setCal(tapioca.getCal(), tapioca.getCarb(), tapioca.getProt(),tapioca.getGord());
        alimentos [5] = tapioca;
        
        Alimento banana = new Alimento();
        banana.setNome("banana");
        banana.setCarb(23);
        banana.setProt(1.1);
        banana.setGord(0.3);
        banana.setPorcao(100);
        banana.setTipoUsuario("1");
        banana.setCal(banana.getCal(), banana.getCarb(), banana.getProt(),banana.getGord());
        alimentos [6] = banana;
        System.out.println("com.mycompany.trabpoo.Programa.setarAlimen()");
        
        //Alimentos fonte de proteina
        
        Alimento peitoFrango = new Alimento();
        peitoFrango.setNome("peito de frango");
        peitoFrango.setCarb(0);
        peitoFrango.setProt(32);
        peitoFrango.setGord(14);
        peitoFrango.setPorcao(100);
        peitoFrango.setTipoUsuario("2");
        peitoFrango.setCal(peitoFrango.getCal(), peitoFrango.getCarb(), peitoFrango.getProt(),peitoFrango.getGord());
        alimentos [7] = peitoFrango;
        
        Alimento patinho = new Alimento();
        patinho.setNome("patinho");
        patinho.setCarb(0);
        patinho.setProt(35.9);
        patinho.setGord(7.3);
        patinho.setPorcao(100);
        patinho.setTipoUsuario("2");
        patinho.setCal(patinho.getCal(), patinho.getCarb(), patinho.getProt(),patinho.getGord());
        alimentos [8] = patinho ;
        
        Alimento tilapia = new Alimento();
        tilapia.setNome("tilápia");
        tilapia.setCarb(0);
        tilapia.setProt(23);
        tilapia.setGord(2);
        tilapia.setPorcao(100);
        tilapia.setTipoUsuario("2");
        tilapia.setCal(tilapia.getCal(), tilapia.getCarb(), tilapia.getProt(),tilapia.getGord());
        alimentos [9] = tilapia;
        
        Alimento soja = new Alimento();
        soja.setNome("proteína de soja");
        soja.setCarb(8);
        soja.setProt(23);
        soja.setGord(1);
        soja.setPorcao(100);
        soja.setTipoUsuario("2");
        soja.setCal(soja.getCal(), soja.getCarb(), soja.getProt(),soja.getGord());
        alimentos [10] = soja;
        
        Alimento ovoCozido = new Alimento();
        ovoCozido.setNome("ovo cozido");
        ovoCozido.setCarb(1.1);
        ovoCozido.setProt(13);
        ovoCozido.setGord(11);
        ovoCozido.setPorcao(100);
        ovoCozido.setTipoUsuario("2");
        ovoCozido.setCal(ovoCozido.getCal(), ovoCozido.getCarb(), ovoCozido.getProt(),ovoCozido.getGord());
        alimentos [11] = ovoCozido;
        
        Alimento atum = new Alimento();
        atum.setNome("Atum");
        atum.setCarb(0);
        atum.setProt(23);
        atum.setGord(1);
        atum.setPorcao(100);
        atum.setTipoUsuario("2");
        atum.setCal(atum.getCal(), atum.getCarb(), atum.getProt(),atum.getGord());
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
        alimentos [13] = abacate;
        
        Alimento pastaAmendoim = new Alimento();
        pastaAmendoim.setNome("pasta de amendoim");
        pastaAmendoim.setCarb(20);
        pastaAmendoim.setProt(25);
        pastaAmendoim.setGord(50);
        pastaAmendoim.setPorcao(100);
        pastaAmendoim.setTipoUsuario("3");
        pastaAmendoim.setCal(pastaAmendoim.getCal(), pastaAmendoim.getCarb(), pastaAmendoim.getProt(),pastaAmendoim.getGord());
        alimentos [14] = pastaAmendoim;
        
        Alimento azeite = new Alimento();
        azeite.setNome("azeite");
        azeite.setCarb(0);
        azeite.setProt(0);
        azeite.setGord(100);
        azeite.setPorcao(100);
        azeite.setTipoUsuario("3");
        azeite.setCal(azeite.getCal(), azeite.getCarb(), azeite.getProt(),azeite.getGord());
        alimentos [15] = azeite;
        
        Alimento manteiga = new Alimento();
        manteiga.setNome("manteiga");
        manteiga.setCarb(0.1);
        manteiga.setProt(0.4);
        manteiga.setGord(82.4);
        manteiga.setPorcao(100);
        manteiga.setTipoUsuario("3");
        manteiga.setCal(manteiga.getCal(), manteiga.getCarb(), manteiga.getProt(),manteiga.getGord());
        alimentos [16] = manteiga;
        
        Alimento nozes = new Alimento();
        nozes.setNome("nozes");
        nozes.setCarb(18.4);
        nozes.setProt(14);
        nozes.setGord(59);
        nozes.setPorcao(100);
        nozes.setTipoUsuario("3");
        nozes.setCal(nozes.getCal(), nozes.getCarb(), nozes.getProt(),nozes.getGord());
        alimentos [17] = nozes;
        
        Alimento castanhas = new Alimento();
        castanhas.setNome("castanhas");
        castanhas.setCarb(29.1);
        castanhas.setProt(18.5);
        castanhas.setGord(46.3);
        castanhas.setPorcao(100);
        castanhas.setTipoUsuario("3");
        castanhas.setCal(castanhas.getCal(), castanhas.getCarb(), castanhas.getProt(),castanhas.getGord());
        alimentos [18] = castanhas;
        
        
        return alimentos;
    }
    
    void menu () {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("MENU INICIAL");
            System.out.println("Para fazer login, digite 1");
            System.out.println("Para fazer cadastro, digite 2");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("LOGIN");
                    int array = cp.login(usuarios);
                    if (array != -1) {
                        tela(array);
                    }
                    return;

                case 2:
                   System.out.println("CADASTRO");
                   Pessoa pessoa = new Pessoa();     
                   pessoa = cp.cadastros(usuarios);
                   int num = op.buscarUsuarioVazio(usuarios);
                   usuarios[num] = pessoa;
                   if (num>= 0) {
                   System.out.println("Parabens, " + usuarios[num].getNome() + "! Seu cadastro foi feito com sucesso!");
                   tela(num);
            
        } else {
            System.out.println("Não foi possível fazer um novo cadastro!");
            menu();
        }
                   return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
      
    void tela(int numArray)
    {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("OPCOES");
            System.out.println("Para ir para seu perfil, digite 1");
            System.out.println("Para ir para a timeline, digite 2");
            System.out.println("Para sair, digite 3");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("PERFIL");
                    perfil(numArray, null);
                    return;

                case 2:
                   System.out.println("TIMELINE");
                   timeline(numArray);
                   return;
                   
                case 3:
                    System.out.println("FIM DO PROGRAMA");
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    void perfil (int numArray, Pessoa[] pessoa) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("OPCOES");
            System.out.println("1- Ultima Avaliação Física");
            System.out.println("2- Ver Plano Alimentar");
            System.out.println("3- Minhas Publicações");
            System.out.println("4- Ver outros perfis");
            System.out.println("5- Fazer nova dieta");
            System.out.println("6- Chat");
            System.out.println("7- Timeline");
            System.out.println("8-Mostrar Alimentos");
            System.out.println("9- Ver informações da conta");
            System.out.println("10- Mudar informações da conta");
            System.out.println("11- Excluir conta");
            System.out.println("12 - Ver seguidores");
            System.out.println("13- Sair");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("ULTIMA AVALIAÇÃO FÍSICA");
                    avalFisica(numArray, usuarios);
                    
                    return;

                case 2:
                   System.out.println("PLANO ALIMENTAR");
                   planoAlimentar(numArray);
                   return;
                                   
                case 3:    
                    int opc = 0;
                    System.out.println("OPCOES:");
                    System.out.println("1- Suas publicações");
                    System.out.println("2- Criar nova publicações");
                    System.out.println("3- Voltar para o perfil");
                    opc = scan.nextInt();
                    
                    switch (opc) {
                        case 1:
                            cp.mostrarPublicacoes(usuarios, numArray);
                            perfil(numArray, usuarios);
                            return;

                        case 2:
                            String pub;
                            cp.criarPublicacoes(usuarios, numArray, pubTodos);
                            perfil(numArray, usuarios);
                            return;
                            
                        case 3:
                            perfil(numArray, usuarios);
                            return;

                        default:
                            System.out.println("Valor inválido");   
                            return;
                    }
                            
                case 4:
                    System.out.println("AMIGOS");
                    amigos(numArray);
                    return;
                
                case 5:
                    System.out.println("NOVA DIETA");
                    novaDieta(numArray);
                    return;
                
                case 6:
                    System.out.println("CHAT ");
                    chat(numArray);
                    return;
                    
                case 7:
                    System.out.println("TIMELINE");
                    timeline(numArray);
                    return;
                case 8:
                    System.out.println("ALIMENTOS");
                    opA.gerenciador(alimentos);
                    perfil(numArray, usuarios);
                    return;
                    
                case 9:
                    cp.mostrarPerfil(usuarios, numArray);
                    perfil(numArray, usuarios);
                    return;
                case 10:
                    cp.mostrarPerfil(usuarios, numArray);
                    System.out.println("MUDAR INFORMAÇÕES");
                    int z;
                    while (true) {
                    System.out.println("Deseja mudar alguma informação da sua conta?");
                    System.out.println("1- Nome");
                    System.out.println("2- Sexo");
                    System.out.println("3- Login");
                    System.out.println("4- Senha");
                    System.out.println("5- Voltar para perfil");
                    
                    z = scan.nextInt();

            switch (z) {
                case 1:
                    cp.mudarNome(usuarios, numArray);
                    perfil(numArray, usuarios);

                    return;
                    
                case 2:
                    cp.mudarSexo(usuarios, numArray);
                    perfil(numArray, usuarios);
                    return;
                    
                case 3:
                    cp.mudarLogin(usuarios, numArray);
                    perfil(numArray, usuarios);
                    return;
                    
                case 4:
                    cp.mudarSenha(usuarios, numArray);
                    perfil(numArray, usuarios);
                    return;
                    
                case 5:
                    System.out.println("5- Voltar pro perfil");
                    perfil(numArray, usuarios);
                    return;
                            
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    perfil(numArray, usuarios);
                    return;    
    }                      

                    }
                case 11:
                System.out.println("EXCLUIR CONTA");
                int i = cp.excluirPerfil(usuarios, numArray);
                if (i==0) {
                    perfil(numArray, pessoa);
                } else {
                    menu();
                }
                case 12:
                    int x = 0;
                    if (usuarios[numArray].getSeguidores()[x] == null) {
                        System.out.println("Você possui 0 Seguidores!");
                        perfil(numArray, usuarios);
                        return;
                    }
                    while (usuarios[numArray].getSeguidores()[x] != null) {
                        System.out.println("Seguidores:" + usuarios[numArray].getSeguidores()[x].getNome());
                        x++;
                    }
                    System.out.println("Você possui " + x + " seguidores!");
                    perfil(numArray, usuarios);
                    return;
                    
                    
                case 13:
                    System.out.println("Sair");
                    menu();
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    return;
            }
        }
    }
    
    void timeline (int numArray) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("OPCOES");
            System.out.println("1- Ver todas as publicações");
            System.out.println("2- Postar");
            System.out.println("3- Voltar para seu perfil");
            System.out.println("4- Sair");


            opcao = scan.nextInt();

            switch (opcao) {
                    case 1:
                     int x = 0;
                     if (pubTodos[x] == null) {
                         System.out.println("Ainda não há publicações!");
                         perfil(numArray, usuarios);
                         return;
                     }
                     while (pubTodos[x] != null) {
                         System.out.println(pubTodos[x].getPessoa().getNome() + "dise: " + pubTodos[x].getPublicacao());
                         x++;
                     }

                    perfil(numArray, usuarios);

                    return;

                case 2:
                cp.criarPublicacoes(usuarios, numArray, pubTodos);
                timeline(numArray);
                return;
                        
                case 3:
                    perfil(numArray, usuarios);
                    return;
                
                case 4:
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    void avalFisica (int numArray, Pessoa[] pessoa) {
        AvalFis avaliacao = new AvalFis();
        int x = 0;
        while (pessoa[numArray].getAvaliacoes()[x] != null){
            x++;
        }
        if (x==0) {
            System.out.println("Você não tem avaliação fisica no histórico, preencha suas informações");
            novaDieta(numArray);
        }
        avaliacao = pessoa[numArray].getAvaliacoes()[x-1];
        System.out.println("Seu nome" + usuarios[numArray].getNome());
        System.out.println("Seu nome " + avaliacao.getPessoa().getNome() + "Sua TMB " + avaliacao.getTMB());
        perfil (numArray, pessoa);
        
    }
    
    void planoAlimentar(int numArray) {
        System.out.println("PLANO ALIMENTAR");
    }
    
    void novaDieta(int numArray) {
        cd.cadDieta(numArray, usuarios, alimentos);
        perfil(numArray, usuarios);
        
        
        
    }
    
    void chat(int numArray) {
        System.out.println("CHAT");
        System.out.println("OPCOES");
        System.out.println("1- Mandar nova mensagem");
        System.out.println("2- Ver lista de mensagens");
        System.out.println("Para sair, digite 3");
        
        Scanner scan = new Scanner(System.in);
        int opc;
        String msg;
        opc = scan.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Digite login de quem receberá a mensagem");
                scan.nextLine();
                Pessoa pessoa = new Pessoa();
                String login = scan.nextLine();
                pessoa = op.buscaPorLogin(login, usuarios);
                System.out.println("Digite a mensagem que você quer enviar");
                msg = scan.nextLine();
                int id = pessoa.getId() - 1;
                int b, c, d, o, y, z = 0;
                o = opC.lugarOrigem(usuarios[id], usuarios[numArray]);
                System.out.println(o);
                d = opC.lugarDestino(usuarios[id], usuarios[numArray]);
        
                //se não existir um chat entre duas pessoas
               
               if (d == -1) {
                Chat novoChat = new Chat();
                Chat chat = new Chat();
                y = opC.buscarMsgVazio(pessoa);
                z = opC.buscarMsgVazio(usuarios[numArray]);
                if (y> -1) {
                    novoChat.setPessoaDestino(usuarios[numArray]);
                    novoChat.setPessoaOrigem(usuarios[id]);
                    novoChat.getMensagem()[0] = msg;
                    usuarios[id].getMensagens()[y] = chat;
                } else {
                   System.out.println("Não foi possivel mandar essa mensagem");
                   perfil(numArray, usuarios);
                   return;
                }
                
                if (z> -1) {
                    
                    novoChat.setPessoaDestino(usuarios[id]);
                    novoChat.setPessoaOrigem(usuarios[numArray]);
                    novoChat.getMensagem()[0] = msg;
                    usuarios[numArray].getMensagens()[z] = novoChat;               
                } else {
                    System.out.println("Não foi possivel mandar essa mensagem");
                   perfil(numArray, usuarios);
                   return;
                }
               }
               else {
                   c= opC.buscarChatVazio(usuarios[id].getMensagens()[d]);
                   b= opC.buscarChatVazio(usuarios[numArray].getMensagens()[z]);               
                   usuarios[id].getMensagens()[d].setPessoaDestino(usuarios[numArray]);
                   usuarios[id].getMensagens()[d].setPessoaOrigem(usuarios[id]);
                   usuarios[id].getMensagens()[d].getMensagem()[c] = msg;
                   usuarios[numArray].getMensagens()[o].setPessoaDestino(usuarios[id]);
                   usuarios[numArray].getMensagens()[o].setPessoaOrigem(usuarios[numArray]);
                   usuarios[numArray].getMensagens()[o].getMensagem()[b] = msg;
                   perfil(numArray, usuarios);
                   return;
               }
               perfil(numArray, usuarios);
               return;
               
            case 2:
                System.out.println("TODAS SUAS MENSAGENS");
                System.out.println(usuarios[numArray].getNome());
                for (int num = 0; num < usuarios[numArray].getMensagens().length; num++) {
                    if (usuarios[numArray].getMensagens()[num] != null) {
                    System.out.println("Mensagens que você mandou para:" + usuarios[numArray].getMensagens()[num].getPessoaDestino().getLogin());   
                    }
                }
                System.out.println("Digite o login do chat que você quer entrar:");
                Scanner sc = new Scanner(System.in);
                String log = sc.nextLine();
                pessoa = op.buscaPorLogin(log, usuarios);
                int idD = pessoa.getId() - 1;
                int n = opC.lugarOrigem(usuarios[idD], usuarios[numArray]);
                for (int num = 0; num < usuarios[numArray].getMensagens()[n].getMensagem().length; num++) {
                    if (usuarios[numArray].getMensagens()[n].getMensagem()[num] != null )
                    System.out.println("Mensagens de" + usuarios[numArray].getMensagens()[n].getPessoaOrigem().getLogin() + ":" + usuarios[numArray].getMensagens()[n].getMensagem()[num]);
                }
                perfil(numArray, usuarios);
                   return;
                
                
            case 3:
                perfil(numArray, usuarios);
                return;
            default:
                System.out.println("Opcao invalida!");
                perfil (numArray, usuarios);
                return;
                
        }
            
    }
//    
    void amigos (int numArray) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in); 
        Pessoa amigo = new Pessoa();

        while (true) {
            System.out.println("OPCOES");
            System.out.println("1- Pesquisar um novo perfil");
            System.out.println("2- Ver lista de amigos");
            System.out.println("Para voltar para o perfil, digite 3");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o login que voce quer achar");
                    scan.nextLine();
                    String login = scan.nextLine();
                    amigo = op.buscaPorLogin(login, usuarios);
                    System.out.println("Nome:" + amigo.getNome());
                    System.out.println("Login:" + amigo.getLogin());
                    System.out.println("id:" + amigo.getId());
                    if (amigo.getSexo().equals("f")) {
                    System.out.println("Sexo: feminino");
                    } else {
                        System.out.println("Sexo: masculino");
                    }
                    seguir (amigo.getId(), numArray);
                //    chat(numArray);
                    return;
                    

                case 2:
                    int x = 0;
                    if (usuarios[numArray].getSeguindo()[x] == null) {
                        System.out.println("Lista de amigos vazia!");
                        perfil (numArray, usuarios);
                        return;
                    }
                    while (usuarios[numArray].getSeguindo()[x] != null) {
                    System.out.println("Seguindo: " + usuarios[numArray].getSeguindo()[x].getNome());
                    x++;
                    }
                    System.out.println("Fim lista de amigos");
                    perfil(numArray, usuarios);
               return;
                   
                case 3:
                    perfil(numArray, usuarios);
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        
        
    }
    void seguir (int numAmigo, int numPerfil) {
        Scanner sc = new Scanner(System.in);
        numAmigo = numAmigo - 1;
        System.out.println("OPÇÕES");
        System.out.println("1- Seguir perfil");
        System.out.println("2- Parar de seguir perfil");
        System.out.println("3- Voltar para seu perfil");
        int opc = sc.nextInt();
        boolean verif;
        switch (opc) {
                case 1:
                verif = op.verifSeguindo(usuarios[numPerfil], usuarios[numAmigo]);
                if (verif) {
                    System.out.println("Você já segue esse perfil!");
                    tela(numPerfil);
                    return;
                    
                } else {
                   int x = op.buscarSeguindo(usuarios[numPerfil]);
                   usuarios[numPerfil].getSeguindo()[x] = usuarios[numAmigo];
                   int z = op.buscarSeguidores(usuarios[numAmigo]);
                   usuarios[numAmigo].getSeguidores()[z] = usuarios[numPerfil];
                    amigos(numPerfil);
                    return;
                    
                }
                                    
                case 2:
                verif = op.verifSeguindo(usuarios[numPerfil], usuarios[numAmigo]);
                if (!verif) {
                   int y = op.buscarSeguindo(usuarios[numPerfil]);
                   usuarios[numPerfil].getSeguindo()[y] = null;
                   int a = op.buscarSeguidores(usuarios[numAmigo]);
                   usuarios[numAmigo].getSeguidores()[a] = null;
                   amigos(numPerfil);
                    return;
                            
                    
                } else {
                 System.out.println("Você não segue esse perfil!");
                  tela(numPerfil);
                  return;   
                }
                                  
                case 3:
                     perfil(numPerfil, usuarios);
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
           }    
    public Programa() {
        setarPessoas(usuarios);
        setarAlimen(alimentos);
        menu();
    }
    
    
    
}