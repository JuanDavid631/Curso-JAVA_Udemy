package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("Objeto persona usando this: " + persona);
        System.out.println("Nombre persona: " + persona.nombre);
        System.out.println("Apellido persona: " + persona.apellido);
    }
}

class Persona {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        super(); // Llama al constructor de la clase padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this en la clase: " + this);
    }
}
