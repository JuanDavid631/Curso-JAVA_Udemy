package test;

import domino.PersonaFinal;

public class testFinal {
  public static void main(String[] args) {
    final int miVariable = 10;
    System.out.println("miVariable = " + miVariable);
    // miVariable = 5; // Error: No se puede modificar una variable final
    // PersonaFinal.MI_CONSTANTE = 5; // Error: No se puede modificar una variable final
    System.out.println("PersonaFinal.MI_CONSTANTE = " + PersonaFinal.MI_CONSTANTE);

    final PersonaFinal persona1 = new PersonaFinal();
    // persona1 = new PersonaFinal(); // Error: No se puede modificar una variable final
    persona1.setNombre("Juan");
    System.out.println("Nombre de la persona = " + persona1.getNombre());
    persona1.setNombre("Carlos");
    System.out.println("Nombre de la persona = " + persona1.getNombre());
  }
}
