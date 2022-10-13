package com.xmslyz.luhn.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserOptionMenu {

    public void greetUser() {
        System.out.println("CHECKSUM OPERATOR");
        System.out.println("What do You want me to do?\nGenerate CheckSum [1] or Exit [2] ? ");
    }

    public String getMainOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("[1] Generate Checksum");
        System.out.println("[2] Exit");
        System.out.print(">>> ");

        try {
            switch (input.nextInt()) {
                case 1 -> {
                    return getInputNumber();
                }
                case 2 -> {
                    System.out.println("Thank You & good bye.");
                    return null;
                }
        }
            System.out.println("\nWrong option. I said \"choose wisely\"\n");
            return getMainOptions();
        } catch (InputMismatchException ex){
            System.out.println("\nNot a number\n");
            return getMainOptions();
        }
    }

    private String getInputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Number to put CHECKSUM: ");
        return input.nextLine();
    }
}
