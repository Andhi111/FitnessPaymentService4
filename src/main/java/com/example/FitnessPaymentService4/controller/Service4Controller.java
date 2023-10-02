package com.example.FitnessPaymentService4.controller;

import com.example.FitnessPaymentService4.model.Service4Request;
import com.example.FitnessPaymentService4.model.Service4Response;
import com.example.FitnessPaymentService4.service.Service4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service4")
public class Service4Controller {
    @Autowired
    private Service4 service4;

    @PostMapping("/process-payment")
    public ResponseEntity<Service4Response> processPayment(@RequestBody Service4Request request) {
        Service4Response response = service4.processPayment(request.getCardNumber(),request.getCvv());
        return ResponseEntity.ok(response);
    }
}
