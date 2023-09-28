/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Pessoa;
import java.util.Scanner;

/**
 *
 * @author taynacardoso
 */
public class AvalFisDAO {
    public AvalFis cadAval (Pessoa[] pessoas, int numArray)
    {
        Scanner scan = new Scanner(System.in);
        AvalFis novaAval = new AvalFis();
        Pessoa pessoa = new Pessoa();
        pessoa = pessoas[numArray];
        novaAval.setPessoa(pessoa);
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
        
        novaAval.setTMB(novaAval.getTMB(), novaAval.getIdade(), novaAval.getPeso(), novaAval.getAltura(), novaAval.getAtvFis(), pessoas[numArray]);
        System.out.println("sua TMB " + novaAval.getTMB());
        // ifs e elses para avaliar a gordura ideal
        novaAval.setBF(novaAval.getBF(), novaAval.getAltura(), novaAval.getPescoco(), novaAval.getCintura(), novaAval.getAbdomem(), novaAval.getQuadril(), pessoas[numArray]);
        System.out.println("sua gordura corporal é igual a " + novaAval.getBF());
        
        novaAval.setMassaGorda(novaAval.getMassaGorda(), novaAval.getBF(), novaAval.getPeso());
        System.out.println("Sua massa gorda é " + novaAval.getMassaGorda());
        
        novaAval.setMassaMagra(novaAval.getMassaMagra(), novaAval.getBF(), novaAval.getPeso());
        System.out.println("Sua massa magra é " + novaAval.getMassaMagra());
        
        return novaAval;
    }
    

public void registro (AvalFis aval) {
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
}