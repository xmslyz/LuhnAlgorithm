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
            if (Integer.parseInt(computation.compute(inputNumber)) <= 0) System.out.println("Input number should be grater than O");
            else {
                computation.compute(inputNumber);
                ChecksumPrinter.printChecksum(computation.compute(inputNumber));
            }
        } catch (NullPointerException e){
            System.out.println("Input error");
        } catch (NumberFormatException e) {
            System.out.println("Number contain non-digit chars or is < 0");
        } catch (IllegalArgumentException e){
            System.out.println("Please enter number");
        }
        System.out.println("Thank You & good bye.");
    }
}