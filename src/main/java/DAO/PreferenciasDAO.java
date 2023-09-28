/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Alimento;
import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Preferencias;
import java.util.Scanner;


/**
 *
 * @author taynacardoso
 */
public class PreferenciasDAO {
     Preferencias pegarPref (Pessoa pessoa, String tipo, int num, Alimento [] alim)
    {
        Preferencias pref = new Preferencias();
       // pref.setTipo(tipo);
        
       // pref.setAlimento(scan.nextInt(num));
       for (Alimento tempAlim : alim)
       {
           if (tempAlim.getId() == num)
           {
               pref.setAlimento(tempAlim);
           }
       }
           
        
        return pref;
    }
    public Preferencias[] preferencias (Alimento [] alimentos, Pessoa [] pessoas, int numArray) {
        Preferencias preferencia [] = new Preferencias [10];
        for (int i = 0; i < 10; i++) {
        preferencia[i] = new Preferencias();
    }
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
             preferencia[x] = pegarPref(pessoas[numArray], "1", alimento, alimentos);
             
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
             preferencia[x+3] = pegarPref(pessoas[numArray], "2", alimento, alimentos);
             
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
             preferencia[x+6] = pegarPref(pessoas[numArray], "3", alimento, alimentos);
             
        } 
        for (Preferencias pref : preferencia) {
             if (pref != null && pref.getAlimento() != null) {
        System.out.println(pref.getAlimento().getNome());
    }
        }
        return preferencia;
    } 
        
        // fim pegar preferencias
    
}
