package com.goutam.orders.model;

public class Order {

    private int id;
    private int amount;
    private String status;

    public Order(int id, int amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}
