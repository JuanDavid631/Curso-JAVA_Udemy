package clases;

public class Persona {
  String nombre;
  String apellido;

  public void desplegarInformacion() {
    System.out.println("\n --- Personas ---");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
  }
}