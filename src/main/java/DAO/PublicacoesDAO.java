/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Pessoa;

/**
 *
 * @author taynacardoso
 */
public class PublicacoesDAO {
    public int buscarPubVazia (Pessoa pessoa) {
        for (int y= 0; y < 10; y++)
           {
              if (pessoa.getPublicacoes()[y] == null)
                      {
                          
                          return y;

                      }
           }
        return -1;

           }
}
