package com.currency.converter.model;

public class ConversionResponse {

    private double convertedAmount;

    public ConversionResponse(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }
}