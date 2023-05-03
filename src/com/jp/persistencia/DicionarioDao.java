/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.persistencia;

import com.jp.modelos.Dicionario;
import com.jp.modelos.Lista;
import com.jp.modelos.No;
import com.jp.modelos.TipoDeBusca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import br.com.avltree.AVLTree;

/**
 *
 * @author aluno
 */
public class DicionarioDao implements IDicionarioDao{
    
    File dicionario[] = new File("./src/com/jp/dicionario").listFiles();
    
    public String[] vetor = new String[153683];

    @Override
    public void gerarVetor(){
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
    
    @Override
    public void gerarArvore(){
        No atual= new No();
        AVLTree arvore = new AVLTree();
        atual.setLetra('a');
        System.out.println(atual.getLetra());
        Lista listaAtual = new Lista();
        for(int i = 0; i < vetor.length - 1; i++){
            if(atual.getLetra() != vetor[i].charAt(0)){
                atual.setLista(listaAtual);
                arvore.insert(atual);
                listaAtual = new Lista();
                atual.setLetra(vetor[i].charAt(0));
            }
            listaAtual.insereNoFim(vetor[i]);
        }
        arvore.printAVLTree();
    }
    @Override
    public Dicionario buscar(TipoDeBusca tipoDeBusca, String palavra) {
        return null;
    }
    public String[] getVetorzinho(){
        return vetor;
    }
}
