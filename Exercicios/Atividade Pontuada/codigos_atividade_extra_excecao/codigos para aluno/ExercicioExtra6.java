import java.io.*;
public class ExercicioExtra6 {
  
  public static void main(String[] args) {
    try {
      try { 
         throw new IOException();
      } catch (IOException e) {
          System.out.println("Trata primeiro aqui");
          throw e;
      }
    } catch (IOException e) {
         System.out.println("Continua aqui ");
    }
  }
}

