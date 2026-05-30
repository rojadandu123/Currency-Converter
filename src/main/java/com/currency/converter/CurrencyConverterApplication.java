package com.currency.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class CurrencyConverterApplication {

    public static void main(String[] academ) {
        SpringApplication.run(CurrencyConverterApplication.class, academ);
    }

    // This listener waits until the server is fully ready, then logs the clickable URL
    @EventListener(ApplicationReadyEvent.class)
    public void logApplicationUrl() {
        System.out.println("\n========================================================");
        System.out.println("  APPLICATION IS LIVE AND READY TO RUN!                 ");
        System.out.println("  👉 CLICK HERE TO OPEN FRONTEND:                       ");
        System.out.println("  http://localhost:8080/index.html                      ");
        System.out.println("========================================================\n");
    }
}