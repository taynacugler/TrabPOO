/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;

//import java.text.DateFormat;

/**
 *
 * @author taynacardoso
 */
public class Pessoa {
    private String nome;
    private static int cont = 0;
    private int id;
    private String sexo;
    private String login;
    private String senha;
    private AvalFis[] avaliacoes;
    private Dieta[] dietas;
    private Publicacoes[] publicacoes;
    private Pessoa[] seguindo;
    private Pessoa[] seguidores;
    private Chat[] mensagens;
    
   // DateFormat dataCriacao;
   // DateFormat dataModificacao;

    public Pessoa() {
        avaliacoes = new AvalFis[5];
        dietas = new Dieta[5];
        publicacoes = new Publicacoes[10];
        seguindo = new Pessoa[10];
        seguidores = new Pessoa[10];
        mensagens = new Chat[50];
        this.id = ++Pessoa.cont;
    }

    public Chat[] getMensagens() {
        return mensagens;
    }

    public void setMensagens(Chat[] mensagens) {
        this.mensagens = mensagens;
    }
    
    
    public Pessoa[] getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(Pessoa[] seguindo) {
        this.seguindo = seguindo;
    }

    public Pessoa[] getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Pessoa[] seguidores) {
        this.seguidores = seguidores;
    }

    public Publicacoes[] getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Publicacoes[] publicacoes) {
        this.publicacoes = publicacoes;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public AvalFis[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(AvalFis[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Dieta[] getDietas() {
        return dietas;
    }

    public void setDietas(Dieta[] dietas) {
        this.dietas = dietas;
    }

   
   
}
