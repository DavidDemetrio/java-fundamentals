package classObjects;

public class Persona {
    // String NO ES UN DATA TYPE PRIMITIVE SINO DE TIPO DE DATO DE CLASE
    String nombre, apellido;

    void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    /**
     * Por cuestiones de práctica, se instancian los objectos dentro de la misma
     * clase, pero ya en proyectos reales no se debe hacer de esta manera
     * @param args
    */
    public static void main(String[] args) {
        Persona obj1 = new Persona();
        // Por cuestiones de aprendizaje de clases y objectos en Java
        // se hace de esta forma el set de los attributes, pero ESTO NO ES UNA BUENA PRÁCTICA
        // EN EL FUTURO VEREMOS OTRAS MEJORES OPCIONES
        obj1.nombre = "David";
        obj1.apellido = "López";
        obj1.mostrarPersona();

        // Instancia de Segundo objeto
        Persona obj2 = new Persona();
        obj2.nombre = "Alicia";
        obj2.apellido = "Paz";
        obj2.mostrarPersona();
    }
}