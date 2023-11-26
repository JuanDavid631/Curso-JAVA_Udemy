package laboratorio.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
  private final int idTeclado;
  private static int contadorTeclados;

  public Teclado(String tipoEntrada, String marca) {
    super(tipoEntrada, marca);
    this.idTeclado = ++Teclado.contadorTeclados;
  }

  public int getIdTeclado() {
    return this.idTeclado;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Teclado {idTeclado: ").append(this.idTeclado);
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
