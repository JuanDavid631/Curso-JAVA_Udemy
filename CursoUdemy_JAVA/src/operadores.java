public class operadores {
  public static void main(String[] args) {
    // Operaciones aritmeticas
    int number = 3, number2 = 2;
    var resultado = number + number2;
    System.out.println("--- Aritmeticas ---");
    System.out.println("Resultado suma: " + resultado);
    resultado = number - number2;
    System.out.println("Resultado resta: " + resultado);
    resultado = number * number2;
    System.out.println("Resultado multiplicacion: " + resultado);
    var resultado2 = 3.3D / number2;
    System.out.println("Resultado division: " + resultado2);
    resultado = number % number2;
    System.out.println("Resultado modulo: " + resultado);

    // Validaciones
    if (number % 2 == 0) {
      System.out.println("Es numero par");
    } else {
      System.out.println("Es numero impar");
    }

    // Operadores de asignacion
    int number3 = 3, number4 = 2;
    int validar = number3 + 5 - number4;
    System.out.println("\n--- Asignacion ---");
    System.out.println("Operaciones varias = " + validar);
    number3 += 3; // number3 = number3 + 3
    System.out.println("Operacion += : " + number3);
    number3 -= 1; // number3 = number3 - 1
    System.out.println("Operacion -= : " + number3);
    number3 *= 2; // number3 = number3 * 2
    System.out.println("Operacion *= : " + number3);
    number3 /= 2; // number3 = number3 / 2
    System.out.println("Operacion /= : " + number3);
    number3 %= 2; // number3 = number3 % 2
    System.out.println("Operacion %= : " + number3);

    // Operadores unarios
    System.out.println("\n--- Unarios ---");
    var number5 = 9;
    var number6 = -number5; // -9
    System.out.println("Cambio de signo: " + number6);
    var number7 = true;
    var number8 = !number7; // false
    System.out.println("Negacion: " + number8);

    // Operadores de incremento y decremento
    System.out.println("\n--- Incremento y decremento ---");
    var number9 = 3;
    var number10 = ++number9; // Pre-incremento simbolo antes de la variable
    System.out.println("Pre-incremento: " + number10);
    number10 = number9++; // Post-incremento simbolo despues de la variable
    System.out.println("Post-incremento: " + number10);
    number10 = --number9; // Pre-decremento simbolo antes de la variable
    System.out.println("Pre-decremento: " + number10);
    number10 = number9--; // Post-decremento simbolo despues de la variable
    System.out.println("Post-decremento: " + number10);
  }
}
