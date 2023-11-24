package pasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {
  public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.nombre = "Juan";
    System.out.println("Nombre del atributo nombre: " + persona1.nombre);
    cambioValor(persona1);
  }

  public static void cambioValor(Persona persona) {
    persona.nombre = "Karla";
    System.out.println("Nombre del atributo nombre: " + persona.nombre);
  }
}
