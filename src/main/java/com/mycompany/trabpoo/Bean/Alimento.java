/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;

/**
 *
 * @author taynacardoso
 */
public class Alimento {
    private int id;
    private String nome;
    private double carb;
    private double prot;
    private double gord;
    private double cal;
    private double porcao;
    private String tipoUsuario; //1 = fonte de carb 2= fonte de proteina 3= fonte de gordura
   //String dataCriacao;
    //String dataModificacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCarb() {
        return carb;
    }

    public void setCarb(double carb) {
        this.carb = carb;
    }

    public double getProt() {
        return prot;
    }

    public void setProt(double prot) {
        this.prot = prot;
    }

    public double getGord() {
        return gord;
    }

    public void setGord(double gord) {
        this.gord = gord;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal, double carb, double prot, double gord) {
        this.cal = (4*carb)+ (4*prot) + (9*gord);
    }

    public double getPorcao() {
        return porcao;
    }

    public void setPorcao(double porcao) {
        this.porcao = porcao;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }    
}
