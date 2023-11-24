package Operaciones;

public class Aritmetica {
  // Atributos de la clase
    int atributo;
    int atributo2;

    // Metodo de la clase
    public void sumar() {
        int resultado = atributo + atributo2;
        System.out.println("El resultado es: " + resultado);
    }

    public int sumarConRetorno() {
        return atributo + atributo2;
    }

    public int sumarConArgumentos(int argumento1, int argumento2) {
        atributo = argumento1;
        atributo2 = argumento2;
        return sumarConRetorno();
    }
}
