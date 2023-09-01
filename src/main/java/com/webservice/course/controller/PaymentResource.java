package com.webservice.course.controller;

import com.webservice.course.model.entities.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @GetMapping
    public ResponseEntity<Payment> findAll() {
        Payment payment = new Payment(1L, Date.from(Instant.parse("2021-09-30T10:00:00Z")));

        return ResponseEntity.ok().body(payment);
    }
}
