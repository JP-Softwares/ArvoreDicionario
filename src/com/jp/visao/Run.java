/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.visao;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Run {
    
    public static TelaPrincipal telaPrincipal = null;
    
    public static void main(String[] args){
        if(!FlatLightLaf.setup()) JOptionPane.showMessageDialog(null, "Falha ao importar o tema.");
        telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }
}
