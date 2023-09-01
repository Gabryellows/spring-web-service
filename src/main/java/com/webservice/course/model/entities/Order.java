package com.webservice.course.model.entities;

import com.webservice.course.model.enums.OrderStatus;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class Order implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date moment;
    private OrderStatus status;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Order() {
    }

    public Order(Long id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
    
    public Order(Long id, Date moment, OrderStatus status, User user) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.user = user;
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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                ", user=" + user +
                '}';
    }
}
