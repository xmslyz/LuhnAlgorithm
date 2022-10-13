package com.xmslyz.luhn.logic;

public interface Validation {
    boolean validateNumber ();
    String trimNumber (String input);
    boolean compareNumbers (String toValidate, String input);
}
