package com.xmslyz.luhn.logic;

class Number {
    private int length;

    public Number(int length) {
        setLength(length);
    }


//    public String getType() {
//        String type = "digit";
//        return type;
//    }

//    public String getItsClass() {
//        String itsClass = "String";
//        return itsClass;
//    4992739871
//    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
