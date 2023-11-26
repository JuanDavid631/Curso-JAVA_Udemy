package test;

import operaciones.Operaciones;

public class testOperaciones {
  public static void main(String[] args) {
    var resultado = Operaciones.sumar(5, 3);
    System.out.println("Resultado = " + resultado);

    var resultado2 = Operaciones.sumar(2.3, 3);
    System.out.println("Resultado = " + resultado2);

    var resultado3 = Operaciones.sumar(3, 5L);
    System.out.println("Resultado = " + resultado3);
  }
}
