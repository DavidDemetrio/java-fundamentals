import java.util.Scanner;

public class checkNumberIsPositive {
    public static void main(String[] args) {
        // Value ingresado por el usuario
        
        var consola = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        
        // var number = Integer.(consola.nextLine());
        var number = Double.parseDouble(consola.nextLine());

        consola.close();

        if (number > 0) {
        System.out.println(number + " es positivo.");
        } else if (number < 0) {
        System.out.println(number + " es negativo.");
        } else {
        System.out.println(number + " es igual a cero.");
        }

        // Second option and unique success when we use integer numbers
        // 'cause signum stay Integer class'
        // use signum method
        // var isPositive = Integer.signum(number);
        

        // if (isPositive == 1) {
        //     System.out.println(number + " es positivo.");
        // } else if (isPositive == -1) {
        //     System.out.println(number + " es negativo.");
        // } else {
        //     System.out.println(number + " es igual a cero.");
        // }
    }
}