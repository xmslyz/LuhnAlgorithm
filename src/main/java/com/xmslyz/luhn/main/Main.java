package com.xmslyz.luhn.main;

import com.xmslyz.luhn.logic.*;

public class Main {
    public static void main(String[] args) {

        Computable computable = new LuhnChecksumComputing();
        UserOptionMenu userOptionMenu = new UserOptionMenu();
        userOptionMenu.greetUser();
        String inputNumber = userOptionMenu.getMainOptions();
        try {
            LuhnCandidate luhnCandidate = new LuhnCandidate(inputNumber);
            var result = computable.compute(luhnCandidate);
            ChecksumPrinter.printChecksum(result);
        } catch (InputValidationException e){
            System.out.println("Wrong input: " + e.getMessage());
        }
    }
}