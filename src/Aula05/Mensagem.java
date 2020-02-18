/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.io.Serializable;

/**
 *
 * @author alunodev07
 */
public class Mensagem implements Serializable{
    private String remetente;
    private String destinatario;

    public Mensagem() {
    }

    public Mensagem(String remetente, String destinatario) {
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return "Mensagem{" + "remetente=" + remetente + ", destinatario=" + destinatario + '}';
    }
    
    
    
    
}
