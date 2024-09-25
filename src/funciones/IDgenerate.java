package funciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Generate ID unique with the next statements:
 * 1. Get name user: get two first character about name.
 * 1.1 Validate the name doesn´t contains space between sides. Uppercase
 * 2. Get last name. The same as 1.1
 * 3. Year birth. Validate format be YYYY. get two last digits. Uppercaser
 * 4. Random four digits.
 */
public class IDgenerate {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        Boolean closeWhile = false;
        String name = "";
        String lastName = "";
        int yearBirth = 1800;

        System.out.println("Generador de ID de Usuario");

        do {
            System.out.print("Proporciona tu nombre:\s");
            name = consola.nextLine().toUpperCase();
            // System.out.println("name out:" + name);
            if (name.isEmpty()) {
                System.out.println("Debes ingresar un nombre");
                clearConsole(); //limpiar la terminal
            } else {
                closeWhile = true;
            }
        } while(!closeWhile);



        System.out.print("Proporciona tu apellido paterno:\s");
        lastName = consola.nextLine().toUpperCase();

        System.out.print("Proporciona el año en que naciste:\s");
        yearBirth = Integer.parseInt(consola.nextLine());

        System.out.println(name + lastName + yearBirth);

        // name validate
        // dont empty
        if (name.isEmpty()) {
            System.err.println("El nombre es obligatorio.");
        }
        // dont be two or more names
        if (name.isEmpty()) {
            System.err.println("El nombre es obligatorio.");
        }
        // tildes

    }

    static String formatYear(String format) {
        // Get current date with the format: YYYY-MM-DD
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String formatDate = date.format(formatter);

        return formatDate;
    }

    static int getRandomNumber(int lengthNumber) {
        // With lengthNumber, the fn will know the length number to return
        return 1234;
    }

    static void clearConsole() {
        // First Option to clear the console
        // Using ANSI Escape Code
        System.out.print("\033[H\033[2J");
        // Destructuring the code (consulting from https://www.javatpoint.com/how-to-clear-screen-in-java):
            // \033: It represents the ASCII escape. Its ANSI value is 27. It stands for ESC.
            // [: It represents the escape sequence.
            // \033[H Location cursor left superior
            // \033[2J Clear screen from init cursor to end the screen.

    }
}
