package herencia;

public class Empleado extends Persona {

  public static int getContadorEmpleado() {
    return contadorEmpleado;
  }

  public static void setContadorEmpleado(int aContadorEmpleado) {
    contadorEmpleado = aContadorEmpleado;
  }

  private int idEmpleado;
  private double sueldo;
  private static int contadorEmpleado;

  public Empleado(String nombre, double sueldo) {
    super(nombre);
    this.idEmpleado = ++Empleado.contadorEmpleado;
    this.sueldo = sueldo;
  }

  public int getIdEmpleado() {
    return idEmpleado;
  }

  public void setIdEmpleado(int idEmpleado) {
    this.idEmpleado = idEmpleado;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Empleado{");
    sb.append("idEmpleado: ").append(this.idEmpleado);
    sb.append(", nombre: ").append(this.nombre);
    sb.append(", sueldo: ").append(this.sueldo);
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}