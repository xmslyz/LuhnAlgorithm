package com.xmslyz.luhn.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuhnChecksumComputingTest {

    private Computation computation = new LuhnChecksumComputing();

    @Test
    void wikipedia_example() {
        var result = computation.compute("7992739871");

        assertEquals("79927398713", result);
    }
//    coś co nie jest liczbą
    @Test
    void notANumber() {
        var result = computation.compute("123e4");
    }

    @Test
    void negativeNumber(){
        var result = computation.compute("-4");
    }
    @Test
    void emptyString(){
        var result = computation.compute("");
    }

    @Test
    void zeroAsInput(){
        var result = computation.compute("0");

    }

    @Test
    void oneAsInput(){
        var result = computation.compute("1");

    }

    @Test
    void visaNumber(){
        var result = computation.compute("400360000000001");
    }

    @Test
    void onlyZeros(){
        var result = computation.compute("000000000000");

    }

    @Test
    void notAlfanumeric(){
        var result = computation.compute("!@#$%");
    }

    @Test
    void numberWithSpace(){
    var result = computation.compute("123 4567");
    }

    @Test
    void nullInput(){
        var result = computation.compute(null);
    }
}