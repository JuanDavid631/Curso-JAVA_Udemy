import java.util.Scanner;

public class ejercicioUno {
  public static void main(String[] args) {
    System.out.print("Proporciona el nombre: ");
    Scanner data = new Scanner(System.in);
    var nombre = data.nextLine();
    System.out.print("Proporciona el ID: ");
    var id = data.nextInt();
    System.out.print("Proporciona el precio: ");
    var precio = data.nextDouble();
    System.out.print("Escribe true o false si el envio es gratuito: ");
    var envio = data.nextBoolean();
    System.out.println("Tu nombre es: " + nombre);
    System.out.println("Tu ID es: " + id);
    System.out.println("El precio es: $" + precio);
    System.out.println("El envio es gratuito: " + envio);
  }
}
