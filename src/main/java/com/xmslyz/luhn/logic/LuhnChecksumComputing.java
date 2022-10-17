package com.xmslyz.luhn.logic;

import java.math.BigInteger;

public class LuhnChecksumComputing implements Computable {

    String[] array;
    BigInteger number;
    int total, checkedNumeral;
    String checkSum;
    int arrInt;

    @Override
    public String compute(LuhnCandidate luhnCandidate) {
        number = luhnCandidate.getNumber();
        array = luhnCandidate.getDigits();
        multiplyWages();
        countTotal();
        getChecksum();
        return checkSum;
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
            arrInt = Integer.parseInt(s);
            total += arrInt;
        }
    }

    private void getChecksum(){
        int mod10 = total % 10;

        if (mod10 != 0) {
            int codeNumber = 10 - mod10;
            checkSum = number.toString() + codeNumber;
        } else {
            checkSum = number.toString() + 0;
        }
    }
}