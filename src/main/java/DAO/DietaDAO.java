/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Dieta;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.TipoDieta;
import java.util.Scanner;

/**
 *
 * @author taynacardoso
 */
public class DietaDAO {
    public Dieta novaDieta (Pessoa[] pessoa, AvalFis aval, int numArray)
    {   Dieta novaDieta = new Dieta();
        novaDieta.setPessoa(pessoa[numArray]);
        novaDieta.setAval(aval);
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
}
