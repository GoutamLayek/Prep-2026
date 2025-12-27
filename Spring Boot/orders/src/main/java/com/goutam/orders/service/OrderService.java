package com.goutam.orders.service;

import com.goutam.orders.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public List<Order> getOrders() {
        return List.of(
                new Order(101, 1000, "CREATED"),
                new Order(102, 2500, "PAID")
        );
    }
}
