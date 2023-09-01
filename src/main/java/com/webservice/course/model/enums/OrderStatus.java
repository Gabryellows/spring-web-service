package com.webservice.course.model.enums;

public enum OrderStatus {

    WAITING_PAYMENT(10),
    PAID(12),
    SHIPPED(14),
    DELIVERED(16),
    CANCELED(99);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode () {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
