/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01.Desafio02;

/**
 *
 * @author jaksciley
 */
public class UsaSistema {
    public static void main(String[] args) {
        
        Produto produto = new Produto();
        Ingrediente ingrediente = new Ingrediente();
        
        ingrediente.setTipo("grama");
        ingrediente.setDosagem(500);
        
        produto.setoQueEh("Arroz Branco");
        produto.adicionarIngrediente(ingrediente);
        
        ingrediente.adicionarProduto(produto);
        
        System.out.println(ingrediente.getDosagem());
        
        //System.out.println(produto);
 
        
    }    
}
