package test;

import domino.Persona;

public class PersonaPrueba {
  public static void main(String[] args) {
    domino.Persona persona1 = new Persona("Juan", 5000.00, false);
    System.out.println("Datos de la persona: " + persona1.toString());
    persona1.setNombre("Juan Carlos");
    System.out.println("Datos de la persona: " + persona1.getNombre());
    System.out.println("Sueldo de la persona: " + persona1.getSueldo());
    System.out.println("Eliminado: " + persona1.isEliminado());
    System.out.println("Datos de la persona: " + persona1.toString());
  }
}