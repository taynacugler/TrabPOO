/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabpoo;
import java.util.Scanner;

/**
 *
 * @author taynacardoso
 */
public class TrabPOO {
    public static void main(String[] args) {
       int opcao = 0;
       Scanner scan = new Scanner(System.in);

             while (true) {
            System.out.println("Menu Inicial");
            System.out.println("Para fazer login, digite 1");
            System.out.println("Para fazer cadastro, digite 2");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu fazer login.");
                    return;

                case 2:
                    System.out.println("Você escolheu fazer cadastro.");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
}
}
}
