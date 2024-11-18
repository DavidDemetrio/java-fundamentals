package classObjects;

public class Persona {
    /**
     * @Nota Los valores estáticos se crean para poder manipularlos
     *       como un atributo de la misma clase y no de los objetos.
     *       Todos los objetos instanciados de la clase Persona, pueden acceder
     *       a el mismo valor de contadorPersonas.
     */
    private static int contadorPersonas = 0;
    private int idPersona = 0;
    // String NO ES UN DATA TYPE PRIMITIVE SINO DE TIPO DE DATO DE CLASE
    String nombre, apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = ++Persona.contadorPersonas;
    }

    void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    @Override
    public String toString() {
        return "Id: " + this.idPersona
                + " Nombre: " + this.nombre
                + " Apellido: " + this.apellido
                + " Dir. Mem: " + super.toString();
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }
}