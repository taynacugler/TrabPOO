/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Refeicoes;
import com.mycompany.trabpoo.Bean.Dieta;


public class RefeicoesDAO {
    Refeicoes quantRef[] = new Refeicoes [6];
    
    public Refeicoes[] refTres (Dieta dieta) {
        for (int i = 0; i < 6; i++) {
        quantRef[i] = new Refeicoes();
    }
        
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
           
           return quantRef;
    }
    public Refeicoes[] refQuatro (Dieta dieta) {
        for (int i = 0; i < 6; i++) {
        quantRef[i] = new Refeicoes();
    }
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
           return quantRef;
    }
    public Refeicoes[] refCinco (Dieta dieta) {
        for (int i = 0; i < 6; i++) {
        quantRef[i] = new Refeicoes();
    }
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
           return quantRef;
    }
    public Refeicoes[] refSeis (Dieta dieta) {
        for (int i = 0; i < 6; i++) {
        quantRef[i] = new Refeicoes();
    }
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
           return quantRef;
    }
    
    public Refeicoes[] refSetar (Dieta dieta) {
        Refeicoes quantidade[] = new Refeicoes [6];
        int quant = dieta.getNumRef();
        System.out.println(quant);
        if (quant == 3) {
           quantidade = refTres(dieta);
        } else if (quant == 4) {
            quantidade = refQuatro(dieta);
        } else if (quant == 5) {
            quantidade = refCinco(dieta);
        } else if (quant == 6) {
            quantidade = refSeis(dieta);
        }
        return quantidade;
    }
    
    public void mostrarRef (Refeicoes[] refeicoes) {
        for (int i = 0; i < refeicoes.length; i++) {
            if (refeicoes[i].getCalorias() == 0) {
                break;
            } else {
            System.out.println("" + refeicoes[i].getNomeRef() + " vai ter " +refeicoes[i].getCalorias()+ " calorias. " + refeicoes[i].getCarboidrato() + " de carboidrato "+ refeicoes[i].getProteína() + " de proteina "+ refeicoes[i].getGordura() + " de gordura.");
        }
    }
    }

}
