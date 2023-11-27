package test;

import domino.PersonaForEach;

public class TestForEach {
  public static void main(String[] args) {
    int edades[] = { 5, 6, 8, 9, 10 };

    // for (int i = 0; i < edades.length; i++) {
    // System.out.println("edad = " + edades[i]);
    // }

    for (int edad : edades) {
      System.out.println("edad = " + edad);
    }

    // var persona = new PersonaForEach("Juan"); // No se puede usar var en un arreglo
    PersonaForEach personas[] = { new PersonaForEach("Juan"), new PersonaForEach("Karla"), new PersonaForEach("Pedro") };
    for (PersonaForEach persona : personas) {
      System.out.println("persona = " + persona);
    }
  }
}