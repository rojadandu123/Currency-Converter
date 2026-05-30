package com.currency.converter.controller;

import com.currency.converter.model.ConversionRequest;
import com.currency.converter.model.ConversionResponse;
import com.currency.converter.service.CurrencyService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.OPTIONS})
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PostMapping("/convert")
    public ConversionResponse convert(@RequestBody ConversionRequest request) {
        double result = currencyService.convert(
                request.getFrom(),
                request.getTo(),
                request.getAmount());

        return new ConversionResponse(result);
    }
}