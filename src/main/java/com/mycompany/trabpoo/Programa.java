/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;

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
       // System.out.println("Calorias de " + arroz.getPorcao() + " gramas de " + arroz.getNome() +": " + arroz.getCal());
        alimentos [0] = arroz;
        
        Alimento macarrao = new Alimento();
        macarrao.setNome("macarrão");
        macarrao.setCarb(77.9);
        macarrao.setProt(10);
        macarrao.setGord(1.3);
        macarrao.setPorcao(100);
        macarrao.setTipoUsuario("1");
        macarrao.setCal(macarrao.getCal(), macarrao.getCarb(), macarrao.getProt(), macarrao.getGord());
       // System.out.println("Calorias de " + macarrao.getPorcao() + " gramas de " + macarrao.getNome() +": " + macarrao.getCal());
        alimentos [1] = macarrao;
        
        
        Alimento pao = new Alimento();
        pao.setNome("pão francês");
        pao.setCarb(58.6);
        pao.setProt(80);
        pao.setGord(3);
        pao.setPorcao(100);
        pao.setTipoUsuario("1");
        pao.setCal(pao.getCal(), pao.getCarb(), pao.getProt(), pao.getGord());
       // System.out.println("Calorias de " + pao.getPorcao() + " gramas de " + pao.getNome() +": " + pao.getCal());
        alimentos [2] = pao;
       
        Alimento batataDoce = new Alimento();
        batataDoce.setNome("batata doce");
        batataDoce.setCarb(18.4);
        batataDoce.setProt(0.6);
        batataDoce.setGord(0.1);
        batataDoce.setPorcao(100);
        batataDoce.setTipoUsuario("1");
        batataDoce.setCal(batataDoce.getCal(), batataDoce.getCarb(), batataDoce.getProt(), batataDoce.getGord());
        //System.out.println("Calorias de " + batataDoce.getPorcao() + " gramas de " + batataDoce.getNome() +": " + batataDoce.getCal());
        alimentos [3] = batataDoce;

        
        Alimento batataInglesa = new Alimento();
        batataInglesa.setNome("batata inglesa");
        batataInglesa.setCarb(11.9);
        batataInglesa.setProt(1.2);
        batataInglesa.setGord(0);
        batataInglesa.setPorcao(100);
        batataInglesa.setTipoUsuario("1");
        batataInglesa.setCal(batataInglesa.getCal(), batataInglesa.getCarb(), batataInglesa.getProt(), batataInglesa.getGord());
       // System.out.println("Calorias de " + batataInglesa.getPorcao() + " gramas de " + batataInglesa.getNome() +": " + batataInglesa.getCal());
        alimentos [4] = batataInglesa;
        
        Alimento tapioca = new Alimento();
        tapioca.setNome("tapioca");
        tapioca.setCarb(22);
        tapioca.setProt(2);
        tapioca.setGord(3.9);
        tapioca.setPorcao(100);
        tapioca.setTipoUsuario("1");
        tapioca.setCal(tapioca.getCal(), tapioca.getCarb(), tapioca.getProt(),tapioca.getGord());
       // System.out.println("Calorias de " + tapioca.getPorcao() + " gramas de " + tapioca.getNome() +": " + tapioca.getCal());
        alimentos [5] = tapioca;
        
        Alimento banana = new Alimento();
        banana.setNome("banana");
        banana.setCarb(23);
        banana.setProt(1.1);
        banana.setGord(0.3);
        banana.setPorcao(100);
        banana.setTipoUsuario("1");
        banana.setCal(banana.getCal(), banana.getCarb(), banana.getProt(),banana.getGord());
        //System.out.println("Calorias de " + banana.getPorcao() + " gramas de " + banana.getNome() +": " + banana.getCal());
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
       //System.out.println("Calorias de " + peitoFrango.getPorcao() + " gramas de " + peitoFrango.getNome() +": " + peitoFrango.getCal());
        alimentos [7] = peitoFrango;
        
        Alimento patinho = new Alimento();
        patinho.setNome("patinho");
        patinho.setCarb(0);
        patinho.setProt(35.9);
        patinho.setGord(7.3);
        patinho.setPorcao(100);
        patinho.setTipoUsuario("2");
        patinho.setCal(patinho.getCal(), patinho.getCarb(), patinho.getProt(),patinho.getGord());
        //System.out.println("Calorias de " + patinho.getPorcao() + " gramas de " + patinho.getNome() +": " + patinho.getCal());
        alimentos [8] = patinho ;
        
        Alimento tilapia = new Alimento();
        tilapia.setNome("tilápia");
        tilapia.setCarb(0);
        tilapia.setProt(23);
        tilapia.setGord(2);
        tilapia.setPorcao(100);
        tilapia.setTipoUsuario("2");
        tilapia.setCal(tilapia.getCal(), tilapia.getCarb(), tilapia.getProt(),tilapia.getGord());
        //System.out.println("Calorias de " + tilapia.getPorcao() + " gramas de " + tilapia.getNome() +": " + tilapia.getCal());
        alimentos [9] = tilapia;
        
        Alimento soja = new Alimento();
        soja.setNome("proteína de soja");
        soja.setCarb(8);
        soja.setProt(23);
        soja.setGord(1);
        soja.setPorcao(100);
        soja.setTipoUsuario("2");
        soja.setCal(soja.getCal(), soja.getCarb(), soja.getProt(),soja.getGord());
        //System.out.println("Calorias de " + soja.getPorcao() + " gramas de " + soja.getNome() +": " + soja.getCal());
        alimentos [10] = soja;
        
        Alimento ovoCozido = new Alimento();
        ovoCozido.setNome("ovo cozido");
        ovoCozido.setCarb(1.1);
        ovoCozido.setProt(13);
        ovoCozido.setGord(11);
        ovoCozido.setPorcao(100);
        ovoCozido.setTipoUsuario("2");
        ovoCozido.setCal(ovoCozido.getCal(), ovoCozido.getCarb(), ovoCozido.getProt(),ovoCozido.getGord());
        //System.out.println("Calorias de " + ovoCozido.getPorcao() + " gramas de " + ovoCozido.getNome() +": " + ovoCozido.getCal());
        alimentos [11] = ovoCozido;
        
        Alimento atum = new Alimento();
        atum.setNome("Atum");
        atum.setCarb(0);
        atum.setProt(23);
        atum.setGord(1);
        atum.setPorcao(100);
        atum.setTipoUsuario("2");
        atum.setCal(atum.getCal(), atum.getCarb(), atum.getProt(),atum.getGord());
        //System.out.println("Calorias de " + atum.getPorcao() + " gramas de " + atum.getNome() +": " + atum.getCal());
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
        //System.out.println("Calorias de " + abacate.getPorcao() + " gramas de " + abacate.getNome() +": " + abacate.getCal());
        alimentos [13] = abacate;
        
        Alimento pastaAmendoim = new Alimento();
        pastaAmendoim.setNome("pasta de amendoim");
        pastaAmendoim.setCarb(20);
        pastaAmendoim.setProt(25);
        pastaAmendoim.setGord(50);
        pastaAmendoim.setPorcao(100);
        pastaAmendoim.setTipoUsuario("3");
        pastaAmendoim.setCal(pastaAmendoim.getCal(), pastaAmendoim.getCarb(), pastaAmendoim.getProt(),pastaAmendoim.getGord());
        //System.out.println("Calorias de " + pastaAmendoim.getPorcao() + " gramas de " + pastaAmendoim.getNome() +": " + pastaAmendoim.getCal());
        alimentos [14] = pastaAmendoim;
        
        Alimento azeite = new Alimento();
        azeite.setNome("azeite");
        azeite.setCarb(0);
        azeite.setProt(0);
        azeite.setGord(100);
        azeite.setPorcao(100);
        azeite.setTipoUsuario("3");
        azeite.setCal(azeite.getCal(), azeite.getCarb(), azeite.getProt(),azeite.getGord());
        //System.out.println("Calorias de " + azeite.getPorcao() + " gramas de " + azeite.getNome() +": " + azeite.getCal());
        alimentos [15] = azeite;
        
        Alimento manteiga = new Alimento();
        manteiga.setNome("manteiga");
        manteiga.setCarb(0.1);
        manteiga.setProt(0.4);
        manteiga.setGord(82.4);
        manteiga.setPorcao(100);
        manteiga.setTipoUsuario("3");
        manteiga.setCal(manteiga.getCal(), manteiga.getCarb(), manteiga.getProt(),manteiga.getGord());
        //System.out.println("Calorias de " + manteiga.getPorcao() + " gramas de " + manteiga.getNome() +": " + manteiga.getCal());
        alimentos [16] = manteiga;
        
        Alimento nozes = new Alimento();
        nozes.setNome("nozes");
        nozes.setCarb(18.4);
        nozes.setProt(14);
        nozes.setGord(59);
        nozes.setPorcao(100);
        nozes.setTipoUsuario("3");
        nozes.setCal(nozes.getCal(), nozes.getCarb(), nozes.getProt(),nozes.getGord());
        //System.out.println("Calorias de " + nozes.getPorcao() + " gramas de " + nozes.getNome() +": " + nozes.getCal());
        alimentos [17] = nozes;
        
        Alimento castanhas = new Alimento();
        castanhas.setNome("castanhas");
        castanhas.setCarb(29.1);
        castanhas.setProt(18.5);
        castanhas.setGord(46.3);
        castanhas.setPorcao(100);
        castanhas.setTipoUsuario("3");
        castanhas.setCal(castanhas.getCal(), castanhas.getCarb(), castanhas.getProt(),castanhas.getGord());
        //System.out.println("Calorias de " + castanhas.getPorcao() + " gramas de " + castanhas.getNome() +": " + castanhas.getCal());
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
                    login(usuarios);
                    return;

                case 2:
                    System.out.println("CADASTRO");
                   cadastros();
                   return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    void cadastros () {
        
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
        
        int num = op.buscarUsuarioVazio(usuarios, pessoa);
        if (num>= 0) {
            System.out.println("Parabens, " + usuarios[num].getNome() + "! Seu cadastro foi feito com sucesso!");
            tela(num);
            
        } else {
            System.out.println("Não foi possível fazer um novo cadastro!");
            menu();
        }
        
        
       }
   
    void login(Pessoa usuarios[]) {
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
                    tela(numArray);
                } else {
                    System.out.println("Senha incorreta. Tente novamente.");
                }
            }
        } else {
            System.out.println("Login não encontrado. Por favor, insira um login válido.");
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
                  // timeline(numArray);
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
            System.out.println("12 - ver seguidores");
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
                    opc = scan.nextInt();
                    
                    switch (opc) {
                        case 1:
                            int x = 0;
                            while (x < 10 && usuarios[numArray].getPublicacoes()[x] != null) {
                                System.out.println(usuarios[numArray].getPublicacoes()[x].getPublicacao());
                                x++;
                            }
                            perfil(numArray, usuarios);
                            return;

                        case 2:
                            String pub;
                            Publicacoes novaPublicacao = new Publicacoes();
                            System.out.println("Escreva sua publicação");
                            scan.nextLine();
                            pub = scan.nextLine();
                            novaPublicacao.setPublicacao(pub);
                            novaPublicacao.setPessoa(usuarios[numArray]);
                            int y = opPub.buscarPubVazia(usuarios[numArray]);
                            int z = opPub.timelineVazio(pubTodos);
                            if (y != -1) {
                             usuarios[numArray].getPublicacoes()[y] = novaPublicacao;
                            } else 
                            {
                                System.out.println("Não foi possível fazer publicação");
                            }
                             if (z != -1) {
                             pubTodos[z] = novaPublicacao;
                            } else 
                            {
                                System.out.println("Não foi possível publicar na timeline");
                            }
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
                    timeline(numArray, pessoa);
                    return;
                case 8:
                    System.out.println("ALIMENTOS");
                    opA.gerenciador(alimentos);
                    perfil(numArray, usuarios);
                    return;
                    
                case 9:
                    System.out.println("SUAS INFOMAÇÕES:");
                    System.out.println("Nome:" + usuarios[numArray].getNome());
                    System.out.println("Login:" + usuarios[numArray].getLogin());
                    System.out.println("id:" + usuarios[numArray].getId());
                    if (usuarios[numArray].getSexo().equals("f")) {
                    System.out.println("Sexo: feminino");
                    } else {
                        System.out.println("Sexo: masculino");
                    }
                    perfil(numArray, usuarios);
                    return;
                case 10:
                    System.out.println("MUDAR INFORMAÇÕES");
                    int z;
                    while (true) {
                    System.out.println("Deseja mudar alguma informação da sua conta?");
                    System.out.println("1- Nome");
                    System.out.println("2- Sexo");
                    System.out.println("3- Login");
                    System.out.println("4- Senha");
                    System.out.println("5- Voltar para perfil");
                    String senha;
                    z = scan.nextInt();

            switch (z) {
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
                    if (senha.equals(usuarios[numArray].getSenha()))
                    {
                        usuarios[numArray].setNome(nome);
                    }
                    else {
                        System.out.println("Senha Incorreta!");
                    }
                    
                    perfil(numArray, usuarios);

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
                    if (senha.equals(usuarios[numArray].getSenha()))
                    {
                        usuarios[numArray].setSexo(sexo);
                    }
                    else {
                        System.out.println("Senha Incorreta!");
                    }
                    
                    perfil(numArray, usuarios);
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
                    if (senha.equals(usuarios[numArray].getSenha()))
                    {
                        usuarios[numArray].setLogin(login);
                    }                            
                    else {
                        System.out.println("Senha Incorreta!");
                    }
                        
               
                            
            
                    perfil(numArray, usuarios);
                    return;
                    
                case 4:
                    String senhaNova;
                    System.out.println("4- Insira nova senha:");
                    scan.nextLine();
                    senhaNova = scan.nextLine();
                    System.out.println("Confirme sua senha antiga");
                    senha = scan.nextLine();
                    if (senha.equals(usuarios[numArray].getSenha()))
                    {
                        usuarios[numArray].setSenha(senhaNova);
                    }
                    else {
                        System.out.println("Senha Incorreta!");
                    }
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
                int op = 0;
                String senha;
                while (true) {
                System.out.println("Tem certeza que deseja excluir sua conta, aperte 1 para confirmar e 2 para voltar para seu perfil");
                op = scan.nextInt();
                switch (op) {
                            case 1:
                                scan.nextLine();
                                System.out.println("Confirme sua senha");
                                senha = scan.nextLine();
                                if (senha.equals(usuarios[numArray].getSenha()))
                                {
                                    for (Pessoa usuario : usuarios) {
                                     if (usuario != null && usuarios[numArray].getLogin().equals(usuario.getLogin())) {
                                        usuarios[numArray].setAvaliacoes(null);
                                        usuarios[numArray].setDietas(null);
                                        usuarios[numArray].setLogin(null);
                                        usuarios[numArray].setNome(null);
                                        usuarios[numArray].setSenha(null);
                                        usuarios[numArray].setSexo(null);
                                        menu();
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
                case 12:
                    int x = 0;
                    while (usuarios[numArray].getSeguidores()[x] != null) {
                        System.out.println("Seguidores:" + usuarios[numArray].getSeguidores()[x].getNome());
                        x++;
                    }
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
    
    void timeline (int numArray, Pessoa[] usuarios) {
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
                     while (pubTodos[x] != null) {
                         System.out.println(pubTodos[x].getPessoa().getNome() + "dise: " + pubTodos[x].getPublicacao());
                         x++;
                     }

                    perfil(numArray, usuarios);

                    return;

                case 2:
                   String pub;
                            Publicacoes novaPublicacao = new Publicacoes();
                            System.out.println("Escreva sua publicação");
                            scan.nextLine();
                            pub = scan.nextLine();
//                            novaPublicacao.setPublicacao(pub);
//                            System.out.println("pub"+ novaPublicacao.getPublicacao());
//                            int y = opPub.buscarPubVazia(usuarios[numArray]);
//                            System.out.println(y);
//                            if (y != -1) {
//                             usuarios[numArray].getPublicacoes()[y] = novaPublicacao;
//                            } else 
//                            {
//                                System.out.println("Não foi possível fazer publicação");
//                            }
                            perfil(numArray, usuarios);
                            return;
                   
                case 3:
                    perfil(numArray, null);
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
        opAF.registro(avaliacao);
        
    }
    
    void planoAlimentar(int numArray) {
        System.out.println("PLANO ALIMENTAR");
    }
    
    void novaDieta(int numArray) {
        System.out.println("NOVA DIETA");
        AvalFis novaAval = new AvalFis();
        Dieta dieta = new Dieta();
        Refeicoes[] quantidade = new Refeicoes[6];
        Preferencias[] pref = new Preferencias[10];
        int array = numArray;
        novaAval = opAF.cadAval(usuarios, numArray);
        int y = 0;
        while (usuarios[numArray].getAvaliacoes()[y] != null)
        {
            y++;
        }
        usuarios[numArray].getAvaliacoes()[y] = novaAval;
        dieta = opD.novaDieta(usuarios, novaAval, array);
        int x = 0;
        while (usuarios[numArray].getDietas()[x] != null) {
            x++;
        }
        usuarios[numArray].getDietas()[x] = dieta;
        quantidade = opR.refSetar(dieta);
        opR.mostrarRef(quantidade);
        pref = opP.preferencias(alimentos, usuarios, numArray);        
        perfil(numArray, usuarios);
        
        
        
    }
//    
//    void chat(int numArray) {
//        System.out.println("CHAT");
//        System.out.println("OPCOES");
//        System.out.println("1- Mandar nova mensagem");
//        System.out.println("2- Ver lista de mensagens");
//        System.out.println("Para sair, digite 3");
//        Pessoa pessoa = new Pessoa();
//        Scanner scan = new Scanner(System.in);
//        Chat novoChat = new Chat();
//        int opc;
//        String msg;
//        opc = scan.nextInt();
//        switch (opc) {
//            case 1:
//                System.out.println("Digite login de quem receberá a mensagem");
//                scan.nextLine();
//                String login = scan.nextLine();
//                pessoa = op.buscaPorLogin(login, usuarios);
//                System.out.println("Digite a mensagem que você quer enviar");
//                msg = scan.nextLine();
//                int a = 0;
//                int b, c;
//                for (int num = 0; num< usuarios[numArray].getMensagens().length; num++) {
//                    if (usuarios[numArray].getMensagens()[num].getPessoaDestino().getLogin().equals(login)){
//                        a = 1;
//                        break;
//                    }
//                    
//                }
//                
//               if (a == 0) {
//                int y = opC.buscarMsgVazio(pessoa);
//                if (y> -1) {
//                    usuarios[pessoa.getId()-1].getMensagens()[y].setPessoaDestino(usuarios[pessoa.getId()-1]);
//                    usuarios[pessoa.getId()-1].getMensagens()[y].setPessoaOrigem(usuarios[numArray]);
//                    usuarios[pessoa.getId()-1].getMensagens()[y].getMensagem()[0] = msg;
//                    c= opC.buscarChatVazio(usuarios[pessoa.getId()-1].getMensagens()[y]);
//                } else {
//                   System.out.println("Não foi possivel mandar essa mensagem");
//                   perfil(numArray, usuarios);
//                   return;
//                }
//                int z = opC.buscarMsgVazio(usuarios[numArray]);
//                if (z> -1) {
//                    b = opC.buscarChatVazio(usuarios[numArray].getMensagens()[z]);
//                    usuarios[numArray].getMensagens()[z].setPessoaDestino(usuarios[pessoa.getId()-1]);
//                    usuarios[numArray].getMensagens()[z].setPessoaOrigem(usuarios[numArray]);
//                    usuarios[numArray].getMensagens()[z].getMensagem()[0] = msg;                
//                } else {
//                    System.out.println("Não foi possivel mandar essa mensagem");
//                   perfil(numArray, usuarios);
//                   return;
//                }
//               }
//               else {
//                   usuarios[pessoa.getId()-1].getMensagens()[y].setPessoaDestino(usuarios[pessoa.getId()-1]);
//                   usuarios[pessoa.getId()-1].getMensagens()[y].setPessoaOrigem(usuarios[numArray]);
//                   usuarios[pessoa.getId()-1].getMensagens()[y].getMensagem()[c] = msg;
//                   usuarios[numArray].getMensagens()[z].setPessoaDestino(usuarios[pessoa.getId()-1]);
//                   usuarios[numArray].getMensagens()[z].setPessoaOrigem(usuarios[numArray]);
//                   usuarios[numArray].getMensagens()[z].getMensagem()[b] = msg;   
//               }
//                
//                
//                
//                
//                
//                
//                
//                
//            case 2:
//            case 3:
//            default:
//                
//        }
//            
//    }
//    
    void amigos (int numArray) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in); 
        Pessoa amigo = new Pessoa();

        while (true) {
            System.out.println("OPCOES");
            System.out.println("1- Pesquisar um novo perfil");
            System.out.println("2- Ver lista de amigos");
            System.out.println("Para sair, digite 3");

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
                    chat(numArray);
                    return;
                    

                case 2:
//                    System.out.println("Seus seguidores = usuarios[numArray].getSeguidores()");
                    int x = 0;
                    while (usuarios[numArray].getSeguindo()[x] != null) {
                    System.out.println("Seguindo =" + usuarios[numArray].getSeguindo()[x].getNome());
                    x++;
                    }
                    System.out.println("Fim lista de amigos");
                    perfil(numArray, usuarios);
               return;
                   
                case 3:
                    System.out.println("FIM DO PROGRAMA");
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