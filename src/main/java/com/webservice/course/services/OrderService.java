package com.webservice.course.services;

import com.webservice.course.model.entities.Order;
import com.webservice.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findByIdOrder(Long id) {
        Optional<Order> returningObj = repository.findById(id);
        return returningObj.get();
    }


}
