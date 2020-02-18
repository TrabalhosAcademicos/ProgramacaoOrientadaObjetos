public class ExercicioExtra9 { 

  class InfartoException extends Exception {
    public String toString() { return "Urgente!"; }
  }

  class ResfriadoException extends Exception {
    public String toString() { return "Descanse!"; }
  }


  void infarto() throws InfartoException {
    throw new InfartoException ();
  }

  void resfriado() throws ResfriadoException {
    throw new ResfriadoException ();
  }

  public static void main(String[] args) throws Exception {
    ExercicioExtra9 p = new ExercicioExtra9();
    try { 
      p.infarto(); 
    }   
    finally { 
      p.resfriado(); 
    }
  }
}

