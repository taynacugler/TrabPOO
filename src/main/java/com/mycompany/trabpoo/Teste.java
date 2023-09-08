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
        
        //CRIANDO ALIMENTOS
        //fontes de carboidratos:
        Alimento arroz = new Alimento();
        arroz.id = 1;
        arroz.nome = "arroz";
        arroz.carb = 28.1;
        arroz.prot = 2.5;
        arroz.gord = 0.2;
        arroz.porcao = 100;
        arroz.tipoUsuario = "1";
        arroz.cal = arroz.calcularCalorias(arroz.carb, arroz.prot, arroz.gord);
        System.out.println("Calorias de " + arroz.porcao + " gramas de " + arroz.nome +": " + arroz.cal);
        
        Alimento macarrao = new Alimento();
        macarrao.id = 2;
        macarrao.nome = "macarrão";
        macarrao.carb = 77.9;
        macarrao.prot = 10;
        macarrao.gord = 1.3;
        macarrao.porcao = 100;
        macarrao.tipoUsuario = "1";
        macarrao.cal = macarrao.calcularCalorias(macarrao.carb, macarrao.prot, macarrao.gord);
        System.out.println("Calorias de " + macarrao.porcao + " gramas de " + macarrao.nome +": " + macarrao.cal);
        
        
        Alimento pao = new Alimento();
        pao.id = 3;
        pao.nome = "pão francês";
        pao.carb = 58.6;
        pao.prot = 8;
        pao.gord = 3;
        pao.porcao = 100;
        pao.tipoUsuario ="1";
        pao.cal = pao.calcularCalorias(pao.carb, pao.prot, pao.gord);
        System.out.println("Calorias de " + pao.porcao + " gramas de " + pao.nome +": " + pao.cal);
       
        Alimento batataDoce = new Alimento();
        batataDoce.id = 4;
        batataDoce.nome = "batata doce";
        batataDoce.carb = 18.4;
        batataDoce.prot = 0.6;
        batataDoce.gord = 0.1;
        batataDoce.porcao = 100;
        batataDoce.tipoUsuario = "1";
        batataDoce.cal = batataDoce.calcularCalorias(batataDoce.carb, batataDoce.prot, batataDoce.gord);
        System.out.println("Calorias de " + batataDoce.porcao + " gramas de " + batataDoce.nome +": " + batataDoce.cal);
        
        Alimento batataInglesa = new Alimento();
        batataInglesa.id = 5;
        batataInglesa.nome = "batata inglesa";
        batataInglesa.carb = 11.9;
        batataInglesa.prot = 1.2;
        batataInglesa.gord = 0;
        batataInglesa.porcao = 100;
        batataInglesa.tipoUsuario = "1";
        batataInglesa.cal = batataInglesa.calcularCalorias(batataInglesa.carb, batataInglesa.prot, batataInglesa.gord);
        System.out.println("Calorias de " + batataInglesa.porcao + " gramas de " + batataInglesa.nome +": " + batataInglesa.cal);
        
        Alimento tapioca = new Alimento();
        tapioca.id = 6;
        tapioca.nome = "tapioca";
        tapioca.carb = 22;
        tapioca.prot = 2;
        tapioca.gord = 3.9;
        tapioca.porcao = 100;
        tapioca.tipoUsuario = "1";
        tapioca.cal = arroz.calcularCalorias(tapioca.carb, tapioca.prot,tapioca.gord);
        System.out.println("Calorias de " + tapioca.porcao + " gramas de " + tapioca.nome +": " + tapioca.cal);
        
        //Alimentos fonte de proteina
        
        Alimento peitoFrango = new Alimento();
        peitoFrango.id = 7;
        peitoFrango.nome = "peito de frango";
        peitoFrango.carb = 0;
        peitoFrango.prot = 32;
        peitoFrango.gord = 14;
        peitoFrango.porcao = 100;
        peitoFrango.tipoUsuario = "2";
        peitoFrango.cal = peitoFrango.calcularCalorias(peitoFrango.carb, peitoFrango.prot,peitoFrango.gord);
        System.out.println("Calorias de " + peitoFrango.porcao + " gramas de " + peitoFrango.nome +": " + peitoFrango.cal);
        
        Alimento patinho = new Alimento();
        patinho.id = 8;
        patinho.nome = "patinho";
        patinho.carb = 0;
        patinho.prot = 35.9;
        patinho.gord = 7.3;
        patinho.porcao = 100;
        patinho.tipoUsuario = "2";
        patinho.cal = patinho.calcularCalorias(patinho.carb, patinho.prot,patinho.gord);
        System.out.println("Calorias de " + patinho.porcao + " gramas de " + patinho.nome +": " + patinho.cal);
        
        Alimento tilapia = new Alimento();
        tilapia.id = 9;
        tilapia.nome = "tilápia";
        tilapia.carb = 0;
        tilapia.prot = 23;
        tilapia.gord = 2;
        tilapia.porcao = 100;
        tilapia.tipoUsuario ="2";
        tilapia.cal = tilapia.calcularCalorias(tilapia.carb, tilapia.prot,tilapia.gord);
        System.out.println("Calorias de " + tilapia.porcao + " gramas de " + tilapia.nome +": " + tilapia.cal);
        
        Alimento soja = new Alimento();
        soja.id = 10;
        soja.nome = "proteína de soja";
        soja.carb = 8;
        soja.prot = 23;
        soja.gord = 1;
        soja.porcao = 100;
        soja.tipoUsuario = "2";
        soja.cal = soja.calcularCalorias(soja.carb, soja.prot,soja.gord);
        System.out.println("Calorias de " + soja.porcao + " gramas de " + soja.nome +": " + soja.cal);
        
        Alimento ovoCozido = new Alimento();
        ovoCozido.id = 11;
        ovoCozido.nome = "ovo cozido";
        ovoCozido.carb = 1.1;
        ovoCozido.prot = 13;
        ovoCozido.gord = 11;
        ovoCozido.porcao = 100;
        ovoCozido.tipoUsuario = "2";
        ovoCozido.cal = ovoCozido.calcularCalorias(ovoCozido.carb, ovoCozido.prot,ovoCozido.gord);
        System.out.println("Calorias de " + ovoCozido.porcao + " gramas de " + ovoCozido.nome +": " + ovoCozido.cal);
        
        //Alimentos fonte de gordura
        Alimento abacate = new Alimento();
        abacate.id = 12;
        abacate.nome = "abacate";
        abacate.carb = 6;
        abacate.prot = 1.2;
        abacate.gord = 8.4;
        abacate.porcao = 100;
        abacate.tipoUsuario = "3";
        abacate.cal = abacate.calcularCalorias(abacate.carb,abacate.prot,abacate.gord);
        System.out.println("Calorias de " + abacate.porcao + " gramas de " + abacate.nome +": " + abacate.cal);
        
        Alimento pastaAmendoim = new Alimento();
        pastaAmendoim.id = 13;
        pastaAmendoim.nome = "pasta de amendoim";
        pastaAmendoim.carb = 20;
        pastaAmendoim.prot = 25;
        pastaAmendoim.gord = 50;
        pastaAmendoim.porcao = 100;
        pastaAmendoim.tipoUsuario = "3";
        pastaAmendoim.cal = pastaAmendoim.calcularCalorias(pastaAmendoim.carb, pastaAmendoim.prot,pastaAmendoim.gord);
        System.out.println("Calorias de " + pastaAmendoim.porcao + " gramas de " + pastaAmendoim.nome +": " + pastaAmendoim.cal);
        
        Alimento azeite = new Alimento();
        azeite.id = 14;
        azeite.nome = "azeite";
        azeite.carb = 0;
        azeite.prot = 0;
        azeite.gord = 100;
        azeite.porcao = 100;
        azeite.tipoUsuario = "3";
        azeite.cal = azeite.calcularCalorias(azeite.carb, azeite.prot,azeite.gord);
        System.out.println("Calorias de " + azeite.porcao + " gramas de " + azeite.nome +": " + azeite.cal);
        
        Alimento manteiga = new Alimento();
        manteiga.id = 15;
        manteiga.nome = "manteiga";
        manteiga.carb = 0.1;
        manteiga.prot = 0.4;
        manteiga.gord = 82.4;
        manteiga.porcao = 100;
        manteiga.tipoUsuario = "3";
        manteiga.cal = manteiga.calcularCalorias(manteiga.carb, manteiga.prot,manteiga.gord);
        System.out.println("Calorias de " + manteiga.porcao + " gramas de " + manteiga.nome +": " + manteiga.cal);
        
        Alimento nozes = new Alimento();
        nozes.id = 16;
        nozes.nome = "nozes";
        nozes.carb = 18.4;
        nozes.prot = 14;
        nozes.gord = 59;
        nozes.porcao = 100;
        nozes.tipoUsuario = "3";
        nozes.cal = nozes.calcularCalorias(nozes.carb, nozes.prot,nozes.gord);
        System.out.println("Calorias de " + nozes.porcao + " gramas de " + nozes.nome +": " + nozes.cal);
        
        
        Alimento castanhas = new Alimento();
        castanhas.id = 17;
        castanhas.nome = "castanhas";
        castanhas.carb = 29.1;
        castanhas.prot = 18.5;
        castanhas.gord = 46.3;
        castanhas.porcao = 100;
        castanhas.tipoUsuario = "3";
        castanhas.cal = castanhas.calcularCalorias(castanhas.carb, castanhas.prot,castanhas.gord);
        System.out.println("Calorias de " + castanhas.porcao + " gramas de " + castanhas.nome +": " + castanhas.cal);
        
        
        //CRIAR TIPOS DE DIETA
        TipoDieta equilibrada = new TipoDieta();
        equilibrada.id = 1;
        equilibrada.nome = "equilibrada";
        equilibrada.carb = 40;
        equilibrada.prot = 30;
        equilibrada.gord = 30;        
        TipoDieta lowcarb = new TipoDieta();
        lowcarb.id = 2;
        lowcarb.nome = "low carb";
        lowcarb.carb = 30;
        lowcarb.prot = 50;
        lowcarb.gord = 20;
        
        TipoDieta cetogenica = new TipoDieta();
        cetogenica.id = 3;
        cetogenica.nome = "cetogênica";
        cetogenica.carb = 15;
        cetogenica.prot = 15;
        cetogenica.gord = 70;
        
        
        //calcular depois o carb, proteina e gordura baseado no peso do atleta.
        TipoDieta atleta = new TipoDieta();
        atleta.id = 4;
        atleta.nome = "atleta";
 
        
        
        
        
        
        
    }
}
