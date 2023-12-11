/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;
import java.time.LocalDateTime;



public class Dieta {
    private static int cont;
    private int id;
    private int pessoa_id;
    private int aval_id;
    private int tipo;   
    private int objetivo;
    private double calorias;
    private double calCarb;
    private double calProt;
    private double calGord;
    
    private int numRef;

    public double getCalCarb() {
        return calCarb;
    }

    public void setCalCarb(double calCarb) {
        this.calCarb = calCarb;
    }

    public double getCalProt() {
        return calProt;
    }

    public void setCalProt(double calProt) {
        this.calProt = calProt;
    }

    public double getCalGord() {
        return calGord;
    }

    public void setCalGord(double calGord) {
        this.calGord = calGord;
    }
    private Preferencias[] pref;
    private Refeicoes[] ref;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

   

    public Dieta() {
        this.id = ++Dieta.cont;
        pref = new Preferencias[10];
        ref = new Refeicoes[6];
        dataCriacao = LocalDateTime.now();
    }
     public Preferencias[] getPref() {
        return pref;
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

    public void setPref(Preferencias[] pref) {    
        this.pref = pref;
    }
 public Refeicoes[] getRef() {
        return ref;
    }

    public void setRef(Refeicoes[] ref) {
        this.ref = ref;
    }
    
   
    public int getId() {
        return id;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public int getAval_id() {
        return aval_id;
    }

    public void setAval_id(int aval_id) {
        this.aval_id = aval_id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
   

    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public int getNumRef() {
        return numRef;
    }

    public void setNumRef(int numRef) {
        this.numRef = numRef;
    }

   
    
}
