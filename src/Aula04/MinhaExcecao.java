/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04_11_02_2020;

/**
 *
 * @author alunodev07
 */
public class MinhaExcecao extends Exception{
    private int x;
    
    public MinhaExcecao() {
    }

    public MinhaExcecao(String message) {
        super(message);
    }

    public MinhaExcecao(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MinhaExcecao{" + "x = " + x + '}';
    }            
}
