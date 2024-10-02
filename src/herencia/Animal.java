package herencia;

public class Animal {
    // Método público para poder acceder desde otras clases, inlcluso de 
    // aquellas que están en otros paquetes
    public void comer() {
        System.out.println("como muchas veces al día");
    }
    
    public void dormir() {
        System.out.println("Duermo mucho en la tarde!");
    }
}

// aquí puede ir una segunda clase
// aquí puede ir una tercera clase ... ambas clases son visibles únicamente dentro de 
// este mismo paquete
class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("Puedo ladrar.");
    }
}


class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Herencia ***");
        System.out.println("<<<<<<<<<<<<<<<< Clase Padre (Súper Clase) >>>>>>>>>>>>>");
        Animal animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        // animal1.hacerSonido(); // it does not exist in parent class

        System.out.println("<<<<<<<<<<<<<<<<< Clase hija (Subclase) >>>>>>>>>>>>>>>>");
        Perro perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();
    }
}


// Nota: Solo una clase puede ser publica y debe tener el mísmo nombre que el archivo.
// esto se debe al diseño y la forma en que compila Java
// los archivos. Ya que al tener una clase que haga referencia al archivo,
// sera más fácil para la JVM crear el archivo .class que hace referencia a className.javas