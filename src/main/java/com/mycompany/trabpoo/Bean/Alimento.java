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
    int id;
    String nome;
    double carb;
    double prot;
    double gord;
    double cal;
    double porcao;
    String tipoUsuario; //1 = fonte de carb 2= fonte de proteina 3= fonte de gordura
   //String dataCriacao;
    //String dataModificacao;
    double calcularCalorias (double carb, double prot, double gord){
        double calorias = (4*carb)+ (4*prot) + (9*gord);
        return calorias;        
    }
    
}
