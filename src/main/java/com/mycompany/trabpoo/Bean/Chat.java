/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;
import java.time.LocalDateTime;



public class Chat {
    int id;
    private static int cont = 0;
    Pessoa pessoaOrigem;
    Pessoa pessoaDestino;
    String [] mensagem;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Chat() {
        this.id = ++Chat.cont;
        mensagem = new String[30];
        dataCriacao = LocalDateTime.now();
    }
    
    public int getId() {
        return id;
    }

    public Pessoa getPessoaOrigem() {
        return pessoaOrigem;
    }

    public void setPessoaOrigem(Pessoa pessoaOrigem) {
        this.pessoaOrigem = pessoaOrigem;
    }

    public Pessoa getPessoaDestino() {
        return pessoaDestino;
    }

    public void setPessoaDestino(Pessoa pessoaDestino) {
        this.pessoaDestino = pessoaDestino;
    }

    public String[] getMensagem() {
        return mensagem;
    }

    public void setMensagem(String[] mensagem) {
        this.mensagem = mensagem;
    }
    
}
