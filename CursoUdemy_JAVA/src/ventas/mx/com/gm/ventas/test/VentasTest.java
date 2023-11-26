package ventas.mx.com.gm.ventas.test;

import ventas.mx.com.gm.ventas.Orden;
import ventas.mx.com.gm.ventas.Producto;

public class VentasTest {
  public static void main(String[] args) {
    // Crear varios objetos de tipo Producto
    Producto producto1 = new Producto("Camisa", 50.0D);
    Producto producto2 = new Producto("Pantalon", 100.0D);
    Producto producto3 = new Producto("Corbata", 30.0D);
    Producto producto4 = new Producto("Calcetines", 5.0D);
    Producto producto5 = new Producto("Cinturon", 10.0D);
    Producto producto6 = new Producto("Traje", 200.0D);
    Producto producto7 = new Producto("Chaleco", 150.0D);
    Producto producto8 = new Producto("Saco", 300.0D);
    Producto producto9 = new Producto("Sombrero", 20.0D);
    Producto producto10 = new Producto("Guantes", 15.0D);
    
    // Crear un objeto de tipo Orden
    Orden orden1 = new Orden();
    orden1.mostrarOrden();
    // Agregar los productos a la orden
    orden1.agregarProducto(producto1);
    orden1.agregarProducto(producto2);
    orden1.agregarProducto(producto3);
    orden1.agregarProducto(producto4);
    orden1.agregarProducto(producto5);
    orden1.agregarProducto(producto6);
    orden1.agregarProducto(producto7);
    orden1.agregarProducto(producto8);
    orden1.agregarProducto(producto9);
    orden1.agregarProducto(producto10);
    // Imprimir la orden
    orden1.mostrarOrden();
    // Crear una segunda orden
    Orden orden2 = new Orden();
    // Agregar los productos a la orden2
    orden2.agregarProducto(producto1);
    orden2.agregarProducto(producto2);
    orden2.agregarProducto(producto3);
    orden2.agregarProducto(producto4);
    orden2.agregarProducto(producto5);
    orden2.agregarProducto(producto6);
    orden2.agregarProducto(producto7);
    orden2.agregarProducto(producto8);
    orden2.agregarProducto(producto9);
    orden2.agregarProducto(producto10);
    // Imprimir la orden2
    orden2.mostrarOrden();
  }
}