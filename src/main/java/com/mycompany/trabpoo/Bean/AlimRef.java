/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;


public class AlimRef {
     private static int cont; 
     private int id;
     private Refeicoes refeição;
     private Alimento alimento;
     private double porcao;
     private double proteína;
     private double gordura;
     private double calorias;
     //dataCriacao, dataModificacao.

    public AlimRef() {
        this.id = ++AlimRef.cont;
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

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public double getPorcao() {
        return porcao;
    }

    public void setPorcao(double porcao) {
        this.porcao = porcao;
    }

    public double getProteína() {
        return proteína;
    }

    public void setProteína(double proteína) {
        this.proteína = proteína;
    }

    public double getGordura() {
        return gordura;
    }

    public void setGordura(double gordura) {
        this.gordura = gordura;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
