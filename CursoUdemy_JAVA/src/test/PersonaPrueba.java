package test;

import domino.Persona;

public class PersonaPrueba {
  public static void main(String[] args) {
    domino.Persona persona1 = new Persona("Juan", 5000.00, false);
    persona1.setNombre("Juan Carlos");
    System.out.println("Datos de la persona = " + persona1.getNombre());
  }
}
