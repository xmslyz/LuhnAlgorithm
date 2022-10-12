package com.xmslyz.luhn.main;

import com.xmslyz.luhn.logic.Motor;

import java.util.Scanner;

public class OptionMenu extends Motor {


    public void getMainOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("CHECKSUM OPERATOR");
        System.out.println("Chose wisely Your option :] ");
        System.out.println("[1] number");
        System.out.println("[2] exit");
        System.out.print(">>> ");

        int selection = input.nextInt();

        switch (selection) {
            case 1 -> compute();
            case 2 -> System.out.println("Thank You & good bye.");
            default -> {
                System.out.println("\nWrong option. I said \"choose wisely\"\n");
                getMainOptions();
            }
        }
}
    public static String getInputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Number to put CHECKSUM:");
        return input.nextLine();
    }
    public static void codeNumber(String codeNumber){
        System.out.println("Your new CHECKSUM is: " + codeNumber);
    }

}
