/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author alunodev07
 */
public class RecuperarMensagem {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Mensagem msgRecuperada = null;
        File arquivo = new File("Mensagem.obj");
        FileInputStream arquivoEntrada = new FileInputStream(arquivo);                  
        ObjectInputStream ArquivoObjetoEntrada = new ObjectInputStream(arquivoEntrada);
        msgRecuperada = (Mensagem)ArquivoObjetoEntrada.readObject();
        System.out.println(msgRecuperada);
        
    }
    
}
