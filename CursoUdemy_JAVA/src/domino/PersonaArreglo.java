package domino;

public class PersonaArreglo {
    private String nombre;

    public PersonaArreglo (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "PersonaArreglo {" + "nombre= " + nombre + '}' + ", " + super.toString();
    }
}