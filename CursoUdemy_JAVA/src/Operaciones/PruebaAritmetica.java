package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
      Aritmetica aritmetica1 = new Aritmetica(); // Se crea el objeto de tipo Aritmetica y constructor vacio
      aritmetica1.atributo = 3;
      aritmetica1.atributo2 = 2;
      aritmetica1.sumar();

      var resultado = aritmetica1.sumarConRetorno();
      System.out.println("El resultado desde la clase de prueba es: " + resultado);

      resultado = aritmetica1.sumarConArgumentos(5, 8);
      System.out.println("El resultado usando argumentos es: " + resultado);

      System.out.println("Arithmetic1: " + aritmetica1.atributo);
      System.out.println("Arithmetic2: " + aritmetica1.atributo2);

      Aritmetica aritmetica2 = new Aritmetica(5, 8);
      System.out.println("Arithmetic1: " + aritmetica2.atributo);
      System.out.println("Arithmetic2: " + aritmetica2.atributo2);
      miMetodo();

      // Variables locales
      var number = 10;
      var number2 = 5;
    }

    public static void miMetodo() {
      // Variables locales
      var number = 10; // No se puede acceder a esta variable desde el main porque es local a este metodo
      var number2 = 5;
      System.out.println("\nOtro metodo");
    }
}
