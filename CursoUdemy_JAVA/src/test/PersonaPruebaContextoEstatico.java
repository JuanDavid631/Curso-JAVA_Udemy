package test;

import contextoEstatico.Persona;

public class PersonaPruebaContextoEstatico {
  private int contador;

  public static void main(String[] args) {
    Persona persona1 = new Persona("Juan");
    System.out.println("Datos de la persona: " + persona1);
    Persona persona2 = new Persona("Karla");
    System.out.println("Datos de la persona: " + persona2);
    imprimir(persona1);
    imprimir(persona2);
  }

  public static void imprimir(Persona persona) {
    System.out.println("Persona: " + persona);
  }

  public int getContador() {
    imprimir(new Persona("Carlos"));
    return contador;
  }
}
