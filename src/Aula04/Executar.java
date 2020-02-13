/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04_11_02_2020;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunodev07
 */
public class Executar {
    
    private void imprimePar(int numero) throws MinhaExcecao{
        if ((numero % 2) == 0)
            System.out.println( numero + " é par");
        else
            throw new MinhaExcecao(numero);        
    }
    
    public static void main(String[] args) {
        Executar PI = new Executar();
        
        try {
            PI.imprimePar(2);
            PI.imprimePar(1);
        } catch (MinhaExcecao ex) {
            //Logger.getLogger(Executar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
    
}
