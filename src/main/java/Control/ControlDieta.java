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

public class ControlDieta {
    AvalFisDAO opAF = new AvalFisDAO();
    DietaDAO opD = new DietaDAO();
    RefeicoesDAO opR = new RefeicoesDAO();
//    PreferenciasDAO opP = new PreferenciasDAO();
    AlimentoDAO opA = new AlimentoDAO();

    public void cadDieta(int numArray, Pessoa[] usuarios, Alimento [] alimentos) {
        System.out.println("NOVA DIETA");
        AvalFis novaAval = new AvalFis();
        Dieta dieta = new Dieta();
        Refeicoes[] quantidade = new Refeicoes[6];
//        Preferencias[] pref = new Preferencias[10];
        novaAval = cadAval(usuarios, numArray);
        System.out.println("teste" + novaAval.getTMB());

        int y = 0;
        while (usuarios[numArray].getAvaliacoes()[y] != null)
        {
            y++;
        }
        usuarios[numArray].getAvaliacoes()[y] = novaAval;
        System.out.println("teste" + usuarios[numArray].getAvaliacoes()[y].getTMB());
        dieta = novaDieta(usuarios, usuarios[numArray].getAvaliacoes()[y], numArray);
        int x = 0;
        while (usuarios[numArray].getDietas()[x] != null) {
            x++;
        }
        usuarios[numArray].getDietas()[x] = dieta;
        quantidade = opR.refSetar(dieta);
        usuarios[numArray].getDietas()[x].setRef(quantidade);
        opR.mostrarRef(quantidade);
//        pref = opP.preferencias(alimentos, usuarios, numArray);        
        registro(novaAval, usuarios, numArray);
      
    }
      public AvalFis cadAval (Pessoa[] pessoas, int numArray)
    {
        Scanner scan = new Scanner(System.in);
        AvalFis novaAval = new AvalFis();
        novaAval.setPessoa(pessoas[numArray]);
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
        novaAval.setIMC();
        System.out.println("Seu IMC " + novaAval.getIMC());
        
        novaAval.setTMB();
        System.out.println("sua TMB " + novaAval.getTMB());
        // ifs e elses para avaliar a gordura ideal
        novaAval.setBF();
        System.out.println("sua gordura corporal é igual a " + novaAval.getBF());
        
        novaAval.setMassaGorda();
        System.out.println("Sua massa gorda é " + novaAval.getMassaGorda());
        
        novaAval.setMassaMagra();
        System.out.println("Sua massa magra é " + novaAval.getMassaMagra());
      //  System.out.println("Control.ControlDieta.cadAval()" + novaAval.getIMC());
        return novaAval;
}
      public Dieta novaDieta (Pessoa[] pessoa, AvalFis aval, int numArray)
    {   Dieta novaDieta = new Dieta();
        novaDieta.setPessoa(pessoa[numArray]);
        novaDieta.setAval(aval);
        TipoDietaDAO op = new TipoDietaDAO();
        Scanner scan = new Scanner(System.in);
  
        
        while (novaDieta.getObjetivo() < 1 || novaDieta.getObjetivo()>3){ 
            
        System.out.println("Qual é seu objetivo? Se for perda de peso digite 1, se for manter o peso digite 2, se for ganhar peso digite 3");
        novaDieta.setObjetivo(scan.nextInt());
        }
        if (novaDieta.getObjetivo() == 1)
        {   
            double cal = aval.getTMB()-300;
            novaDieta.setCalorias(cal);
            System.out.println("Seu objetivo é perda de peso e por isso sua dieta vai ter " + novaDieta.getCalorias() + " calorias diarios");
        } else if (novaDieta.getObjetivo() == 2)
        {   
            double cal = aval.getTMB();
            novaDieta.setCalorias(cal);
            System.out.println("Seu objetivo é manter o peso por isso sua dieta vai ter " + novaDieta.getCalorias() + " calorias diarios");
        } else if (novaDieta.getObjetivo() == 3)
        {   
            double cal = aval.getTMB()+300;
            novaDieta.setCalorias(cal);
            System.out.println("Seu objetivo ganho de peso e por isso sua dieta vai ter " + novaDieta.getCalorias() + " calorias diarios");
        }
        while (novaDieta.getNumRef()< 3 || novaDieta.getNumRef()>5){ 
            
        System.out.println("Quantas refeições por dia você quer ter em sua dieta?");
        novaDieta.setNumRef(scan.nextInt());
        }
        int tipo = 0;
        TipoDieta novoTipo = new TipoDieta();
        novaDieta.setTipo(novoTipo);
        while (tipo<1 || tipo>4){ 
        System.out.println("Tipos de Dieta");
        System.out.println("1- Equilibrada");
        System.out.println("2- Cetogênica");
        System.out.println("3- Low Carb");
        System.out.println("4- Atleta /n");
        
        System.out.println("Qual o tipo de dieta que você quer ter? Digite o numero");
        tipo = scan.nextInt();
        }
        
        if (tipo == 1) {
            
           novaDieta = op.equilibrado(novaDieta);
            
        } else if (tipo == 2)
            
        {
            novaDieta = op.cetogenica(novaDieta);
            
        } else if (tipo == 3)
        {
            novaDieta = op.lowCarb(novaDieta);
            
        } else if (tipo == 4)
        {
            novaDieta = op.atleta(novaDieta);
            
        }
        System.out.println("Sua dieta vai ter " + novaDieta.getTipo().getCarb() + " de calorias de carboidrato" + novaDieta.getTipo().getProt() + "de calorias de proteina" + novaDieta.getTipo().getGord() + "de calorias de gordura");
        return novaDieta;
    }
      public void registro (AvalFis aval, Pessoa[] usuarios, int numArray) {
//comparações
       
  //bf
  if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<30 && aval.getBF()<19)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()>29 && aval.getIdade()<40 && aval.getBF()<20)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()>=40 && aval.getBF()<21)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<30 && aval.getBF()>19 && aval.getBF()<29)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>20 && aval.getBF()<30)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()>=40 && aval.getBF()>21 && aval.getBF()<31)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<30 && aval.getBF()>28)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>29)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()>=40 && aval.getBF()>30)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  }
  
  
  else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<30 && aval.getBF()<14)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()>29 && aval.getIdade()<40 && aval.getBF()<15)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()>=40 && aval.getBF()<17)
  {
      System.out.println("A sua porcentagem de gordura corporal está boa");
  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<30 && aval.getBF()>13 && aval.getBF()<21)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>14 && aval.getBF()<22)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()>=40 && aval.getBF()>16 && aval.getBF()<24)
  {
      System.out.println("A sua porcentagem de gordura corporal está normal");
  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<30 && aval.getBF()>20)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>21)
  {
      System.out.println("A sua porcentagem de gordura corporal está elevada");
  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()>=40 && aval.getBF()>23)
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
      public void gerenciador (Alimento[] alim) {
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
                 opA.todosAlim(alim);
                 return;
             case 2:
                 System.out.println("Mostrando todas as fontes de carboidratos:");
                 opA.fonteCarb (alim);
                 return;
             case 3:
                 System.out.println("Mostrando todas as fontes de proteinas:");
                 opA.fonteProt(alim);
                 return;
             case 4: 
                 System.out.println("Mostrando todas as fontes de gordura:");
                 opA.fonteGord(alim);
                 return;
             default:
                 System.out.println("Opcao invalida!");
                 
                  
         }
         
         
     }
}
