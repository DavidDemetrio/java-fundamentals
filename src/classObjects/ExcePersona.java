package classObjects;

public class ExcePersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de objetos de la clase Persona ***");
        // System.out.println("Variable estática: " + Persona.contadorPersonas);

        Persona obj1 = new Persona("David", "Demetrio");
        // Por cuestiones de aprendizaje de clases y objectos en Java
        // se hace de esta forma el set de los attributes, pero ESTO NO ES UNA BUENA
        // PRÁCTICA
        obj1.mostrarPersona();
        /**
         * NOTA: El contexto estático no puede acceder al contexto dinámico,
         * y el contexto dinámico si puede acceder al contexto estático.
        */
        // Contexto dinámico accediendo a contexto estático
        // System.out.println("Variable estática: " + obj1.getContadorPersonas());
        // Accediendo al contexto estático por medio de la clase. Buena práctica.
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        System.out.println(obj1);
        // Instancia de Segundo objeto
        Persona obj2 = new Persona("Alicia", "Paz");
        // System.out.println("Variable estática: " + obj2.getContadorPersonas());
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        obj2.mostrarPersona();
        System.out.println(obj2);
    }
}
