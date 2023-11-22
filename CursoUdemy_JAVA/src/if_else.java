import java.util.Scanner;

public class if_else {
  public static void main(String[] args) {
    var condicion = true;
    if (condicion) {
      System.out.println("Condicion verdadera");
    } else {
      System.out.println("Condicion falsa");
    }

    // Ejercicio IF - ELSE
    var number = 2;
    var numeroTexto = "Numero desconocido";
    if (number == 1) {
      numeroTexto = "Numero uno";
    } else if (number == 2) {
      numeroTexto = "Numero dos";
    } else if (number == 3) {
      numeroTexto = "Numero tres";
    } else if (number == 4) {
      numeroTexto = "Numero cuatro";
    } else {
      numeroTexto = "Numero no encontrado";
    }

    // Ejercicio estaciones del año
    Scanner estacion = new Scanner(System.in);
    System.out.println("Ingrese el mes del año para conocer la estación: ");
    var mes = estacion.nextInt();
    var estacionTexto = "Estacion desconocida";
    if (mes == 1 || mes == 2 || mes == 12) {
      estacionTexto = "Invierno";
    } else if (mes == 3 || mes == 4 || mes == 5) {
      estacionTexto = "Primavera";
    } else if (mes == 6 || mes == 7 || mes == 8) {
      estacionTexto = "Verano";
    } else if (mes == 9 || mes == 10 || mes == 11) {
      estacionTexto = "Otoño";
    } else {
      estacionTexto = "Mes incorrecto";
    }
  }
}
