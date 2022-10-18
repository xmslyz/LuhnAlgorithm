package com.xmslyz.luhn.logic;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LuhnCandidateTest {

    @Test
    void notANumber() {
        assertThrows(InputValidationException.class, () -> new Candidate("1r23e4"), "Expected only digits");
    }

    @Test
    void notAlphanumeric(){
        assertThrows(InputValidationException.class, () -> new Candidate("!@#$"), "Expected only digits");
    }

    @Test
    void emptyString(){
        assertThrows(InputValidationException.class, () -> new Candidate(""), "Expected non-empty string");
    }

    @Test
    void nullInput(){
            assertThrows(InputValidationException.class, () -> new Candidate(null), "Expected not-null input");
    }

    @Test
    void numberWithSpace(){
        var result = new Candidate("123 4567 8912 3456 7890");

        assertEquals(BigInteger.valueOf(Long.parseLong("1234567891234567890")), result.getNumber());
    }
}