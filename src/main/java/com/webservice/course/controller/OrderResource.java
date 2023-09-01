package com.webservice.course.controller;

import com.webservice.course.model.entities.Order;
import com.webservice.course.model.enums.OrderStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @GetMapping
    public ResponseEntity<Order> findAll() {
        Order order = new Order(1L, Date.from(Instant.parse("2021-09-30T10:00:00Z")), OrderStatus.PAID);

        return ResponseEntity.ok().body(order);
    }
}
