/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jp.persistencia;
import com.jp.modelos.TipoDeBusca;
import com.jp.modelos.Dicionario;

/**
 *
 * @author aluno
 */
public interface IDicionarioDao {
    
    Dicionario buscar(TipoDeBusca tipoDeBusca, String palavra);
    
}
