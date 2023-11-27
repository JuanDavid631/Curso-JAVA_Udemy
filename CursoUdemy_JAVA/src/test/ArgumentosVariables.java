package test;

public class ArgumentosVariables {
  public static void main(String[] args) {
    imprimirNumeros(3, 4, 5);
    imprimirNumeros(1, 2);
    variosParametros("Juan", 1, 2, 3, 4, 5);
  }

  private static void variosParametros(String nombre, int... numeros) {
    System.out.println("Nombre: " + nombre);
    imprimirNumeros(numeros);
  }

  private static void imprimirNumeros(int... numeros) { // Argumentos variables
    int contador = 0;
    for (contador = 0; contador < numeros.length; contador++) {
      System.out.println("Elemento: " + numeros[contador]);
    }
  }
}
