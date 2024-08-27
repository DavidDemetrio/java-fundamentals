package ciclos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var systemOut = false;
        var consola = new Scanner(System.in);
        double num1 = 0, num2 = 0, result = 0;

        System.err.println("*** Calculadora en Java ***");

        while (!systemOut) {
            System.out.print("""
                    Menú:
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    Escoge una opción:\s""");

            var opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1 -> {
                    // Sumar dos valores ingresados por el usuario
                    System.out.print("Ingresa el primer número: ");
                    num1 = Double.parseDouble(consola.nextLine());

                    System.out.print("Ingresa el segundo número: ");
                    num2 = Double.parseDouble(consola.nextLine());

                    result = num1 + num2;

                    System.out.println("El resultado de la suma es: " + result);
                }
                case 2 -> {
                    // Restar dos valores ingresados por el usuario
                    System.out.print("Ingresa el primer número: ");
                    num1 = Double.parseDouble(consola.nextLine());

                    System.out.print("Ingresa el segundo número: ");
                    num2 = Double.parseDouble(consola.nextLine());

                    result = num1 - num2;
                    System.out.println("El resultado de la resta es: " + result);
                }
                case 3 -> {
                    // Multiplicar dos valores ingresados por el usuario
                    System.out.print("Ingresa el primer número: ");
                    num1 = Double.parseDouble(consola.nextLine());

                    System.out.print("Ingresa el segundo número: ");
                    num2 = Double.parseDouble(consola.nextLine());

                    result = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + result);
                }
                case 4 -> {
                    // Dividir dos valores ingresados por el usuario
                    System.out.print("Ingresa el primer número: ");
                    num1 = Double.parseDouble(consola.nextLine());

                    System.out.print("Ingresa el segundo número: ");
                    num2 = Double.parseDouble(consola.nextLine());

                    result = num1 / num2;

                    System.out.println("El resultado de la división es: " + result);
                }
                case 5 -> {
                    // Salir del sistema
                    systemOut = true;
                    System.out.println("Saliendo del sistema, hasta pronto!");
                }

                default -> System.out.println("Opción inválida: " + opcion);
            }
            
            System.out.println();
        }
        consola.close();
    }
}
