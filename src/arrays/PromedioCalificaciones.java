package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.err.print("""
                *** Promedio de Calificaciones ***
                ¿Cuántas calificaciones deseas agregar?\s""");

        int largoArreglo = Integer.parseInt(consola.nextLine());
        
        // Declaración del arreglo
        double[] calificaciones = new double[largoArreglo];
        double totalCalificaciones = 0;
    
        for (var index = 0; index < largoArreglo; index++) {
            System.err.print("Calificación [" + index + "]: ");
            calificaciones[index] = Double.parseDouble(consola.nextLine());
        }

        // Calcular el promedio de las calificaciones ingresadas
        // // Por el método tradicional
        // for (var index = 0; index < largoArreglo; index++) {
        //     totalCalificaciones += calificaciones[index];
        // }
        // var promedio = totalCalificaciones / largoArreglo;
        
        // usando Streams
        double suma = Arrays.stream(calificaciones).sum();
        var promedio = suma / largoArreglo;


        System.err.println("El promedio de las calificaciones ingresada es: " + promedio);

        consola.close();
    }
}
