package com.xmslyz.luhn;

import java.util.Scanner;

public class OptionMenu extends Motor {
    Scanner input = new Scanner(System.in);

    public void getMainOptions() {
        System.out.println("CHECKSUM OPERATOR");
        System.out.println("Chose wisely Your option :] ");
        System.out.println("[1] number");
        System.out.println("[2] exit");
        System.out.print(">>> ");

        int selection = input.nextInt();

        switch (selection) {
            case 1 -> getDigits();
            case 2 -> System.out.println("Thank You & good bye.");
            default -> {
                System.out.println("\nWrong option. I said \"choose wisely\"\n");
                getMainOptions();
            }
        }
}
}
