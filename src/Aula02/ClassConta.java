/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conta;

import Cliente.ClassCliente;
import java.util.HashSet;

/**
 *
 * @author alunodev07
 */
public class ClassConta {
    double saldo;
    HashSet<ClassCliente> donos = new HashSet<>();
    //ClassCliente clientes;
    int numero;

    public ClassConta() {
    }

    public ClassConta(double saldo, int numero) {
        this.saldo = saldo;        
        this.numero = numero;
    }
    
    private boolean verificarTransacao(double valor){               
        return this.saldo - valor >= 0;                    
        }                        
    
    public boolean sacar(double valor){        
        if (verificarTransacao(valor)){
            saldo -= valor;
            return true;
        } else
            return false;                                    
    }
    
    public void depositar(double valor){                
            saldo += valor;            
            System.out.println("Transação Confirmada Com Sucesso");
    }
    
    public void transfere(ClassConta contaDestino,double valor){                
        
        if(verificarTransacao(valor)){
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transação Confirmada Com Sucesso");
        } else {
            System.out.println("Transação Invalida, Não Saldo Suficiente");
        }
    }
    
     public void extrato(){                                       
            System.out.println("Extrato Bancario Saldo: " + this.saldo);
    }
    
    public void adicionarCliente(ClassCliente cliente){                
            this.donos.add(cliente);
    }
    
    /*
    public void removerCliente(ClassCliente cliente){                
        if verificarTransacao(0.01)
                
        this.donos.remove(cliente);
    }
    */
     
}
