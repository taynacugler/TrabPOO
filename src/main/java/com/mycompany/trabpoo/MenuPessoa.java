/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;
import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Pessoa;
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
        System.out.println("Coloque o numero de ativ fisica que você faz:");
        novaAval.setAtvFis(scan.nextDouble());
        System.out.println("Coloque seu pescoço");
        novaAval.setPescoco(scan.nextDouble());
       
        novaAval.setIMC(novaAval.getIMC(), novaAval.getPeso(), novaAval.getAltura());
        System.out.println("Seu IMC " + novaAval.getIMC());
        
        novaAval.setTMB(novaAval.getTMB(), novaAval.getIdade(), novaAval.getPeso(), novaAval.getAltura(), novaAval.getAtvFis(), pessoa);
        System.out.println("sua TMB " + novaAval.getTMB());
        
        novaAval.setBF(novaAval.getBF(), novaAval.getAltura(), novaAval.getPescoco(), novaAval.getCintura(), novaAval.getAbdomem(), novaAval.getQuadril(), pessoa);
        System.out.println("sua gordura corporal é igual a " + novaAval.getBF());
        
        novaAval.setMassaGorda(novaAval.getMassaGorda(), novaAval.getBF(), novaAval.getPeso());
        System.out.println("Sua massa gorda é " + novaAval.getMassaGorda());
        
        novaAval.setMassaMagra(novaAval.getMassaMagra(), novaAval.getBF(), novaAval.getPeso());
        System.out.println("Sua massa magra é " + novaAval.getMassaMagra());
        
        return novaAval;
    }
}
