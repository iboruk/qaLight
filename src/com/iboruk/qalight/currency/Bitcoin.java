package com.iboruk.qalight.currency;

public class Bitcoin extends Currency {

    public Bitcoin (double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public double exchangeCurrencyToGrn (double amountOfCurrency){
        System.out.println("Операция запрещена нацбанком");
        return amountOfCurrency;
    }
}
