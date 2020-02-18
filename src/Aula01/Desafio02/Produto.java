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
public class Produto {
    private final List<Ingrediente> ingredientes = new ArrayList();
    private String oQueEh;

    public Produto() {
    }
    
    public Produto(String oQueEh) {
        this.oQueEh = oQueEh;
    }

    public String getoQueEh() {
        return oQueEh;
    }

    public void setoQueEh(String oQueEh) {
        this.oQueEh = oQueEh;
    }

    @Override
    public String toString() {
        return "Produto{" + "ingredientes=" + ingredientes + ", oQueEh=" + oQueEh + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.ingredientes);
        hash = 23 * hash + Objects.hashCode(this.oQueEh);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.oQueEh, other.oQueEh)) {
            return false;
        }
        if (!Objects.equals(this.ingredientes, other.ingredientes)) {
            return false;
        }
        return true;
    }
    
    public void adicionarIngrediente(Ingrediente ingredienteNovo){
       ingredientes.add(ingredienteNovo);
    }
    
    public void removerIngrediente(Ingrediente ingredienteAntigo){
       ingredientes.remove(ingredienteAntigo);
    }
    
}
