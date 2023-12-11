/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;

import DAO.PratoDAO;
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
import com.mycompany.trabpoo.Bean.Prato;
import DAO.ChatDAO;
import DAO.DietaDAO;
import DAO.RefeicoesDAO;
import DAO.AlimentoDAO;
import DAO.PublicacoesDAO;
import Control.controlPerfil;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Random;
import com.mycompany.trabpoo.Bean.Seguir;
import DAO.SeguirDAO;
import com.mycompany.trabpoo.Bean.TipoDieta;
import java.util.List;
import DAO.PratoDAO;



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
    SeguirDAO sd = new SeguirDAO();
    PratoDAO pd = new PratoDAO();
    String loginTeste = "tayna";
    
    
    

    
    void menu () {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("MENU INICIAL");
            System.out.println("Para fazer login, digite 1");
            System.out.println("Para fazer cadastro, digite 2");
            System.out.println("Para finalizar o programa, digite 3");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("LOGIN");
                    String login = cp.fazerLogin();
                    PessoaDAO pessoaDAO = new PessoaDAO();
                    int id = 0;
                    try (DBConnection dbConnection = new DBConnection()) {
                     id = pessoaDAO.getID(login, dbConnection.getConnection());
                     
                    } catch (SQLException e) {
                         System.err.println("Erro ao fazer login: " + e.getMessage());
                    }
                    
                    if (id != 0) {
                        tela(id);
                    } else {
                        System.out.println("Login inexistente");
                    }
                    return;

                case 2:
                   System.out.println("CADASTRO");
                   
                    cp.cadastros();
                    menu();

     
                   return;
                   
                case 3:
                    System.out.println("Fim do programa!");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
      
    void tela(int id)
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
                    perfil(id);
                    return;

                case 2:
                   System.out.println("TIMELINE");
                   timeline(id);
                   return;
                   
                case 3:
                    
                    menu();
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    void perfil (int id) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        int numArray = 0;
           while (true) {
            System.out.println("OPCOES");
            System.out.println("1- Ultima Avaliação Física");//
            System.out.println("2- Ver Plano Alimentar");//
            System.out.println("3- Minhas Publicações");//
            System.out.println("4- Ver outros perfis");//
            System.out.println("5- Fazer nova dieta");//
            System.out.println("6- Chat");//
            System.out.println("7- Timeline");//
            System.out.println("8-Mostrar Alimentos");//
            System.out.println("9- Ver informações da conta");//
            System.out.println("10- Mudar informações da conta");//
            System.out.println("11- Excluir conta");//
            System.out.println("12 - Ver seguidores");//
            System.out.println("13- Sair");//

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("ULTIMA AVALIAÇÃO FÍSICA");
                    avalFisica(id);
                    return;

                case 2:
                   System.out.println("PLANO ALIMENTAR");
                  mostrarPA(id);
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
                            
            try (DBConnection dbConnection = new DBConnection()) {
             opPub.mostrarPubPessoa(id, dbConnection.getConnection());
             
         } catch (SQLException e) {
             System.err.println("Erro ao pegar publicacao" + e.getMessage());
         }
                  perfil(id);

                            return;

                        case 2:
                            cp.criarPublicacoes(id);
                            perfil(id);
                            return;
                            
                        case 3:
                            perfil(id);
                            return;

                        default:
                            System.out.println("Valor inválido");   
                            return;
                    }
                            
                case 4:
                    System.out.println("AMIGOS");
                  amigos(id);
                    return;
                
                case 5:
                    System.out.println("NOVA DIETA");
                    novaDieta(id);
                    return;
                
                case 6:
                    System.out.println("CHAT ");
                    chat(id);
                    perfil(id);
                    return;
                    
                case 7:
                    System.out.println("TIMELINE");
                    timeline(numArray);
                    return;
                case 8:
                    System.out.println("ALIMENTOS");
                    cd.gerenciador();
                    perfil(id);
                    return;
                    
                case 9:
             cp.mostrarPerfil(id);
                    perfil(id);
                    return;
                case 10:
                    cp.mostrarPerfil(id);
                    cp.mudarInformacoes(id);
                     perfil(id);
                    return;

                    
                case 11:
                System.out.println("EXCLUIR CONTA");
                int i = cp.excluir(id);
                if (i == 1) {
                    perfil(id);
                } else {
                    menu();
                }
                case 12:
                  seguidores(id);
                    perfil(id);
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
    
    void timeline (int id) {
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
         try (DBConnection dbConnection = new DBConnection()) {
             opPub.mostrarPublicacoes(dbConnection.getConnection());
             
         } catch (SQLException e) {
             System.err.println("Erro ao fazer publicacao" + e.getMessage());
         }
                  perfil(id);

                    return;

                case 2:
                cp.criarPublicacoes(id);
                timeline(id);
                return;
                        
                case 3:
                    perfil(id);
                    return;
                
                case 4:
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
        void avalFisica(int id) {
        AvalFis avaliacao = new AvalFis();
        DBConnection dbConnection = new DBConnection();
        boolean avalExiste = false;
        try {
            avalExiste = opAF.buscaIDPessoa(id, dbConnection.getConnection());
        } catch (SQLException e) {
            System.err.println("Não é possivel saber se há uma avaliação ou não:" + e.getMessage());
        }
        
        if (avalExiste == true) {
            try {
            avaliacao = opAF.getAval(id, dbConnection.getConnection());
                System.out.println("IMC: " + avaliacao.getIMC());
                System.out.println("TMB: " + avaliacao.getTMB());
                System.out.println("Body Fat: " + avaliacao.getBF());
                System.out.println("Massa Gorda: " + avaliacao.getMassaGorda());
                System.out.println("Massa Magra: " + avaliacao.getMassaMagra());
                
                
        } catch (SQLException e) {
            System.err.println("Não é possivel saber se há uma avaliação ou não:" + e.getMessage());
        }   
        }
        else {
            System.out.println("Você não tem avaliação fisica no histórico, preencha suas informações");
            novaDieta(id);
        }
        perfil(id);
        
    }
    
        
   
    void mostrarPA (int id) {
    
        System.out.println(" Mostrar ultimo plano alimentar");
             
       
                
                int idDieta = 0;
                

     try (DBConnection dbConnection = new DBConnection()) {
             idDieta = opD.getUltimaDieta(id, dbConnection.getConnection());
             if (idDieta == 0) {
                 novaDieta(id);
             } else {
             List<Prato> pratos = pd.getPratos(dbConnection.getConnection(), idDieta);
             int x = 0;
            for (Prato prato : pratos) {
                x++;
                String fonteCarb = opA.getNome(prato.getFonteCarb(), dbConnection.getConnection());
                String fonteProt = opA.getNome(prato.getFonteProt(), dbConnection.getConnection());
                String fonteGord = opA.getNome(prato.getFonteGord(), dbConnection.getConnection());
                   System.out.println(x + "° Refeição");
                   System.out.println("Fonte de Proteína: " + fonteProt + " " + prato.getPorcaoProt() + " gramas");
                   System.out.println("Fonte de Carboidrato: " + fonteCarb + " " + prato.getPorcaoCarb() + " gramas");
                   System.out.println("Fonte de Gordura: " + fonteGord + " " + prato.getPorcaoGord() + " gramas");
          
               }
             
             } 
             
         } catch (SQLException e) {
             System.err.println("Erro ao procurar planos alimentares" + e.getMessage());
         }
    
//               
//                
                perfil(id); 
                
                
                
            

    }
    
    
    void novaDieta(int id) {
        int dieta = cd.cadDieta(id, usuarios, alimentos);
        
        int op;
                Scanner sc = new Scanner(System.in);
                System.out.println("OPCOES PARA O PLANO ALIMENTAR");
                System.out.println("1- Montar plano alimentar manual.");
                System.out.println("2- Gerar plano alimentar automatico.");
                
                 op = sc.nextInt();
                switch (op) {
                    case 1:
                        planoManual(id, dieta);
                        mostrarPA(id);        
                        return;
                    case 2:
                        System.out.println("automatico");
                       planoRandom(id, dieta);
                       mostrarPA(id);
                       return;

                    default:
                        System.out.println("Opção invalida");
                       

                }
        mostrarPA(id);
        
        
        
    }
    
    int[] preferencias (int id, int idDieta) {
        int alim [] = new int [3];
        try (DBConnection dbConnection = new DBConnection()) {          
            int carb = 0; 
            opA.mostrarAlimentosCarb(dbConnection.getConnection());
            while (carb<1 || carb>6) {
              System.out.println("Escolha uma fonte de carboidratos para sua refeição, 1 a 6");
              Scanner scan = new Scanner(System.in);
             carb = scan.nextInt();
            }
             opP.inserirPreferencia(id, 1, carb, dbConnection.getConnection());
             opA.mostrarAlimentosProt(dbConnection.getConnection());
            int prot = 0;
            while (prot<7 || prot>11) {
              System.out.println("Escolha uma fonte de proteina para seu prato, 7 a 11");
              Scanner scan = new Scanner(System.in);
             prot = scan.nextInt();
            }
             opP.inserirPreferencia(id, 2, prot, dbConnection.getConnection());
             int gord = 0;
             opA.mostrarAlimentosGord(dbConnection.getConnection());
             
            while (gord<12 || prot>17) {
              System.out.println("Escolha suas fontes de gordura para seu prato, 12 a 17");
              Scanner scan = new Scanner(System.in);
             gord = scan.nextInt();
            }
             opP.inserirPreferencia(id, 3, gord, dbConnection.getConnection());
             alim [0] = carb;
             alim [1] = prot;
             alim [2] = gord;
             
             
         } catch (SQLException e) {
             System.err.println("Erro ao pegar preferencias" + e.getMessage());
         }
     return alim;
    }
    void planoManual (int id, int idDieta) {
     System.out.println("manual");
                  
                    int quantRef = 0;
                  
      try (DBConnection dbConnection = new DBConnection()) {
             
             quantRef = opD.getQuantRef(idDieta, dbConnection.getConnection());
             Dieta dieta = opD.getDietbyID(idDieta, dbConnection.getConnection());
             
             
              for (int x = 0; x < quantRef; x++) {
                  int alim[] = preferencias(id, idDieta);
                  // o metodo de pegar alimentos de forma randomica só vai mudar isso aqui (posso mudar esse metodo para if else ok
                  double caloriasDiv = dieta.getCalorias()/quantRef;
                  Prato prato = new Prato();
                  prato.setFonteCarb(alim[0]);
                  prato.setFonteProt(alim[1]);
                  prato.setFonteGord(alim[2]);
                  int tipoId = dieta.getTipo();
                  TipoDieta tipo = cd.getTipo(tipoId, dieta);
                  double carbTipo = tipo.getCarb()*caloriasDiv;
                  double protTipo = tipo.getProt()*caloriasDiv;
                  double gordTipo = tipo.getGord()*caloriasDiv;
                  double porcaoCarb = (carbTipo*100/opA.getCalorias(alim[0], dbConnection.getConnection()));
                  double porcaoProt = (protTipo*100/opA.getCalorias(alim[1], dbConnection.getConnection()));
                  double porcaoGord = (gordTipo*100/opA.getCalorias(alim[2], dbConnection.getConnection()));
                  prato.setPorcaoCarb(porcaoCarb);
                  prato.setPorcaoProt(porcaoProt);
                  prato.setPorcaoGord(porcaoGord);
                  prato.setDieta_id(idDieta);
                  
            //setar esse prato 
            
            pd.inserirPrato(dbConnection.getConnection(), prato);
              
}
         } catch (SQLException e) {
             System.err.println("Erro ao fazer plano alimentar" + e.getMessage());
         }
      
        
    }
    
    void planoRandom (int id, int idDieta) {
      int quantRef = 0;
                       
      try (DBConnection dbConnection = new DBConnection()) {
             
             
             quantRef = opD.getQuantRef(idDieta, dbConnection.getConnection());
            
             Dieta dieta = opD.getDietbyID(idDieta, dbConnection.getConnection());
             
             
              for (int x = 0; x < quantRef; x++) {
                Random carbo = new Random();
                int carb = carbo.nextInt(6) + 1; 

                Random proto = new Random();
                int prot = proto.nextInt(5) + 7; 

                Random gordu = new Random();
                int gord = gordu.nextInt(6) + 12;
                
                  // o metodo de pegar alimentos de forma randomica só vai mudar isso aqui (posso mudar esse metodo para if else ok
                  double caloriasDiv = dieta.getCalorias()/quantRef;
                  Prato prato = new Prato();
                  prato.setFonteCarb(carb);
                  prato.setFonteProt(prot);
                  prato.setFonteGord(gord);
                  int tipoId = dieta.getTipo();
                  TipoDieta tipo = cd.getTipo(tipoId, dieta);
                  double carbTipo = tipo.getCarb()*caloriasDiv;
                  double protTipo = tipo.getProt()*caloriasDiv;
                  double gordTipo = tipo.getGord()*caloriasDiv;
                  
                double porcaoCarb = 0;
                double porcaoProt = 0;
                double porcaoGord = 0;

                double caloriasCarb = opA.getCalorias(carb, dbConnection.getConnection());
                double caloriasProt = opA.getCalorias(prot, dbConnection.getConnection());
                double caloriasGord = opA.getCalorias(gord, dbConnection.getConnection());

                if (caloriasCarb != 0) {
                    porcaoCarb = carbTipo * 100 / caloriasCarb;
                }

                if (caloriasProt != 0) {
                    porcaoProt = protTipo * 100 / caloriasProt;
                }

                if (caloriasGord != 0) {
                    porcaoGord = gordTipo * 100 / caloriasGord;
                }
                  prato.setPorcaoProt(porcaoProt);
                  prato.setPorcaoGord(porcaoGord);
                  prato.setPorcaoCarb(porcaoCarb);
                  prato.setDieta_id(idDieta);
                  
            //setar esse prato 
            
            pd.inserirPrato(dbConnection.getConnection(), prato);
            
            //Cada prato vai ter um id porém a idDIeta vai ser a mesma e ai eu consigo pegar os pratos desse id dieta 
    
              }     
                  

             
         } catch (SQLException e) {
             System.err.println("Erro ao fazer plano alimentar" + e.getMessage());
         }
     
      
    }
 
    
    void chat(int id)  {
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
                System.out.println("Digite login de quem receberá a mensagem: ");
                scan.nextLine();
                String login = scan.nextLine();
                int idAmg = 0;
                System.out.println("Digite a mensagem que você quer enviar: ");
                msg = scan.nextLine();
                try (DBConnection dbConnection = new DBConnection()) {
                      idAmg = op.getID(login, dbConnection.getConnection());
                      opC.inserirMensagem(dbConnection.getConnection(), id, idAmg, msg);
                    
                    } catch (SQLException e) {
                         System.err.println("Erro ao mandar mensagem: " + e.getMessage());
                    }
               
               perfil(id);
               return;
               
            case 2:
                System.out.println("1- Mensagens recebidas");
                System.out.println("2- Mensagens enviadas");
                scan.nextLine();
                int opcao = scan.nextInt();
                String idStr = null;
                switch (opcao) {
                    case 1:
                        try (DBConnection dbConnection = new DBConnection()) { 
                          List<Chat> mensagensRecebidas = opC.obterMensagensRecebidas(dbConnection.getConnection(), id);
                          
                          for (Chat mensagem : mensagensRecebidas) {
                           try (DBConnection c = new DBConnection()) { 
                               
                              Pessoa pessoa = new Pessoa();
                              pessoa = op.buscaPorID(mensagem.getIdRemetente(), c.getConnection());
                              System.out.println("Mensagem: " + mensagem.getMensagem());
                              System.out.println("Enviado por " + pessoa.getNome());
                                System.out.println("---");
                           }
                           catch (SQLException e) {
                                System.err.println("Erro ao procurar mensagem: " + e.getMessage());
                           }
                          }
                                    
                } catch (SQLException e) {
                    System.err.println("Erro ao procurar mensagem: " + e.getMessage());
                }
                        perfil(id);
                
                   return;
                    case 2:
                        try (DBConnection dbConnection = new DBConnection()) { 
                          List<Chat> mensagensRecebidas = opC.obterMensagensDoRemetente(dbConnection.getConnection(), id);
                          
                          for (Chat mensagem : mensagensRecebidas) {
                           try (DBConnection c = new DBConnection()) { 
                               
                              Pessoa pessoa = new Pessoa();
                              pessoa = op.buscaPorID(mensagem.getIdRecebidas(), c.getConnection());
                              System.out.println("Mensagem: " + mensagem.getMensagem());
                              System.out.println("Enviado por você");
                                System.out.println("---");
                           }
                           catch (SQLException e) {
                               System.err.println("Erro ao procurar mensagem: " + e.getMessage());
                           }
                          }
                                    
                } catch (SQLException e) {
                    System.err.println("Erro ao procurar mensagem: " + e.getMessage());
                }
                       perfil(id);
                        return;
                
                
            case 3:
                perfil(id);
                return;
            default:
                System.out.println("Opcao invalida!");
                perfil (id);
                                
        }
            
    }
    }
   
    void amigos (int id) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in); 
        
        

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
                    int idAmigo = 0;
                    try (DBConnection dbConnection = new DBConnection()) {
                     idAmigo = op.getID(login, dbConnection.getConnection());
                     cp.mostrarPerfil(idAmigo);
                     
                    } catch (SQLException e) {
                         System.err.println("Erro ao achar perfil: " + e.getMessage());
                    }
                    seguir(id, idAmigo);
                    
                 perfil(id);
                    return;
                    

                case 2:
                    int seguindo = 0;
                    try (DBConnection dbConnection = new DBConnection()) {
                        seguindo = sd.contarSeguindo(id, dbConnection.getConnection());
                        System.out.println("Você segue: " + seguindo + " pessoas.");
                        List<String> nomeSeguindo = sd.obterNomesSeguindo(id, dbConnection.getConnection());

            if (!nomeSeguindo.isEmpty()) {
                System.out.println("Pessoas que você está seguindo:");
                for (String nome : nomeSeguindo) {
                    System.out.println(nome);
                }
            }
                    } catch (Exception e) { 
                        System.err.println("Erro ao interagir com o banco de dados: " + e.getMessage());
                        e.printStackTrace();
                    }
                     perfil(id);
                   
               return;
//                   
                case 3:
                    perfil(id);
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
//        
//        
    }
    
    void seguir (int id, int idSeguido) {
        Scanner sc = new Scanner(System.in);
        System.out.println("OPÇÕES");
        System.out.println("1- Seguir perfil");
        System.out.println("2- Parar de seguir perfil");
        System.out.println("3- Voltar para seu perfil");
        int opc = sc.nextInt();
        boolean verif = false;
        switch (opc) {
                case 1:
                    try (DBConnection dbConnection = new DBConnection()) {
                        verif = sd.verifSeguindo(id, idSeguido, dbConnection.getConnection());
                        if (verif) {
                            System.out.println("Você já segue essa conta!");
                            perfil(id);
                        } else {
                            sd.inserirSeguir(id, idSeguido, dbConnection.getConnection());
                        }
                    } catch (Exception e) { 
                        System.err.println("Erro ao interagir com o banco de dados: " + e.getMessage());
                        e.printStackTrace();
                    }
                    return;
  
                                    
                case 2:
                        try (DBConnection dbConnection = new DBConnection()) {
                        verif = sd.verifSeguindo(id, idSeguido, dbConnection.getConnection());
                        if (verif == false) {
                            System.out.println("Você não segue essa conta");
                            perfil(id);
                        } else {
                            sd.pararSeguir(id, idSeguido, dbConnection.getConnection());
                        }
                    } catch (Exception e) { // ou Throwable se preferir capturar qualquer exceção
                        System.err.println("Erro ao interagir com o banco de dados: " + e.getMessage());
                        e.printStackTrace();
                    }
                    return;
                                  
                case 3:
                     perfil(id);
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
    }
    public void seguidores (int id) {
        int seguidores = 0;
                    try (DBConnection dbConnection = new DBConnection()) {
                        seguidores = sd.contarSeguidores(id, dbConnection.getConnection());
                        System.out.println("Você é seguido por:  " + seguidores + " pessoas.");
                        List<String> nomeSeguidores = sd.obterNomesSeguidores(id, dbConnection.getConnection());

            if (!nomeSeguidores.isEmpty()) {
                System.out.println("Pessoas estão seguindo você: ");
                for (String nome : nomeSeguidores) {
                    System.out.println(nome);
                }
            }
                    } catch (Exception e) { 
                        System.err.println("Erro ao interagir com o banco de dados: " + e.getMessage());
                        e.printStackTrace();
                    }
    }
           
    public Programa() {
        menu();
    }
    
    
    
}