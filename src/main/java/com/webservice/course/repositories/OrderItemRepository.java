package com.webservice.course.repositories;

import com.webservice.course.model.entities.Order;
import com.webservice.course.model.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
