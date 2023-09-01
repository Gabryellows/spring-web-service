package com.webservice.course.model.entities;

import com.webservice.course.model.enums.OrderStatus;

import java.util.Date;

public class Order implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Date moment;
    private OrderStatus status;
}
