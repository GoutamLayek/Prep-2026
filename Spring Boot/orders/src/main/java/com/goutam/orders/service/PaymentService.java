package com.goutam.orders.service;

import com.goutam.orders.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService{

    public List<Payment> getPayments(){
        return List.of(
            new Payment(1, "CARD", 500.0),
            new Payment(2, "UPI", 1200.0)
        );
    }
}