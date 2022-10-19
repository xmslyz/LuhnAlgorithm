package com.xmslyz.luhn.logic;

import org.apache.commons.lang3.math.NumberUtils;
import java.math.BigInteger;

public class Candidate {

    private final BigInteger number;
    private final String[] digits;

    public Candidate(String input) {
        validate(input);
        var trimmedInput = input.trim().replace(" ", "");
        this.number = new BigInteger(trimmedInput);
        this.digits = trimmedInput.split("");
        if (this.number.signum() <= 0 || input.replace("0", "").equals("")) {
            throw new InputValidationException("Expected number > 0");
        }
    }

    private void validate(String input){
        if (input == null) throw new InputValidationException("Expected not-null input");
        if (input.isEmpty()) throw new InputValidationException("Expected non-empty string");
        if (!NumberUtils.isDigits(input.replaceAll("\\s+", ""))) throw new InputValidationException("Expected only digits");
        if (new BigInteger(input.replaceAll("\\s+", "")).signum() <= 0)
            throw new InputValidationException("Expected number > 0");
    }

    public BigInteger getNumber() { return number; }

    public Integer getDigitCount() { return digits.length; }

    public String[] getDigits() { return digits; }
}