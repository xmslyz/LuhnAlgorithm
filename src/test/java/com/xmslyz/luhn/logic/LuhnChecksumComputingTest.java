package com.xmslyz.luhn.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LuhnChecksumComputingTest {

    @SuppressWarnings("all")
    private Computation computation = new LuhnChecksumComputing();

    @Test
    void wikipedia_example() {
        var result = computation.compute("7992739871");

        assertEquals("79927398713", result);
    }

    @Test
    void notANumber() {
        assertThrows(NumberFormatException.class, () -> computation.compute(String.valueOf(Integer.parseInt("1q234"))),
                "Not a number");
    }

    @Test
    void negativeNumber(){
        assertThrows(NumberFormatException.class,
                () -> computation.compute(String.valueOf(Integer.parseInt("-4"))),
                "negative number");
    }

    @Test
    void emptyString(){
        assertThrows(NumberFormatException.class,
                () -> computation.compute(String.valueOf(Integer.parseInt(""))),
                "empty string");
    }

    @Test
    void zeroAsInput(){
        var result = computation.compute("0");

        assertEquals("00", result);
    }

    @Test
    void oneAsInput(){
        var result = computation.compute("1");

        assertEquals("18", result);
    }

    @Test
    void visaNumber(){
        var result = computation.compute("400360000000002");

        assertEquals("4003600000000022", result);
    }


    @Test
    void onlyZeros(){
        var result = computation.compute("000000000000");

        assertEquals("0000000000000", result);
    }

    @Test
    void notAlphanumeric(){
        assertThrows(NumberFormatException.class,
                () -> computation.compute(String.valueOf(Integer.parseInt("!@#$"))),
                "Not alphanumeric");
    }

    @Test
    void numberWithSpace(){
    var result = computation.compute("123 4567");

    assertEquals("12345674", result);
    }

    @Test
    void nullInput(){
        assertThrows(NullPointerException.class, () -> computation.compute(null),
                "expected not-null input");

    }

}