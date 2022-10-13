package com.xmslyz.luhn.main;

import com.xmslyz.luhn.logic.LuhnAlgorithm;
import com.xmslyz.luhn.logic.LuhnAlgorithmEngine;

public class Main {
    public static void main(String[] args) {
        LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithmEngine();
        UserOptionMenu userOptionMenu = new UserOptionMenu();
        userOptionMenu.greetUser();
        String inputNumber = userOptionMenu.getMainOptions();
        if (inputNumber != null){
        PrintChecksum.printChecksum(luhnAlgorithm.compute(inputNumber));
        userOptionMenu.getMainOptions();

        }
    }
}
