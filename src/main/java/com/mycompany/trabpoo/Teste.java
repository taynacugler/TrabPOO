/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo;

import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Alimento;
import com.mycompany.trabpoo.Bean.TipoDieta;
import com.mycompany.trabpoo.Bean.AvalFis;
import com.mycompany.trabpoo.Bean.Preferencias;
import com.mycompany.trabpoo.Bean.Dieta;
import com.mycompany.trabpoo.Bean.Refeicoes;
import java.util.Scanner;
/**
 *
 * @author taynacardoso
 */
public class Teste {
   static Alimento alimentos [] = new Alimento [19];
   static TipoDieta tipoDieta [] = new TipoDieta [4];
   static Pessoa usuarios [] = new Pessoa [10];
  

    public static void main(String[] args) {
        MenuPessoa aval = new MenuPessoa();
     //Criando Pessoas        
        Pessoa p1 = new Pessoa();
        p1.setNome("Tayna");
        p1.setId (1);
        p1.setSexo("f");
        p1.setLogin("tayna");
        p1.setSenha("1234");
        System.out.println("nome:" + p1.getNome()); 
        usuarios [0] = p1;
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Silvio");
        p2.setId(2);
        p2.setSexo("m");
        p2.setLogin("silvio");
        p2.setSenha("5678");
        System.out.println("nome:" + p2.getNome());
        usuarios [1] = p2;
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Malu");
        p3.setId(3);
        p3.setSexo("f");
        p3.setLogin("Malu");
        p3.setSenha("1256");
        System.out.println("nome:" + p3.getNome()); 
        usuarios [2] = p3;
        
        //CRIANDO ALIMENTOS
        //fontes de carboidratos:
        Alimento arroz = new Alimento();
        arroz.setId(1);
        arroz.setNome("arroz");
        arroz.setCarb(28.1);
        arroz.setProt(2.5);
        arroz.setGord(0.2);
        arroz.setPorcao(100);
        arroz.setTipoUsuario("1");
        arroz.setCal(arroz.getCal(), arroz.getCarb(), arroz.getProt(), arroz.getGord());
        System.out.println("Calorias de " + arroz.getPorcao() + " gramas de " + arroz.getNome() +": " + arroz.getCal());
        alimentos [0] = arroz;
        
        Alimento macarrao = new Alimento();
        macarrao.setId(2);
        macarrao.setNome("macarrão");
        macarrao.setCarb(77.9);
        macarrao.setProt(10);
        macarrao.setGord(1.3);
        macarrao.setPorcao(100);
        macarrao.setTipoUsuario("1");
        macarrao.setCal(macarrao.getCal(), macarrao.getCarb(), macarrao.getProt(), macarrao.getGord());
        System.out.println("Calorias de " + macarrao.getPorcao() + " gramas de " + macarrao.getNome() +": " + macarrao.getCal());
        alimentos [1] = macarrao;
        
        
        Alimento pao = new Alimento();
        pao.setId(3);
        pao.setNome("pão francês");
        pao.setCarb(58.6);
        pao.setProt(80);
        pao.setGord(3);
        pao.setPorcao(100);
        pao.setTipoUsuario("1");
        pao.setCal(pao.getCal(), pao.getCarb(), pao.getProt(), pao.getGord());
        System.out.println("Calorias de " + pao.getPorcao() + " gramas de " + pao.getNome() +": " + pao.getCal());
        alimentos [2] = pao;
       
        Alimento batataDoce = new Alimento();
        batataDoce.setId(4);
        batataDoce.setNome("batata doce");
        batataDoce.setCarb(18.4);
        batataDoce.setProt(0.6);
        batataDoce.setGord(0.1);
        batataDoce.setPorcao(100);
        batataDoce.setTipoUsuario("1");
        batataDoce.setCal(batataDoce.getCal(), batataDoce.getCarb(), batataDoce.getProt(), batataDoce.getGord());
        System.out.println("Calorias de " + batataDoce.getPorcao() + " gramas de " + batataDoce.getNome() +": " + batataDoce.getCal());
        alimentos [3] = batataDoce;

        
        Alimento batataInglesa = new Alimento();
        batataInglesa.setId(5);
        batataInglesa.setNome("batata inglesa");
        batataInglesa.setCarb(11.9);
        batataInglesa.setProt(1.2);
        batataInglesa.setGord(0);
        batataInglesa.setPorcao(100);
        batataInglesa.setTipoUsuario("1");
        batataInglesa.setCal(batataInglesa.getCal(), batataInglesa.getCarb(), batataInglesa.getProt(), batataInglesa.getGord());
        System.out.println("Calorias de " + batataInglesa.getPorcao() + " gramas de " + batataInglesa.getNome() +": " + batataInglesa.getCal());
        alimentos [4] = batataInglesa;
        
        Alimento tapioca = new Alimento();
        tapioca.setId(6);
        tapioca.setNome("tapioca");
        tapioca.setCarb(22);
        tapioca.setProt(2);
        tapioca.setGord(3.9);
        tapioca.setPorcao(100);
        tapioca.setTipoUsuario("1");
        tapioca.setCal(tapioca.getCal(), tapioca.getCarb(), tapioca.getProt(),tapioca.getGord());
        System.out.println("Calorias de " + tapioca.getPorcao() + " gramas de " + tapioca.getNome() +": " + tapioca.getCal());
        alimentos [5] = tapioca;
        
        Alimento banana = new Alimento();
        banana.setId(7);
        banana.setNome("banana");
        banana.setCarb(23);
        banana.setProt(1.1);
        banana.setGord(0.3);
        banana.setPorcao(100);
        banana.setTipoUsuario("1");
        banana.setCal(banana.getCal(), banana.getCarb(), banana.getProt(),banana.getGord());
        System.out.println("Calorias de " + banana.getPorcao() + " gramas de " + banana.getNome() +": " + banana.getCal());
        alimentos [6] = banana;
        
        //Alimentos fonte de proteina
        
        Alimento peitoFrango = new Alimento();
        peitoFrango.setId(8);
        peitoFrango.setNome("peito de frango");
        peitoFrango.setCarb(0);
        peitoFrango.setProt(32);
        peitoFrango.setGord(14);
        peitoFrango.setPorcao(100);
        peitoFrango.setTipoUsuario("2");
        peitoFrango.setCal(peitoFrango.getCal(), peitoFrango.getCarb(), peitoFrango.getProt(),peitoFrango.getGord());
        System.out.println("Calorias de " + peitoFrango.getPorcao() + " gramas de " + peitoFrango.getNome() +": " + peitoFrango.getCal());
        alimentos [7] = peitoFrango;
        
        Alimento patinho = new Alimento();
        patinho.setId(9);
        patinho.setNome("patinho");
        patinho.setCarb(0);
        patinho.setProt(35.9);
        patinho.setGord(7.3);
        patinho.setPorcao(100);
        patinho.setTipoUsuario("2");
        patinho.setCal(patinho.getCal(), patinho.getCarb(), patinho.getProt(),patinho.getGord());
        System.out.println("Calorias de " + patinho.getPorcao() + " gramas de " + patinho.getNome() +": " + patinho.getCal());
        alimentos [8] = patinho ;
        
        Alimento tilapia = new Alimento();
        tilapia.setId(10);
        tilapia.setNome("tilápia");
        tilapia.setCarb(0);
        tilapia.setProt(23);
        tilapia.setGord(2);
        tilapia.setPorcao(100);
        tilapia.setTipoUsuario("2");
        tilapia.setCal(tilapia.getCal(), tilapia.getCarb(), tilapia.getProt(),tilapia.getGord());
        System.out.println("Calorias de " + tilapia.getPorcao() + " gramas de " + tilapia.getNome() +": " + tilapia.getCal());
        alimentos [9] = tilapia;
        
        Alimento soja = new Alimento();
        soja.setId(11);
        soja.setNome("proteína de soja");
        soja.setCarb(8);
        soja.setProt(23);
        soja.setGord(1);
        soja.setPorcao(100);
        soja.setTipoUsuario("2");
        soja.setCal(soja.getCal(), soja.getCarb(), soja.getProt(),soja.getGord());
        System.out.println("Calorias de " + soja.getPorcao() + " gramas de " + soja.getNome() +": " + soja.getCal());
        alimentos [10] = soja;
        
        Alimento ovoCozido = new Alimento();
        ovoCozido.setId(12);
        ovoCozido.setNome("ovo cozido");
        ovoCozido.setCarb(1.1);
        ovoCozido.setProt(13);
        ovoCozido.setGord(11);
        ovoCozido.setPorcao(100);
        ovoCozido.setTipoUsuario("2");
        ovoCozido.setCal(ovoCozido.getCal(), ovoCozido.getCarb(), ovoCozido.getProt(),ovoCozido.getGord());
        System.out.println("Calorias de " + ovoCozido.getPorcao() + " gramas de " + ovoCozido.getNome() +": " + ovoCozido.getCal());
        alimentos [11] = ovoCozido;
        
        Alimento atum = new Alimento();
        atum.setId(13);
        atum.setNome("Atum");
        atum.setCarb(0);
        atum.setProt(23);
        atum.setGord(1);
        atum.setPorcao(100);
        atum.setTipoUsuario("2");
        atum.setCal(atum.getCal(), atum.getCarb(), atum.getProt(),atum.getGord());
        System.out.println("Calorias de " + atum.getPorcao() + " gramas de " + atum.getNome() +": " + atum.getCal());
        alimentos [12] = atum;
        
        //Alimentos fonte de gordura
        Alimento abacate = new Alimento();
        abacate.setId(14);
        abacate.setNome("abacate");
        abacate.setCarb(6);
        abacate.setProt(1.2);
        abacate.setGord(8.4);
        abacate.setPorcao(100);
        abacate.setTipoUsuario("3");
        abacate.setCal(abacate.getCal(), abacate.getCarb(),abacate.getProt(),abacate.getGord());
        System.out.println("Calorias de " + abacate.getPorcao() + " gramas de " + abacate.getNome() +": " + abacate.getCal());
        alimentos [13] = abacate;
        
        Alimento pastaAmendoim = new Alimento();
        pastaAmendoim.setId(15);
        pastaAmendoim.setNome("pasta de amendoim");
        pastaAmendoim.setCarb(20);
        pastaAmendoim.setProt(25);
        pastaAmendoim.setGord(50);
        pastaAmendoim.setPorcao(100);
        pastaAmendoim.setTipoUsuario("3");
        pastaAmendoim.setCal(pastaAmendoim.getCal(), pastaAmendoim.getCarb(), pastaAmendoim.getProt(),pastaAmendoim.getGord());
        System.out.println("Calorias de " + pastaAmendoim.getPorcao() + " gramas de " + pastaAmendoim.getNome() +": " + pastaAmendoim.getCal());
        alimentos [14] = pastaAmendoim;
        
        Alimento azeite = new Alimento();
        azeite.setId(16);
        azeite.setNome("azeite");
        azeite.setCarb(0);
        azeite.setProt(0);
        azeite.setGord(100);
        azeite.setPorcao(100);
        azeite.setTipoUsuario("3");
        azeite.setCal(azeite.getCal(), azeite.getCarb(), azeite.getProt(),azeite.getGord());
        System.out.println("Calorias de " + azeite.getPorcao() + " gramas de " + azeite.getNome() +": " + azeite.getCal());
        alimentos [15] = azeite;
        
        Alimento manteiga = new Alimento();
        manteiga.setId(17);
        manteiga.setNome("manteiga");
        manteiga.setCarb(0.1);
        manteiga.setProt(0.4);
        manteiga.setGord(82.4);
        manteiga.setPorcao(100);
        manteiga.setTipoUsuario("3");
        manteiga.setCal(manteiga.getCal(), manteiga.getCarb(), manteiga.getProt(),manteiga.getGord());
        System.out.println("Calorias de " + manteiga.getPorcao() + " gramas de " + manteiga.getNome() +": " + manteiga.getCal());
        alimentos [16] = manteiga;
        
        Alimento nozes = new Alimento();
        nozes.setId(18);
        nozes.setNome("nozes");
        nozes.setCarb(18.4);
        nozes.setProt(14);
        nozes.setGord(59);
        nozes.setPorcao(100);
        nozes.setTipoUsuario("3");
        nozes.setCal(nozes.getCal(), nozes.getCarb(), nozes.getProt(),nozes.getGord());
        System.out.println("Calorias de " + nozes.getPorcao() + " gramas de " + nozes.getNome() +": " + nozes.getCal());
        alimentos [17] = nozes;
        
        Alimento castanhas = new Alimento();
        castanhas.setId(19);
        castanhas.setNome("castanhas");
        castanhas.setCarb(29.1);
        castanhas.setProt(18.5);
        castanhas.setGord(46.3);
        castanhas.setPorcao(100);
        castanhas.setTipoUsuario("3");
        castanhas.setCal(castanhas.getCal(), castanhas.getCarb(), castanhas.getProt(),castanhas.getGord());
        System.out.println("Calorias de " + castanhas.getPorcao() + " gramas de " + castanhas.getNome() +": " + castanhas.getCal());
        alimentos [18] = castanhas;
        
        //CRIAR TIPOS DE DIETA
//        TipoDieta equilibrada = new TipoDieta();
//        equilibrada.setId(1);
//        equilibrada.setNome("equilibrada");
//        equilibrada.setCarb(40);
//        equilibrada.setProt(30);
//        equilibrada.setGord(30);
//        tipoDieta [0] = equilibrada;
//        
//        TipoDieta lowcarb = new TipoDieta();
//        lowcarb.setId(2);
//        lowcarb.setNome("low carb");
//        lowcarb.setCarb(30);
//        lowcarb.setProt(50);
//        lowcarb.setGord(20);
//        tipoDieta [1] = lowcarb;
//        
//        TipoDieta cetogenica = new TipoDieta();
//        cetogenica.setId(3);
//        cetogenica.setNome("cetogênica");
//        cetogenica.setCarb(15);
//        cetogenica.setProt(15);
//        cetogenica.setGord(70);
//        tipoDieta [2] = cetogenica;
//        
//        
//        //calcular depois o carb, proteina e gordura baseado no peso do atleta.
//        TipoDieta atleta = new TipoDieta();
//        atleta.setId(4);
//        atleta.setNome("atleta");
//        //atleta.setProt();
//        tipoDieta [3] = atleta;
        



        AvalFis novaAval = new AvalFis();
        Dieta dieta = new Dieta();
        novaAval = aval.cadAval(p2);
        dieta = aval.novaDieta(p2, novaAval);
        
        //num de refeições 
        
       


//pegar preferencias 
       Preferencias preferencia [] = new Preferencias [10];
       //carboidratos
        for (int i = 0; i < alimentos.length; i++) {
             int num = i + 1;
             if (alimentos[i].getTipoUsuario().equals("1")) {
            System.out.println("" + num + ": " + alimentos[i].getNome());
             }
        }
        for (int x = 0; x < 3; x++)
        {
           
            int alimento = 0;
            while (alimento<1 || alimento>7) {
              System.out.println("Escolha 3 fontes de carboidratos para sua dieta");
              Scanner scan = new Scanner(System.in);
             alimento = scan.nextInt();
            }
             preferencia[x] = aval.pegarPref(p3, "1", alimento, alimentos);
             
        }
        //proteinas
             for (int i = 0; i < alimentos.length; i++) {
             int num = i + 1;
             if (alimentos[i].getTipoUsuario().equals("2")) {
            System.out.println("" + num + ": " + alimentos[i].getNome());
             }
        }
        for (int x = 0; x < 3; x++)
        {
            
            int alimento = 0;
             while (alimento<8 || alimento>13) {
             System.out.println("Escolha 3 fontes de proteinas para sua dieta");
             Scanner scan = new Scanner(System.in);
             alimento = scan.nextInt();
             }
             preferencia[x+3] = aval.pegarPref(p3, "2", alimento, alimentos);
             
        } 
        for (int i = 0; i < alimentos.length; i++) {
             int num = i + 1;
             if (alimentos[i].getTipoUsuario().equals("3")) {
            System.out.println("" + num + ": " + alimentos[i].getNome());
             }
        }
        for (int x = 0; x < 3; x++)
        {
            
            int alimento = 0;
            
            while (alimento<14 || alimento>19) 
            {
             System.out.println("Escolha 3 fontes de gordura para sua dieta");
             Scanner scan = new Scanner(System.in);
             alimento = scan.nextInt();
            }
             preferencia[x+6] = aval.pegarPref(p3, "3", alimento, alimentos);
             
        } 
        for (Preferencias pref : preferencia) {
             if (pref != null && pref.getAlimento() != null) {
        System.out.println(pref.getAlimento().getNome());
    }
        }
        
        
        // fim pegar preferencias
        
        int tipoGerar = 0;
        //refeições
        Refeicoes ref[] = aval.quantRef(dieta);
        System.out.println(ref[0].getCarboidrato());
        System.out.println("Como você prefere que sua dieta seja gerada? /n");
        System.out.println("1- Com base nas suas preferencias");
        System.out.println("2- Gerar automaticamente");

        Scanner scan = new Scanner(System.in);
        tipoGerar = scan.nextInt();
       
        
                
//   
}
}


