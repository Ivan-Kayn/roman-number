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
}
