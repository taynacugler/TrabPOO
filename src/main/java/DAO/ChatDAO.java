/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.trabpoo.Bean.Pessoa;
import com.mycompany.trabpoo.Bean.Chat;

/**
 *
 * @author taynacardoso
 */
public class ChatDAO {
     public int buscarMsgVazio (Pessoa pessoa) {
        for (int y= 0; y < 10; y++)
           {
              if (pessoa.getMensagens()[y] == null)
                      {
                          
                          return y;

                      }
           }
        return -1;

           }
     public int buscarChatVazio (Chat chat) {
         for (int y= 0; y < 10; y++)
           {
              if (chat.getMensagem()[y] == null)
                      {
                          
                          return y;

                      }
           }
        return -1;

     }
     public int lugarOrigem (Pessoa destino, Pessoa origem) {
     for (int num = 0; num< origem.getMensagens().length; num++) {
                    if (origem.getMensagens()[num] != null && origem.getMensagens()[num].getPessoaDestino().getId() == destino.getId()){
                        
                        return num;
                    }
                    
                    
                }
     return -1;
     }
     
     public int lugarDestino (Pessoa destino, Pessoa origem) {
     for (int num = 0; num< destino.getMensagens().length; num++) {
                    if (destino.getMensagens()[num] != null && destino.getMensagens()[num].getPessoaOrigem() == origem) {
                        return num;
                    }
                    
                  
                }
     return -1;  
     }
     
    
     
}
