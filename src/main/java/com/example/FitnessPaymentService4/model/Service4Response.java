package com.example.FitnessPaymentService4.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Service4Response {
    private String status;
    private String timestamp;

    public Service4Response() {
    }

    public Service4Response(String status, String timestamp) {
            this.status = status;
            this.timestamp = timestamp;
    }
}
