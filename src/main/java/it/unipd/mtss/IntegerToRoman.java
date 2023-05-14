package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        String[] romanNumerals = { "I" };
        int[] values = { 1 };

        String roman_number = "";

        // CONVERSIONE PER SOTTRAZIONE: man mano che si convertono dei simbolo ne viene
        // sottratta la rispettiva quantita dal numero da convertire
        int i = 0;
        while (number > 0) {
            if (number - values[i] >= 0) {
                roman_number += romanNumerals[i];
                number -= values[i];
            } else {
                i++;
            }
        }
        return roman_number;
    }
}
