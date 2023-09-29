/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import com.mycompany.trabpoo.Bean.Alimento;
import java.util.Scanner;


/**
 *
 * @author taynacardoso
 */
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

     public void gerenciador (Alimento[] alim) {
         int opc;
         Scanner scan = new Scanner(System.in);
         System.out.println("Escolha uma opção:");
         System.out.println("1- Mostrar todos os alimentos");
         System.out.println("2- Mostrar fonte de carboidratos");
         System.out.println("3- Mostrar fonte de proteinas");
         System.out.println("4- Mostrar fonte de gorduras");
         opc = scan.nextInt();
         
         switch (opc) {
             case 1:
                 System.out.println("Mostrando todos os alimentos:");
                 todosAlim(alim);
                 return;
             case 2:
                 System.out.println("Mostrando todas as fontes de carboidratos:");
                 fonteCarb (alim);
                 return;
             case 3:
                 System.out.println("Mostrando todas as fontes de proteinas:");
                 fonteProt(alim);
                 return;
             case 4: 
                 System.out.println("Mostrando todas as fontes de gordura:");
                 fonteGord(alim);
                 return;
             default:
                 System.out.println("Opcao invalida!");
                 
                  
         }
         
         
     }
}

