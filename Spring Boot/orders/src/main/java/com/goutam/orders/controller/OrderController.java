package com.goutam.orders.controller;

import com.goutam.orders.model.Order;
import com.goutam.orders.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // GET/orders
    @GetMapping
    public List<Order> getOrders(@RequestParam(required = false) String status) {
        if(status != null)
         return orderService.getOrderByStatus(status);
        else
            return orderService.getOrders();
    }

    // GET/orders/{id}
    @GetMapping("/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable int id){

        Order order = orderService.getOrderById(id);

        if(order == null){
            return ResponseEntity
                .status(404)
                .body(Map.of("error", "Order not found"));
        }
        return ResponseEntity.ok(order);
    }


}
