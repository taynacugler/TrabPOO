/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabpoo.Bean;

/**
 *
 * @author taynacardoso
 */
public class Preferencias {
    private static int cont;
    private int id;
    private Pessoa pessoa;
    private Alimento alimento;
    private int Tipo;
    //dataCriacao, dataModificacao.

    public Preferencias() {
        this.id = ++Preferencias.cont;
    }

    
    public int getId() {
        return id;
    }
    
    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }
}
