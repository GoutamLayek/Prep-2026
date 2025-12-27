package com.goutam.orders.model;

public class Payment{

    private int id;
    private String method;
    private double amount;

    public Payment(int id, String method, double amount){
        this.id = id;
        this.method = method;
        this.amount = amount;
    }

    public int getId(){
        return this.id;
    }

    public String getMethod(){
        return this.method;
    }

    public double getAmount(){
        return this.amount;
    }

}