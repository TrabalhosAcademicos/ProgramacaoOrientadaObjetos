/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alunodev07
 */
public class Teclado {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader teclado = new InputStreamReader(System.in);    
        BufferedReader tecladoStream = new BufferedReader(teclado);    
        String textoDigitado; 
        
        while(true){        
            System.out.println("Digite a palavra que deseja imprir: ");       
            textoDigitado = tecladoStream.readLine();
            System.out.println("texto digitado: " + textoDigitado );
            if ("exit".equals(textoDigitado))
                break;                            
        }            
    }       
                    
}
