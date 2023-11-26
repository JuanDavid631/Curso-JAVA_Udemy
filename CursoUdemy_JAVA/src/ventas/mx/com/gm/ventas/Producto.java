package ventas.mx.com.gm.ventas;

public class Producto {
  private final int idProducto;
  private String nombre;
  private double precio;
  private static int contadorProductos;

  private Producto() {
    this.idProducto = ++Producto.contadorProductos;
  }

  public Producto(String nombre, double precio) {
    this();
    this.nombre = nombre;
    this.precio = precio;
  }

  public int getIdProducto() {
    return this.idProducto;
  }

  public String getNombre() {
    return this.nombre;
  }

  public double getPrecio() {
    return this.precio;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Producto{idProducto=").append(this.idProducto);
    sb.append(", nombre=").append(this.nombre);
    sb.append(", precio=").append(this.precio);
    sb.append('}');
    return sb.toString();
  }
}
