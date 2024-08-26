package ciclos;

import java.util.Scanner;

/**
 * @Ejercicio Se les deja crear la aplicación de cajero automático.
 * 
 *            Las funciones principales de un cajero son:
 *            DEPOSITAR,
 *            RETIRAR,
 *            CONSULTAR
 * 
 *            PUEDE TENER UN VALOR INICIAL EL SALDO.
 * 
 * 
 */
public class CajeroAutomatico {
    public static void main(String[] args) {
        var systemOut = false;
        var consola = new Scanner(System.in);
        final var VALOR_MAXIMO_INGRESADO = 99000;
        double saldo = 0;

        System.out.println("*** Cajero Automático ***");

        while (!systemOut) {
            System.out.print("""
                    Menu:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");

            var opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1 -> System.out.println("Tu saldo actual es: $" + saldo);

                case 2 -> {
                    // Hacer las funciones de restar el saldo
                    System.out.print("Ingresa la cantidad que deseas retirar: $");
                    var cantidadIngresada = Double.parseDouble(consola.nextLine());

                    // Validar que la cantidad ingresada no sea mayor al saldo actual
                    if (cantidadIngresada > saldo) {
                        System.out.println("No cuentas con la cantidad suficiente para retirar.");
                        System.out.println("Tu saldo es: $" + saldo);
                        break;
                    }

                    // Actualización del saldo
                    saldo -= cantidadIngresada;

                    System.out.println("Tu saldo es: $" + saldo);
                }

                case 3 -> {
                    // Hacer las opciones de añadir saldo
                    System.out.print("Ingresa la cantidad que deseas ingresar: $");
                    var cantidadIngresada = Double.parseDouble(consola.nextLine());

                    if (cantidadIngresada > VALOR_MAXIMO_INGRESADO) {
                        System.out.println("La cantidad máxima a depositar es: $" + VALOR_MAXIMO_INGRESADO);
                        break;
                    }

                    saldo += cantidadIngresada;

                    System.out.println("Tu saldo es: $" + saldo);
                }

                case 4 -> {
                    systemOut = true;
                    System.out.println("Saliendo del cajero automático, hasta pronto!");
                }

                default -> System.out.println("Opción inválida: " + opcion);
            }

            // Salto de línea
            System.out.println();

        }
        consola.close();

    }
}
