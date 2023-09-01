package com.webservice.course.model.entities;

import java.util.Date;

public class Payment implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Date moment;

    public Payment() {
    }

    public Payment(Integer id, Date moment) {
        this.id = id;
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", moment=" + moment +
                '}';
    }
}
