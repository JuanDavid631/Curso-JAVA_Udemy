import java.util.Scanner;

public class switchClass {
  public static void main(String[] args) {
    var numero = 2;
    var numeroTexto = "Numero desconocido";
    switch (numero) {
      case 1:
        numeroTexto = "Numero uno";
        break;
      case 2:
        numeroTexto = "Numero dos";
        break;
      case 3:
        numeroTexto = "Numero tres";
        break;
      case 4:
        numeroTexto = "Numero cuatro";
        break;
      default:
        numeroTexto = "Numero no encontrado";
    }
    System.out.println("Numero = " + numeroTexto);

    // Ejercicio estaciones del año
    Scanner data = new Scanner(System.in);
    System.out.println("Ingrese el mes del año para conocer la estación: ");
    var mes = data.nextInt();
    var estacion = "Estacion desconocida";
    switch (mes) {
      case 1:
      case 2:
      case 12:
        estacion = "Invierno";
        break;
      case 3:
      case 4:
      case 5:
        estacion = "Primavera";
        break;
      case 6:
      case 7:
      case 8:
        estacion = "Verano";
        break;
      case 9:
      case 10:
      case 11:
        estacion = "Otoño";
        break;
      default:
        estacion = "Mes incorrecto";
    }
    System.out.println("Estacion: " + estacion);
  }
}