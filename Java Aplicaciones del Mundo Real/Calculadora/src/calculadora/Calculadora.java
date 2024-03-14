package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            // Construccion del menu
            try {
                var operacion = menu();
                if (operacion >= 1 && operacion <= 4) {
                    // Pedir valores usuario
                    System.out.println("Proporciona valor Numero 1: ");
                    var operando1 = Integer.parseInt(consola.nextLine());
                    System.out.println("Proporciona valor Numero 2: ");
                    var operando2 = Integer.parseInt(consola.nextLine());
                    switch (operacion) {
                        case 1 -> {
                            var sumaFinal = suma(operando1, operando2);
                            System.out.println("Resultado de la suma: " + sumaFinal);
                        }

                        case 2 -> {
                            var restaFinal = resta(operando1, operando2);
                            System.out.println("Resultado de la resta: " + restaFinal);
                        }

                        case 3 -> {
                            var multiplicacionFinal = multiplicacion(operando1, operando2);
                            System.out.println("Resultado de la multiplicacion: " + multiplicacionFinal);
                        }

                        case 4 -> {
                            var divisionFinal = division(operando1, operando2);
                            System.out.println("Resultado de la division: " + divisionFinal);
                        }

                        default -> {
                            System.out.println("Operacion Numero " + operacion + " erronea");
                        }
                    }

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

    public static int menu() {
        Scanner consola = new Scanner(System.in);
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.println("¿Que operacion desea realizar?: ");
        var operacion = Integer.parseInt(consola.nextLine());
        return operacion;
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int division(int numero1, int numero2) {
        return numero1 / numero2;
    }
}