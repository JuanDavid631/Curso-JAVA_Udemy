package ventas.mx.com.gm.ventas;

public class Orden {
  private int idOrden;
  private Producto productos[];
  private static int contadorOrdenes;
  private int contadorProductos;
  private static final int MAX_PRODUCTOS = 10;

  public Orden() {
    this.idOrden = ++Orden.contadorOrdenes;
    this.productos = new Producto[Orden.MAX_PRODUCTOS];
  }

  public void agregarProducto(Producto producto) {
    if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
      this.productos[this.contadorProductos++] = producto;
    } else {
      System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
    }
  }

  public double calcularTotal() {
    int contadorFor = 0;
    double total = 0.0D;
    for (contadorFor = 0; contadorFor < this.contadorProductos; contadorFor++) {
      total += this.productos[contadorFor].getPrecio();
    }
    return total;
  }

  public void mostrarOrden() {
    int contadorFor = 0;
    System.out.println("Orden #: " + this.idOrden);
    double totalOrden = this.calcularTotal();
    System.out.println("Total de la orden: $" + totalOrden);
    System.out.println("Productos de la orden: ");
    for (contadorFor = 0; contadorFor < this.contadorProductos; contadorFor++) {
      System.out.println(this.productos[contadorFor]);
    }
  }

  public int getIdOrden() {
    return this.idOrden;
  }

  public void setIdOrden(int idOrden) {
    this.idOrden = idOrden;
  }

  public Producto[] getProductos() {
    return this.productos;
  }

  public void setProductos(Producto[] productos) {
    this.productos = productos;
  }

  public static int getContadorOrdenes() {
    return contadorOrdenes;
  }

  public static void setContadorOrdenes(int contadorOrdenes) {
    Orden.contadorOrdenes = contadorOrdenes;
  }

  public static int getMaxProductos() {
    return MAX_PRODUCTOS;
  }

  public int getContadorProductos() {
    return this.contadorProductos;
  }

  public void setContadorProductos(int contadorProductos) {
    this.contadorProductos = contadorProductos;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Orden{idOrden=").append(this.idOrden);
    sb.append(", productos=").append(this.productos);
    sb.append(", contadorProductos=").append(this.contadorProductos);
    sb.append('}');
    return sb.toString();
  }
}
