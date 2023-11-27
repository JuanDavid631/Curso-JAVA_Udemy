package domino;

public class PersonaBloquesCodigo {
  private final int idPersona;
  private static int contadorPersonas;

  static {
    System.out.println("Ejecucion bloque estatico");
    ++PersonaBloquesCodigo.contadorPersonas;
    // idPersona = 10; // No se puede usar this en un contexto estatico
  }

  // Bloque de codigo para inicializar atributos de la clase
  {
    System.out.println("Ejecucion bloque NO estatico");
    // Se puede usar this en un contexto NO estatico
    this.idPersona = PersonaBloquesCodigo.contadorPersonas++;
  }

  public PersonaBloquesCodigo() {
    System.out.println("Ejecucion del constructor");
  }

  public int getIdPersona() {
    return this.idPersona;
  }

  @Override
  public String toString() {
    return "PersonaBloquesCodigo [idPersona= " + this.idPersona + "]";
  }
}