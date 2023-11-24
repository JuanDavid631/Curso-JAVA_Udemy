package pasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {
  public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.nombre = "Juan";
    System.out.println("Nombre del atributo nombre: " + persona1.nombre);
    cambioValor(persona1);
    System.out.println("Nombre del atributo nombre despues de llamar al metodo: " + persona1.nombre);
    persona1 = cambioValorDos(persona1);
    System.out.println("Nombre del atributo nombre despues de llamar al metodo: " + persona1.nombre);
  }

  public static void cambioValor(Persona persona) {
    persona.nombre = "Karla";
  }

  public static Persona cambioValorDos(Persona persona1) {
    persona1.nombre = "Laura";
    return persona1;
  }
}