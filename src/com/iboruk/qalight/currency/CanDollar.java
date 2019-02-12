package com.iboruk.qalight.currency;

public class CanDollar extends Currency implements IsFreeConverted {

    public CanDollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "CanDollar";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}