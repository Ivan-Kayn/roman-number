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
}
