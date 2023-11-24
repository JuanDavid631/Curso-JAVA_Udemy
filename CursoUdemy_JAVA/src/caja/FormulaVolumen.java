package caja;

public class FormulaVolumen {
  public static void main(String[] args) {
    // Creacion de un objeto
    Volumen caja = new Volumen();
    caja.ancho = 3;
    caja.alto = 2;
    caja.profundo = 6;
    int resultado = caja.calcularVolumen();
    System.out.println("El volumen de la caja es: " + resultado);

    Volumen caja2 = new Volumen(2, 4, 6);
    System.out.println("El volumen de la caja con argumentos es: " + caja2.calcularVolumen());
  }
}