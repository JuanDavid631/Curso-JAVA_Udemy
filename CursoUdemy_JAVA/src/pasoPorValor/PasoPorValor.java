package pasoPorValor;

public class PasoPorValor {
  public static void main(String[] args) {
    var number = 10;
    System.out.println("Number desde el main: " + number);
    cambioValor(number);
    System.out.println("Number desde el main despues de llamar al metodo: " + number);
  }

  public static void cambioValor(int number) {
    System.out.println("Number desde el metodo llamado = " + number);
    number = 200;
    System.out.println("Number desde el metodo despues de cambiar su valor: " + number);
  }
}
