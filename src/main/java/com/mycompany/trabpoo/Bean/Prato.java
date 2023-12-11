/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;
import java.time.LocalDateTime;



public class Prato {
    private static int cont;
    private int id;
    private int dieta_id;
    private int fonteProt;
    private int fonteCarb;
    private int fonteGord;
    private double porcaoProt;
    private double porcaoGord;
    private double porcaoCarb;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public double getPorcaoProt() {
        return porcaoProt;
    }

    public void setPorcaoProt(double porcaoProt) {
        this.porcaoProt = porcaoProt;
    }

    public double getPorcaoGord() {
        return porcaoGord;
    }

    public void setPorcaoGord(double porcaoGord) {
        this.porcaoGord = porcaoGord;
    }

    public double getPorcaoCarb() {
        return porcaoCarb;
    }

    public void setPorcaoCarb(double porcaoCarb) {
        this.porcaoCarb = porcaoCarb;
    }
    
    

    public Prato() {
        this.id = ++Prato.cont;
        dataCriacao = LocalDateTime.now();
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
    public int getId() {
        return id;
    }

    public int getDieta_id() {
        return dieta_id;
    }

    public void setDieta_id(int dieta_id) {
        this.dieta_id = dieta_id;
    }

  
    public int getFonteProt() {
        return fonteProt;
    }

    public void setFonteProt(int fonteProt) {
        this.fonteProt = fonteProt;
    }

    public int getFonteCarb() {
        return fonteCarb;
    }

    public void setFonteCarb(int fonteCarb) {
        this.fonteCarb = fonteCarb;
    }

    public int getFonteGord() {
        return fonteGord;
    }

    public void setFonteGord(int fonteGord) {
        this.fonteGord = fonteGord;
    }

   
    
   
}
