import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        System.out.print("Escribe tu nombre: ");
    Scanner consola = new Scanner(System.in);
    var usuario = consola.nextLine();
    System.out.println("Usuario ingresado es: " + usuario);
    System.out.print("Ingresa tu profesión: ");
    var profesion = consola.nextLine();
    System.out.println("Resultado " + profesion + " " + usuario);

    // EJERCICIO
    System.out.print("Proporciona el titulo: ");
    Scanner dataUsuario = new Scanner(System.in);
    var titulo = dataUsuario.nextLine();
    System.out.print("Proporciona el autor: ");
    var autor = dataUsuario.nextLine();
    System.out.println("El libro " + titulo + " fue escrito por " + autor);
    }
}