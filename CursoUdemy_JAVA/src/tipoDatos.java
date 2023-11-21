public class tipoDatos {
    public static void main(String[] args) {
        // Tipos de datos Primitivos enteros
        System.out.println("--- NUMEROS PRIMITIVOS ENTEROS ---");
        byte numberByte = (byte) 129;
        System.out.println("Numero en byte: " + numberByte);
        System.out.println("\tValor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("\tValor maximo byte: " + Byte.MAX_VALUE);

        short numberShort = (short) 32768;
        System.out.println("Numero en short: " + numberShort);
        System.out.println("\tValor minimo short: " + Short.MIN_VALUE);
        System.out.println("\tValor maximo short: " + Short.MAX_VALUE);

        int numberInt = (int) 2147483649L;
        System.out.println("Numero en int: " + numberInt);
        System.out.println("\tValor minimo int: " + Integer.MIN_VALUE);
        System.out.println("\tValor maximo int: " + Integer.MAX_VALUE);

        long numberLong = (long) 9223372036854775809D;
        System.out.println("Numero en long: " + numberLong);
        System.out.println("\tValor minimo long: " + Long.MIN_VALUE);
        System.out.println("\tValor maximo long: " + Long.MAX_VALUE);

        // Tipos de datos Primitivos flotante
        System.out.println("\n--- NUMEROS PRIMITIVOS FLOTANTES ---");
        float numberFloat = (float) 3.4028235E38D;
        System.out.println("Numero en float: " + numberFloat);
        System.out.println("\tValor minimo float: " + Float.MIN_VALUE);
        System.out.println("\tValor maximo float: " + Float.MAX_VALUE);

        double numberDouble = 1.7976931348623157E308;
        System.out.println("Numero en double: " + numberDouble);
        System.out.println("\tValor minimo double: " + Double.MIN_VALUE);
        System.out.println("\tValor maximo double: " + Double.MAX_VALUE);
    }
}