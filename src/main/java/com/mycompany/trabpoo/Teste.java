/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;

/**
 *
 * @author taynacardoso
 */
public class Teste {

    public static void main(String[] args) {
     //Criando Pessoas        
        Pessoa p1 = new Pessoa();
        p1.nome = "Tayna";
        p1.id = 1;
        p1.sexo = "f";
        p1.login = "tayna";
        p1.senha = "1234";
        System.out.println("nome:" + p1.nome);   
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Silvio";
        p2.id = 2;
        p2.sexo = "m";
        p2.login = "silvio";
        p2.senha = "5678";
        System.out.println("nome:" + p2.nome); 
        
        Pessoa p3 = new Pessoa();
        p3.nome = "Malu";
        p3.id = 3;
        p3.sexo = "f";
        p3.login = "tayna";
        p3.senha = "1256";
        System.out.println("nome:" + p3.nome); 
        
        //Criando Alimentos
        //fontes de carboidratos:
        Alimento arroz = new Alimento();
        arroz.id = 1;
        arroz.nome = "arroz";
        arroz.carb = 28.1;
        arroz.prot = 2.5;
        arroz.gord = 0.2;
        arroz.porcao = 100;
        arroz.cal = arroz.calcularCalorias(arroz.carb, arroz.prot, arroz.gord);
        System.out.println("Calorias de " + arroz.porcao + " gramas de " + arroz.nome +": " + arroz.cal);
        
        Alimento macarrao = new Alimento();
        macarrao.id = 2;
        macarrao.nome = "macarrão";
        macarrao.carb = 77.9;
        macarrao.prot = 10;
        macarrao.gord = 1.3;
        macarrao.porcao = 100;
        macarrao.cal = macarrao.calcularCalorias(macarrao.carb, macarrao.prot, macarrao.gord);
        System.out.println("Calorias de " + macarrao.porcao + " gramas de " + macarrao.nome +": " + macarrao.cal);
        
        
        Alimento pao = new Alimento();
        pao.id = 3;
        pao.nome = "pão francês";
        pao.carb = 58.6;
        pao.prot = 8;
        pao.gord = 3;
        pao.porcao = 100;
        pao.cal = pao.calcularCalorias(pao.carb, pao.prot, pao.gord);
        System.out.println("Calorias de " + pao.porcao + " gramas de " + pao.nome +": " + pao.cal);
       
        Alimento batataDoce = new Alimento();
        batataDoce.id = 4;
        batataDoce.nome = "batata doce";
        batataDoce.carb = 18.4;
        batataDoce.prot = 0.6;
        batataDoce.gord = 0.1;
        batataDoce.porcao = 100;
        batataDoce.cal = batataDoce.calcularCalorias(batataDoce.carb, batataDoce.prot, batataDoce.gord);
        System.out.println("Calorias de " + batataDoce.porcao + " gramas de " + batataDoce.nome +": " + batataDoce.cal);
        
        Alimento batatInglesa = new Alimento();
        batatInglesa.id = 5;
        batatInglesa.nome = "batata inglesa";
        batatInglesa.carb = 11.9;
        batatInglesa.prot = 1.2;
        batatInglesa.gord = 0;
        batatInglesa.porcao = 100;
        batatInglesa.cal = batatInglesa.calcularCalorias(batatInglesa.carb, batatInglesa.prot, batatInglesa.gord);
        System.out.println("Calorias de " + batatInglesa.porcao + " gramas de " + batatInglesa.nome +": " + batatInglesa.cal);
        
        Alimento tapioca = new Alimento();
        tapioca.id = 6;
        tapioca.nome = "tapioca";
        tapioca.carb = 22;
        tapioca.prot = 2;
        tapioca.gord = 3.9;
        tapioca.porcao = 100;
        tapioca.cal = arroz.calcularCalorias(tapioca.carb, tapioca.prot,tapioca.gord);
        System.out.println("Calorias de " + tapioca.porcao + " gramas de " + tapioca.nome +": " + tapioca.cal);
        
        //Aliments fonte de proteina
        
        Alimento peitoFrango = new Alimento();
        peitoFrango.id = 7;
        peitoFrango.nome = "peito de frango";
        peitoFrango.carb = 0;
        peitoFrango.prot = 32;
        peitoFrango.gord = 14;
        peitoFrango.porcao = 100;
        peitoFrango.cal = peitoFrango.calcularCalorias(peitoFrango.carb, peitoFrango.prot,peitoFrango.gord);
        System.out.println("Calorias de " + peitoFrango.porcao + " gramas de " + peitoFrango.nome +": " + peitoFrango.cal);
        
        Alimento patinho = new Alimento();
        patinho.id = 8;
        patinho.nome = "patinho";
        patinho.carb = 0;
        patinho.prot = 35.9;
        patinho.gord = 7.3;
        patinho.porcao = 100;
        patinho.cal = patinho.calcularCalorias(patinho.carb, patinho.prot,patinho.gord);
        System.out.println("Calorias de " + patinho.porcao + " gramas de " + patinho.nome +": " + patinho.cal);
        
        Alimento tilapia = new Alimento();
        tilapia.id = 9;
        tilapia.nome = "tilápia";
        tilapia.carb = 0;
        tilapia.prot = 23;
        tilapia.gord = 2;
        tilapia.porcao = 100;
        tilapia.cal = tilapia.calcularCalorias(tilapia.carb, tilapia.prot,tilapia.gord);
        System.out.println("Calorias de " + tilapia.porcao + " gramas de " + tilapia.nome +": " + tilapia.cal);
        
        Alimento soja = new Alimento();
        soja.id = 10;
        soja.nome = "proteína de soja";
        soja.carb = 8;
        soja.prot = 23;
        soja.gord = 1;
        soja.porcao = 100;
        soja.cal = soja.calcularCalorias(soja.carb, soja.prot,soja.gord);
        System.out.println("Calorias de " + soja.porcao + " gramas de " + soja.nome +": " + soja.cal);
        
        Alimento ovoCozido = new Alimento();
        ovoCozido.id = 11;
        ovoCozido.nome = "ovo cozido";
        ovoCozido.carb = 1.1;
        ovoCozido.prot = 13;
        ovoCozido.gord = 11;
        ovoCozido.porcao = 100;
        ovoCozido.cal = ovoCozido.calcularCalorias(ovoCozido.carb, ovoCozido.prot,ovoCozido.gord);
        System.out.println("Calorias de " + ovoCozido.porcao + " gramas de " + ovoCozido.nome +": " + ovoCozido.cal);
        
        //alimentos fonte de gordura
        Alimento abacate = new Alimento();
        abacate.id = 12;
        abacate.nome = "abacate";
        abacate.carb = 6;
        abacate.prot = 1.2;
        abacate.gord = 8.4;
        abacate.porcao = 100;
        abacate.cal = abacate.calcularCalorias(abacate.carb,abacate.prot,abacate.gord);
        System.out.println("Calorias de " + abacate.porcao + " gramas de " + abacate.nome +": " + abacate.cal);
        
        Alimento pastaAmendoim = new Alimento();
        pastaAmendoim.id = 13;
        pastaAmendoim.nome = "pasta de amendoim";
        pastaAmendoim.carb = 20;
        pastaAmendoim.prot = 25;
        pastaAmendoim.gord = 50;
        pastaAmendoim.porcao = 100;
        pastaAmendoim.cal = pastaAmendoim.calcularCalorias(pastaAmendoim.carb, pastaAmendoim.prot,pastaAmendoim.gord);
        System.out.println("Calorias de " + pastaAmendoim.porcao + " gramas de " + pastaAmendoim.nome +": " + pastaAmendoim.cal);
        
        Alimento azeite = new Alimento();
        azeite.id = 14;
        azeite.nome = "azeite";
        azeite.carb = 0;
        azeite.prot = 0;
        azeite.gord = 100;
        azeite.porcao = 100;
        azeite.cal = azeite.calcularCalorias(azeite.carb, azeite.prot,azeite.gord);
        System.out.println("Calorias de " + azeite.porcao + " gramas de " + azeite.nome +": " + azeite.cal);
        
        Alimento manteiga = new Alimento();
        manteiga.id = 15;
        manteiga.nome = "manteiga";
        manteiga.carb = 0.1;
        manteiga.prot = 0.4;
        manteiga.gord = 82.4;
        manteiga.porcao = 100;
        manteiga.cal = manteiga.calcularCalorias(manteiga.carb, manteiga.prot,manteiga.gord);
        System.out.println("Calorias de " + manteiga.porcao + " gramas de " + manteiga.nome +": " + manteiga.cal);
        
        Alimento nozes = new Alimento();
        nozes.id = 16;
        nozes.nome = "nozes";
        nozes.carb = 18.4;
        nozes.prot = 14;
        nozes.gord = 59;
        nozes.porcao = 100;
        nozes.cal = nozes.calcularCalorias(nozes.carb, nozes.prot,nozes.gord);
        System.out.println("Calorias de " + nozes.porcao + " gramas de " + nozes.nome +": " + nozes.cal);
        
        
        Alimento castanhas = new Alimento();
        castanhas.id = 17;
        castanhas.nome = "castanhas";
        castanhas.carb = 29.1;
        castanhas.prot = 18.5;
        castanhas.gord = 46.3;
        castanhas.porcao = 100;
        castanhas.cal = castanhas.calcularCalorias(castanhas.carb, castanhas.prot,castanhas.gord);
        System.out.println("Calorias de " + castanhas.porcao + " gramas de " + castanhas.nome +": " + castanhas.cal);
        
        
        
        
        
        
    }
}
