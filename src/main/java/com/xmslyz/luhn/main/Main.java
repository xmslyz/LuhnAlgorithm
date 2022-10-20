package com.xmslyz.luhn.main;

import com.xmslyz.luhn.logic.*;

public class Main {
    public static void main(String[] args) {
        UserOptionMenu.greetUser();
        String inputNumber = UserOptionMenu.getMainOptions();
        try {
            Computable computable = new LuhnChecksumComputing();
            Candidate candidate = new Candidate(inputNumber);
            var result = computable.compute(candidate);
            ChecksumPrinter.printChecksum(result);
        } catch (InputValidationException e){
            System.out.println("Wrong input: " + e.getMessage());
        }

    }
}