import java.util.Scanner;

/**
 * @description Para este ejercicio, encontrar el mayor de dos numeros
*/
public class MayorDosNumeros {
    public static void main(String[] args) {
        float num_1 = 0, num_2 = 0;
        var consola = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        num_1 = Float.parseFloat(consola.nextLine());
        
        System.out.print("Escribe el segundo número: ");
        num_2 = Float.parseFloat(consola.nextLine());

        consola.close();

        if (num_1 == num_2) {
            System.out.println("Ambos números son iguales! :(");
            return;    
        };

        if (num_1 > num_2) {
            System.out.println("El número mayor es: " + num_1);
            return;
        }
        
        if (num_1 < num_2) {
            System.out.println("El número mayor es: " + num_2);
        }
    }
}
