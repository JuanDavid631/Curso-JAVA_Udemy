package test;

public class AutoUnboxing {
  // Classes envolventes de tipos primitivos
  // byte -> Byte
  // short -> Short
  // int -> Integer
  // long -> Long
  // float -> Float
  // double -> Double
  // boolean -> Boolean
  // char -> Character
  public static void main(String[] args) {
    Integer entero = 10;

    // Auto Unboxing
    System.out.println("Entero int = " + entero);
    System.out.println("Entero String = " + entero.toString());
    System.out.println("Entero double = " + entero.doubleValue());
    System.out.println("Entero boolean = " + entero.byteValue());

    // UnBoxing
    int entero2 = entero;
    System.out.println("Entero2 = " + entero2);
    
  }
}
