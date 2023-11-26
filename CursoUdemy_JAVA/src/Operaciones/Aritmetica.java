package operaciones;

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
        this.atributo = argumento1; // this.atributo hace referencia al atributo de la clase
        this.atributo2 = argumento2;
        return this.sumarConRetorno();
    }

    // Constructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor vacio");
    }

    // Constructor con argumentos
    public Aritmetica(int argumento1, int argumento2) {
        this.atributo = argumento1;
        this.atributo2 = argumento2;
        System.out.println("Ejecutando constructor con argumentos");
    }
}
