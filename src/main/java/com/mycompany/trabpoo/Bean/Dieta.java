/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;
import java.util.Scanner;

/**
 *
 * @author taynacardoso
 */
public class Dieta {
    int id;
    Pessoa pessoa;
    AvalFis aval;
    TipoDieta tipo;
    int objetivo;
    double calorias;
    int numRef;
    
    //dataCriacao, dataModificacao. 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
