package com.currency.converter.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CurrencyService {

    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);       
        exchangeRates.put("INR", 95.01);     
        exchangeRates.put("EUR", 0.92);      
        exchangeRates.put("GBP", 0.79);      
        exchangeRates.put("AUD", 1.51);      
        exchangeRates.put("CAD", 1.36);      
        exchangeRates.put("SGD", 1.35);      
        exchangeRates.put("JPY", 156.40);    
        exchangeRates.put("CNY", 7.24);      
        exchangeRates.put("AED", 3.67);      
    }

    public double convert(String from, String to, double amount) {
        String fromCurrency = from.toUpperCase();
        String toCurrency = to.toUpperCase();

        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Unsupported currency code provided.");
        }

        double amountInUSD = amount / exchangeRates.get(fromCurrency);
        return amountInUSD * exchangeRates.get(toCurrency);
    }
}