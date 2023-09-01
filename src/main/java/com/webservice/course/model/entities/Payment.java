package com.webservice.course.model.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_payment")
public class Payment implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date moment;

    public Payment() {
    }

    public Payment(Long id, Date moment) {
        this.id = id;
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
