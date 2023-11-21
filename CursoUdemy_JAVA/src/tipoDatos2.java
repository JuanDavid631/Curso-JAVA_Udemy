public class tipoDatos2 {
    public static void main(String[] args) {
        var caracter = 'a';
        System.out.println("Caracter es: " + caracter);
        char varChar = '\u0021';
        System.out.println("Caracter es: " + varChar);
        char varCharDecimal = 33;
        System.out.println("Caracter es: " + varCharDecimal);
        char varCharSimbolo = '!';
        System.out.println("Caracter es: " + varCharSimbolo);

        // Inferencia
        var caracterDos = 'a';
        System.out.println("Caracter es: " + caracterDos);
        var varCharDos = '\u0021';
        System.out.println("Caracter es: " + varCharDos);
        var varCharDecimalDos = 33;
        System.out.println("Caracter es: " + varCharDecimalDos);
        var varCharSimboloDos = '!';
        System.out.println("Caracter es: " + varCharSimboloDos);

        int varIntSimbolo = '!';
        System.out.println("Numero es: " + varIntSimbolo);
        int letra = 'a';
        System.out.println("Numero es: " + letra);
        int letraMayus = 'A';
        System.out.println("Numero es: " + letraMayus);
    }
}