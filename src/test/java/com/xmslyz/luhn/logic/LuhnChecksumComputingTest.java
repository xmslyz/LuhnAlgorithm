package com.xmslyz.luhn.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LuhnChecksumComputingTest {

    private final Computable computable = new LuhnChecksumComputing();

    @Test
    void wikipedia_example() {

        var result = computable.compute(new Candidate("7992739871"));

        assertEquals("79927398713", result);
    }

    @Test
    void visaNumber(){
        var result = computable.compute(new Candidate("400360000000002"));

        assertEquals("4003600000000022", result);
    }

    @Test
    void oneAsInput(){
        var result = computable.compute(new Candidate("1"));

        assertEquals("18", result);
    }

    @Test
    void maxLongNumber(){
        var result = computable.compute(new Candidate("9223372036854775807"));
        assertEquals("92233720368547758074", result);
    }

    @Test void bigNumberTest() {
            var result = computable.compute(new Candidate("85502769294714727290219296850855013652640660699718"));

            assertEquals("855027692947147272902192968508550136526406606997186", result);
        }
}