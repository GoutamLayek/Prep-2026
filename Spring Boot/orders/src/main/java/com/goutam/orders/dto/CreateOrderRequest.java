package com.goutam.orders.dto;
public class CreateOrderRequest{

    private int amount;
    private String status;

    //setter method
    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setStatus(String status){
        this.status = status;
    }

    //getter method 
    public String getStatus(){
        return status;
    }

    public int getAmount(){
        return amount;
    }
}