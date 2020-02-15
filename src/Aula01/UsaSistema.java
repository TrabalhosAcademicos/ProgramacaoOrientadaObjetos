/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

/**
 *
 * @author alunodev08
 */
public class UsaSistema {
    public static void main(String[] args) {
        
        Cliente c = new Cliente ("Teste");
        Conta c1 = new Conta(1000D, 1);
        System.out.println("Saldo atual c1: " + c1.getSaldo());
        c1.depositar(500D);
        System.out.println("Saldo atual c1: " + c1.getSaldo());
        
        Conta c2 = new Conta(0D, 1);
        System.out.println("Saldo atual c2: " + c2.getSaldo());
        c1.transfere (c2, 200D);
        
        System.out.println("Saldo atual c1: " + c1.getSaldo());
        System.out.println("Saldo atual c2: " + c2.getSaldo());
        
        c1.adicionarCliente(c);
        
        Cliente cliRec = c1.recuperaClientePeloNome();
        System.out.println(cliRec.getNome());
        
    }
}
