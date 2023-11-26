package test;

import domino.PersonaArreglo;

public class Matrices {
  public static void main(String[] args) {
    int edades[][] = new int[3][2];
    int contador = 0, ren = 0;
    System.out.println("Edades direccion de memoria = " + edades);
    edades[0][0] = 5;
    edades[0][1] = 7;
    edades[1][0] = 80;
    edades[1][1] = 4;
    edades[2][0] = 83;
    edades[2][1] = 232;
    System.out.println("Edades 0-0 = " + edades[0][0]);
    System.out.println("Edades 0-1 = " + edades[0][1]);
    System.out.println("Edades 1-0 = " + edades[1][0]);
    System.out.println("Edades 1-1 = " + edades[1][1]);
    for (contador = 0; contador < edades.length; contador++) {
      for (ren = 0; ren < edades[contador].length; ren++) {
        System.out.println("Edades elemento " + contador + "-" + ren + ": " + edades[contador][ren]);
      }
    }

    String fruString[][] = { { "Naranja", "Limon", "Melon", "Banana" }, { "Fresa", "Zarzamora", "Mora" } };
    imprimir(fruString);

    PersonaArreglo personas[][] = new PersonaArreglo[2][3];
    personas[0][0] = new PersonaArreglo("Juan");
    personas[0][1] = new PersonaArreglo("Karla");
    personas[0][2] = new PersonaArreglo("Pedro");
    personas[1][0] = new PersonaArreglo("Maria");
    personas[1][1] = new PersonaArreglo("Luis");
    personas[1][2] = new PersonaArreglo("Jose");
    imprimir(personas);
  }

  public static void imprimir(Object matriz[][]) {
    for (int contador = 0; contador < matriz.length; contador++) {
      for (int ren = 0; ren < matriz[contador].length; ren++) {
        System.out.println("Elemento " + contador + "-" + ren + ": " + matriz[contador][ren]);
      }
    }
  }
}