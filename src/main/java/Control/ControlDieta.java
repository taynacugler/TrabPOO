/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DAO.AlimentoDAO;
import DAO.AvalFisDAO;
import DAO.DietaDAO;
import DAO.PreferenciasDAO;
import DAO.RefeicoesDAO;
import DAO.TipoDietaDAO;
import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Dieta;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Preferencias;
import com.mycompany.trabpoo.Bean.Refeicoes;
import com.mycompany.trabpoo.Bean.Alimento;
import com.mycompany.trabpoo.Bean.TipoDieta;
import java.util.Scanner;
import com.mycompany.trabpoo.DBConnection;
import java.sql.SQLException;



public class ControlDieta {
    AvalFisDAO opAF = new AvalFisDAO();
    DietaDAO opD = new DietaDAO();
    RefeicoesDAO opR = new RefeicoesDAO();
//    PreferenciasDAO opP = new PreferenciasDAO();
    AlimentoDAO opA = new AlimentoDAO();
    TipoDietaDAO tdD = new TipoDietaDAO();

    public int cadDieta(int id, Pessoa[] usuarios, Alimento [] alimentos) {
        System.out.println("NOVA DIETA");
        AvalFis novaAval = new AvalFis();
        Dieta dieta = new Dieta();
        Refeicoes[] quantidade = new Refeicoes[6];
        Preferencias[] pref = new Preferencias[10];
        novaAval = cadAval(id);
        int idDieta = 0;
        int idAval = 0;
        

        try (DBConnection dbConnection = new DBConnection()) {
         idAval = opAF.cadastrarAvaliacaoFisica (novaAval, id, dbConnection.getConnection());
         dieta = novaDieta(novaAval, id, idAval);
         idDieta = opD.criarDieta(dieta, dbConnection.getConnection());
         

        } catch (SQLException e) {
            System.err.println("Erro para cadastrar nova avaliação física ou dieta" + e.getMessage());
}    

        
//        quantidade = opR.refSetar(dieta);
//        usuarios[id].getDietas()[x].setRef(quantidade);
//        opR.mostrarRef(quantidade);
////        pref = opP.preferencias(alimentos, usuarios, numArray);        
//        registro(novaAval, usuarios, id);
        
      return idDieta;
    }
      public AvalFis cadAval (int id)
    {
        Scanner scan = new Scanner(System.in);
        AvalFis novaAval = new AvalFis();
        System.out.println("vamos preencher os dados!");
        System.out.println("Coloque seu peso:");
        novaAval.setPeso(scan.nextDouble());
        System.out.println("Coloque sua altura:");
        novaAval.setAltura(scan.nextDouble());
        System.out.println("Coloque sua idade:");
        novaAval.setIdade(scan.nextDouble());
        System.out.println("Coloque sua cintura:");
        novaAval.setCintura(scan.nextDouble());
        System.out.println("Coloque seu quadril:");
        novaAval.setQuadril(scan.nextDouble());
        System.out.println("Coloque seu abdomem:");
        novaAval.setAbdomem(scan.nextDouble());
        System.out.println("Nível de atividade física");
        System.out.println("1.2: sedentário (pouco ou nenhum exercício)");
        System.out.println("1,375: levemente ativo (exercício leve 1 a 3 dias por semana)");
        System.out.println("1,55: moderadamente ativo (exercício moderado 6 a 7 dias por semana)");
        System.out.println("1,725: muito ativo (exercício intenso todos os dias ou exercício duas vezes ao dia)");
        System.out.println("1,9: extra ativo (exercício muito difícil, treinamento ou trabalho físico)");
        System.out.println("Coloque o numero de ativ fisica que você faz:");
        novaAval.setAtvFis(scan.nextDouble());
        System.out.println("Coloque seu pescoço");
        novaAval.setPescoco(scan.nextDouble());
        String sexo = null;
        try (DBConnection dbConnection = new DBConnection()) {
        sexo = opAF.obterSexoPorId(id, dbConnection.getConnection());
         
        } catch (SQLException e) {
            System.err.println("Erro ao procurar o sexo da pessoa" + e.getMessage());
}    
        novaAval.setIMC();
        System.out.println("Seu IMC " + novaAval.getIMC());
        
        novaAval.setTMB(sexo);
        System.out.println("sua TMB " + novaAval.getTMB());
        // ifs e elses para avaliar a gordura ideal
        novaAval.setBF(sexo);
        System.out.println("sua gordura corporal é igual a " + novaAval.getBF());
        
        novaAval.setMassaGorda();
        System.out.println("Sua massa gorda é " + novaAval.getMassaGorda());
        
        novaAval.setMassaMagra();
        System.out.println("Sua massa magra é " + novaAval.getMassaMagra());
      //  System.out.println("Control.ControlDieta.cadAval()" + novaAval.getIMC());
        return novaAval;
}
      public Dieta novaDieta (AvalFis aval, int id, int idAval)
    {   Dieta novaDieta = new Dieta();
        novaDieta.setPessoa_id(id);
        novaDieta.setAval_id(idAval);
        TipoDietaDAO op = new TipoDietaDAO();
        Scanner scan = new Scanner(System.in);
  
        
        while (novaDieta.getObjetivo() < 1 || novaDieta.getObjetivo()>3){ 
            
        System.out.println("Qual é seu objetivo? Se for perda de peso digite 1, se for manter o peso digite 2, se for ganhar peso digite 3");
        novaDieta.setObjetivo(scan.nextInt());
        }
            switch (novaDieta.getObjetivo()) {
               case 1:
                   double calPerdaPeso = aval.getTMB() - 300;
                   novaDieta.setCalorias(calPerdaPeso);
                   System.out.println("Seu objetivo é perda de peso e por isso sua dieta vai ter " + novaDieta.getCalorias() + " calorias diárias");
                   break;

               case 2:
                   double calManterPeso = aval.getTMB();
                   novaDieta.setCalorias(calManterPeso);
                   System.out.println("Seu objetivo é manter o peso, por isso sua dieta vai ter " + novaDieta.getCalorias() + " calorias diárias");
                   break;

               case 3:
                   double calGanhoPeso = aval.getTMB() + 300;
                   novaDieta.setCalorias(calGanhoPeso);
                   System.out.println("Seu objetivo é ganho de peso, por isso sua dieta vai ter " + novaDieta.getCalorias() + " calorias diárias");
                   break;

               default:
                   System.out.println("Objetivo não reconhecido");
           }
        
        while (novaDieta.getNumRef()< 3 || novaDieta.getNumRef()>5){ 
            
        System.out.println("Quantas refeições por dia você quer ter em sua dieta?");
        novaDieta.setNumRef(scan.nextInt());
        }
        int tipo = 0;
        while (tipo<1 || tipo>4){ 
        System.out.println("Tipos de Dieta");
        System.out.println("1- Equilibrada");
        System.out.println("2- Cetogênica");
        System.out.println("3- Low Carb");
        System.out.println("4- Atleta /n");
        
        System.out.println("Qual o tipo de dieta que você quer ter? Digite o numero");
        tipo = scan.nextInt();
        
        }
        novaDieta.setTipo(tipo);
        
        if (tipo == 1) {
            
        novaDieta.setCalCarb(novaDieta.getCalorias()*0.4);
        novaDieta.setCalProt(novaDieta.getCalorias()*0.3);
        novaDieta.setCalGord(novaDieta.getCalorias()*0.3);
            
        } else if (tipo == 2)
            
        {
        novaDieta.setCalCarb(novaDieta.getCalorias()*0.15);
        novaDieta.setCalProt(novaDieta.getCalorias()*0.15);
        novaDieta.setCalGord(novaDieta.getCalorias()*0.7);
            
        } else if (tipo == 3)
        {
        novaDieta.setCalCarb(novaDieta.getCalorias()*0.3);
        novaDieta.setCalProt(novaDieta.getCalorias()*0.5);
        novaDieta.setCalGord(novaDieta.getCalorias()*0.2);
            
        } else if (tipo == 4)
        {
        novaDieta.setCalCarb(aval.getPeso()*2*4);
        novaDieta.setCalProt(aval.getPeso()*0.8*9);
        double gord = novaDieta.getCalorias() - (novaDieta.getCalProt() - novaDieta.getCalCarb());
        novaDieta.setCalGord(gord);            
        }
        return novaDieta;
    }
      
      
     
      
      
      
      
      public void registro ( int idPessoa) {
//comparações
String sexo = null;
 AvalFis aval = new AvalFis();
try (DBConnection dbConnection = new DBConnection()) {
       sexo = opAF.obterSexoPorId(idPessoa, dbConnection.getConnection());
       aval = opAF.getAval(idPessoa, dbConnection.getConnection());
} catch (SQLException e) {
            System.err.println("Erro para obter registro de dieta" + e.getMessage());
}    

       
  //bf
  if (sexo != null && sexo.equals("f") && aval.getIdade()<30 && aval.getBF()<19)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (sexo != null && sexo.equals("f") && aval.getIdade()>29 && aval.getIdade()<40 && aval.getBF()<20)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (sexo != null && sexo.equals("f") && aval.getIdade()>=40 && aval.getBF()<21)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (sexo != null && sexo.equals("f") && aval.getIdade()<30 && aval.getBF()>19 && aval.getBF()<29)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (sexo != null && sexo.equals("f") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>20 && aval.getBF()<30)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (sexo != null && sexo.equals("f") && aval.getIdade()>=40 && aval.getBF()>21 && aval.getBF()<31)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (sexo != null && sexo.equals("f") && aval.getIdade()<30 && aval.getBF()>28)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  } else if (sexo != null && sexo.equals("f") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>29)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  } else if (sexo != null && sexo.equals("f") && aval.getIdade()>=40 && aval.getBF()>30)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  }
  
  
  else if (sexo != null && sexo.equals("m") && aval.getIdade()<30 && aval.getBF()<14)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (sexo != null && sexo.equals("m") && aval.getIdade()>29 && aval.getIdade()<40 && aval.getBF()<15)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (sexo != null && sexo.equals("m") && aval.getIdade()>=40 && aval.getBF()<17)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (sexo != null && sexo.equals("m") && aval.getIdade()<30 && aval.getBF()>13 && aval.getBF()<21)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (sexo != null && sexo.equals("m") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>14 && aval.getBF()<22)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (sexo != null && sexo.equals("m") && aval.getIdade()>=40 && aval.getBF()>16 && aval.getBF()<24)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (sexo != null && sexo.equals("m") && aval.getIdade()<30 && aval.getBF()>20)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  } else if (sexo != null && sexo.equals("m") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>21)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  } else if (sexo != null && sexo.equals("m") && aval.getIdade()>=40 && aval.getBF()>23)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  }
 //IMC
        if (aval.getIMC() > 40)
        {
            System.out.println("Seu IMC é" + aval.getIMC() + "e sua classificação é 'obesidade grau 3'. É recomendado uma dieta para perda de peso.");
        } else if (aval.getIMC() < 40 && aval.getIMC()> 35)
        {
            System.out.println("Seu IMC é" + aval.getIMC() + "e sua classificação é 'obesidade grau 2'. É recomendado uma dieta para perda de peso.");
        } else if (aval.getIMC()< 35 && aval.getIMC()> 30)
        {
            System.out.println("Seu IMC é" + aval.getIMC() + "e sua classificação é 'obesidade grau 1'. É recomendado uma dieta para perda de peso.");
        } else if (aval.getIMC()<30 && aval.getIMC()> 25)
        {
            System.out.println("Seu IMC é" + aval.getIMC() + "e você está acima do peso'. É recomendado uma dieta para perda de peso.");
        } else if (aval.getIMC()<25 && aval.getIMC()>18.5) 
        {
            System.out.println("Seu IMC é" + aval.getIMC() + "e sua classificação é 'peso normal'. É recomendado uma dieta para manter o peso");
        } else if (aval.getIMC()<18.5)
        {
            System.out.println("Seu IMC é" + aval.getIMC() + "e sua classificação é 'abaixo do peso'. É recomendado uma dieta para ganho de peso");
        }
}
        public void gerenciador () {
         int opc;
         Scanner scan = new Scanner(System.in);
         System.out.println("Escolha uma opção:");
         System.out.println("1- Mostrar todos os alimentos");
         System.out.println("2- Mostrar fonte de carboidratos");
         System.out.println("3- Mostrar fonte de proteinas");
         System.out.println("4- Mostrar fonte de gorduras");
         opc = scan.nextInt();
         
         switch (opc) {
             case 1:
                 System.out.println("Mostrando todos os alimentos:");
                 try (DBConnection dbConnection = new DBConnection()) {
                    opA.mostrarTodosAlimentos(dbConnection.getConnection());
                } catch (SQLException e) {
                    System.err.println("Erro para mostrar alimentos" + e.getMessage());
} 
                 
                 return;
             case 2:
                 System.out.println("Mostrando todas as fontes de carboidratos:");
                 System.out.println("Mostrando todos os alimentos:");
                 try (DBConnection dbConnection = new DBConnection()) {
                    opA.mostrarAlimentosCarb(dbConnection.getConnection());
                } catch (SQLException e) {
                    System.err.println("Erro para mostrar alimentos" + e.getMessage());
} 
                 return;
             case 3:
                 System.out.println("Mostrando todas as fontes de proteinas:");
                 System.out.println("Mostrando todos os alimentos:");
                 try (DBConnection dbConnection = new DBConnection()) {
                    opA.mostrarAlimentosProt(dbConnection.getConnection());
                } catch (SQLException e) {
                    System.err.println("Erro para mostrar alimentos" + e.getMessage());
} 
                 return;
             case 4: 
                 System.out.println("Mostrando todas as fontes de gordura:");
                System.out.println("Mostrando todos os alimentos:");
                 try (DBConnection dbConnection = new DBConnection()) {
                    opA.mostrarAlimentosGord(dbConnection.getConnection());
                } catch (SQLException e) {
                    System.err.println("Erro para mostrar alimentos" + e.getMessage());
} 
                 return;
             default:
                 System.out.println("Opcao invalida!");
                 
                  
         }
        }
          public TipoDieta getTipo (int num, Dieta dieta) {
          TipoDieta tipo = new TipoDieta();
          double peso = 0;
          try (DBConnection dbConnection = new DBConnection()) {
          peso = opAF.getPeso(num, dbConnection.getConnection());
                  } catch (SQLException e) {
             System.err.println("Erro ao pegar peso" + e.getMessage());
         }
          switch (num) {
                case 1:
                  tipo = tdD.equilibrado(dieta);
                  return tipo;
                  
                case 2:
                    tipo = tdD.cetogenica(dieta);
                    return tipo;
                case 3: 
                    tipo = tdD.lowCarb(dieta);
                    return tipo;
                case 4:
                    tipo = tdD.atleta(dieta, peso);
                    return tipo;
 
          }
          
          return tipo;
      }
         
         
     }

