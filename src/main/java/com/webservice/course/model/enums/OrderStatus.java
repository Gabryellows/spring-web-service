package com.webservice.course.model.enums;

public enum OrderStatus {

    WAITING_PAYMENT(10),
    PAID(12),
    SHIPPED(14),
    DELIVERED(16),
    CANCELED(99);

    OrderStatus(int id) {

    }
}
