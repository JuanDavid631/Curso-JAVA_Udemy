package laboratorio.com.gm.mundopc;

public class Monitor {
  private final int idMonitor;
  private String marca;
  private double tamano;
  private static int contadorMonitores;

  public Monitor(String marca, double tamano) {
    this.marca = marca;
    this.tamano = tamano;
    this.idMonitor = ++Monitor.contadorMonitores;
  }

  public int getIdMonitor() {
    return this.idMonitor;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getTamano() {
    return this.tamano;
  }

  public void setTamano(double tamano) {
    this.tamano = tamano;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Monitor {idMonitor: ").append(this.idMonitor);
    sb.append(", marca: ").append(this.marca);
    sb.append(", tamano: ").append(this.tamano);
    sb.append('}');
    return sb.toString();
  }
}
