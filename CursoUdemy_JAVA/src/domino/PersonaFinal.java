package domino;

public final class PersonaFinal {
  public final static int MI_CONSTANTE = 121;
  private String nombre;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public final void imprimir() {
    System.out.println("Metodo imprimir");
  }
}
