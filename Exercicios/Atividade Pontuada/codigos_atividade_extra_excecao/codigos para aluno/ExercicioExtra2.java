public class ExercicioExtra2 {
  public static void main(String[] args) {
    try {
       throw new Exception ("Uma primeira excecao");
    } catch(Exception e) {
      System.out.println("Excecao capturada");
      System.out.println(e);
    }
  }
} 


