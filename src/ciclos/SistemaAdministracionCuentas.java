package ciclos;

import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        // Menú interactivo
        System.out.println("*** Sistema de Administración de Cuentas ***");
        var salir = false;

        while (!salir) {
            // Cadenas de bloque de texto (múltiples líneas)
            System.out.println("""
                    Menú:
                    1. Crear cuenta.
                    2. Eliminar cuenta.
                    3. Salir del sistema.

                    Escoge una opción:\s""");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (opcion) {
                case 1 -> System.out.println("Creando tu cuenta ...");
                case 2 -> System.out.println("Eliminando tu cuenta ...");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto ...");
                    salir = true;
                }
                default -> System.out.println("Opción inválida: " + opcion);
            }
            System.out.println();
        }
    }
}
