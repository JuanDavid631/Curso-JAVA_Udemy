import java.util.Scanner;

public class ejercicioDos {
  public static void main(String[] args) {
    // Area y perimetro de un rectangulo
    Scanner datos = new Scanner(System.in);
    System.out.println("Ingrese el alto del rectangulo: ");
    var height = Integer.parseInt(datos.nextLine());
    System.out.println("Ingrese el ancho del rectangulo: ");
    var width = Integer.parseInt(datos.nextLine());
    System.out.println("Area: " + (width * height));
    System.out.println("Perimeter: " + ((width + height) * 2));

    // Determinar cual es el mayor de dos numeros
    System.out.println("Ingrese el primer numero: ");
    var number1 = Integer.parseInt(datos.nextLine());
    System.out.println("Ingrese el segundo numero: ");
    var number2 = Integer.parseInt(datos.nextLine());
    System.out.println("El numero mayor es: " + (number1 > number2 ? number1 : number2));
  }
}