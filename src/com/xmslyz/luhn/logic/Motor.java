package com.xmslyz.luhn.logic;

import com.xmslyz.luhn.main.OptionMenu;

public class Motor implements LuhnAlgorithm {

    String number_string, checkSum_string;
    String[] array;
    int checkedNumeral_int, total_int, mod10_int, codeNumber_int;

    @Override
    public void compute() {
        number_string = OptionMenu.getInputNumber();
        setArray(setLenght());
        MultiplyOdds();
        Total();
        getCheckSum();
        OptionMenu.codeNumber(this.checkSum_string);
    }

    protected int setLenght() {
        Number numberToCodeLenght = new Number(number_string.length());
        return numberToCodeLenght.getLength();
    }

    public void setArray(int stringLenght) {
        array = new String[stringLenght];
        for (int i = 0; i < stringLenght; i++) {
            String charFromString = String.valueOf(number_string.charAt(i));
            array[i] = charFromString;
        }
    }

    public void MultiplyOdds() {
        for (int i = array.length; i > 0; i -= 2) {
            checkedNumeral_int = Integer.parseInt(array[i - 1]);
            checkedNumeral_int *= 2;
            if (checkedNumeral_int % 10 > 0 || checkedNumeral_int == 10) {
                array[i - 1] = String.valueOf((checkedNumeral_int / 10) + (checkedNumeral_int % 10));
            }
        }
    }
    public void Total() {
        for (String s : array) {
            int arrInt = Integer.parseInt(s);
            total_int += arrInt;
        }
    }
    @SuppressWarnings("all") // ponieważ z głupia franc woła [Unnecessary 'String.valueOf()' call] w 54 linii.
    public void getCheckSum(){
        mod10_int = total_int % 10;
        if (mod10_int != 0) {
            codeNumber_int = 10 - mod10_int;
            checkSum_string = number_string + String.valueOf(codeNumber_int);
        } else {
            checkSum_string = number_string + String.valueOf(0);
        }
    }


}