import java.util.Scanner;

/**
 * Requirement about Grading System:
 * 1. Use conditional Switch (also using new sintax proposed by Java)
 */
public class GradingSystem {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        boolean consoleIsInteger = true, consoleIsFloat = true;
        float grade = 0;

        System.out.println("SISTEMAS DE CALIFICACIONES");

        // if (!console.hasNextInt() && !console.hasNextFloat()) return;

        do {
            System.out.print("Introduce la califiación: ");
            consoleIsInteger = console.hasNextInt();
            consoleIsFloat = console.hasNextFloat();
        } while (!consoleIsInteger && !consoleIsFloat);

        grade = Math.round(Float.parseFloat(console.nextLine()));

        System.out.println(grade);

        // Input value User
        // Validate is numbere and validate it is between 0 and 10
        // else throw message Insert a correct number please (use do while cycle)

        // if (grade >= 9 && grade <= 10) {
        // System.out.println("La calificación de " + grade + "es A");
        // return;
        // }
        // if (grade >= 8 && grade < 9) {
        // System.out.println("La calificación de " + grade + "es B");
        // return;
        // }
        // if (grade >= 7 && grade < 8) {
        // System.out.println("La calificación de " + grade + "es C");
        // return;
        // }
        // if (grade >= 6 && grade < 7) {
        // System.out.println("La calificación de " + grade + "es D");
        // return;
        // }
        // if (grade >= 0 && grade < 6) {
        // System.out.println("La calificación de " + grade + "es F");
        // return;
        // }
    }
}