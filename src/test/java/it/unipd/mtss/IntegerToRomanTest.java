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

    @Test
    public void testConvertFive() {
        // Arrange
        int numeroArabo = 5;
        String numeroRomanoAtteso = "V";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvertTen() {
        // Arrange
        int numeroArabo = 10;
        String numeroRomanoAtteso = "X";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvertFourteen() {
        // Arrange
        int numeroArabo = 14;
        String numeroRomanoAtteso = "XIV";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvertFifty() {
        // Arrange
        int numeroArabo = 50;
        String numeroRomanoAtteso = "L";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvertNinety() {
        // Arrange
        int numeroArabo = 90;
        String numeroRomanoAtteso = "XC";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvertHundred() {
        // Arrange
        int numeroArabo = 100;
        String numeroRomanoAtteso = "C";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvertNineHundred() {
        // Arrange
        int numeroArabo = 900;
        String numeroRomanoAtteso = "CM";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvertThousand() {
        // Arrange
        int numeroArabo = 1000;
        String numeroRomanoAtteso = "M";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

}
