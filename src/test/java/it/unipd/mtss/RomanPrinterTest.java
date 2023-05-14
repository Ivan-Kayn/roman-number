package it.unipd.mtss;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;;

public class RomanPrinterTest {
    @Test
    public void testConvertZero() {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {

            utilities.when(() -> IntegerToRoman.convert(0)).thenReturn("");

            // Act
            String expected = "";

            // Assert
            assertEquals(expected, RomanPrinter.print(0));
        }
    }

    @Test
    public void testConvertOne() {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {

            utilities.when(() -> IntegerToRoman.convert(1)).thenReturn("I");

            // Act
            String expected = "  _____ \n" +
                    " |_   _|\n" +
                    "   | |  \n" +
                    "   | |  \n" +
                    "  _| |_ \n" +
                    " |_____|\n";

            String valoreAtteso = RomanPrinter.print(1);

            // Assert
            assertEquals(expected, valoreAtteso);
        }
    }

    @Test
    public void testConvertFive() {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {

            utilities.when(() -> IntegerToRoman.convert(5)).thenReturn("V");

            // Act
            String expected = " __      __\n" +
                    " \\ \\    / /\n" +
                    "  \\ \\  / / \n" +
                    "   \\ \\/ /  \n" +
                    "    \\  /   \n" +
                    "     \\/    \n";

            // Assert
            assertEquals(expected, RomanPrinter.print(5));
        }
    }

    @Test
    public void testConvertTen() {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {

            utilities.when(() -> IntegerToRoman.convert(10)).thenReturn("X");

            // Act
            String expected = " __    __\n" +
                    " \\ \\  / /\n" +
                    "  \\ \\/ / \n" +
                    "   >  <  \n" +
                    "  / /\\ \\ \n" +
                    " /_/  \\_\\\n";

            // Assert
            assertEquals(expected, RomanPrinter.print(10));
        }
    }

    @Test
    public void testConvertFifty() {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {

            utilities.when(() -> IntegerToRoman.convert(50)).thenReturn("L");

            // Act
            String expected = "  _      \n" +
                    " | |     \n" +
                    " | |     \n" +
                    " | |     \n" +
                    " | |____ \n" +
                    " |______|\n";

            // Assert
            assertEquals(expected, RomanPrinter.print(50));
        }
    }

    @Test
    public void testConvertHundred() {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {

            utilities.when(() -> IntegerToRoman.convert(100)).thenReturn("C");

            // Act
            String expected = "   _____ \n" +
                    "  / ____|\n" +
                    " | |     \n" +
                    " | |     \n" +
                    " | |____ \n" +
                    "  \\_____|\n";

            // Assert
            assertEquals(expected, RomanPrinter.print(100));
        }
    }

    @Test
    public void testConvertFiveHundred() {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {

            utilities.when(() -> IntegerToRoman.convert(500)).thenReturn("D");

            // Act
            String expected = "  _____  \n" +
                    " |  __ \\ \n" +
                    " | |  | |\n" +
                    " | |  | |\n" +
                    " | |__| |\n" +
                    " |______/\n";

            // Assert
            assertEquals(expected, RomanPrinter.print(500));
        }
    }

    @Test
    public void testConvertThousand() {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {

            utilities.when(() -> IntegerToRoman.convert(1000)).thenReturn("M");

            // Act
            String expected = "  __  __ \n" +
                    " |  \\/  |\n" +
                    " | \\  / |\n" +
                    " | |\\/| |\n" +
                    " | |  | |\n" +
                    " |_|  |_|\n";

            // Assert
            assertEquals(expected, RomanPrinter.print(1000));
        }
    }
}
