package com.goutam.orders.service;

import com.goutam.orders.model.Order;
import org.springframework.stereotype.Service;
import com.goutam.orders.dto.CreateOrderRequest;


import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    public List<Order> getOrders() {
        return List.of(
                new Order(101, 1000, "CREATED"),
                new Order(102, 2500, "PAID"),
                new Order(103, 2000, "PAID"),
                new Order(104, 1500, "CREATED"),
                new Order(105, 1700, "PAID")
        );
    }

    

    public Order getOrderById(int id) {
        for (Order order : getOrders()) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getOrderByStatus(String status){
        List<Order>orderList= new ArrayList<>();
        for (Order order : getOrders()) {
            if (order.getStatus().equals(status)) {
                orderList.add(order);
            }
        }
        return orderList;
    }

    public Order createOrder(CreateOrderRequest request){
        return new Order(106, request.getAmount(), request.getStatus());
    }
}
