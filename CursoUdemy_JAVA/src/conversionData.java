import java.util.Scanner;

public class conversionData {
    public static void main(String[] args) {
        var edad = Integer.parseInt("20");
        System.out.println("Edad: " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("Valor PI: " + valorPI);

        // Pedir un valor
        var consola = new Scanner(System.in);
        System.out.print("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad: " + edad);
    }
}
