public class ciclo {
  public static void main(String[] args) {
    // Ciclo While
    System.out.println("-- Ciclo While --");
    var contador = 0;
    while (contador < 3) {
      System.out.println("Contador = " + contador);
      contador++;
    }

    // Ciclo Do While
    System.out.println("\n-- Ciclo Do While --");
    var contadorDoWhile = 0;
    do {
      System.out.println("Contador = " + contadorDoWhile);
      contadorDoWhile++;
    } while (contadorDoWhile < 3);

    // Ciclo For
    System.out.println("\n-- Ciclo For --");
    var contadorFor = 0;
    for (contadorFor = 0; contadorFor <= 8; contadorFor++) {
      System.out.println("Contador = " + contadorFor);
    }

    // Ciclo For con break
    System.out.println("\n-- Ciclo For con break --");
    var contadorForBreak = 0;
    for (contadorForBreak = 0; contadorForBreak < 3; contadorForBreak++) {
      if (contadorForBreak % 2 == 0) {
        System.out.println("Contador = " + contadorForBreak);
        break;
      }
    }

    // Ciclo For con continue
    System.out.println("\n-- Ciclo For con continue --");
    var contadorForContinue = 0;
    for (contadorForContinue = 0; contadorForContinue < 3; contadorForContinue++) {
      if (contadorForContinue % 2 != 0) {
        continue; // Salta a la siguiente iteración
      }
      System.out.println("Contador = " + contadorForContinue);
    }

    // Ciclo For con etiqueta
    System.out.println("\n-- Ciclo For con etiqueta --");
    var contadorForEtiqueta = 0;
    inicio: 
    for (contadorForEtiqueta = 0; contadorForEtiqueta < 3; contadorForEtiqueta++) {
      if (contadorForEtiqueta % 2 != 0) {
        continue inicio; // Salta a la linea de codigo con la etiqueta
      }
      System.out.println("Contador = " + contadorForEtiqueta);
    }
  }
}
