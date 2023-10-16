/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;


public class Prato {
    private static int cont;
    private int id;
    private Refeicoes refeição;
    private Alimento fonteProt;
    private Alimento fonteCarb;
    private Alimento fonteGord;
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

    public Alimento getFonteProt() {
        return fonteProt;
    }

    public void setFonteProt(Alimento fonteProt) {
        this.fonteProt = fonteProt;
    }

    public Alimento getFonteCarb() {
        return fonteCarb;
    }

    public void setFonteCarb(Alimento fonteCarb) {
        this.fonteCarb = fonteCarb;
    }

    public Alimento getFonteGord() {
        return fonteGord;
    }

    public void setFonteGord(Alimento fonteGord) {
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
