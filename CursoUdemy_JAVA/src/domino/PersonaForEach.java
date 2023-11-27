package domino;

public class PersonaForEach {
  private String nombre;

  public PersonaForEach(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "PersonaForEach [nombre= " + this.nombre + "]";
  }
}
