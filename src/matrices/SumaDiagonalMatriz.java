package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        int sizeMatriz = initSystem();
        // entrada de valor por consola
        var in = new Scanner(System.in);
        // Definir la matriz y su tamaño
        float[][] matriz = new float[sizeMatriz][sizeMatriz];
        boolean isNumber = false;

        do {
            isNumber = addValuesMatriz(sizeMatriz, in, matriz);
        } while (!isNumber);

        // =======================================================================
        // Validar los valores ingresado en la matriz
        System.out.println("Los valores de la matriz son:");

        // Primer método: Arrays.deepToString()
        // System.out.println(Arrays.deepToString(matriz));

        // Segundo método: Ciclo for anidado (método tradicional)
        for (int raw = 0; raw < sizeMatriz; raw++) {
            for (int column = 0; column < sizeMatriz; column++) {
                System.out.println("[" + raw + "][" + column + "]:" + matriz[raw][column]);
            }
        }

        // // Tercer métdo: For-each anidado
        // for (float[] raw : matriz) {
        // for(float value : raw) {
        // System.out.println(value);
        // }
        // }
        // =======================================================================


        // Hacer la suma de la diagonal
        /**
         *      -1 2 3
         *      3 -4 4
         *      1  3 4
        */
        // [0][0]
        // [1][1]
        // [2][2] ...consecutivamente
        float acumulado = 0;

        for (int index = 0; index < sizeMatriz; index ++) {
            acumulado += matriz[index][index];
        }

        System.out.println("Total de la suma de la diagonal de la matriz: " + acumulado);
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
                // Si el valor es menor a 1, retorna nuevamente a la primer linea de codigo del
                // cilco while
                if (sizeMatriz < 1)
                    continue;

                // FALTA LIMITAR A UN MÁXIMO DEL TAMAÑO DE LA MATRIZ

                // Rompe el ciclo while
                isInteger = true;
            } else {
                // Limpia la entrada de la consola (Scanner)
                // PARA NO PRODUCIR UN WHILE INFINITO O COMPORTAMIENTOS EXTRAÑOS
                in.nextLine();
            }
        } while (!isInteger);

        return sizeMatriz;
    }

    public static boolean addValuesMatriz(int sizeMatriz, Scanner in, float[][] matriz) {
        for (int raw = 0; raw < sizeMatriz; raw++) {
            for (int column = 0; column < sizeMatriz; column++) {
                System.out.print("Introduce el valor [" + raw + "][" + column + "]: ");

                if (!in.hasNextFloat()) {
                    System.out.println("Solo puedes ingresar números (enteros, decimales, negativos, etc.).");
                    in.nextLine(); // limipar el scanner para la siguiente entrada (limpia todo el buffer del
                                   // Scanner)
                    return false;
                }

                // Se puede usar estas dos opciones pero la última es más corta
                // matriz[raw][column] = Float.parseFloat(in.nextLine());
                matriz[raw][column] = in.nextFloat();
            }
        }

        return true;
    }
}
