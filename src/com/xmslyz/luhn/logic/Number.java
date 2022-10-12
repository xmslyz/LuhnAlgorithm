package com.xmslyz.luhn.logic;

class Number {
    private int length;

    public Number(int length) {
        setLength(length);
    }

//    public Number(int length) {
//        //this.type = type;
//        this.length = length;
//        //this.itsClass = itsClass;
//    }

//    public String getType() {
//        String type = "digit";
//        return type;
//    }

//    public String getItsClass() {
//        String itsClass = "String";
//        return itsClass;
//    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
