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
        // var resultSubstrString = substrString(0, 2, "Noé");

        var consola = new Scanner(System.in);
        String name = "";
        String lastName = "";
        // int yearBirth = ;

        var result = formatYear("2023 pACO ENEDERV*W2 E323");
        System.out.println("Result formatYear fn: " + result);
    }

    static String substrString(int startIndex, int endIndex, String value) {
        return "";
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
}
