/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author alunodev07
 */
public class PersistirMensagem {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Mensagem msg = new Mensagem("Eu","Você");
        File arquivo = new File("Mensagem.obj");         
        FileOutputStream arquivoSaida = new FileOutputStream(arquivo);
        ObjectOutputStream ArquivoObjetoSaida = new ObjectOutputStream(arquivoSaida);
        ArquivoObjetoSaida.writeObject(msg);         
    }
    
}
