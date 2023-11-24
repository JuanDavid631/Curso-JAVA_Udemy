package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
      Aritmetica aritmetica1 = new Aritmetica();
      aritmetica1.atributo = 3;
      aritmetica1.atributo2 = 2;
      aritmetica1.sumar();

      var resultado = aritmetica1.sumarConRetorno();
      System.out.println("El resultado desde la clase de prueba es: " + resultado);

      resultado = aritmetica1.sumarConArgumentos(5, 8);
      System.out.println("El resultado usando argumentos es: " + resultado);
    }
}
