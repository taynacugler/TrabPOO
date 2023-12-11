/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;
import java.time.LocalDateTime;



public class Chat {
    int id;
    private static int cont = 0;
    int idRemetente;
    int idRecebidas;
    String mensagem;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Chat() {
        this.id = ++Chat.cont;
        dataCriacao = LocalDateTime.now();
    }
    
    public int getId() {
        return id;
    }

    public int getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(int idRemetente) {
        this.idRemetente = idRemetente;
    }

    public int getIdRecebidas() {
        return idRecebidas;
    }

    public void setIdRecebidas(int idRecebidas) {
        this.idRecebidas = idRecebidas;
    }

   


    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
