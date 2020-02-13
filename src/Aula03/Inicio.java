/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execução;

import Comparable.Pessoa;
import Comparator.PessoaComparativo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alunodev07
 */
public class Inicio {

    public static void main(String[] args) {

        List<Pessoa> lp = new ArrayList<Pessoa>();
        lp.add(new Pessoa(30, "José"));
        lp.add(new Pessoa(15, "Maria"));
        lp.add(new Pessoa(3, "Zeus"));

        System.out.println("Antes");
        for (Pessoa elem : lp) {
            System.out.println(elem);
        }

        Collections.sort(lp);

        System.out.println("Depois");
        for (Pessoa elem : lp) {
            System.out.println(elem);
        }

        System.out.println("----------------------------------------");

        System.out.println("Antes");
        for (Pessoa elem : lp) {
            System.out.println(elem);
        }

        Collections.sort(lp, new PessoaComparativo());

        System.out.println("Depois");
        for (Pessoa elem : lp) {
            System.out.println(elem);
        }

        System.out.println("----------------------------------------");

        PessoaComparativo ordem = new PessoaComparativo();

        System.out.println("Antes");
        for (Pessoa elem : lp) {
            System.out.println(elem);
        }
        ordem.setOrdem("Nome");
        Collections.sort(lp, ordem);

        System.out.println("Depois");
        for (Pessoa elem : lp) {
            System.out.println(elem);
        }

    }
}
