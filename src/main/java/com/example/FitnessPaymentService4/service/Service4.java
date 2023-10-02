package com.example.FitnessPaymentService4.service;

import com.example.FitnessPaymentService4.model.Service4Response;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class Service4 {
    public Service4Response processPayment(String cardNumber, String cvv) {
        simulateBusinessProcess();
        String timestamp = Instant.now().toString();

        return new Service4Response("SUCCESS", timestamp);
    }

    private void simulateBusinessProcess() {
        try {
            Thread.sleep(2000); // Delay 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
