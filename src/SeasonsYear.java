import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Create program that, when a user inputs a month, the system
 * shows the season for that month
 */
public class SeasonsYear {
    public static void main(String[] args) {
        String monthInput;
        Boolean isInputMonthsArr;
        var consola = new Scanner(System.in);
        // Create a HasMap Object called monthSeasons
        HashMap<String, String> monthSeasons = new HashMap<String, String>();

        // Add keys and values (Month, Season)
        monthSeasons.put("diciembre", "Invierno");
        monthSeasons.put("enero", "Invierno");
        monthSeasons.put("febrero", "Invierno");
        monthSeasons.put("marzo", "Primavera");
        monthSeasons.put("abril", "Primavera");
        monthSeasons.put("mayo", "Primavera");
        monthSeasons.put("junio", "Verano");
        monthSeasons.put("julio", "Verano");
        monthSeasons.put("agosto", "Verano");
        monthSeasons.put("septiembre", "Otoño");
        monthSeasons.put("octubre", "Otoño");
        monthSeasons.put("noviembre", "Otoño");

        System.out.println("Cálculo de las estaciones del año");

        do {
            System.out.print("Ingresa el mes: ");

            monthInput = consola.nextLine().toLowerCase();

            // Validate if monthInput is in the months array
                // asList -> validate the value in array.
            isInputMonthsArr = Arrays.asList(monthSeasons.keySet().toArray()).contains(monthInput);

        } while (!isInputMonthsArr);

        consola.close();

        // // Validate what season stay the month inputed user
        System.out.println("La estación del año es: " + monthSeasons.get(monthInput));
    }
}
