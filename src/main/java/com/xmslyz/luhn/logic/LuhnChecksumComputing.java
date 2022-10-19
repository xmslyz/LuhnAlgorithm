package com.xmslyz.luhn.logic;

import java.math.BigInteger;

public class LuhnChecksumComputing implements Computable {

    @Override
    public String compute(Candidate candidate) {
        BigInteger number = candidate.getNumber();
        String[] array = candidate.getDigits();
        int digitLength = candidate.getDigitCount();

        String[] wagedArray = multiplyWages(array, digitLength);
        int total = countTotal(wagedArray);
        return getChecksum(number, total);
    }

    private String[] multiplyWages(String[] array, int digitLength) {
        for (int i = digitLength; i > 0; i -= 2) {
            int checkedNumeral = Integer.parseInt(array[i - 1]);
            checkedNumeral *= 2;
            if (checkedNumeral % 10 > 0 || checkedNumeral == 10) {
                array[i - 1] = String.valueOf((checkedNumeral / 10) + (checkedNumeral % 10));
            }
        }
        return array;
    }

    private int countTotal(String[] array) {
        int total = 0;
        for (String s : array) {
            int arrInt = Integer.parseInt(s);
            total += arrInt;
        }
        return total;
    }

    private String getChecksum(BigInteger number, int total){
        int mod10 = total % 10;
        String checkSum;
        if (mod10 != 0) {
            int codeNumber = 10 - mod10;
            checkSum = number.toString() + codeNumber;
        } else {
            checkSum = number.toString() + 0;
        }
        return checkSum;
    }
}