package com.xmslyz.luhn;

class Number {
    private final String type = "digit";
    private int length;
    private final String itsClass = "String";

    // Constructor (special type of method)
    public Number(int length) {
        //this.type = type;
        this.length = length;
        //this.itsClass = itsClass;
    }
    public String getType() {
        return type;
    }
    public String getItsClass() {
        return itsClass;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
