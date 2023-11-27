package test;

import domino.PersonaBloquesCodigo;

public class TestBloquesInicializacion {
  public static void main(String[] args) {
    PersonaBloquesCodigo persona1 = new PersonaBloquesCodigo();
    System.out.println("Data en memoria = " + persona1);
    System.out.println("IdPersona = " + persona1.getIdPersona());
    PersonaBloquesCodigo persona2 = new PersonaBloquesCodigo();
    System.out.println("\nData en memoria = " + persona2);
    System.out.println("IdPersona = " + persona2.getIdPersona());
  }
}