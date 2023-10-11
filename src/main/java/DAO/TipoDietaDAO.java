/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import com.mycompany.trabpoo.Bean.Dieta;
import com.mycompany.trabpoo.Bean.TipoDieta;

/**
 *
 * @author taynacardoso
 */
public class TipoDietaDAO {
    TipoDieta tipo = new TipoDieta();
    
    public Dieta equilibrado(Dieta dieta) {
        dieta.getTipo().setNome("equilibrada");
        double carb = dieta.getCalorias()*0.4;
        double prot = dieta.getCalorias()*0.3;
        double gord = dieta.getCalorias()*0.3;
        dieta.getTipo().setCarb(carb);
        dieta.getTipo().setProt(prot);
        dieta.getTipo().setGord(gord);
        
        return dieta;
    }
    public Dieta cetogenica (Dieta dieta) {
            dieta.getTipo().setNome("cetogenica");
            double carb = dieta.getCalorias()*0.15;
            double prot = dieta.getCalorias()*0.15;
            double gord = dieta.getCalorias()*0.7;
            dieta.getTipo().setCarb(carb);
            dieta.getTipo().setProt(prot);
            dieta.getTipo().setGord(gord);
            
            
        return dieta;
    }
    public Dieta lowCarb(Dieta dieta) {
            dieta.getTipo().setNome("low carb");
            double carb = dieta.getCalorias()*0.3;
            double prot = dieta.getCalorias()*0.5;
            double gord = dieta.getCalorias()*0.2;
            dieta.getTipo().setCarb(carb);
            dieta.getTipo().setProt(prot);
            dieta.getTipo().setGord(gord);
            
            return dieta;
    }
    public Dieta atleta(Dieta dieta) {
            dieta.getTipo().setNome("atleta");
            double prot = dieta.getAval().getPeso()*2*4;
            double gord = dieta.getAval().getPeso()*0.8*9;
            double carb = dieta.getCalorias() - (prot+gord);
            dieta.getTipo().setCarb(carb);
            dieta.getTipo().setProt(prot);
            dieta.getTipo().setGord(gord);
            
            return dieta;
    }
}
