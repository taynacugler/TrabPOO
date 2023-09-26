/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;
import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Dieta;
import com.mycompany.trabpoo.Bean.TipoDieta;
import com.mycompany.trabpoo.Bean.Preferencias;
import com.mycompany.trabpoo.Bean.Alimento;
import com.mycompany.trabpoo.Bean.Refeicoes;
import java.util.Scanner;

/**
 *
 * @author taynacardoso
 */
public class MenuPessoa {
    
    
    AvalFis cadAval (Pessoa pessoa)
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
       
        novaAval.setIMC(novaAval.getIMC(), novaAval.getPeso(), novaAval.getAltura());
        System.out.println("Seu IMC " + novaAval.getIMC());
        
        novaAval.setTMB(novaAval.getTMB(), novaAval.getIdade(), novaAval.getPeso(), novaAval.getAltura(), novaAval.getAtvFis(), pessoa);
        System.out.println("sua TMB " + novaAval.getTMB());
        // ifs e elses para avaliar a gordura ideal
        novaAval.setBF(novaAval.getBF(), novaAval.getAltura(), novaAval.getPescoco(), novaAval.getCintura(), novaAval.getAbdomem(), novaAval.getQuadril(), pessoa);
        System.out.println("sua gordura corporal é igual a " + novaAval.getBF());
        
        novaAval.setMassaGorda(novaAval.getMassaGorda(), novaAval.getBF(), novaAval.getPeso());
        System.out.println("Sua massa gorda é " + novaAval.getMassaGorda());
        
        novaAval.setMassaMagra(novaAval.getMassaMagra(), novaAval.getBF(), novaAval.getPeso());
        System.out.println("Sua massa magra é " + novaAval.getMassaMagra());
        
        return novaAval;
    }
    Dieta novaDieta (Pessoa pessoa, AvalFis aval)
    {   Dieta novaDieta = new Dieta();
        novaDieta.setPessoa(pessoa);
        novaDieta.setAval(aval);
        Scanner scan = new Scanner(System.in);
  //comparações
  //bf
//  if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<30 && aval.getBF()<19)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está boa");
//  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()>29 && aval.getIdade()<40 && aval.getBF()<20)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está boa");
//  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()>=40 && aval.getBF()<21)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está boa");
//  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<30 && aval.getBF()>19 && aval.getBF()<29)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está normal");
//  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>20 && aval.getBF()<30)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está normal");
//  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()>=40 && aval.getBF()>21 && aval.getBF()<31)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está normal");
//  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<30 && aval.getBF()>28)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está elevada");
//  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>29)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está elevada");
//  } else if (aval.getPessoa().getSexo().equals("f") && aval.getIdade()>=40 && aval.getBF()>30)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está elevada");
//  }
//  
//  
//  else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<30 && aval.getBF()<14)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está boa");
//  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()>29 && aval.getIdade()<40 && aval.getBF()<15)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está boa");
//  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()>=40 && aval.getBF()<17)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está boa");
//  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<30 && aval.getBF()>13 && aval.getBF()<21)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está normal");
//  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>14 && aval.getBF()<22)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está normal");
//  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()>=40 && aval.getBF()>16 && aval.getBF()<24)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está normal");
//  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<30 && aval.getBF()>20)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está elevada");
//  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()<40 && aval.getIdade()>=30 && aval.getBF()>21)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está elevada");
//  } else if (aval.getPessoa().getSexo().equals("m") && aval.getIdade()>=40 && aval.getBF()>23)
//  {
//      System.out.println("A sua porcentagem de gordura corporal está elevada");
//  }
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
            
            novaDieta.getTipo().setNome("equilibrada");
            double carb = novaDieta.getCalorias()*0.4;
            double prot = novaDieta.getCalorias()*0.3;
            double gord = novaDieta.getCalorias()*0.3;
            novaDieta.getTipo().setCarb(carb);
            novaDieta.getTipo().setProt(prot);
            novaDieta.getTipo().setGord(gord);
            
        } else if (tipo == 2)
            
        {
            novaDieta.getTipo().setNome("cetogenica");
            double carb = novaDieta.getCalorias()*0.15;
            double prot = novaDieta.getCalorias()*0.15;
            double gord = novaDieta.getCalorias()*0.7;
            novaDieta.getTipo().setCarb(carb);
            novaDieta.getTipo().setProt(prot);
            novaDieta.getTipo().setGord(gord);
            
        } else if (tipo == 3)
        {
            novaDieta.getTipo().setNome("low carb");
            double carb = novaDieta.getCalorias()*0.3;
            double prot = novaDieta.getCalorias()*0.5;
            double gord = novaDieta.getCalorias()*0.2;
            novaDieta.getTipo().setCarb(carb);
            novaDieta.getTipo().setProt(prot);
            novaDieta.getTipo().setGord(gord);
            
        } else if (tipo == 4)
        {
            novaDieta.getTipo().setNome("atleta");
            double prot = novaDieta.getAval().getPeso()*2*4;
            double gord = novaDieta.getAval().getPeso()*0.8*9;
            double carb = novaDieta.getCalorias() - (prot+gord);
            novaDieta.getTipo().setCarb(carb);
            novaDieta.getTipo().setProt(prot);
            novaDieta.getTipo().setGord(gord);
            
        }
        System.out.println("Sua dieta vai ter " + novaDieta.getTipo().getCarb() + " de calorias de carboidrato" + novaDieta.getTipo().getProt() + "de calorias de proteina" + novaDieta.getTipo().getGord() + "de calorias de gordura");
        return novaDieta;
    }
    
    Preferencias pegarPref (Pessoa pessoa, String tipo, int num, Alimento alim [])
    {
        Preferencias pref = new Preferencias();
       // pref.setTipo(tipo);
        
       // pref.setAlimento(scan.nextInt(num));
       for (Alimento tempAlim : alim)
       {
           if (tempAlim.getId() == num)
           {
               pref.setAlimento(tempAlim);
           }
       }
           
        
        return pref;
    }
    Refeicoes[] quantRef (Dieta dieta) {
        Refeicoes quantRef[] = new Refeicoes [6];
         for (int i = 0; i < 6; i++) {
        quantRef[i] = new Refeicoes();
    }
       if (dieta.getNumRef() == 3) {
           System.out.println("teste");
           quantRef[0].setNomeRef("Café da manhã");
           quantRef[0].setCalorias(dieta.getCalorias()*0.35);
           quantRef[0].setProteína(dieta.getTipo().getProt()*0.35);
           quantRef[0].setCarboidrato(dieta.getTipo().getCarb()*0.35);
           quantRef[0].setGordura(dieta.getTipo().getGord()*0.35);
           
           quantRef[1].setNomeRef("Almoço");
           quantRef[1].setCalorias(dieta.getCalorias()*0.35);
           quantRef[1].setProteína(dieta.getTipo().getProt()*0.35);
           quantRef[1].setCarboidrato(dieta.getTipo().getCarb()*0.35);
           quantRef[1].setGordura(dieta.getTipo().getGord()*0.35);
           
           quantRef[2].setNomeRef("Janta");
           quantRef[2].setCalorias(dieta.getCalorias()*0.3);
           quantRef[2].setProteína(dieta.getTipo().getProt()*0.3);
           quantRef[2].setCarboidrato(dieta.getTipo().getCarb()*0.3);
           quantRef[2].setGordura(dieta.getTipo().getGord()*0.3);
           
       } else if (dieta.getNumRef() == 4)
       {
           System.out.println("teste");
           quantRef[0].setNomeRef("Café da manhã");
           quantRef[0].setCalorias(dieta.getCalorias()*0.3);
           quantRef[0].setProteína(dieta.getTipo().getProt()*0.3);
           quantRef[0].setCarboidrato(dieta.getTipo().getCarb()*0.3);
           quantRef[0].setGordura(dieta.getTipo().getGord()*0.3);
           
           quantRef[1].setNomeRef("Almoço");
           quantRef[1].setCalorias(dieta.getCalorias()*0.3);
           quantRef[1].setProteína(dieta.getTipo().getProt()*0.3);
           quantRef[1].setCarboidrato(dieta.getTipo().getCarb()*0.3);
           quantRef[1].setGordura(dieta.getTipo().getGord()*0.3);
           
           quantRef[2].setNomeRef("lanche");
           quantRef[2].setCalorias(dieta.getCalorias()*0.1);
           quantRef[2].setProteína(dieta.getTipo().getProt()*0.1);
           quantRef[2].setCarboidrato(dieta.getTipo().getCarb()*0.1);
           quantRef[2].setGordura(dieta.getTipo().getGord()*0.1);
           
           quantRef[3].setNomeRef("Janta");
           quantRef[3].setCalorias(dieta.getCalorias()*0.3);
           quantRef[3].setProteína(dieta.getTipo().getProt()*0.3);
           quantRef[3].setCarboidrato(dieta.getTipo().getCarb()*0.3);
           quantRef[3].setGordura(dieta.getTipo().getGord()*0.3);
       } else if (dieta.getNumRef() == 5)
       {
           System.out.println("teste");
           quantRef[0].setNomeRef("Café da manhã");
           quantRef[0].setCalorias(dieta.getCalorias()*0.25);
           quantRef[0].setProteína(dieta.getTipo().getProt()*0.25);
           quantRef[0].setCarboidrato(dieta.getTipo().getCarb()*0.25);
           quantRef[0].setGordura(dieta.getTipo().getGord()*0.25);
           
           quantRef[1].setNomeRef("lanche");
           quantRef[1].setCalorias(dieta.getCalorias()*0.1);
           quantRef[1].setProteína(dieta.getTipo().getProt()*0.1);
           quantRef[1].setCarboidrato(dieta.getTipo().getCarb()*0.1);
           quantRef[1].setGordura(dieta.getTipo().getGord()*0.1);
           
           quantRef[2].setNomeRef("almoço");
           quantRef[2].setCalorias(dieta.getCalorias()*0.3);
           quantRef[2].setProteína(dieta.getTipo().getProt()*0.3);
           quantRef[2].setCarboidrato(dieta.getTipo().getCarb()*0.3);
           quantRef[2].setGordura(dieta.getTipo().getGord()*0.3);
           
           quantRef[3].setNomeRef("lanche");
           quantRef[3].setCalorias(dieta.getCalorias()*0.1);
           quantRef[3].setProteína(dieta.getTipo().getProt()*0.1);
           quantRef[3].setCarboidrato(dieta.getTipo().getCarb()*0.1);
           quantRef[3].setGordura(dieta.getTipo().getGord()*0.1);
           
           quantRef[4].setNomeRef("Janta");
           quantRef[4].setCalorias(dieta.getCalorias()*0.25);
           quantRef[4].setProteína(dieta.getTipo().getProt()*0.25);
           quantRef[4].setCarboidrato(dieta.getTipo().getCarb()*0.25);
           quantRef[4].setGordura(dieta.getTipo().getGord()*0.25);
       } else if (dieta.getNumRef() == 6)
       {
           System.out.println("teste");
           quantRef[0].setNomeRef("Café da manhã");
           quantRef[0].setCalorias(dieta.getCalorias()*0.25);
           quantRef[0].setProteína(dieta.getTipo().getProt()*0.25);
           quantRef[0].setCarboidrato(dieta.getTipo().getCarb()*0.25);
           quantRef[0].setGordura(dieta.getTipo().getGord()*0.25);
           
           quantRef[1].setNomeRef("lanche");
           quantRef[1].setCalorias(dieta.getCalorias()*0.08);
           quantRef[1].setProteína(dieta.getTipo().getProt()*0.08);
           quantRef[1].setCarboidrato(dieta.getTipo().getCarb()*0.08);
           quantRef[1].setGordura(dieta.getTipo().getGord()*0.08);
           
           quantRef[2].setNomeRef("almoço");
           quantRef[2].setCalorias(dieta.getCalorias()*0.25);
           quantRef[2].setProteína(dieta.getTipo().getProt()*0.25);
           quantRef[2].setCarboidrato(dieta.getTipo().getCarb()*0.25);
           quantRef[2].setGordura(dieta.getTipo().getGord()*0.25);
           
           quantRef[3].setNomeRef("lanche");
           quantRef[3].setCalorias(dieta.getCalorias()*0.09);
           quantRef[3].setProteína(dieta.getTipo().getProt()*0.09);
           quantRef[3].setCarboidrato(dieta.getTipo().getCarb()*0.09);
           quantRef[3].setGordura(dieta.getTipo().getGord()*0.09);
           
           quantRef[4].setNomeRef("Janta");
           quantRef[4].setCalorias(dieta.getCalorias()*0.25);
           quantRef[4].setProteína(dieta.getTipo().getProt()*0.25);
           quantRef[4].setCarboidrato(dieta.getTipo().getCarb()*0.25);
           quantRef[4].setGordura(dieta.getTipo().getGord()*0.25);
           
           quantRef[5].setNomeRef("ceia");
           quantRef[5].setCalorias(dieta.getCalorias()*0.08);
           quantRef[5].setProteína(dieta.getTipo().getProt()*0.08);
           quantRef[5].setCarboidrato(dieta.getTipo().getCarb()*0.08);
           quantRef[5].setGordura(dieta.getTipo().getGord()*0.08);
       }
        
            
            return quantRef;
    }
    
    
}
