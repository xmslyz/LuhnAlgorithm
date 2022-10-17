package com.xmslyz.luhn.main;

import com.xmslyz.luhn.logic.Computation;
import com.xmslyz.luhn.logic.LuhnChecksumComputing;

public class Main {
    public static void main(String[] args) {

        Computation computation = new LuhnChecksumComputing();
        UserOptionMenu userOptionMenu = new UserOptionMenu();
        userOptionMenu.greetUser();
        String inputNumber = userOptionMenu.getMainOptions();
        try {
            var result = computation.compute(inputNumber);
            ChecksumPrinter.printChecksum(result);
        } catch (com.xmslyz.luhn.logic.InputValidationException e){
            System.out.println("Wrong input: " + e.getMessage());
        }
    }
}