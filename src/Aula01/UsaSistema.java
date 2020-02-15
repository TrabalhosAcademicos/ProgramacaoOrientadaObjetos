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
        
        Cliente cliente = new Cliente ("Jaksciley","Rua das Oliveiras","111.111.111.11");
               
        Conta conta01 = new Conta(0, 1);
        conta01.adicionarCliente(cliente);
        
        
        System.out.println(cliente);
        System.out.println(conta01);
        
        System.out.println("Saldo atual conta01: " + conta01.getSaldo());
        System.out.println("Deposito de R$ 500");
        conta01.depositar(500.00);
        System.out.println("Saldo atual conta01: " + conta01.getSaldo());
        System.out.println("Saque de R$ 300");
        conta01.saca(300.00);
        System.out.println("Saldo atual conta01: " + conta01.getSaldo());
               
        
        
        
        cliente = new Cliente ("Jeorge","Rua das Candongas","222.222.222.22");
               
        Conta conta02 = new Conta(10000.00, 2);
        conta02.adicionarCliente(cliente);
        
        
        System.out.println(cliente);
        System.out.println(conta02);
        
        System.out.println("Saldo atual conta02: " + conta02.getSaldo());
        System.out.println("Deposito de R$ 1500");
        conta02.depositar(1500.00);
        System.out.println("Saldo atual conta02: " + conta02.getSaldo());
        System.out.println("Saque de R$ 880.00");
        conta02.saca(880.00);
        System.out.println("Saldo atual conta02: " + conta02.getSaldo());
        
        
        
        System.out.println("Transferencia de Saldo R$ 900");
        conta02.transfere (conta01, 900.00);
        System.out.println("Saldo atual conta01: " + conta01.getSaldo());
        System.out.println("Saldo atual conta02: " + conta02.getSaldo());
       
    }
}
