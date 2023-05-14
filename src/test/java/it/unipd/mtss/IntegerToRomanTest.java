package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {
    @Test
    public void testConvertZero() {
        // Arrange
        int numeroArabo = 0;
        String numeroRomanoAtteso = "";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvertOne() {
        // Arrange
        int numeroArabo = 1;
        String numeroRomanoAtteso = "I";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }
}
