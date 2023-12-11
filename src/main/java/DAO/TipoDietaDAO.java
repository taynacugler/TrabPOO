/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import com.mycompany.trabpoo.Bean.Dieta;
import com.mycompany.trabpoo.Bean.TipoDieta;
import com.mycompany.trabpoo.Bean.AvalFis;


public class TipoDietaDAO {

public TipoDieta equilibrado(Dieta dieta) {
    TipoDieta tipo = new TipoDieta();
    tipo.setNome("equilibrada");
    double carb = 0.4;
    double prot = 0.3;
    double gord = 0.3;
    tipo.setCarb(carb);
    tipo.setProt(prot);
    tipo.setGord(gord);

    return tipo;
}

public TipoDieta cetogenica(Dieta dieta) {
    TipoDieta tipo = new TipoDieta();
    tipo.setNome("cetogenica");
    double carb = 0.15;
    double prot = 0.15;
    double gord = 0.7;
    tipo.setCarb(carb);
    tipo.setProt(prot);
    tipo.setGord(gord);

    return tipo;
}

public TipoDieta lowCarb(Dieta dieta) {
    TipoDieta tipo = new TipoDieta();
    tipo.setNome("low carb");
    double carb = 0.3;
    double prot = 0.5;
    double gord = 0.2;
    tipo.setCarb(carb);
    tipo.setProt(prot);
    tipo.setGord(gord);

    return tipo;
}

public TipoDieta atleta(Dieta dieta, Double peso) {
    TipoDieta tipo = new TipoDieta();
    tipo.setNome("atleta");
    double prot = peso * 2 * 4;
    double gord = peso * 0.8 * 9;
    double carb = dieta.getCalorias() - (prot + gord);
    tipo.setCarb(carb);
    tipo.setProt(prot);
    tipo.setGord(gord);

    return tipo;
}
}
