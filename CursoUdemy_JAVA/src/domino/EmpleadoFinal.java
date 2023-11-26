package domino;

/*public class EmpleadoFinal // extends PersonaFinal {
{
// Error: No se puede heredar de una clase final
}*/

public class EmpleadoFinal {
  @Override
  public void imprimir() {
    System.out.println("Metodo imprimir desde clase hija");
  }
}
