package herencia;

public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace  un sonido");
    }
}

// aquí puede ir una segunda clase
// aquí puede ir una tercera clase ... ambas clases son visibles únicamente dentro de 
// este mismo paquete
class Perro extends Animal {
    @Override // indicar al compilador que este método se está sobreescribiendo
    public void hacerSonido() {
        System.out.println("Puedo ladrar.");
    }
}

class Gato extends Animal {
    @Override // indicar al compilador que este método se está sobreescribiendo
    public void hacerSonido() {
        System.out.println("Puedo maullar");
    }
}

class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Polimorfismo ***");

        // var animal = new Animal();
        
        /**
         * A pesar de tener la inferencia de tipo Animal,
         * la instancia está apuntando a Gato, por lo que el método
         * a ejecutar es igual a la del objeto que se está apuntando
        */
        Animal animal = new Gato(); // Polimorfismo

        animal.hacerSonido();
    }
}


// Nota: Solo una clase puede ser publica y debe tener el mísmo nombre que el archivo.
// esto se debe al diseño y la forma en que compila Java
// los archivos. Ya que al tener una clase que haga referencia al archivo,
// sera más fácil para la JVM crear el archivo .class que hace referencia a className.javas