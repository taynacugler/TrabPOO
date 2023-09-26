/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;

/**
 *
 * @author taynacardoso
 */
public class Prato {
    private static int cont;
    private int id;
    private Refeicoes refeição;
    private AlimRef fonteProt;
    private AlimRef fonteCarb;
    private AlimRef fonteGord;
    private double proteína;
    private double gordura;
    private double carboidratos;

    public Prato() {
        this.id = ++Prato.cont;
    }
    public int getId() {
        return id;
    }
    public Refeicoes getRefeição() {
        return refeição;
    }

    public void setRefeição(Refeicoes refeição) {
        this.refeição = refeição;
    }

    public AlimRef getFonteProt() {
        return fonteProt;
    }

    public void setFonteProt(AlimRef fonteProt) {
        this.fonteProt = fonteProt;
    }

    public AlimRef getFonteCarb() {
        return fonteCarb;
    }

    public void setFonteCarb(AlimRef fonteCarb) {
        this.fonteCarb = fonteCarb;
    }

    public AlimRef getFonteGord() {
        return fonteGord;
    }

    public void setFonteGord(AlimRef fonteGord) {
        this.fonteGord = fonteGord;
    }

    public double getProteína() {
        return proteína;
    }

    public void setProteína(double protProt, double protCarb, double protGord) {
        this.proteína = protProt + protCarb + protGord;
    }

    public double getGordura() {
        return gordura;
    }

    public void setGordura(double gordProt, double gordCarb, double gordGord) {
        this.gordura = gordProt + gordCarb + gordGord;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carbProt, double carbCarb, double carbGord) {
        this.carboidratos = carbProt + carbCarb + carbGord;
    }
    

    
   
}
