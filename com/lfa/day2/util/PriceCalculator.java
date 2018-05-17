package com.lfa.day2.util;

public class PriceCalculator{
    private double price;
    

    public void setPrice(double price){
        this.price=price;
    }

    public void addServiceCharge(float charge){
        price = price + (price * charge)/100;
    }
    public void addVat(float vat){
        price = price + (price * vat ) /100;
    }

    public void addDiscount(float discount){
        price = price - (price * discount)/100;
    }

    public double getTotal(){
        return price;
    }
}