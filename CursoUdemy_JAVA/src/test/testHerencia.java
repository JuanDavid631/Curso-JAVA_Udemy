package test;

import herencia.Empleado;
import herencia.Cliente;
import java.util.Date;

public class testHerencia {
  public static void main(String[] args) {
    Empleado empleado1 = new Empleado("Juan", 5000.0);
    System.out.println("Empleado1: " + empleado1);
    
    Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Calle 123");
    System.out.println("Cliente1: " + cliente1);
  }
}