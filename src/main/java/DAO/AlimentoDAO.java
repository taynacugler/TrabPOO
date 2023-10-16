/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import com.mycompany.trabpoo.Bean.Alimento;
import java.util.Scanner;



public class AlimentoDAO {
    public void todosAlim (Alimento[] alim) {
    for (int i = 0; i < alim.length; i++) {
            int num = i + 1;
            System.out.println("" + num + ": " + alim[i].getNome() + " | 100g | " + alim[i].getCal() + " calorias");
           
        }
    }
    public void fonteCarb (Alimento [] alim)
    {
        for (int i = 0; i < alim.length; i++) {
             int num = i + 1;
             if (alim[i].getTipoUsuario().equals("1")) {
            System.out.println("" + num + ": " + alim[i].getNome() + " | 100g | " + alim[i].getCal() + " calorias");
             }
        }
    }
     public void fonteProt (Alimento [] alim)
    {
        for (int i = 0; i < alim.length; i++) {
             int num = i + 1;
             if (alim[i].getTipoUsuario().equals("2")) {
            System.out.println("" + num + ": " + alim[i].getNome() + " | 100g | " + alim[i].getCal() + " calorias");
             }
        }
    }
      public void fonteGord (Alimento [] alim)
    {
        for (int i = 0; i < alim.length; i++) {
             int num = i + 1;
             if (alim[i].getTipoUsuario().equals("3")) {
            System.out.println("" + num + ": " + alim[i].getNome() + " | 100g | " + alim[i].getCal() + " calorias");
             }
        }
    }

    
}

