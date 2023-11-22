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

    // Operadores de igualdad y relacionales
    System.out.println("\n--- Igualdad y relacionales ---");
    var number11 = 153;
    var number12 = 21;
    var number13 = (number11 == number12);
    System.out.println("Igualdad: " + number13);
    number13 = (number11 != number12);
    System.out.println("Diferencia: " + number13);
    number13 = (number11 > number12);
    System.out.println("Mayor que: " + number13);
    number13 = (number11 < number12);
    System.out.println("Menor que: " + number13);
    number13 = (number11 >= number12);
    System.out.println("Mayor o igual que: " + number13);
    number13 = (number11 <= number12);
    System.out.println("Menor o igual que: " + number13);

    var cadena = "Hola";
    var cadena2 = "Adios";
    var cadena4 = "Hola";
    var cadena3 = (cadena == cadena2); // Compara la referencia en memoria segun la variable
    System.out.println("\nIgualdad de cadenas: " + cadena3);
    cadena3 = cadena.equals(cadena4); // Compara el contenido de la cadena
    System.out.println("Igualdad de cadenas: " + cadena3);

    // Operadores condicionales
    System.out.println("\n--- Condicionales ---");
    var number14 = (number11 == number12) && (number11 > number12);
    System.out.println("AND: " + number14);
    number14 = (number11 == number12) && (number11 < number12);
    System.out.println("AND: " + number14);
    number14 = (number11 == number12) || (number11 > number12);
    System.out.println("OR: " + number14);
    number14 = (number11 == number12) || (number11 < number12);
    System.out.println("OR: " + number14);

    // Ejercicio Operadores Condicionales
    var vacaciones= false;
    var diaDescanso = true;
    if (vacaciones || diaDescanso) {
      System.out.println("Padre puede asistir al juego del hijo");
    } else {
      System.out.println("El padre esta ocupado");
    }






    // Operador ternario
    System.out.println("\n--- Ternario ---");
    var number15 = (number11 == number12) ? "Es igual" : "No es igual";
    System.out.println("Ternario: " + number15);

    // Operador de asignacion ternario
    System.out.println("\n--- Asignacion ternario ---");
    var number16 = 1;
    var number17 = 2;
    var number18 = (number16 > number17) ? "Es mayor" : "Es menor";
    System.out.println("Asignacion ternario: " + number18);

  }
}
