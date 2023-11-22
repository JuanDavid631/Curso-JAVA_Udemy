import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args) {
      Scanner nota = new Scanner(System.in);
      System.out.println("Ingrese la nota del alumno: ");
      var calificacion = nota.nextInt();
      var notaTexto = "Nota desconocida";
      if (calificacion >= 0 && calificacion < 6) {
        notaTexto = "F";
      } else if (calificacion >= 6 && calificacion < 7) {
        notaTexto = "D";
      } else if (calificacion >= 7 && calificacion < 8) {
        notaTexto = "C";
      } else if (calificacion >= 8 && calificacion < 9) {
        notaTexto = "B";
      } else if (calificacion >= 9 && calificacion <= 10) {
        notaTexto = "A";
      } else {
        notaTexto = "Nota incorrecta";
      }
    }
}
