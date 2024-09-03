package matrices;

import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        int sizeMatriz = initSystem();

        // entrada de valor por consola
        var in = new Scanner(System.in);
        // controlar el ciclo while, hasta que se introduzca un valor entero positivo
        // mayor a 1
        // boolean isInteger = false;
        // // tamaño de la matriz - default = 0
        // int sizeMatriz = 0;

       
        // System.out.println("This is the size matriz: " + sizeMatriz);
        // Definir la matriz y su tamaño
        float[][] matriz = new float[sizeMatriz][sizeMatriz];
        // float valueIndiceMatriz = 0;


        for (int raw = 0; raw < sizeMatriz; raw++) {
            for (int column = 0; column < sizeMatriz; column++) {
                System.out.print("Introduce el valor [" + raw + "][" + column + "]: ");
                
                if (!in.hasNextFloat()) {
                    System.out.println("Solo puedes ingresar números (enteros, decimales, negativas, etc.).");
                    // initSystem();
                    return;
                }
                
                matriz[raw][column] = Float.parseFloat(in.nextLine());

                // valueIndiceMatriz = Float.parseFloat(in.nextLine());

            }
        }

        in.close();
    }

    public static int initSystem() {
        // entrada de valor por consola
        var in = new Scanner(System.in);
        // controlar el ciclo while, hasta que se introduzca un valor entero positivo
        // mayor a 1
        boolean isInteger = false;
        // tamaño de la matriz - default = 0
        int sizeMatriz = 0;

        do {
            System.err.print("""
                    *** Suma Diagonal Matríz ***
                    Proporciona el tamaño de tu matriz (debe ser un número entero mayor a cero):\s""");

            // Si es un valor entero
            if (in.hasNextInt()) {
                sizeMatriz = in.nextInt();
                // System.out.println("La matriz es un entero: " + in.nextInt());
                // Si el valor es menor a 1, retorna nuevamente a la primer linea de codigo del
                // cilco while
                if (sizeMatriz < 1) {
                    // System.out.println("Es un numero menor a 1: ");
                    continue;
                }

                // FALTA LIMITAR A UN MÁXIMO DEL TAMAÑO DE LA MATRIZ

                // Rompe el ciclo while
                isInteger = true;
            } else {
                // Valida la siguoiente linea por consola
                in.nextLine();
            }
        } while (!isInteger);

        // in.close(); // veridicar con chatGPT por qué no se puede cerrar, cuando descomento esta linea manda error

        return sizeMatriz;
    }
}
