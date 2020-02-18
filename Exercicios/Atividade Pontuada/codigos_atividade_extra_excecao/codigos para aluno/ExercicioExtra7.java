class MinhaExcecao extends Exception {
  public MinhaExcecao() {}
  public MinhaExcecao(String msg) { 
  		super(msg); 
  }
  public MinhaExcecao(String msg, int x) {  
		super(msg); i = x; 
  }
  
  public int val() { return i; }
  private int i;
}

public class ExercicioExtra7 {
  
  public static void f() throws MinhaExcecao {
    System.out.println("Disparou MinhaExcecao");
    throw new MinhaExcecao();
  }

  public static void main(String[] args) {
    try {
      f();
    } 
    catch(MinhaExcecao e) {
      	System.out.println(e.val());      	
      	e.printStackTrace();
    }
  }
}

