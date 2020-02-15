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
    private int numConta;
    private List<Cliente> listaCliente = new ArrayList();
    
   public void adicionarCliente(Cliente c){
       listaCliente.add(c);
   }
   
   public Cliente recuperaClientePeloNome(){
   
       return listaCliente.get(0);
   }
    
    public boolean saca(Double valor){
    
        if(verificaTransacao(valor)){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public Conta(double saldo, int numConta) {
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    
    public void depositar(Double valor){
    
        saldo = saldo + valor;
    }
    
    public void transfere(Conta conta, Double valor){
    
        this.saca(valor);
        conta.depositar(valor);
        
    }
    
    private boolean verificaTransacao(Double valor){
        return saldo >= valor;
    }


    
}
