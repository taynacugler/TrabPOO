/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;
import java.time.LocalDateTime;



public class Dieta {
    private static int cont;
    private int id;
    private Pessoa pessoa;
    private AvalFis aval;
    private TipoDieta tipo;
    private int objetivo;
    private double calorias;
    private int numRef;
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
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public AvalFis getAval() {
        return aval;
    }

    public void setAval(AvalFis aval) {
        this.aval = aval;
    }

    public TipoDieta getTipo() {
        return tipo;
    }

    public void setTipo(TipoDieta tipo) {
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
