import java.util.Scanner;

public class compareStrings {
    public static void main(String[] args) {
        // En java cadena1 y cadena2 apuntan al mimo objeto en memoria
        var cadena1 = "David";
        var cadena2 = "David";
        
        var consola = new Scanner(System.in); // Entrada del usuario por consola
        System.out.println("Ingrese una cadena: ");
        // Pero esta cadena a pesar de que tenga el mismo texto que cadena1 o cade2
        // la cadena3 se crea en otro objeto de memoria (referencia de memoria)
        var cadena3 = consola.nextLine();
        consola.close();
        
        if (cadena1 == cadena3) {
            System.out.println("Las cadenas son iguales en referencia de memoria.");
        } else {
            System.out.println("Las cadenas son distintas en referencia de memoria.");
        }

        // Para solucionar esto, si que remos comparar el contenido y no la referencia de memoria
        // usamos el método equals de la clase String
        if (cadena1.equalsIgnoreCase(cadena3)) {  // Java es sensitiveCase, si queremos ignorar esto, cambiar7
                                        // equals por equalsIgnoreCase
            System.out.println("Las cadenas son iguales en contenido.");
        } else {
            System.out.println("Las cadenas son distintas en contenido.");
        }
    }
}
