/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.modelos;


/**
 *
 * @author Woly
 */
public class Busca {
    
    public static boolean sequencial(String vetor[], String palavra){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i].equals(palavra)) return true;
        }
        
        return false;
    }
    
    public static boolean sequencialLista(Lista lista, String palavra){
        for(int i = 0; i < lista.getTamanho(); i++){
            if(lista.[i].equals(palavra)) return true;
        }
        
        return false;
    }
    
    // String = {"oi", "eae", "uva", "fala", "bala"};
    
    public static boolean binaria(String vetor[], String palavra, int inicio, int fim){
        if(inicio > fim) return false;
        
        int meio = (inicio + fim)/2;
        
        if(vetor[meio].equals(palavra)) return true;
        
        if(palavra.length() < vetor[meio].length()) return binaria(vetor, palavra, inicio, meio - 1);
        
        if(palavra.length() == vetor[meio].length()){
            int cont = 1;
            
            try {
                while(vetor[meio - cont].length() == palavra.length() && !vetor[meio - cont].equals(palavra)){
                    cont++;
                }
            } catch (Exception e) {}
            
            if(vetor[meio - cont].equals(palavra)) return true;
            
            cont = 1;
            
            try {
                while(vetor[meio + cont].length() == palavra.length() && !vetor[meio + cont].equals(palavra)){
                    cont++;
                }
            } catch (Exception e) {}
            
            if(vetor[meio + cont].equals(palavra)) return true;
            
            return false;
        }
        
        return binaria(vetor, palavra, meio + 1, fim);
    }
}