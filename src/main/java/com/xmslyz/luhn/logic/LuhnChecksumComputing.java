package com.xmslyz.luhn.logic;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigInteger;

public class LuhnChecksumComputing implements Computation {

    String number, checkSum;
    String[] array;
    int checkedNumeral, total, mod10, codeNumber;

    @Override
    public String compute(String input) {
        validate(input.replaceAll("\\s+", ""));
        this.number = input.replaceAll("\\s+", "");
        setArray(number.length());
        multiplyWages();
        countTotal();
        getChecksum();
        return this.checkSum;
    }

    private void validate(String input){
        if (input == null) throw new InputValidationException("Expected not-null input");
        if (input.isEmpty()) throw new InputValidationException("Expected non-empty string");
        if (!NumberUtils.isDigits(input)) throw new InputValidationException("Expected only digits");
        if (new BigInteger(input.replaceAll("\\s+", "")).signum() < 0) throw new InputValidationException("Expected number >= 0");
    }

    private void setArray(int stringLenght) {
        array = new String[stringLenght];
        for (int i = 0; i < stringLenght; i++) {
            String charFromString = String.valueOf(number.charAt(i));
            array[i] = charFromString;
        }
    }

    private void multiplyWages() {
        for (int i = array.length; i > 0; i -= 2) {
            checkedNumeral = Integer.parseInt(array[i - 1]);
            checkedNumeral *= 2;
            if (checkedNumeral % 10 > 0 || checkedNumeral == 10) {
                array[i - 1] = String.valueOf((checkedNumeral / 10) + (checkedNumeral % 10));
            }
        }
    }

    private void countTotal() {
        for (String s : array) {
            int arrInt = Integer.parseInt(s);
            total += arrInt;
        }
    }

    private void getChecksum(){
        mod10 = total % 10;
        if (mod10 != 0) {
            codeNumber = 10 - mod10;
            checkSum = number + codeNumber;
        } else {
            checkSum = number + 0;
        }
    }
}