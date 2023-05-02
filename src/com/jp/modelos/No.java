/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.modelos;

import java.util.List;

/**
 *
 * @author aluno
 */
public class No {
    
    private Lista lista = new Lista();
    
    private char letra = ' ';

    public No(char letra, Lista lista) {
        this.letra = letra;
        this.lista = lista;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
}
