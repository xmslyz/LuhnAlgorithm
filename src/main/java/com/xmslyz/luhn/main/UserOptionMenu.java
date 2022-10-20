package com.xmslyz.luhn.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserOptionMenu {

    public static void greetUser() {
        System.out.println("CHECKSUM OPERATOR");
        System.out.println("What do You want me to do?\nGenerate CheckSum [1] or Exit [2] ? ");
    }

    public static String getMainOptions() {
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
            }
        } catch (InputMismatchException ex){
            System.exit(0);
            }
        System.out.println("Choose between CheckSum [1] and Exit [2] ? ");
        return getMainOptions();
    }

    private static String getInputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Number to put CHECKSUM: ");
        return input.nextLine();
    }
}
