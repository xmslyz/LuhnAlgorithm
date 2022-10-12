package com.xmslyz.luhn.main;

import com.xmslyz.luhn.logic.LuhnAlgorithmEngine;
import java.util.Scanner;

public class OptionMenu extends LuhnAlgorithmEngine {


    public String getMainOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("CHECKSUM OPERATOR");
        System.out.println("Chose wisely Your option :] ");
        System.out.println("[1] number");
        System.out.println("[2] exit");
        System.out.print(">>> ");

        int selection = input.nextInt();

        switch (selection) {
            case 1 -> {
                return getInputNumber();
            }
            case 2 -> {
                System.out.print("Thank You & good bye.");
                return null;
            }
            default -> {
                System.out.println("\nWrong option. I said \"choose wisely\"\n");
                getMainOptions();
            }
        }
        return null;
}
    public static String getInputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Number to put CHECKSUM: ");
        return input.nextLine();
    }
    public static void codeNumber(String codeNumber){
        System.out.print("Your new CHECKSUM is: " + codeNumber);
    }

}
