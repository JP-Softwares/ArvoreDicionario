/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.modelos;

import com.jp.persistencia.DicionarioDao;
import java.io.File;

/**
 *
 * @author Woly
 */
public class Dicionario {
    
    private static File dicionarios[] = new File("./src/com/jp/dicionario").listFiles();

    private String[] vetor = null;
    private long tempoDeResposta_milisegundo = 0;
    private long tempoDeResposta_nanosegundo = 0;
    private boolean achou = false;
    
    public Dicionario(){
        
    }
    
    public Dicionario(String[] vetor){
        this.vetor = vetor;
    }
    
    public Dicionario(String[] vetor, long tempoDeResposta_milisegundo, long tempoDeResposta_nanosegundo){
        this.vetor = vetor;
        this.tempoDeResposta_milisegundo = tempoDeResposta_milisegundo;
        this.tempoDeResposta_nanosegundo = tempoDeResposta_nanosegundo;
    }
    
    public Dicionario(String[] vetor, long tempoDeResposta_milisegundo, long tempoDeResposta_nanosegundo, boolean achou){
        this.vetor = vetor;
        this.tempoDeResposta_milisegundo = tempoDeResposta_milisegundo;
        this.tempoDeResposta_nanosegundo = tempoDeResposta_nanosegundo;
        this.achou = achou;
    }
    
    public static String[] listarIdiomas() {
        String[] idiomas = new String[dicionarios.length];
        
        for(int i = 0; i < idiomas.length; i++){
            idiomas[i] = dicionarios[i].getName().replace(".dic", "");
        }
        
        return idiomas;
    }
    
//    public static void ordenarTXT(File entradaTXT){
//        DicionarioDao.ordenarTXT(entradaTXT);
//    }
//    
//    public static void saidaTXT(File saidaTxt, String[] vetor){
//        DicionarioDao.saidaTXT(saidaTxt, vetor);
//    }

    public String[] getVetor() {
        return vetor;
    }

    public void setVetor(String[] vetor) {
        this.vetor = vetor;
    }

    public long getTempoDeResposta_milisegundo() {
        return tempoDeResposta_milisegundo;
    }

    public void setTempoDeResposta_milisegundo(long tempoDeResposta_milisegundo) {
        this.tempoDeResposta_milisegundo = tempoDeResposta_milisegundo;
    }

    public long getTempoDeResposta_nanosegundo() {
        return tempoDeResposta_nanosegundo;
    }

    public void setTempoDeResposta_nanosegundo(long tempoDeResposta_nanosegundo) {
        this.tempoDeResposta_nanosegundo = tempoDeResposta_nanosegundo;
    }
    
    public boolean isAchou() {
        return achou;
    }

    public void setAchou(boolean achou) {
        this.achou = achou;
    }
    
}
