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
        System.out.print(">>> ");

        try {
            switch (input.nextInt()) {
                case 1 -> {
                    return getInputNumber();
                }
                case 2 -> {
                    System.out.println("Thank You & good bye.");
                    System.exit(0);
                }
//                default -> {
//                    System.out.println("Please enter correct option.");
//                    getMainOptions();
//                }
        }
        } catch (InputMismatchException ex){
            System.exit(0);
        }
        return null;
    }

    private String getInputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Number to put CHECKSUM: ");
        return input.nextLine();
    }
}
