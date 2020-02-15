/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunodev08
 */
public class Conta {
    private double saldo;
    private int numero;
    private final List<Cliente> listaCliente = new ArrayList();
    
   public void adicionarCliente(Cliente cliente){
       listaCliente.add(cliente);
   }
    
    private boolean verificaTransacao(Double valor){
        return saldo >= valor;
    }

    public Conta(double saldo, int conta) {
        this.saldo = saldo;
        this.numero = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
     public boolean saca(Double valor){
    
        if(verificaTransacao(valor)){
            this.saldo = saldo - valor;
            return true;
        }
        return false;
    }
     
    public void depositar(Double valor){
    
        this.saldo = saldo + valor;
    }
    
    public void transfere(Conta conta, Double valor){
    
        this.saca(valor);
        conta.depositar(valor);
        
    }

    @Override
    public String toString() {
        return "Conta{" + "saldo=" + saldo + ", numero=" + numero + ", listaCliente=" + listaCliente + '}';
    }
    
    


    
}
