package com.xmslyz.luhn.logic;

public class LuhnChecksumComputing implements Computation {

    String number, checkSum;
    String[] array;
    int checkedNumeral, total, mod10, codeNumber;

    @Override
    public String compute(String input) {
        try {
            this.number = input.trim().replace(" ", "");
            setArray(number.length());
            multiplyWages();
            countTotal();
            getChecksum();
            return this.checkSum;
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Input error.");
        }
        return null;
    }

    public void setArray(int stringLenght) {
        array = new String[stringLenght];
        for (int i = 0; i < stringLenght; i++) {
            String charFromString = String.valueOf(number.charAt(i));
            array[i] = charFromString;
        }
    }

        public void multiplyWages() {
            for (int i = array.length; i > 0; i -= 2) {
                checkedNumeral = Integer.parseInt(array[i - 1]);
                checkedNumeral *= 2;
                if (checkedNumeral % 10 > 0 || checkedNumeral == 10) {
                    array[i - 1] = String.valueOf((checkedNumeral / 10) + (checkedNumeral % 10));
                }
            }
        }
        public void countTotal() {
            for (String s : array) {
                int arrInt = Integer.parseInt(s);
                total += arrInt;
            }
        }

        public void getChecksum(){
            mod10 = total % 10;
            if (mod10 != 0) {
                codeNumber = 10 - mod10;
                checkSum = number + codeNumber;
            } else {
                checkSum = number + 0;
            }
        }
}