public class tipoDatos3 {
    public static void main(String[] args) {
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        if (varBoolean == true) {
            System.out.println("La bandera es verdadera con valor: " + varBoolean);
        } else {
            System.out.println("La bandera es falsa con valor: " + varBoolean);
        }

        // EJERCICIO
        System.out.println("\n--- EJERCICIO ---");
        var edad = 45;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad con valor: " + edad);
        } else {
            System.out.println("Eres menor de edad con valor: " + edad);
        }
    }
}