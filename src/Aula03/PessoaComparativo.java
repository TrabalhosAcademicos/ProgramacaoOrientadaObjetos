/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import Comparable.Pessoa;
import java.util.Comparator;

/**
 *
 * @author alunodev07
 */
public class PessoaComparativo implements Comparator<Pessoa> {

    String ordem = "Nome";

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if ("Nome".equals(ordem)) {
            return o1.getNome().compareTo(o2.getNome());
        } else {
            return o1.getIdade() - o2.getIdade();
        }
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

}
