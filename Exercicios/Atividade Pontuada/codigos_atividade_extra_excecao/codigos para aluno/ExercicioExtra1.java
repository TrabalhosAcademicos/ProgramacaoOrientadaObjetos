public class ExercicioExtra1 {
  public static void main(String[] args) { 
    String s;
    int a, b;
    try {
      s = "testes";
 	  a = Integer.valueOf(s).intValue();
  	  s = "0";
  	  b = Integer.valueOf(s).intValue();
      int resultado = a / b;
    } catch (ArithmeticException e){
  		System.out.println("Divisao por zero");
  		System.out.println(e);
    } catch (NumberFormatException e){    	
  		System.out.println ("Erro na Formatacao ");
  		System.out.println(e);
    } catch(Exception e) {
      System.out.println("Qualquer outra Excecao");
      System.out.println(e);
    }
  }
}

