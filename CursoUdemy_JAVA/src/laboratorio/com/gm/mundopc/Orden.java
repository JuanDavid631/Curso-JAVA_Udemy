package laboratorio.com.gm.mundopc;

public class Orden {
  private final int idOrden;
  private Computadora computadoras[];
  private static int contadorOrdenes;
  private static final int MAX_COMPUTADORAS = 10;
  private int contadorComputadoras;

  public Orden() {
    this.idOrden = ++Orden.contadorOrdenes;
    this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
  }

  public void agregarComputadora(Computadora computadora) {
    if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
      this.computadoras[this.contadorComputadoras++] = computadora;
    } else {
      System.out.println("Se ha superado el maximo de computadoras: " + Orden.MAX_COMPUTADORAS);
    }
  }

  public void mostrarOrden() {
    int contador;
    System.out.println("Orden #: " + this.idOrden);
    System.out.println("Computadoras de la orden #: " + this.idOrden + ":");
    for (contador = 0; contador < this.contadorComputadoras; contador++) {
      System.out.println(this.computadoras[contador]);
    }
  }
}