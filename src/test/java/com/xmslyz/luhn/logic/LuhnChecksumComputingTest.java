//package com.xmslyz.luhn.logic;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class LuhnChecksumComputingTest {
//
//    private final Computable computable = new LuhnChecksumComputing();
//
//    @Test
//    void wikipedia_example() {
//        var result = computable.compute("7992739871");
//
//        assertEquals("79927398713", result);
//    }
//
//    @Test
//    void notANumber() {
//        assertThrows(InputValidationException.class, () -> computable.compute("1r23e4"), "Expected only digits");
//    }
//
//    @Test
//    void notAlphanumeric(){
//        assertThrows(InputValidationException.class, () -> computable.compute("!@#$"), "Expected only digits");
//    }
//
//    @Test
//    void emptyString(){
//        assertThrows(NumberFormatException.class, () -> computable.compute(String.valueOf(Integer.parseInt(""))), "empty string");
//    }
//
//    @Test
//    void zeroAsInput(){
//        var result = computable.compute("0");
//
//        assertEquals("00", result);
//    }
//
//    @Test
//    void oneAsInput(){
//        var result = computable.compute("1");
//
//        assertEquals("18", result);
//    }
//
//    @Test
//    void visaNumber(){
//        var result = computable.compute("400360000000002");
//
//        assertEquals("4003600000000022", result);
//    }
//
//
//    @Test
//    void onlyZeros(){
//        var result = computable.compute("000000000000");
//
//        assertEquals("0000000000000", result);
//    }
//
//
//
//    @Test
//    void numberWithSpace(){
//    var result = computable.compute("123 4567");
//
//    assertEquals("12345674", result);
//    }
//
//    @Test
//    void nullInput(){
//        assertThrows(NullPointerException.class, () -> computable.compute(null),
//                "expected not-null input");
//
//    }
//    @Test
//    void maxLongNumber(){
//        var result = computable.compute("9223372036854775807");
//        assertEquals("92233720368547758074", result);
//    }
//
//    @Test void bigNumberTest() {
//            var result = computable.compute("85502769294714727290219296850855013652640660699718");
//
//            assertEquals("855027692947147272902192968508550136526406606997186", result);
//        }
//}