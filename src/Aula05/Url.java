/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author alunodev07
 */
public class Url {
    
    public static void main(String[] args) throws IOException {
        InputStream pagina = new URL("https://www.uvv.br").openStream();
        InputStreamReader paginaUrl = new InputStreamReader(pagina);
        BufferedReader paginaStream = new BufferedReader(paginaUrl);  
                
        String paginaCarregada;
        
        while ((paginaCarregada = paginaStream.readLine()) != null ){
           System.out.println(paginaCarregada);            
        }               
    }              
}
