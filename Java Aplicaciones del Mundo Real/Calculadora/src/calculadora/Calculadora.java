package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            // Construccion del menu
            menu();
            var operacion = Integer.parseInt(consola.nextLine());
            try {
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta luego ...");
                    break;
                } else {
                    System.out.println("Operacion Numero " + operacion + " erronea");
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error " + e.getMessage());
            }
        }
    }

    private static void menu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.println("¿Que operacion desea realizar?: ");
    }

    public static void suma(Double numero1, Double numero2) {
        System.out.println("Resultado de la suma: " + (numero1 + numero2));
    }

    public static void resta(Double numero1, Double numero2) {
        System.out.println("Resultado de la resta: " + (numero1 - numero2));
    }

    public static void multiplicacion(Double numero1, Double numero2) {
        System.out.println("Resultado de la multiplicacion: " + (numero1 * numero2));
    }

    public static void division(Double numero1, Double numero2) {
        System.out.println("Resultado de la division: " + (numero1 / numero2));
    }

    private static void ejecutarOperacion (int operacion, Scanner consola) {
        // Pedir valores usuario
        System.out.println("Proporciona valor Numero 1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona valor Numero 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        switch (operacion) {
            case 1 -> {
                suma(operando1, operando2);
            }

            case 2 -> {
                resta(operando1, operando2);
            }

            case 3 -> {
                multiplicacion(operando1, operando2);
            }

            case 4 -> {
                division(operando1, operando2);
            }

            default -> {
                System.out.println("Operacion Numero " + operacion + " erronea");
            }
        }
    }
}