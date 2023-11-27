package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
  public static void main(String[] args) {
    System.out.println("Valor 1: " + Dias.LUNES);
    indicarDia(Dias.MARTES);
    
    System.out.println();
    System.out.println("Continente no. 4: " + Continentes.AMERICA);
    System.out.println("Paises en America: " + Continentes.AMERICA.getPaises());

    System.out.println();
    System.out.println("Continente no. 1: " + Continentes.AFRICA);
    System.out.println("Paises en Africa: " + Continentes.AFRICA.getPaises());
  }

  private static void indicarDia(Dias dias) {
    switch (dias) {
      case LUNES:
        System.out.println("Primer dia de la semana");
        break;
      case MARTES:
        System.out.println("Segundo dia de la semana");
        break;
      case MIERCOLES:
        System.out.println("Tercer dia de la semana");
        break;
      case JUEVES:
        System.out.println("Cuarto dia de la semana");
        break;
      case VIERNES:
        System.out.println("Quinto dia de la semana");
        break;
      case SABADO:
        System.out.println("Sexto dia de la semana");
        break;
      case DOMINGO:
        System.out.println("Septimo dia de la semana");
        break;
      default:
        System.out.println("Dia no valido");
        break;
    }
  }
}