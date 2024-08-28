package matrices;

import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.err.print("""
                *** Suma Diagonal Matríz ***
                Proporciona el tamaño de tu matriz (debe ser un número entero):\s""");

        // Validar que sí sea un número entero el dato introducido por la consola
        var inputUser = Integer.parseInt(consola.nextLine());;

        
        // int sizeMatriz = Integer.parseInt(consola.nextLine());
        // System.err.println("sizeMatriz: " + sizeMatriz);

        consola.close();
    }
}
