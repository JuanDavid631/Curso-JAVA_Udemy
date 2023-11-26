package test;

public class testArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        int contador = 0;
        System.out.println("Edades direccion de memoria = " + edades);
        edades[0] = 10;
        System.out.println("Edades 0 = " + edades[0]);
        edades[1] = 20;
        System.out.println("Edades 1 = " + edades[1]);
        edades[2] = 30;
        System.out.println("Edades 2 = " + edades[2]);
        // edades[3] = 40; // Error: ArrayIndexOutOfBoundsException
        // System.out.println("Edades 3 = " + edades[3]);
        for (contador = 0; contador < edades.length; contador++) {
            System.out.println("Edades elemento " + contador + ": " + edades[contador]);
        }
    }
}
