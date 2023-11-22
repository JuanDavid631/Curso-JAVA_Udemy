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
    }
}
