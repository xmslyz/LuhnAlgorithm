package com.xmslyz.luhn;

import java.util.Scanner;

public class Motor {
    Scanner input = new Scanner(System.in);
    String number_string, checkSum_string;
    String[] array;
    int checkedNumeral_int, total_int, mod10_int, codeNumber_int;

    public void getDigits()  {
        this.number_string = getInputNumber();
        setLenght();
        setArray();
        MultiplyOdds();
        Total();
        getCheckSum();
        System.out.println("Your new CHECKSUM is: " + this.checkSum_string);
    }

    public String getInputNumber() {
        System.out.print("Number to put CHECKSUM:");
        this.number_string = this.input.nextLine();
        return this.number_string;
    }

    public void setLenght() {
        int numberLen = this.number_string.length();
        Number numberToCode = new Number(numberLen);
    }

    public void setArray() {
        this.array = new String[this.number_string.length()];
        for (int i = 0; i < this.number_string.length(); i++) {
            String charFromString = String.valueOf(this.number_string.charAt(i));
            this.array[i] = charFromString;
        }
    }

    public void MultiplyOdds() {
        for (int i = this.array.length; i > 0; i -= 2) {
            this.checkedNumeral_int = Integer.parseInt(this.array[i - 1]);
            this.checkedNumeral_int *= 2;
            if (this.checkedNumeral_int % 10 > 0 || this.checkedNumeral_int == 10) {
                this.array[i - 1] = String.valueOf((this.checkedNumeral_int / 10) + (this.checkedNumeral_int % 10));
            }
        }
    }
    public void Total() {
        for (int index = 0; index < this.array.length; index++) {
            int arrInt = Integer.parseInt(array[index]);
            this.total_int += arrInt;
        }
    }
    public void getCheckSum(){
        this.mod10_int = this.total_int % 10;
        if (this.mod10_int != 0) {
            this.codeNumber_int = 10 - mod10_int;
            this.checkSum_string = this.number_string + String.valueOf(this.codeNumber_int);
        } else {
            this.checkSum_string = this.number_string + String.valueOf(0);
        }
    }
}