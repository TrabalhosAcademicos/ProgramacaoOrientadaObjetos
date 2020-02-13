/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alunodev07
 */
public class Pessoa implements Comparable<Pessoa> {

    private int idade;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idade=" + idade + ", nome=" + nome + '}';
    }

//    @Override
//    public int compareTo(Object outraPessoa) {
//        return nome.compareTo(((Pessoa)outraPessoa).nome);
//    }    
    @Override
    public int compareTo(Pessoa o) {
        //return nome.compareTo(o.nome);
        return this.idade - o.idade;
    }
}
