package test;

import domino.PersonaArreglo;

public class testArreglosObject {
  public static void main(String[] args) {
    PersonaArreglo personas[] = new PersonaArreglo[2];
    int contador = 0;
    personas[0] = new PersonaArreglo("Juan");
    personas[1] = new PersonaArreglo("Karla");
    System.out.println("Datos persona 0 = " + personas[0]);
    System.out.println("Datos persona 1 = " + personas[1]);
    for (contador = 0; contador < personas.length; contador++) {
      System.out.println("Persona " + contador + ": " + personas[contador].getNombre());
    }
  }
}