import java.io.*;
import java.util.*;
 
public class ExercicioExtra5 {
  static Random rand = new Random(); 
  static int pRand(int mod) {
     return Math.abs(rand.nextInt()) % mod + 1;
  }

  public static void main(String[] args) throws IOException {
    System.out.println("Primeiro try");
    try {
      primeiro();
    } catch (NullPointerException e){
      System.out.println("Trata primeiro try - Metodo main");
    }
  }

  public static void primeiro() throws IOException, NullPointerException { 
    System.out.println("Segundo try ");
    try {
      segundo();
    } catch (NumberFormatException e) {
         System.out.println("Trata segundo try - Metodo primeiro ");
    }
  }
  
  public static void segundo() throws IOException, NullPointerException { 
    System.out.println("Terceiro try ");
    try {
          int sel = pRand(4);
          System.out.println("Numero randomico gerado:" + sel);
          switch(sel) {
      	  default: 
            case 1: throw new NumberFormatException();
            case 2: throw new EOFException();
            case 3: throw new NullPointerException();    
            case 4: throw new IOException();    
          }
    } catch (EOFException e) {
          System.out.println("Trata terceiro try - Metodo segundo");
    }
  }
}


