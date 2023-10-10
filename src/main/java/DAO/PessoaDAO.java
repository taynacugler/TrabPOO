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
public class PessoaDAO {
public int buscarUsuarioVazio (Pessoa usuarios[], Pessoa pessoa) {
    for (int y= 0; y < usuarios.length; y++)
       {
          if (usuarios[y] == null)
                  {
                      usuarios[y] = pessoa;
                      return y;

                  }

       }
    return -1;

       }
public int buscaPorID (int id, Pessoa usuarios[]) {
    for (int y=0; y< usuarios.length; y++){
        if (usuarios[y].getId() == id) {
            return y;
        }
    }
        
            return -1;
        }
    
public Pessoa buscaPorLogin (String login, Pessoa usuarios[]) {
 for (int y=0; y< usuarios.length; y++){
        if (usuarios[y].getLogin().equals(login)) {
            return usuarios[y];
        }
    }
        
            return null;
        }


public int buscarSeguindo (Pessoa pessoa) {

for (int y=0; y< pessoa.getSeguindo().length; y++){
        if (pessoa.getSeguindo()[y] == null) {
            return y;
        }
    }
        
            return -1;
}

public int buscarSeguidores (Pessoa pessoa) {

for (int y=0; y< pessoa.getSeguidores().length; y++){
        if (pessoa.getSeguidores()[y] == null) {
            return y;
        }
    }
        
            return -1;
        

}
public boolean verifSeguindo (Pessoa seguidor, Pessoa seguido) {
     for (int y= 0; y< seguido.getSeguidores().length; y++){
        System.out.println("teste");
        if (seguido.getSeguidores()[y] != null && seguido.getSeguidores()[y].getId() == seguidor.getId()) {
            
        }
    }
        
            return false;
    
}

}




