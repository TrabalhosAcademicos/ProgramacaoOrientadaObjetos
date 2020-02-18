public class ExercicioExtra8 {

  class SuperAquecimentoException extends Exception {} 
  public void ligar() {}
  public void mover() throws SuperAquecimentoException {
    String temperatura = "anormal";
    if (temperatura.equals("anormal")) {
      throw new SuperAquecimentoException();
    }
  } 
  public void desligar() {
  		System.out.println("Vou desligar de qualquer jeito");
  }

  public static void main(String[] args) {
    ExercicioExtra8 c = new ExercicioExtra8();
    try {
	      c.ligar();
      	  c.mover();
    } 
    catch(SuperAquecimentoException e) {
 	     System.out.println("vai explodir!!!");
    } 
    finally {
    	  c.desligar();
    }
  }
}

