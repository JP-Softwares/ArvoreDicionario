/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.persistencia;

import com.jp.modelos.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import br.com.avltree.AVLTree;
import java.text.Normalizer;

/**
 *
 * @author aluno
 */
public class DicionarioDao implements IDicionarioDao{
    
    File dicionario[] = new File("./src/com/jp/dicionario").listFiles();
    
    String[] vetor = null;
    
    AVLTree arvore = null;
    
    public DicionarioDao(){
        vetor = new String[153683];
        gerarVetor();
    }

    
    private void gerarVetor(){
        try {
            FileReader fr = new FileReader(dicionario[0]);
            BufferedReader br = new BufferedReader(fr);
            
            String linha = "";
            Lista palavras = new Lista();
            int i = 0;
            while((linha = br.readLine()) != null){
                vetor[i] = linha;
                i++; 
            }
            br.close();    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private char normalizarChar(char letra){
        return Character.toLowerCase(Normalizer.normalize(letra + "", Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").charAt(0));
    }
    
    private void gerarArvore(){
        char letra = 'a';
        arvore = new AVLTree();
        Lista listaAtual = new Lista();
        for(int i = 0; i < vetor.length - 1; i++){
            if(normalizarChar(letra) != normalizarChar(vetor[i].charAt(0))){
                No atual= new No();
                atual.setLetra(letra);
                atual.setLista(listaAtual);
                //System.out.println(atual.getLetra());
                arvore.insert(atual);
                listaAtual = new Lista();
                letra = vetor[i].charAt(0);
            }
            listaAtual.insereNoFim(vetor[i]);
            
        }
        arvore.printAVLTree();
        
    }
    @Override
    public Dicionario buscar(TipoDeBusca tipoDeBusca, String palavra) {
        Dicionario dicionario = new Dicionario();
        long milisegundos = System.currentTimeMillis();
        long nanosegundos = System.nanoTime();
        switch(tipoDeBusca) {
            case SEQUENCIAL:
                dicionario.setAchou(Busca.sequencial(vetor, palavra));
                dicionario.setTempoDeResposta_milisegundo(System.currentTimeMillis() - milisegundos);
                dicionario.setTempoDeResposta_milisegundo(System.nanoTime() - nanosegundos);
                break;
            case BINARIA:
                dicionario.setAchou(Busca.binaria(vetor, palavra, 0, vetor.length-1));
                dicionario.setTempoDeResposta_milisegundo(System.currentTimeMillis() - milisegundos);
                dicionario.setTempoDeResposta_milisegundo(System.nanoTime() - nanosegundos);
                break;
            case ARVORE:
                gerarArvore();
                Lista lista = arvore.find(palavra.charAt(0)).key.getLista();
                
                //dicionario.setAchou();
                break;
        }
        return null;
    }
    public String[] getVetorzinho(){
        return vetor;
    }
}
