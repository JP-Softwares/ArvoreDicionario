/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.persistencia;

import com.jp.modelos.Dicionario;
import com.jp.modelos.No;
import com.jp.modelos.TipoDeBusca;
import java.io.File;

/**
 *
 * @author aluno
 */
public class DicionarioDao implements IDicionarioDao{
    
    File dicionario = new File("./src/com/jp/dicionario/Portuguese(Brazilian).dic");

    
    
    
    @Override
    public Dicionario buscar(TipoDeBusca tipoDeBusca, String palavra) {
        
    }
    
}
