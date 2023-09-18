/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;


/**
 *
 * @author taynacardoso
 */
public class AvalFis {
    private int id;
    private Pessoa pessoa;
    private double peso;
    private double altura;
    private double idade;
    private double pescoco;
    private double cintura;
    private double quadril;
    private double atvFis;
    private double abdomem;

     
    
    private double IMC;
    private double TMB;
    private double BF;
    
    private double massaGorda;
    private double massaMagra;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "AvalFis{" + "id=" + id + ", pessoa=" + pessoa + ", peso=" + peso + ", altura=" + altura + ", idade=" + idade + ", pescoco=" + pescoco + ", cintura=" + cintura + ", quadril=" + quadril + ", atvFis=" + atvFis + ", abdomem=" + abdomem + ", IMC=" + IMC + ", TMB=" + TMB + ", BF=" + BF + ", massaGorda=" + massaGorda + ", massaMagra=" + massaMagra + '}';
    }

    public double getPescoco() {
        return pescoco;
    }

    public void setPescoco(double pescoco) {
        this.pescoco = pescoco;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getQuadril() {
        return quadril;
    }

    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }
    public double getAtvFis() {
        return atvFis;
    }

    public void setAtvFis(double atvFis) {
        this.atvFis = atvFis;
    }

    public double getAbdomem() {
        return abdomem;
    }

    public void setAbdomem(double abdomem) {
        this.abdomem = abdomem;
    }
    

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC, double peso, double altura) {
        this.IMC = peso/(altura*altura);
    }

    public double getTMB() {
        return TMB;
    }

    public void setTMB(double TMB, double idade, double peso, double altura, double atvFis, Pessoa pessoa) {
        if (pessoa.getSexo().equals("f"))
        {
          this.TMB = atvFis * (655 + ( (9.6 * peso) + (1.8 * (altura*100)) - (4.7 * idade)  ));
            
        }
        else if (pessoa.getSexo().equals("m")) {
          this.TMB = atvFis * (66 + ( (13.7 * peso) + (5 * (altura*100)) - (6.8 * idade)  ));
        }
    }

    public double getBF() {
        return BF;
    }

    public void setBF(double BF, double altura, double pescoco, double cintura, double abdomem, double quadril, Pessoa pessoa) {
        if (pessoa.getSexo().equals("f"))
        { 
          double x = 0;
          x = cintura + quadril - pescoco;
         this.BF =(163.205*Math.log10(x)) - (97.684 *Math.log10(altura*100))- 78.387;
            
        }
        else if (pessoa.getSexo().equals("m")) {
          this.BF = (86.010*Math.log10 (abdomem-pescoco))-(70.041*Math.log10(altura*100)) + 36.76;
        }
    }

    public double getMassaGorda() {
        return massaGorda;
    }

    public void setMassaGorda(double massaGorda, double BF, double peso) {
        this.massaGorda = peso*BF/ 100;
    }

    public double getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(double massaMagra, double BF, double peso) {
        this.massaMagra = peso*(1-(BF/100));
    }
    
   
    
  
}
