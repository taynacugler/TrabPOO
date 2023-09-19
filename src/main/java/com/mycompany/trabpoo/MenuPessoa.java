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
        
        while (novaDieta.getObjetivo() < 1 || novaDieta.getObjetivo()>3){ 
            
        System.out.println("Qual é seu objetivo? Se for perda peso digite 1, se for manter o peso digite 2, se for ganhar peso digite 3");
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
    Pessoa cadastro (Pessoa usuarios[])
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
//         for (int x= 0; x < usuarios.length(); x++)
//        {
//           if (pessoa.getLogin().equals(usuarios[x].getLogin())
//                   {
//                       System.out.println("Crie um login:");
//                       pessoa.setLogin(scan.nextLine())
//                       
//                   }
//           
//        }
        System.out.println("Crie um senha:");
        pessoa.setSenha(scan.nextLine());
        return pessoa;
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
}
