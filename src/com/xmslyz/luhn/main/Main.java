package com.xmslyz.luhn.main;

import com.xmslyz.luhn.logic.Computation;
import com.xmslyz.luhn.logic.LuhnChecksumComputing;

public class Main {
    public static void main(String[] args) {
        Computation computation = new LuhnChecksumComputing();
        UserOptionMenu userOptionMenu = new UserOptionMenu();
        userOptionMenu.greetUser();
        String inputNumber = userOptionMenu.getMainOptions();
        if (inputNumber != null){
        ChecksumPrinter.printChecksum(computation.compute(inputNumber));
        userOptionMenu.getMainOptions();
        }
    }
}
