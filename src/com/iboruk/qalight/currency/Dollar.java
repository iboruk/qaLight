package com.iboruk.qalight.currency;

public class Dollar extends Currency implements IsFreeConverted {

    public Dollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Dollar";
    }


    @Override
    public boolean isFreeConv() {
        return true;
    }
}
