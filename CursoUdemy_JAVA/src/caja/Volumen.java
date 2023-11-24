package caja;

public class Volumen {
    int ancho;
    int alto;
    int profundo;

    public Volumen() {
        System.out.println("Ejecutando constructor vacio");
    }

    public Volumen(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutando constructor con argumentos");
    }

    public int calcularVolumen() {
        return this.ancho * this.alto * this.profundo;
    }
}
