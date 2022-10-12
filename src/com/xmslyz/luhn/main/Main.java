package com.xmslyz.luhn.main;

import com.xmslyz.luhn.logic.LuhnAlgorithmEngine;

public class Main {
    public static void main(String[] args) {
        LuhnAlgorithmEngine luhnAlgorithmEngine = new LuhnAlgorithmEngine();
        OptionMenu optionMenu = new OptionMenu();
        String inputNumber = optionMenu.getMainOptions();
        if (inputNumber != null){
        OptionMenu.codeNumber(luhnAlgorithmEngine.compute(inputNumber));
        }
    }
}
