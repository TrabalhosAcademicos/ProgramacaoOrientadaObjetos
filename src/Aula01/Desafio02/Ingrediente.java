/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01.Desafio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jaksciley
 */
public class Ingrediente {
    
    private final List<Produto> produtos = new ArrayList();
    private String tipo;
    private int dosagem;

    public Ingrediente() {
    }
    
    public Ingrediente(String tipo, int dosagem) {
        this.tipo = tipo;
        this.dosagem = dosagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDosagem() {
        return dosagem;
    }

    public void setDosagem(int dosagem) {
        this.dosagem = dosagem;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "produtos=" + produtos + ", tipo=" + tipo + ", dosagem=" + dosagem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.produtos);
        hash = 53 * hash + Objects.hashCode(this.tipo);
        hash = 53 * hash + this.dosagem;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ingrediente other = (Ingrediente) obj;
        if (this.dosagem != other.dosagem) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.produtos, other.produtos)) {
            return false;
        }
        return true;
    }
    
        public void adicionarProduto(Produto produtoNovo){
            produtos.add(produtoNovo);
        }
    
        public void removerProduto(Produto produtoAntigo){
            produtos.remove(produtoAntigo);
        }
    
    
    
}
